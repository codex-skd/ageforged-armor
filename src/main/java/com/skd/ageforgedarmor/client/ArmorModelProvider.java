package com.skd.ageforgedarmor.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import com.skd.ageforgedarmor.CommonClass;
import com.skd.ageforgedarmor.client.models.ArmorModel;
import com.skd.ageforgedarmor.config.AgeforgedArmorConfig;
import com.skd.ageforgedarmor.config.PreferredModel;
import com.skd.ageforgedarmor.config.SkinSyncState;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;
import java.util.function.Supplier;

import static com.skd.ageforgedarmor.Constants.MOD_ID;

public class ArmorModelProvider {
    protected static final Identifier PLAYER_RESOURCE_LOCATION = Identifier.withDefaultNamespace("player");
    private static final Logger LOGGER = LogManager.getLogger();

    public interface SkinVariant {
        String getTexturePrefix();
    }

    public static ArmorModelProvider create(String armorName, EquipmentSlot slot, ArmorModelSupplier modelSupplier, Supplier<LayerDefinition> layerDefinitionSupplier){
        return new ArmorModelProvider(armorName, slot, modelSupplier, layerDefinitionSupplier);
    }

    public static ArmorModelProvider create(String armorName, EquipmentSlot slot, ArmorModelSupplier modelSupplier, Supplier<LayerDefinition> layerDefinitionSupplier, Supplier<LayerDefinition> slimLayerDefinitionSupplier){
        return new MixedArmorModelProvider(armorName, slot, modelSupplier, layerDefinitionSupplier, slimLayerDefinitionSupplier);
    }

    public static <E extends Enum<E> & SkinVariant> ArmorModelProvider create(
            String armorName, EquipmentSlot slot, ArmorModelSupplier modelSupplier,
            Supplier<LayerDefinition> layerDefinitionSupplier, Supplier<LayerDefinition> slimLayerDefinitionSupplier,
            Supplier<E> skinSupplier, Class<E> enumClass, Function<SkinSyncState, E> syncStateExtractor) {
        return new SkinnedMixedArmorModelProvider<>(armorName, slot, modelSupplier, layerDefinitionSupplier, slimLayerDefinitionSupplier, skinSupplier, enumClass, syncStateExtractor);
    }

    private final Supplier<LayerDefinition> layerDefinitionSupplier;
    protected final ArmorModelSupplier modelSupplier;
    private ArmorModel<? extends HumanoidRenderState> armorModel;
    private final ModelLayerLocation modelLayerLocation;
    protected final Identifier resourceLocation;

    protected ArmorModelProvider(String armorName, EquipmentSlot slot, ArmorModelSupplier modelSupplier, Supplier<LayerDefinition> layerDefinitionSupplier){
        this.layerDefinitionSupplier = layerDefinitionSupplier;
        this.modelSupplier = modelSupplier;
        this.modelLayerLocation = new ModelLayerLocation(PLAYER_RESOURCE_LOCATION, armorName + "_" + slot.name().toLowerCase());
        this.resourceLocation = Identifier.fromNamespaceAndPath(MOD_ID, "textures/models/armor/" + armorName + ".png");
        LOGGER.debug("ArmorModelProvider created: armor={}, slot={}, texture={}", armorName, slot, resourceLocation);
    }

    @NotNull
    public Identifier getTexture(Entity entity) {
        LOGGER.debug("getTexture(entity) called, returning: {}", this.resourceLocation);
        return this.resourceLocation;
    }

    @NotNull
    public Identifier getTexture(HumanoidRenderState state) {
        LOGGER.debug("getTexture(state) called, returning: {}", this.resourceLocation);
        return this.resourceLocation;
    }

    @NotNull
    public ModelLayerLocation getLayerLocation() {
        return this.modelLayerLocation;
    }

    public LayerDefinition createLayer(){
        return this.layerDefinitionSupplier.get();
    }

    public static boolean isSlim(Entity entity) {
        if (entity == null) return false;
        if (entity == Minecraft.getInstance().player) {
            return AgeforgedArmorConfig.get().preferredModel == PreferredModel.FEMALE;
        }
        if (CommonClass.CURRENT_PREFERRED_MODEL_MAP.containsKey(entity.getUUID())) {
            return CommonClass.CURRENT_PREFERRED_MODEL_MAP.get(entity.getUUID()) == PreferredModel.FEMALE;
        }
        return entity instanceof AbstractClientPlayer player && "slim".equals(player.getSkin().model().name());
    }

    public ArmorModel<? extends HumanoidRenderState> getArmorModel(Entity entity) {
        if(this.armorModel == null){
            this.armorModel = this.modelSupplier.create(Minecraft.getInstance().getEntityModels().bakeLayer(this.modelLayerLocation), false);
            LOGGER.debug("getArmorModel(entity): baked new model for layer: {}", this.modelLayerLocation);
        }
        return this.armorModel;
    }

