package com.skd.ageforgedarmor.registry;

import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import com.skd.ageforgedarmor.config.AOTAConfig;
import com.skd.ageforgedarmor.item.AotAMaterials;
import com.skd.ageforgedarmor.item.HatItem;

import java.util.function.Supplier;

import static net.minecraft.world.item.equipment.ArmorType.*;
import static com.skd.ageforgedarmor.Constants.*;
import static com.skd.ageforgedarmor.Constants.RAIJIN_ARMOR_NAME;

public abstract class ItemRegistry {
    public static ItemRegistry REGISTRY;

    public Supplier<Item> TAB_ICON;

    public ItemRegistry(){
        register(ANUBIS_ARMOR_NAME, AotAMaterials.ANUBIS, HELMET, AOTAConfig.get().anubisDurability);
        register(ANUBIS_ARMOR_NAME, AotAMaterials.ANUBIS, CHESTPLATE, AOTAConfig.get().anubisDurability);
        register(ANUBIS_ARMOR_NAME, AotAMaterials.ANUBIS, LEGGINGS, AOTAConfig.get().anubisDurability);
        register(ANUBIS_ARMOR_NAME, AotAMaterials.ANUBIS, BOOTS, AOTAConfig.get().anubisDurability);
        register(CENTURION_ARMOR_NAME, AotAMaterials.CENTURION, HELMET, AOTAConfig.get().centurionDurability);
        register(CENTURION_ARMOR_NAME, AotAMaterials.CENTURION, CHESTPLATE, AOTAConfig.get().centurionDurability);
        register(CENTURION_ARMOR_NAME, AotAMaterials.CENTURION, LEGGINGS, AOTAConfig.get().centurionDurability);
        register(CENTURION_ARMOR_NAME, AotAMaterials.CENTURION, BOOTS, AOTAConfig.get().centurionDurability);
        register(EXALTED_AURUM_ARMOR_NAME, AotAMaterials.EXALTED_AURUM, HELMET, AOTAConfig.get().exaltedAurumDurability);
        register(EXALTED_AURUM_ARMOR_NAME, AotAMaterials.EXALTED_AURUM, CHESTPLATE, AOTAConfig.get().exaltedAurumDurability);
        register(EXALTED_AURUM_ARMOR_NAME, AotAMaterials.EXALTED_AURUM, LEGGINGS, AOTAConfig.get().exaltedAurumDurability);
        register(EXALTED_AURUM_ARMOR_NAME, AotAMaterials.EXALTED_AURUM, BOOTS, AOTAConfig.get().exaltedAurumDurability);
        register(HOLY_ARMOR_NAME, AotAMaterials.HOLY, HELMET, AOTAConfig.get().holyDurability);
        register(HOLY_ARMOR_NAME, AotAMaterials.HOLY, CHESTPLATE, AOTAConfig.get().holyDurability);
        register(HOLY_ARMOR_NAME, AotAMaterials.HOLY, LEGGINGS, AOTAConfig.get().holyDurability);
        register(HOLY_ARMOR_NAME, AotAMaterials.HOLY, BOOTS, AOTAConfig.get().holyDurability);
        register(IRON_PLATE_ARMOR_NAME, AotAMaterials.IRON_PLATE, HELMET, AOTAConfig.get().ironPlateDurability);
        register(IRON_PLATE_ARMOR_NAME, AotAMaterials.IRON_PLATE, CHESTPLATE, AOTAConfig.get().ironPlateDurability);
        register(IRON_PLATE_ARMOR_NAME, AotAMaterials.IRON_PLATE, LEGGINGS, AOTAConfig.get().ironPlateDurability);
        register(IRON_PLATE_ARMOR_NAME, AotAMaterials.IRON_PLATE, BOOTS, AOTAConfig.get().ironPlateDurability);
        register(JAPANESE_LIGHT_ARMOR_NAME, AotAMaterials.JAPANESE_LIGHT, HELMET, AOTAConfig.get().japaneseLightDurability);
        register(JAPANESE_LIGHT_ARMOR_NAME, AotAMaterials.JAPANESE_LIGHT, CHESTPLATE, AOTAConfig.get().japaneseLightDurability);
        register(JAPANESE_LIGHT_ARMOR_NAME, AotAMaterials.JAPANESE_LIGHT, LEGGINGS, AOTAConfig.get().japaneseLightDurability);
        register(JAPANESE_LIGHT_ARMOR_NAME, AotAMaterials.JAPANESE_LIGHT, BOOTS, AOTAConfig.get().japaneseLightDurability);
        register(O_YOROI_ARMOR_NAME, AotAMaterials.O_YOROI, HELMET, AOTAConfig.get().oYoroiDurability);
        register(O_YOROI_ARMOR_NAME, AotAMaterials.O_YOROI, CHESTPLATE, AOTAConfig.get().oYoroiDurability);
        register(O_YOROI_ARMOR_NAME, AotAMaterials.O_YOROI, LEGGINGS, AOTAConfig.get().oYoroiDurability);
        register(O_YOROI_ARMOR_NAME, AotAMaterials.O_YOROI, BOOTS, AOTAConfig.get().oYoroiDurability);
        register(PHARAOH_ARMOR_NAME, AotAMaterials.PHARAOH, HELMET, AOTAConfig.get().pharaohDurability);
        register(PHARAOH_ARMOR_NAME, AotAMaterials.PHARAOH, CHESTPLATE, AOTAConfig.get().pharaohDurability);
        register(PHARAOH_ARMOR_NAME, AotAMaterials.PHARAOH, LEGGINGS, AOTAConfig.get().pharaohDurability);
        register(PHARAOH_ARMOR_NAME, AotAMaterials.PHARAOH, BOOTS, AOTAConfig.get().pharaohDurability);
        register(QUETZALCOATL_ARMOR_NAME, AotAMaterials.QUETZALCOATL, HELMET, AOTAConfig.get().quetzalcoatlDurability);
        register(QUETZALCOATL_ARMOR_NAME, AotAMaterials.QUETZALCOATL, CHESTPLATE, AOTAConfig.get().quetzalcoatlDurability);
        register(QUETZALCOATL_ARMOR_NAME, AotAMaterials.QUETZALCOATL, LEGGINGS, AOTAConfig.get().quetzalcoatlDurability);
        register(QUETZALCOATL_ARMOR_NAME, AotAMaterials.QUETZALCOATL, BOOTS, AOTAConfig.get().quetzalcoatlDurability);
        register(RAIJIN_ARMOR_NAME, AotAMaterials.RAIJIN, HELMET, AOTAConfig.get().raijinDurability);
        register(RAIJIN_ARMOR_NAME, AotAMaterials.RAIJIN, CHESTPLATE, AOTAConfig.get().raijinDurability);
        register(RAIJIN_ARMOR_NAME, AotAMaterials.RAIJIN, LEGGINGS, AOTAConfig.get().raijinDurability);
        register(RAIJIN_ARMOR_NAME, AotAMaterials.RAIJIN, BOOTS, AOTAConfig.get().raijinDurability);
    }

    public abstract Supplier<Item> register(final String name, final Supplier<Item> itemSupplier);

    public abstract void register(String armorSetName, Holder<ArmorMaterial> material, ArmorType slot, int durabilityFactor);
}
