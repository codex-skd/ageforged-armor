package com.skd.ageforgedarmor;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.skd.ageforgedarmor.client.AgeforgedArmorClient;
import com.skd.ageforgedarmor.config.AgeforgedArmorConfig;
import com.skd.ageforgedarmor.item.ForgeHumanoidArmorItem;
import com.skd.ageforgedarmor.item.HatItem;
import com.skd.ageforgedarmor.item.HumanoidArmorItem;
import com.skd.ageforgedarmor.loot.LootModifierProvider;
import com.skd.ageforgedarmor.loot.LootModifiers;
import com.skd.ageforgedarmor.networking.ForgeConfigSyncNetworkHandler;
import com.skd.ageforgedarmor.networking.NeoForgePayloadRegistry;
import com.skd.ageforgedarmor.patreon.PatronSyncHandler;
import com.skd.ageforgedarmor.registry.ArmorMaterialRegistry;
import com.skd.ageforgedarmor.registry.ArmorMaterialRegistryNeoForge;
import com.skd.ageforgedarmor.registry.ItemRegistry;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import static com.skd.ageforgedarmor.Constants.MOD_ID;

@Mod(MOD_ID)
public class AgeforgedArmor {
    private static final Logger LOGGER = LogManager.getLogger();

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public AgeforgedArmor(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("=== Ageforged Armor initializing ===");
        LOGGER.info("Mod ID: {}, pack.mcmeta format: 64", MOD_ID);
        LOGGER.info("Assets: assets/{}/textures/item/, assets/{}/textures/models/armor/", MOD_ID, MOD_ID);

        // Correct Forge path: .minecraft/config/<modid>/<modid>.json (DO NOT prefix with "config/")
        Constants.CONFIG_PATH = FMLPaths.CONFIGDIR.get().resolve(MOD_ID).resolve(MOD_ID + ".json");

        /*
         * ================================================================
         *  TODO: REMOVE THIS BLOCK IN A FUTURE VERSION
         *  TEMPORARY CONFIG MIGRATION FIX (Forge only)
         *
         *  Objective:
         *   - If an old config file exists in ".minecraft/config/config/<modid>.json"
         *     or ".minecraft/config/<modid>.json", copy it to the current location
         *     ".minecraft/config/<modid>/<modid>.json" IF IT DOESN'T ALREADY EXIST.
         *   - Delete the old files, then attempt to delete the
         *     ".minecraft/config/config" folder ONLY if it is empty.
         *
         *  Safety:
         *   - We do NOT overwrite an existing file at the new destination.
         *   - Everything is logged to help with debugging for players.
         * ================================================================
         */
        migrateForgeConfigIfNeeded();
        // ========================== END TEMPORARY FIX ==========================

        CommonClass.CONFIG_SYNC_HANDLER = new ForgeConfigSyncNetworkHandler();
        CommonClass.init();

        // ArmorMaterial registry init
        ArmorMaterialRegistry.REGISTRY = new ArmorMaterialRegistryNeoForge();

        // Items init
        ItemRegistryImpl.REGISTRY = new ItemRegistryImpl();
        ItemRegistryImpl.DEFERRED_REGISTER.register(modEventBus);

        // Creative inventory init
        CREATIVE_MODE_TAB.register(modEventBus);
        CREATIVE_MODE_TAB.register(MOD_ID, () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup." + MOD_ID))
                .icon(() -> ItemRegistry.REGISTRY.TAB_ICON.get().getDefaultInstance())
                .displayItems((params, output) -> output.acceptAll(
                        ItemRegistryImpl.DEFERRED_REGISTER.getEntries().stream()
                                .filter(holder -> holder != ItemRegistry.REGISTRY.TAB_ICON)
                                .map(holder -> holder.get().getDefaultInstance())
                                .toList()))
                .build());

        LootModifiers.register(modEventBus);
        modEventBus.addListener(GatherDataEvent.Server.class, this::gatherData);
        modEventBus.addListener(NeoForgePayloadRegistry::register);
        modEventBus.addListener(ForgeHumanoidArmorItem::registerClientExtensions);

        // Armor set effects — run at the end of each player tick, server-side only
        NeoForge.EVENT_BUS.addListener(AgeforgedArmor::onPlayerTick);

        // Send patron tier to player on login
        NeoForge.EVENT_BUS.addListener(AgeforgedArmor::onPlayerLoggedIn);

        // Client init
        if (FMLEnvironment.getDist().isClient()) {
            modContainer.registerExtensionPoint(IConfigScreenFactory.class, (modContainer2, parent) -> AgeforgedArmorConfig.createScreen().generateScreen(parent));
            modEventBus.addListener(AgeforgedArmorClient::registerLayerDefinitions);
            NeoForge.EVENT_BUS.addListener(AgeforgedArmorClient::playerLoggedInEvent);
        }
    }