    public ArmorModel<? extends HumanoidRenderState> getArmorModel(HumanoidRenderState state) {
        if(this.armorModel == null){
            this.armorModel = this.modelSupplier.create(Minecraft.getInstance().getEntityModels().bakeLayer(this.modelLayerLocation), false);
            LOGGER.debug("getArmorModel(state): baked new model for layer: {}", this.modelLayerLocation);
        }
        return this.armorModel;
    }

    public static class SkinnedMixedArmorModelProvider<E extends Enum<E> & SkinVariant> extends MixedArmorModelProvider {
        private final java.util.Map<E, Identifier> skinTextures;
        private final java.util.Map<E, Identifier> slimSkinTextures;
        private final Supplier<E> skinSupplier;
        private final Function<SkinSyncState, E> syncStateExtractor;

        protected SkinnedMixedArmorModelProvider(
                String armorName,
                EquipmentSlot slot,
                ArmorModelSupplier modelSupplier,
                Supplier<LayerDefinition> layerDefinitionSupplier,
                Supplier<LayerDefinition> slimLayerDefinitionSupplier,
                Supplier<E> skinSupplier,
                Class<E> enumClass,
                Function<SkinSyncState, E> syncStateExtractor) {
            super(armorName, slot, modelSupplier, layerDefinitionSupplier, slimLayerDefinitionSupplier);
            this.skinSupplier = skinSupplier;
            this.syncStateExtractor = syncStateExtractor;
            this.skinTextures = new java.util.EnumMap<>(enumClass);
            this.slimSkinTextures = new java.util.EnumMap<>(enumClass);
            for (E skin : enumClass.getEnumConstants()) {
                String prefix = skin.getTexturePrefix();
                this.skinTextures.put(skin, Identifier.fromNamespaceAndPath(MOD_ID, "textures/models/armor/" + prefix + armorName + ".png"));
                this.slimSkinTextures.put(skin, Identifier.fromNamespaceAndPath(MOD_ID, "textures/models/armor/" + prefix + armorName + "_slim.png"));
            }
        }

        @Override
        public @NotNull Identifier getTexture(Entity entity) {
            E skin;
            if (entity == Minecraft.getInstance().player) {
                skin = skinSupplier.get();
            } else {
                SkinSyncState syncState = CommonClass.CURRENT_SKIN_MAP.get(entity.getUUID());
                skin = (syncState != null) ? syncStateExtractor.apply(syncState) : skinSupplier.get();
            }
            return isSlim(entity) ? slimSkinTextures.get(skin) : skinTextures.get(skin);
        }

        @Override
        public @NotNull Identifier getTexture(HumanoidRenderState state) {
            E skin = skinSupplier.get();
            return skinTextures.get(skin);
        }
    }

    public static class MixedArmorModelProvider extends ArmorModelProvider{
        private final Supplier<LayerDefinition> slimLayerDefinitionSupplier;
        private final ModelLayerLocation slimModelLayerLocation;
        private final Identifier slimIdentifier;
        private ArmorModel<? extends HumanoidRenderState> slimArmorModel;

        protected MixedArmorModelProvider(String armorName, EquipmentSlot slot, ArmorModelSupplier modelSupplier, Supplier<LayerDefinition> layerDefinitionSupplier, Supplier<LayerDefinition> slimLayerDefinitionSupplier){
            super(armorName, slot, modelSupplier, layerDefinitionSupplier);
            this.slimLayerDefinitionSupplier = slimLayerDefinitionSupplier;
            this.slimModelLayerLocation = new ModelLayerLocation(PLAYER_RESOURCE_LOCATION, armorName + "_" + slot.name().toLowerCase() + "_slim");
            this.slimIdentifier = Identifier.fromNamespaceAndPath(MOD_ID, "textures/models/armor/" + armorName + "_slim.png");
        }

        @NotNull
        public ModelLayerLocation getSlimLayerLocation() {
            return this.slimModelLayerLocation;
        }

        public LayerDefinition createSlimLayer(){
            return this.slimLayerDefinitionSupplier.get();
        }

        @Override
        public @NotNull Identifier getTexture(Entity entity) {
            return isSlim(entity) ? this.slimIdentifier : super.getTexture(entity);
        }

        @Override
        public @NotNull Identifier getTexture(HumanoidRenderState state) {
            return this.resourceLocation;
        }

        @Override
        public ArmorModel<? extends HumanoidRenderState> getArmorModel(Entity entity) {
            if(ArmorModelProvider.isSlim(entity)){
                if(this.slimArmorModel == null){
                    this.slimArmorModel = this.modelSupplier.create(Minecraft.getInstance().getEntityModels().bakeLayer(this.slimModelLayerLocation), true);
                }
                return this.slimArmorModel;
            }else{
                return super.getArmorModel(entity);
            }
        }

        @Override
        public ArmorModel<? extends HumanoidRenderState> getArmorModel(HumanoidRenderState state) {
            return super.getArmorModel(state);
        }
    }
}