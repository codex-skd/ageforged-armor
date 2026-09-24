package com.skd.ageforgedarmor.registry;

import java.util.HashMap;
import java.util.function.Supplier;

import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.world.entity.EquipmentSlot;
import com.skd.ageforgedarmor.client.ArmorModelProvider;
import com.skd.ageforgedarmor.client.ArmorModelSupplier;
import com.skd.ageforgedarmor.client.models.anubis_armor.ChestAnubisArmorModel;
import com.skd.ageforgedarmor.client.models.anubis_armor.FeetAnubisArmorModel;
import com.skd.ageforgedarmor.client.models.anubis_armor.HeadAnubisArmorModel;
import com.skd.ageforgedarmor.client.models.anubis_armor.LegsAnubisArmorModel;
import com.skd.ageforgedarmor.client.models.exalted_aurum.ChestExaltedAurumArmorModel;
import com.skd.ageforgedarmor.client.models.exalted_aurum.FeetExaltedAurumArmorModel;
import com.skd.ageforgedarmor.client.models.exalted_aurum.HeadExaltedAurumArmorModel;
import com.skd.ageforgedarmor.client.models.exalted_aurum.LegsExaltedAurumArmorModel;
import com.skd.ageforgedarmor.client.models.holy_armor.ChestHolyArmorModel;
import com.skd.ageforgedarmor.client.models.holy_armor.FeetHolyArmorModel;
import com.skd.ageforgedarmor.client.models.holy_armor.HeadHolyArmorModel;
import com.skd.ageforgedarmor.client.models.holy_armor.LegsHolyArmorModel;
import com.skd.ageforgedarmor.client.models.iron_plate_armor.ChestIronPlateArmorModel;
import com.skd.ageforgedarmor.client.models.iron_plate_armor.FeetIronPlateArmorModel;
import com.skd.ageforgedarmor.client.models.iron_plate_armor.HeadIronPlateArmorModel;
import com.skd.ageforgedarmor.client.models.iron_plate_armor.LegsIronPlateArmorModel;
import com.skd.ageforgedarmor.client.models.japanese_light_armor.ChestJapaneseLightArmorModel;
import com.skd.ageforgedarmor.client.models.japanese_light_armor.FeetJapaneseLightArmorModel;
import com.skd.ageforgedarmor.client.models.japanese_light_armor.HeadJapaneseLightArmorModel;
import com.skd.ageforgedarmor.client.models.japanese_light_armor.LegsJapaneseLightArmorModel;
import com.skd.ageforgedarmor.client.models.centurion_armor.ChestCenturionArmorModel;
import com.skd.ageforgedarmor.client.models.centurion_armor.FeetCenturionArmorModel;
import com.skd.ageforgedarmor.client.models.centurion_armor.HeadCenturionArmorModel;
import com.skd.ageforgedarmor.client.models.centurion_armor.LegsCenturionArmorModel;
import com.skd.ageforgedarmor.client.models.o_yoroi_armor.ChestOYoroiArmorModel;
import com.skd.ageforgedarmor.client.models.o_yoroi_armor.FeetOYoroiArmorModel;
import com.skd.ageforgedarmor.client.models.o_yoroi_armor.HeadOYoroiArmorModel;
import com.skd.ageforgedarmor.client.models.o_yoroi_armor.LegsOYoroiArmorModel;
import com.skd.ageforgedarmor.client.models.pharaoh_armor.ChestPharaohArmorModel;
import com.skd.ageforgedarmor.client.models.pharaoh_armor.FeetPharaohArmorModel;
import com.skd.ageforgedarmor.client.models.pharaoh_armor.HeadPharaohArmorModel;
import com.skd.ageforgedarmor.client.models.pharaoh_armor.LegsPharaohArmorModel;
import com.skd.ageforgedarmor.client.models.quetzalcoatl_armor.ChestQuetzalcoatlArmorModel;
import com.skd.ageforgedarmor.client.models.quetzalcoatl_armor.FeetQuetzalcoatlArmorModel;
import com.skd.ageforgedarmor.client.models.quetzalcoatl_armor.HeadQuetzalcoatlArmorModel;
import com.skd.ageforgedarmor.client.models.quetzalcoatl_armor.LegsQuetzalcoatlArmorModel;
import com.skd.ageforgedarmor.client.models.raijin_armor.ChestRaijinArmorModel;
import com.skd.ageforgedarmor.client.models.raijin_armor.FeetRaijinArmorModel;
import com.skd.ageforgedarmor.client.models.raijin_armor.HeadRaijinArmorModel;
import com.skd.ageforgedarmor.client.models.raijin_armor.LegsRaijinArmorModel;