    public static void onPlayerTick(PlayerTickEvent.Post event) {
        ArmorSetEffectHandler.onPlayerTick(event.getEntity());
    }

    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        if (event.getEntity() instanceof net.minecraft.server.level.ServerPlayer serverPlayer) {
            PatronSyncHandler.onPlayerLogin(serverPlayer);
        }
    }

    public void gatherData(GatherDataEvent.Server event) {
        event.getGenerator().getVanillaPack(true).addProvider((DataProvider.Factory<LootModifierProvider>) output -> new LootModifierProvider(output, event.getLookupProvider()));
    }

    // ===== TEMPORARY CONFIG MIGRATION FIX (see TODO above) =====
    private static void migrateForgeConfigIfNeeded() {
        final Path newFile    = Constants.CONFIG_PATH;                       // .../.minecraft/config/<modid>/<modid>.json
        final Path oldDir     = FMLPaths.CONFIGDIR.get().resolve("config");  // .../.minecraft/config/config
        final Path oldFile    = oldDir.resolve(MOD_ID + ".json");            // very old location
        final Path legacyFile = FMLPaths.CONFIGDIR.get().resolve(MOD_ID + ".json"); // previous location

        try {
            Files.createDirectories(newFile.getParent());
        } catch (IOException e) {
            LOGGER.warn("[{}] Failed to create config directory '{}': {}",
                    MOD_ID, newFile.getParent(), e.getMessage());
        }

        migrateSingleConfig(oldFile, newFile);
        migrateSingleConfig(legacyFile, newFile);
        cleanupIfEmpty(oldDir);
    }

    private static void migrateSingleConfig(Path oldFile, Path newFile) {
        if (!Files.exists(oldFile)) {
            return;
        }

        if (!Files.exists(newFile)) {
            try {
                Files.copy(oldFile, newFile, StandardCopyOption.REPLACE_EXISTING);
                LOGGER.info("[{}] Configuration migrated from '{}' to '{}'.", MOD_ID, oldFile, newFile);
            } catch (IOException e) {
                LOGGER.warn("[{}] Failed to copy old configuration '{}' to '{}': {}",
                        MOD_ID, oldFile, newFile, e.getMessage());
            }
        } else {
            LOGGER.info("[{}] New configuration file already present: '{}'. " +
                    "The old one will be cleaned up if possible.", MOD_ID, newFile);
        }

        // Delete old file (best-effort)
        try {
            Files.deleteIfExists(oldFile);
        } catch (IOException e) {
            LOGGER.warn("[{}] Failed to delete old configuration file '{}': {}",
                    MOD_ID, oldFile, e.getMessage());
        }
    }

    private static void cleanupIfEmpty(Path dir) {
        // Try to delete the folder if it's empty
        try {
            if (Files.isDirectory(dir)) {
                try (DirectoryStream<Path> ds = Files.newDirectoryStream(dir)) {
                    if (!ds.iterator().hasNext()) {
                        Files.delete(dir);
                        LOGGER.info("[{}] Old folder '{}' deleted (was empty).", MOD_ID, dir);
                    } else {
                        LOGGER.info("[{}] Old folder '{}' kept (contents detected).", MOD_ID, dir);
                    }
                }
            }
        } catch (IOException e) {
            LOGGER.warn("[{}] Failed to clean up old folder '{}': {}",
                    MOD_ID, dir, e.getMessage());
        }
    }
    // ===================== END TEMPORARY MIGRATION FIX =====================

    public static class ItemRegistryImpl extends ItemRegistry {
        public static final DeferredRegister.Items DEFERRED_REGISTER = DeferredRegister.createItems(MOD_ID);
        public static final Map<String, List<Identifier>> ARMORS_LOCATION_FROM_NAME = new Object2ObjectOpenHashMap<>();

        public ItemRegistryImpl() {
            this.TAB_ICON = DEFERRED_REGISTER.registerSimpleItem(MOD_ID);
            LOGGER.info("TAB_ICON registered: {}:{}", MOD_ID, MOD_ID);
            LOGGER.info("  model: assets/{}/models/item/{}.json", MOD_ID, MOD_ID);
            LOGGER.info("  texture: assets/{}/textures/item/{}.png", MOD_ID, MOD_ID);
            // Register Bamboo Hat directly via registerItem to ensure Properties.setId() is called
            DEFERRED_REGISTER.registerItem(Constants.BAMBOO_HAT_NAME,
                    props -> new HatItem(props,
                            AgeforgedArmorConfig.get().bambooHatDurability,
                            AgeforgedArmorConfig.get().bambooHatHelmetDef,
                            AgeforgedArmorConfig.get().bambooHatToughness,
                            AgeforgedArmorConfig.get().bambooHatEnchantability),
                    () -> new Item.Properties()
                            .stacksTo(1)
                            .durability(net.minecraft.world.item.equipment.ArmorType.HELMET.getDurability(AgeforgedArmorConfig.get().bambooHatDurability))
                            .attributes(HatItem.buildModifiers(AgeforgedArmorConfig.get().bambooHatHelmetDef, AgeforgedArmorConfig.get().bambooHatToughness))
                            .equippable(net.minecraft.world.entity.EquipmentSlot.HEAD));
            ARMORS_LOCATION_FROM_NAME
                    .computeIfAbsent(Constants.BAMBOO_HAT_NAME, s -> new ObjectArrayList<>())
                    .add(Identifier.fromNamespaceAndPath(MOD_ID, Constants.BAMBOO_HAT_NAME));
            LOGGER.info("Bamboo Hat registered: {}:{}", MOD_ID, Constants.BAMBOO_HAT_NAME);
            LOGGER.info("  model: assets/{}/models/item/{}.json", MOD_ID, Constants.BAMBOO_HAT_NAME);
            LOGGER.info("  texture: assets/{}/textures/item/{}.png (item), assets/{}/textures/models/armor/bamboo_hat.png (entity)", MOD_ID, Constants.BAMBOO_HAT_NAME, MOD_ID);
        }

        @Override
        public void register(String armorSetName, Holder<ArmorMaterial> material, ArmorType slot, int durabilityFactor) {
            String name = armorSetName + "_" + slot.getSlot().getName();
            ARMORS_LOCATION_FROM_NAME
                    .computeIfAbsent(armorSetName, s -> new ObjectArrayList<>())
                    .add(Identifier.fromNamespaceAndPath(MOD_ID, name));
            DEFERRED_REGISTER.registerItem(name,
                    props -> new ForgeHumanoidArmorItem(armorSetName, props, material, slot, durabilityFactor),
                    () -> new Item.Properties().stacksTo(1).durability(slot.getDurability(durabilityFactor))
                            .rarity(HumanoidArmorItem.deriveRarity(material)).humanoidArmor(material.value(), slot));
            LOGGER.info("Armor registered: {}:{}", MOD_ID, name);
            LOGGER.info("  item model: assets/{}/models/item/{}.json", MOD_ID, name);
            LOGGER.info("  item texture: assets/{}/textures/item/{}.png", MOD_ID, name);
            LOGGER.info("  armor texture: assets/{}/textures/models/armor/{}.png", MOD_ID, armorSetName);
        }

        @Override
        public Supplier<Item> register(String name, Supplier<Item> itemSupplier) {
            ARMORS_LOCATION_FROM_NAME
                    .computeIfAbsent(name, s -> new ObjectArrayList<>())
                    .add(Identifier.fromNamespaceAndPath(MOD_ID, name));
            return DEFERRED_REGISTER.register(name, itemSupplier);
        }
    }
}
