package com.skd.ageforgedarmor.item;

import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import com.skd.ageforgedarmor.config.AgeforgedArmorConfig;
import com.skd.ageforgedarmor.registry.AgeforgedArmorTags;
import com.skd.ageforgedarmor.registry.ArmorMaterialRegistry;

import java.util.Map;

import static com.skd.ageforgedarmor.Constants.MOD_ID;

public class AgeforgedArmorMaterials {

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
        new ArmorMaterial(AgeforgedArmorConfig.get().ironPlateDurability,
            defMap(AgeforgedArmorConfig.get().ironPlateHelmetDef, AgeforgedArmorConfig.get().ironPlateChestDef,
                   AgeforgedArmorConfig.get().ironPlateLegsDef, AgeforgedArmorConfig.get().ironPlateFeetDef),
            AgeforgedArmorConfig.get().ironPlateEnchantability, SoundEvents.ARMOR_EQUIP_IRON,
            AgeforgedArmorConfig.get().ironPlateToughness, 0.0F,
            AgeforgedArmorTags.Items.IRON_PLATE_REPAIR, asset("iron_plate"))
    );

    public static final Holder<ArmorMaterial> HOLY = ArmorMaterialRegistry.REGISTRY.register("holy",
        new ArmorMaterial(AgeforgedArmorConfig.get().holyDurability,
            defMap(AgeforgedArmorConfig.get().holyHelmetDef, AgeforgedArmorConfig.get().holyChestDef,
                   AgeforgedArmorConfig.get().holyLegsDef, AgeforgedArmorConfig.get().holyFeetDef),
            AgeforgedArmorConfig.get().holyEnchantability, SoundEvents.ARMOR_EQUIP_DIAMOND,
            AgeforgedArmorConfig.get().holyToughness, AgeforgedArmorConfig.get().holyKnockbackResistance,
            AgeforgedArmorTags.Items.HOLY_REPAIR, asset("holy"))
    );

    public static final Holder<ArmorMaterial> EXALTED_AURUM = ArmorMaterialRegistry.REGISTRY.register("exalted_aurum",
        new ArmorMaterial(AgeforgedArmorConfig.get().exaltedAurumDurability,
            defMap(AgeforgedArmorConfig.get().exaltedAurumHelmetDef, AgeforgedArmorConfig.get().exaltedAurumChestDef,
                   AgeforgedArmorConfig.get().exaltedAurumLegsDef, AgeforgedArmorConfig.get().exaltedAurumFeetDef),
            AgeforgedArmorConfig.get().exaltedAurumEnchantability, SoundEvents.ARMOR_EQUIP_IRON,
            AgeforgedArmorConfig.get().exaltedAurumToughness, AgeforgedArmorConfig.get().exaltedAurumKnockbackResistance,
            AgeforgedArmorTags.Items.EXALTED_AURUM_REPAIR, asset("exalted_aurum"))
    );

    public static final Holder<ArmorMaterial> JAPANESE_LIGHT = ArmorMaterialRegistry.REGISTRY.register("japanese_light",
        new ArmorMaterial(AgeforgedArmorConfig.get().japaneseLightDurability,
            defMap(AgeforgedArmorConfig.get().japaneseLightHelmetDef, AgeforgedArmorConfig.get().japaneseLightChestDef,
                   AgeforgedArmorConfig.get().japaneseLightLegsDef, AgeforgedArmorConfig.get().japaneseLightFeetDef),
            AgeforgedArmorConfig.get().japaneseLightEnchantability, SoundEvents.ARMOR_EQUIP_LEATHER,
            AgeforgedArmorConfig.get().japaneseLightToughness, 0.0F,
            AgeforgedArmorTags.Items.JAPANESE_LIGHT_REPAIR, asset("japanese_light"))
    );

    public static final Holder<ArmorMaterial> O_YOROI = ArmorMaterialRegistry.REGISTRY.register("o_yoroi",
        new ArmorMaterial(AgeforgedArmorConfig.get().oYoroiDurability,
            defMap(AgeforgedArmorConfig.get().oYoroiHelmetDef, AgeforgedArmorConfig.get().oYoroiChestDef,
                   AgeforgedArmorConfig.get().oYoroiLegsDef, AgeforgedArmorConfig.get().oYoroiFeetDef),
            AgeforgedArmorConfig.get().oYoroiEnchantability, SoundEvents.ARMOR_EQUIP_IRON,
            AgeforgedArmorConfig.get().oYoroiToughness, 0.0F,
            AgeforgedArmorTags.Items.O_YOROI_REPAIR, asset("o_yoroi"))
    );

    public static final Holder<ArmorMaterial> RAIJIN = ArmorMaterialRegistry.REGISTRY.register("raijin",
        new ArmorMaterial(AgeforgedArmorConfig.get().raijinDurability,
            defMap(AgeforgedArmorConfig.get().raijinHelmetDef, AgeforgedArmorConfig.get().raijinChestDef,
                   AgeforgedArmorConfig.get().raijinLegsDef, AgeforgedArmorConfig.get().raijinFeetDef),
            AgeforgedArmorConfig.get().raijinEnchantability, SoundEvents.ARMOR_EQUIP_LEATHER,
            AgeforgedArmorConfig.get().raijinToughness, AgeforgedArmorConfig.get().raijinKnockbackResistance,
            AgeforgedArmorTags.Items.RAIJIN_REPAIR, asset("raijin"))
    );

    public static final Holder<ArmorMaterial> PHARAOH = ArmorMaterialRegistry.REGISTRY.register("pharaoh",
        new ArmorMaterial(AgeforgedArmorConfig.get().pharaohDurability,
            defMap(AgeforgedArmorConfig.get().pharaohHelmetDef, AgeforgedArmorConfig.get().pharaohChestDef,
                   AgeforgedArmorConfig.get().pharaohLegsDef, AgeforgedArmorConfig.get().pharaohFeetDef),
            AgeforgedArmorConfig.get().pharaohEnchantability, SoundEvents.ARMOR_EQUIP_GOLD,
            AgeforgedArmorConfig.get().pharaohToughness, 0.0F,
            AgeforgedArmorTags.Items.PHARAOH_REPAIR, asset("pharaoh"))
    );

    public static final Holder<ArmorMaterial> ANUBIS = ArmorMaterialRegistry.REGISTRY.register("anubis",
        new ArmorMaterial(AgeforgedArmorConfig.get().anubisDurability,
            defMap(AgeforgedArmorConfig.get().anubisHelmetDef, AgeforgedArmorConfig.get().anubisChestDef,
                   AgeforgedArmorConfig.get().anubisLegsDef, AgeforgedArmorConfig.get().anubisFeetDef),
            AgeforgedArmorConfig.get().anubisEnchantability, SoundEvents.ARMOR_EQUIP_GOLD,
            AgeforgedArmorConfig.get().anubisToughness, AgeforgedArmorConfig.get().anubisKnockbackResistance,
            AgeforgedArmorTags.Items.ANUBIS_REPAIR, asset("anubis"))
    );

    public static final Holder<ArmorMaterial> CENTURION = ArmorMaterialRegistry.REGISTRY.register("centurion",
        new ArmorMaterial(AgeforgedArmorConfig.get().centurionDurability,
            defMap(AgeforgedArmorConfig.get().centurionHelmetDef, AgeforgedArmorConfig.get().centurionChestDef,
                   AgeforgedArmorConfig.get().centurionLegsDef, AgeforgedArmorConfig.get().centurionFeetDef),
            AgeforgedArmorConfig.get().centurionEnchantability, SoundEvents.ARMOR_EQUIP_CHAIN,
            AgeforgedArmorConfig.get().centurionToughness, 0.0F,
            AgeforgedArmorTags.Items.CENTURION_REPAIR, asset("centurion"))
    );

    public static final Holder<ArmorMaterial> QUETZALCOATL = ArmorMaterialRegistry.REGISTRY.register("quetzalcoatl",
        new ArmorMaterial(AgeforgedArmorConfig.get().quetzalcoatlDurability,
            defMap(AgeforgedArmorConfig.get().quetzalcoatlHelmetDef, AgeforgedArmorConfig.get().quetzalcoatlChestDef,
                   AgeforgedArmorConfig.get().quetzalcoatlLegsDef, AgeforgedArmorConfig.get().quetzalcoatlFeetDef),
            AgeforgedArmorConfig.get().quetzalcoatlEnchantability, SoundEvents.ARMOR_EQUIP_TURTLE,
            AgeforgedArmorConfig.get().quetzalcoatlToughness, AgeforgedArmorConfig.get().quetzalcoatlKnockbackResistance,
            AgeforgedArmorTags.Items.QUETZALCOATL_REPAIR, asset("quetzalcoatl"))
    );
}