import com.skd.ageforgedarmor.client.patreon.ClientPatronState;
import com.skd.ageforgedarmor.config.AgeforgedArmorConfig;
import com.skd.ageforgedarmor.config.CenturionSkin;
import com.skd.ageforgedarmor.config.IronPlateSkin;
import com.skd.ageforgedarmor.config.OYoroiSkin;
import com.skd.ageforgedarmor.config.PharaohSkin;
import com.skd.ageforgedarmor.config.RaijinSkin;
import com.skd.ageforgedarmor.config.SkinSyncState;

import static com.skd.ageforgedarmor.Constants.*;

// Client side
public class ModelProviderRegistry {

    public static final HashMap<String, ArmorModelProvider> REGISTRY = new HashMap<>();
    static {
        register(ANUBIS_ARMOR_NAME, EquipmentSlot.HEAD, HeadAnubisArmorModel::new, HeadAnubisArmorModel::createLayerDefinition, HeadAnubisArmorModel::createSlimLayerDefinition);
        register(ANUBIS_ARMOR_NAME, EquipmentSlot.CHEST, ChestAnubisArmorModel::new, ChestAnubisArmorModel::createLayerDefinition, ChestAnubisArmorModel::createSlimLayerDefinition);
        register(ANUBIS_ARMOR_NAME, EquipmentSlot.LEGS, LegsAnubisArmorModel::new, LegsAnubisArmorModel::createLayerDefinition);
        register(ANUBIS_ARMOR_NAME, EquipmentSlot.FEET, FeetAnubisArmorModel::new, FeetAnubisArmorModel::createLayerDefinition);
        registerSkinned(CENTURION_ARMOR_NAME, EquipmentSlot.HEAD, HeadCenturionArmorModel::new, HeadCenturionArmorModel::createLayerDefinition, HeadCenturionArmorModel::createLayerDefinition, () -> { CenturionSkin s = AgeforgedArmorConfig.get().centurionSkin; return s.getRequiredTier() > 0 && ClientPatronState.playerTier < s.getRequiredTier() ? CenturionSkin.DEFAULT : s; }, CenturionSkin.class, SkinSyncState::centurionSkin);
        registerSkinned(CENTURION_ARMOR_NAME, EquipmentSlot.CHEST, ChestCenturionArmorModel::new, ChestCenturionArmorModel::createLayerDefinition, ChestCenturionArmorModel::createSlimLayerDefinition, () -> { CenturionSkin s = AgeforgedArmorConfig.get().centurionSkin; return s.getRequiredTier() > 0 && ClientPatronState.playerTier < s.getRequiredTier() ? CenturionSkin.DEFAULT : s; }, CenturionSkin.class, SkinSyncState::centurionSkin);
        registerSkinned(CENTURION_ARMOR_NAME, EquipmentSlot.LEGS, LegsCenturionArmorModel::new, LegsCenturionArmorModel::createLayerDefinition, LegsCenturionArmorModel::createLayerDefinition, () -> { CenturionSkin s = AgeforgedArmorConfig.get().centurionSkin; return s.getRequiredTier() > 0 && ClientPatronState.playerTier < s.getRequiredTier() ? CenturionSkin.DEFAULT : s; }, CenturionSkin.class, SkinSyncState::centurionSkin);
        registerSkinned(CENTURION_ARMOR_NAME, EquipmentSlot.FEET, FeetCenturionArmorModel::new, FeetCenturionArmorModel::createLayerDefinition, FeetCenturionArmorModel::createLayerDefinition, () -> { CenturionSkin s = AgeforgedArmorConfig.get().centurionSkin; return s.getRequiredTier() > 0 && ClientPatronState.playerTier < s.getRequiredTier() ? CenturionSkin.DEFAULT : s; }, CenturionSkin.class, SkinSyncState::centurionSkin);
        register(EXALTED_AURUM_ARMOR_NAME, EquipmentSlot.HEAD, HeadExaltedAurumArmorModel::new, HeadExaltedAurumArmorModel::createLayerDefinition);
        register(EXALTED_AURUM_ARMOR_NAME, EquipmentSlot.CHEST, ChestExaltedAurumArmorModel::new, ChestExaltedAurumArmorModel::createLayerDefinition, ChestExaltedAurumArmorModel::createSlimLayerDefinition);
        register(EXALTED_AURUM_ARMOR_NAME, EquipmentSlot.LEGS, LegsExaltedAurumArmorModel::new, LegsExaltedAurumArmorModel::createLayerDefinition, LegsExaltedAurumArmorModel::createSlimLayerDefinition);
        register(EXALTED_AURUM_ARMOR_NAME, EquipmentSlot.FEET, FeetExaltedAurumArmorModel::new, FeetExaltedAurumArmorModel::createLayerDefinition);
        register(HOLY_ARMOR_NAME, EquipmentSlot.HEAD, HeadHolyArmorModel::new, HeadHolyArmorModel::createLayerDefinition);
        register(HOLY_ARMOR_NAME, EquipmentSlot.CHEST, ChestHolyArmorModel::new, ChestHolyArmorModel::createLayerDefinition, ChestHolyArmorModel::createSlimLayerDefinition);
        register(HOLY_ARMOR_NAME, EquipmentSlot.LEGS, LegsHolyArmorModel::new, LegsHolyArmorModel::createLayerDefinition);
        register(HOLY_ARMOR_NAME, EquipmentSlot.FEET, FeetHolyArmorModel::new, FeetHolyArmorModel::createLayerDefinition);
        registerSkinned(IRON_PLATE_ARMOR_NAME, EquipmentSlot.HEAD, HeadIronPlateArmorModel::new, HeadIronPlateArmorModel::createLayerDefinition, HeadIronPlateArmorModel::createLayerDefinition, () -> AgeforgedArmorConfig.get().ironPlateSkin, IronPlateSkin.class, SkinSyncState::ironPlateSkin);
        registerSkinned(IRON_PLATE_ARMOR_NAME, EquipmentSlot.CHEST, ChestIronPlateArmorModel::new, ChestIronPlateArmorModel::createLayerDefinition, ChestIronPlateArmorModel::createSlimLayerDefinition, () -> AgeforgedArmorConfig.get().ironPlateSkin, IronPlateSkin.class, SkinSyncState::ironPlateSkin);
        registerSkinned(IRON_PLATE_ARMOR_NAME, EquipmentSlot.LEGS, LegsIronPlateArmorModel::new, LegsIronPlateArmorModel::createLayerDefinition, LegsIronPlateArmorModel::createLayerDefinition, () -> AgeforgedArmorConfig.get().ironPlateSkin, IronPlateSkin.class, SkinSyncState::ironPlateSkin);
        registerSkinned(IRON_PLATE_ARMOR_NAME, EquipmentSlot.FEET, FeetIronPlateArmorModel::new, FeetIronPlateArmorModel::createLayerDefinition, FeetIronPlateArmorModel::createLayerDefinition, () -> AgeforgedArmorConfig.get().ironPlateSkin, IronPlateSkin.class, SkinSyncState::ironPlateSkin);
        register(JAPANESE_LIGHT_ARMOR_NAME, EquipmentSlot.HEAD, HeadJapaneseLightArmorModel::new, HeadJapaneseLightArmorModel::createLayerDefinition);
        register(JAPANESE_LIGHT_ARMOR_NAME, EquipmentSlot.CHEST, ChestJapaneseLightArmorModel::new, ChestJapaneseLightArmorModel::createLayerDefinition, ChestJapaneseLightArmorModel::createSlimLayerDefinition);
        register(JAPANESE_LIGHT_ARMOR_NAME, EquipmentSlot.LEGS, LegsJapaneseLightArmorModel::new, LegsJapaneseLightArmorModel::createLayerDefinition);
        register(JAPANESE_LIGHT_ARMOR_NAME, EquipmentSlot.FEET, FeetJapaneseLightArmorModel::new, FeetJapaneseLightArmorModel::createLayerDefinition);
        registerSkinned(O_YOROI_ARMOR_NAME, EquipmentSlot.HEAD, HeadOYoroiArmorModel::new, HeadOYoroiArmorModel::createLayerDefinition, HeadOYoroiArmorModel::createLayerDefinition, () -> { OYoroiSkin s = AgeforgedArmorConfig.get().oYoroiSkin; return s.getRequiredTier() > 0 && ClientPatronState.playerTier < s.getRequiredTier() ? OYoroiSkin.DEFAULT : s; }, OYoroiSkin.class, SkinSyncState::oYoroiSkin);
        registerSkinned(O_YOROI_ARMOR_NAME, EquipmentSlot.CHEST, ChestOYoroiArmorModel::new, ChestOYoroiArmorModel::createLayerDefinition, ChestOYoroiArmorModel::createSlimLayerDefinition, () -> { OYoroiSkin s = AgeforgedArmorConfig.get().oYoroiSkin; return s.getRequiredTier() > 0 && ClientPatronState.playerTier < s.getRequiredTier() ? OYoroiSkin.DEFAULT : s; }, OYoroiSkin.class, SkinSyncState::oYoroiSkin);
        registerSkinned(O_YOROI_ARMOR_NAME, EquipmentSlot.LEGS, LegsOYoroiArmorModel::new, LegsOYoroiArmorModel::createLayerDefinition, LegsOYoroiArmorModel::createLayerDefinition, () -> { OYoroiSkin s = AgeforgedArmorConfig.get().oYoroiSkin; return s.getRequiredTier() > 0 && ClientPatronState.playerTier < s.getRequiredTier() ? OYoroiSkin.DEFAULT : s; }, OYoroiSkin.class, SkinSyncState::oYoroiSkin);
        registerSkinned(O_YOROI_ARMOR_NAME, EquipmentSlot.FEET, FeetOYoroiArmorModel::new, FeetOYoroiArmorModel::createLayerDefinition, FeetOYoroiArmorModel::createLayerDefinition, () -> { OYoroiSkin s = AgeforgedArmorConfig.get().oYoroiSkin; return s.getRequiredTier() > 0 && ClientPatronState.playerTier < s.getRequiredTier() ? OYoroiSkin.DEFAULT : s; }, OYoroiSkin.class, SkinSyncState::oYoroiSkin);
        registerSkinned(PHARAOH_ARMOR_NAME, EquipmentSlot.HEAD, HeadPharaohArmorModel::new, HeadPharaohArmorModel::createLayerDefinition, HeadPharaohArmorModel::createLayerDefinition, () -> { PharaohSkin s = AgeforgedArmorConfig.get().pharaohSkin; return s.getRequiredTier() > 0 && ClientPatronState.playerTier < s.getRequiredTier() ? PharaohSkin.DEFAULT : s; }, PharaohSkin.class, SkinSyncState::pharaohSkin);
        registerSkinned(PHARAOH_ARMOR_NAME, EquipmentSlot.CHEST, ChestPharaohArmorModel::new, ChestPharaohArmorModel::createLayerDefinition, ChestPharaohArmorModel::createSlimLayerDefinition, () -> { PharaohSkin s = AgeforgedArmorConfig.get().pharaohSkin; return s.getRequiredTier() > 0 && ClientPatronState.playerTier < s.getRequiredTier() ? PharaohSkin.DEFAULT : s; }, PharaohSkin.class, SkinSyncState::pharaohSkin);
        registerSkinned(PHARAOH_ARMOR_NAME, EquipmentSlot.LEGS, LegsPharaohArmorModel::new, LegsPharaohArmorModel::createLayerDefinition, LegsPharaohArmorModel::createLayerDefinition, () -> { PharaohSkin s = AgeforgedArmorConfig.get().pharaohSkin; return s.getRequiredTier() > 0 && ClientPatronState.playerTier < s.getRequiredTier() ? PharaohSkin.DEFAULT : s; }, PharaohSkin.class, SkinSyncState::pharaohSkin);
        registerSkinned(PHARAOH_ARMOR_NAME, EquipmentSlot.FEET, FeetPharaohArmorModel::new, FeetPharaohArmorModel::createLayerDefinition, FeetPharaohArmorModel::createLayerDefinition, () -> { PharaohSkin s = AgeforgedArmorConfig.get().pharaohSkin; return s.getRequiredTier() > 0 && ClientPatronState.playerTier < s.getRequiredTier() ? PharaohSkin.DEFAULT : s; }, PharaohSkin.class, SkinSyncState::pharaohSkin);
        register(QUETZALCOATL_ARMOR_NAME, EquipmentSlot.HEAD, HeadQuetzalcoatlArmorModel::new, HeadQuetzalcoatlArmorModel::createLayerDefinition);
        register(QUETZALCOATL_ARMOR_NAME, EquipmentSlot.CHEST, ChestQuetzalcoatlArmorModel::new, ChestQuetzalcoatlArmorModel::createLayerDefinition, ChestQuetzalcoatlArmorModel::createSlimLayerDefinition);
        register(QUETZALCOATL_ARMOR_NAME, EquipmentSlot.LEGS, LegsQuetzalcoatlArmorModel::new, LegsQuetzalcoatlArmorModel::createLayerDefinition);
        register(QUETZALCOATL_ARMOR_NAME, EquipmentSlot.FEET, FeetQuetzalcoatlArmorModel::new, FeetQuetzalcoatlArmorModel::createLayerDefinition);
        registerSkinned(RAIJIN_ARMOR_NAME, EquipmentSlot.HEAD, HeadRaijinArmorModel::new, HeadRaijinArmorModel::createLayerDefinition, HeadRaijinArmorModel::createSlimLayerDefinition, () -> { RaijinSkin s = AgeforgedArmorConfig.get().raijinSkin; return s.getRequiredTier() > 0 && ClientPatronState.playerTier < s.getRequiredTier() ? RaijinSkin.DEFAULT : s; }, RaijinSkin.class, SkinSyncState::raijinSkin);
        registerSkinned(RAIJIN_ARMOR_NAME, EquipmentSlot.CHEST, ChestRaijinArmorModel::new, ChestRaijinArmorModel::createLayerDefinition, ChestRaijinArmorModel::createSlimLayerDefinition, () -> { RaijinSkin s = AgeforgedArmorConfig.get().raijinSkin; return s.getRequiredTier() > 0 && ClientPatronState.playerTier < s.getRequiredTier() ? RaijinSkin.DEFAULT : s; }, RaijinSkin.class, SkinSyncState::raijinSkin);
        registerSkinned(RAIJIN_ARMOR_NAME, EquipmentSlot.LEGS, LegsRaijinArmorModel::new, LegsRaijinArmorModel::createLayerDefinition, LegsRaijinArmorModel::createSlimLayerDefinition, () -> { RaijinSkin s = AgeforgedArmorConfig.get().raijinSkin; return s.getRequiredTier() > 0 && ClientPatronState.playerTier < s.getRequiredTier() ? RaijinSkin.DEFAULT : s; }, RaijinSkin.class, SkinSyncState::raijinSkin);
        registerSkinned(RAIJIN_ARMOR_NAME, EquipmentSlot.FEET, FeetRaijinArmorModel::new, FeetRaijinArmorModel::createLayerDefinition, FeetRaijinArmorModel::createLayerDefinition, () -> { RaijinSkin s = AgeforgedArmorConfig.get().raijinSkin; return s.getRequiredTier() > 0 && ClientPatronState.playerTier < s.getRequiredTier() ? RaijinSkin.DEFAULT : s; }, RaijinSkin.class, SkinSyncState::raijinSkin);

    }

