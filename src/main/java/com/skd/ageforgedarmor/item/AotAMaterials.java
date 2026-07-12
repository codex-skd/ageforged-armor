package com.skd.ageforgedarmor.item;

import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import com.skd.ageforgedarmor.config.AOTAConfig;
import com.skd.ageforgedarmor.registry.AotATags;
import com.skd.ageforgedarmor.registry.ArmorMaterialRegistry;

import java.util.Map;

import static com.skd.ageforgedarmor.Constants.MOD_ID;

public class AotAMaterials {

    private static Map<ArmorType, Integer> defMap(int helmet, int chestplate, int leggings, int boots) {
        return Map.of(
            ArmorType.HELMET, helmet,
            ArmorType.CHESTPLATE, chestplate,
            ArmorType.LEGGINGS, leggings,
            ArmorType.BOOTS, boots
        );
    }

    private static ResourceKey<EquipmentAsset> asset(String name) {
        return ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(MOD_ID, name));
    }

    public static final Holder<ArmorMaterial> IRON_PLATE = ArmorMaterialRegistry.REGISTRY.register("iron_plate",
        new ArmorMaterial(AOTAConfig.get().ironPlateDurability,
            defMap(AOTAConfig.get().ironPlateHelmetDef, AOTAConfig.get().ironPlateChestDef,
                   AOTAConfig.get().ironPlateLegsDef, AOTAConfig.get().ironPlateFeetDef),
            AOTAConfig.get().ironPlateEnchantability, SoundEvents.ARMOR_EQUIP_IRON,
            AOTAConfig.get().ironPlateToughness, 0.0F,
            AotATags.Items.IRON_PLATE_REPAIR, asset("iron_plate"))
    );

    public static final Holder<ArmorMaterial> HOLY = ArmorMaterialRegistry.REGISTRY.register("holy",
        new ArmorMaterial(AOTAConfig.get().holyDurability,
            defMap(AOTAConfig.get().holyHelmetDef, AOTAConfig.get().holyChestDef,
                   AOTAConfig.get().holyLegsDef, AOTAConfig.get().holyFeetDef),
            AOTAConfig.get().holyEnchantability, SoundEvents.ARMOR_EQUIP_DIAMOND,
            AOTAConfig.get().holyToughness, AOTAConfig.get().holyKnockbackResistance,
            AotATags.Items.HOLY_REPAIR, asset("holy"))
    );

    public static final Holder<ArmorMaterial> EXALTED_AURUM = ArmorMaterialRegistry.REGISTRY.register("exalted_aurum",
        new ArmorMaterial(AOTAConfig.get().exaltedAurumDurability,
            defMap(AOTAConfig.get().exaltedAurumHelmetDef, AOTAConfig.get().exaltedAurumChestDef,
                   AOTAConfig.get().exaltedAurumLegsDef, AOTAConfig.get().exaltedAurumFeetDef),
            AOTAConfig.get().exaltedAurumEnchantability, SoundEvents.ARMOR_EQUIP_IRON,
            AOTAConfig.get().exaltedAurumToughness, AOTAConfig.get().exaltedAurumKnockbackResistance,
            AotATags.Items.EXALTED_AURUM_REPAIR, asset("exalted_aurum"))
    );

    public static final Holder<ArmorMaterial> JAPANESE_LIGHT = ArmorMaterialRegistry.REGISTRY.register("japanese_light",
        new ArmorMaterial(AOTAConfig.get().japaneseLightDurability,
            defMap(AOTAConfig.get().japaneseLightHelmetDef, AOTAConfig.get().japaneseLightChestDef,
                   AOTAConfig.get().japaneseLightLegsDef, AOTAConfig.get().japaneseLightFeetDef),
            AOTAConfig.get().japaneseLightEnchantability, SoundEvents.ARMOR_EQUIP_LEATHER,
            AOTAConfig.get().japaneseLightToughness, 0.0F,
            AotATags.Items.JAPANESE_LIGHT_REPAIR, asset("japanese_light"))
    );

    public static final Holder<ArmorMaterial> O_YOROI = ArmorMaterialRegistry.REGISTRY.register("o_yoroi",
        new ArmorMaterial(AOTAConfig.get().oYoroiDurability,
            defMap(AOTAConfig.get().oYoroiHelmetDef, AOTAConfig.get().oYoroiChestDef,
                   AOTAConfig.get().oYoroiLegsDef, AOTAConfig.get().oYoroiFeetDef),
            AOTAConfig.get().oYoroiEnchantability, SoundEvents.ARMOR_EQUIP_IRON,
            AOTAConfig.get().oYoroiToughness, 0.0F,
            AotATags.Items.O_YOROI_REPAIR, asset("o_yoroi"))
    );

    public static final Holder<ArmorMaterial> RAIJIN = ArmorMaterialRegistry.REGISTRY.register("raijin",
        new ArmorMaterial(AOTAConfig.get().raijinDurability,
            defMap(AOTAConfig.get().raijinHelmetDef, AOTAConfig.get().raijinChestDef,
                   AOTAConfig.get().raijinLegsDef, AOTAConfig.get().raijinFeetDef),
            AOTAConfig.get().raijinEnchantability, SoundEvents.ARMOR_EQUIP_LEATHER,
            AOTAConfig.get().raijinToughness, AOTAConfig.get().raijinKnockbackResistance,
            AotATags.Items.RAIJIN_REPAIR, asset("raijin"))
    );

    public static final Holder<ArmorMaterial> PHARAOH = ArmorMaterialRegistry.REGISTRY.register("pharaoh",
        new ArmorMaterial(AOTAConfig.get().pharaohDurability,
            defMap(AOTAConfig.get().pharaohHelmetDef, AOTAConfig.get().pharaohChestDef,
                   AOTAConfig.get().pharaohLegsDef, AOTAConfig.get().pharaohFeetDef),
            AOTAConfig.get().pharaohEnchantability, SoundEvents.ARMOR_EQUIP_GOLD,
            AOTAConfig.get().pharaohToughness, 0.0F,
            AotATags.Items.PHARAOH_REPAIR, asset("pharaoh"))
    );

    public static final Holder<ArmorMaterial> ANUBIS = ArmorMaterialRegistry.REGISTRY.register("anubis",
        new ArmorMaterial(AOTAConfig.get().anubisDurability,
            defMap(AOTAConfig.get().anubisHelmetDef, AOTAConfig.get().anubisChestDef,
                   AOTAConfig.get().anubisLegsDef, AOTAConfig.get().anubisFeetDef),
            AOTAConfig.get().anubisEnchantability, SoundEvents.ARMOR_EQUIP_GOLD,
            AOTAConfig.get().anubisToughness, AOTAConfig.get().anubisKnockbackResistance,
            AotATags.Items.ANUBIS_REPAIR, asset("anubis"))
    );

    public static final Holder<ArmorMaterial> CENTURION = ArmorMaterialRegistry.REGISTRY.register("centurion",
        new ArmorMaterial(AOTAConfig.get().centurionDurability,
            defMap(AOTAConfig.get().centurionHelmetDef, AOTAConfig.get().centurionChestDef,
                   AOTAConfig.get().centurionLegsDef, AOTAConfig.get().centurionFeetDef),
            AOTAConfig.get().centurionEnchantability, SoundEvents.ARMOR_EQUIP_CHAIN,
            AOTAConfig.get().centurionToughness, 0.0F,
            AotATags.Items.CENTURION_REPAIR, asset("centurion"))
    );

    public static final Holder<ArmorMaterial> QUETZALCOATL = ArmorMaterialRegistry.REGISTRY.register("quetzalcoatl",
        new ArmorMaterial(AOTAConfig.get().quetzalcoatlDurability,
            defMap(AOTAConfig.get().quetzalcoatlHelmetDef, AOTAConfig.get().quetzalcoatlChestDef,
                   AOTAConfig.get().quetzalcoatlLegsDef, AOTAConfig.get().quetzalcoatlFeetDef),
            AOTAConfig.get().quetzalcoatlEnchantability, SoundEvents.ARMOR_EQUIP_TURTLE,
            AOTAConfig.get().quetzalcoatlToughness, AOTAConfig.get().quetzalcoatlKnockbackResistance,
            AotATags.Items.QUETZALCOATL_REPAIR, asset("quetzalcoatl"))
    );
}