    private static void register(String armorName, EquipmentSlot slot, ArmorModelSupplier armorModelSupplier, Supplier<LayerDefinition> layerDefinition){
        ArmorModelProvider provider = ArmorModelProvider.create(armorName, slot, armorModelSupplier, layerDefinition);
        REGISTRY.put(armorName + "_" + slot.name().toLowerCase(), provider);
    }

    private static void register(String armorName, EquipmentSlot slot, ArmorModelSupplier armorModelSupplier, Supplier<LayerDefinition> layerDefinition, Supplier<LayerDefinition> slimLayerDefinition){
        ArmorModelProvider provider = ArmorModelProvider.create(armorName, slot, armorModelSupplier, layerDefinition, slimLayerDefinition);
        REGISTRY.put(armorName + "_" + slot.name().toLowerCase(), provider);
    }

    private static <E extends Enum<E> & ArmorModelProvider.SkinVariant> void registerSkinned(
            String armorName, EquipmentSlot slot, ArmorModelSupplier armorModelSupplier,
            Supplier<LayerDefinition> layerDefinition, Supplier<LayerDefinition> slimLayerDefinition,
            java.util.function.Supplier<E> skinSupplier, Class<E> enumClass,
            java.util.function.Function<SkinSyncState, E> syncStateExtractor) {
        ArmorModelProvider provider = ArmorModelProvider.create(armorName, slot, armorModelSupplier, layerDefinition, slimLayerDefinition, skinSupplier, enumClass, syncStateExtractor);
        REGISTRY.put(armorName + "_" + slot.name().toLowerCase(), provider);
    }
}