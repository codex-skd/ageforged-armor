package com.skd.ageforgedarmor.registry;

import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import com.skd.ageforgedarmor.config.AgeforgedArmorConfig;
import com.skd.ageforgedarmor.item.AgeforgedArmorMaterials;
import com.skd.ageforgedarmor.item.HatItem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

import static net.minecraft.world.item.equipment.ArmorType.*;
import static com.skd.ageforgedarmor.Constants.*;
import static com.skd.ageforgedarmor.Constants.RAIJIN_ARMOR_NAME;

public abstract class ItemRegistry {
    public static ItemRegistry REGISTRY;
    protected static final Logger LOGGER = LogManager.getLogger();

    public Supplier<Item> TAB_ICON;

    public ItemRegistry(){
        register(ANUBIS_ARMOR_NAME, AgeforgedArmorMaterials.ANUBIS, HELMET, AgeforgedArmorConfig.get().anubisDurability);
        register(ANUBIS_ARMOR_NAME, AgeforgedArmorMaterials.ANUBIS, CHESTPLATE, AgeforgedArmorConfig.get().anubisDurability);
        register(ANUBIS_ARMOR_NAME, AgeforgedArmorMaterials.ANUBIS, LEGGINGS, AgeforgedArmorConfig.get().anubisDurability);
        register(ANUBIS_ARMOR_NAME, AgeforgedArmorMaterials.ANUBIS, BOOTS, AgeforgedArmorConfig.get().anubisDurability);
        register(CENTURION_ARMOR_NAME, AgeforgedArmorMaterials.CENTURION, HELMET, AgeforgedArmorConfig.get().centurionDurability);
        register(CENTURION_ARMOR_NAME, AgeforgedArmorMaterials.CENTURION, CHESTPLATE, AgeforgedArmorConfig.get().centurionDurability);
        register(CENTURION_ARMOR_NAME, AgeforgedArmorMaterials.CENTURION, LEGGINGS, AgeforgedArmorConfig.get().centurionDurability);
        register(CENTURION_ARMOR_NAME, AgeforgedArmorMaterials.CENTURION, BOOTS, AgeforgedArmorConfig.get().centurionDurability);
        register(EXALTED_AURUM_ARMOR_NAME, AgeforgedArmorMaterials.EXALTED_AURUM, HELMET, AgeforgedArmorConfig.get().exaltedAurumDurability);
        register(EXALTED_AURUM_ARMOR_NAME, AgeforgedArmorMaterials.EXALTED_AURUM, CHESTPLATE, AgeforgedArmorConfig.get().exaltedAurumDurability);
        register(EXALTED_AURUM_ARMOR_NAME, AgeforgedArmorMaterials.EXALTED_AURUM, LEGGINGS, AgeforgedArmorConfig.get().exaltedAurumDurability);
        register(EXALTED_AURUM_ARMOR_NAME, AgeforgedArmorMaterials.EXALTED_AURUM, BOOTS, AgeforgedArmorConfig.get().exaltedAurumDurability);
        register(HOLY_ARMOR_NAME, AgeforgedArmorMaterials.HOLY, HELMET, AgeforgedArmorConfig.get().holyDurability);
        register(HOLY_ARMOR_NAME, AgeforgedArmorMaterials.HOLY, CHESTPLATE, AgeforgedArmorConfig.get().holyDurability);
        register(HOLY_ARMOR_NAME, AgeforgedArmorMaterials.HOLY, LEGGINGS, AgeforgedArmorConfig.get().holyDurability);
        register(HOLY_ARMOR_NAME, AgeforgedArmorMaterials.HOLY, BOOTS, AgeforgedArmorConfig.get().holyDurability);
        register(IRON_PLATE_ARMOR_NAME, AgeforgedArmorMaterials.IRON_PLATE, HELMET, AgeforgedArmorConfig.get().ironPlateDurability);
        register(IRON_PLATE_ARMOR_NAME, AgeforgedArmorMaterials.IRON_PLATE, CHESTPLATE, AgeforgedArmorConfig.get().ironPlateDurability);
        register(IRON_PLATE_ARMOR_NAME, AgeforgedArmorMaterials.IRON_PLATE, LEGGINGS, AgeforgedArmorConfig.get().ironPlateDurability);
        register(IRON_PLATE_ARMOR_NAME, AgeforgedArmorMaterials.IRON_PLATE, BOOTS, AgeforgedArmorConfig.get().ironPlateDurability);
        register(JAPANESE_LIGHT_ARMOR_NAME, AgeforgedArmorMaterials.JAPANESE_LIGHT, HELMET, AgeforgedArmorConfig.get().japaneseLightDurability);
        register(JAPANESE_LIGHT_ARMOR_NAME, AgeforgedArmorMaterials.JAPANESE_LIGHT, CHESTPLATE, AgeforgedArmorConfig.get().japaneseLightDurability);
        register(JAPANESE_LIGHT_ARMOR_NAME, AgeforgedArmorMaterials.JAPANESE_LIGHT, LEGGINGS, AgeforgedArmorConfig.get().japaneseLightDurability);
        register(JAPANESE_LIGHT_ARMOR_NAME, AgeforgedArmorMaterials.JAPANESE_LIGHT, BOOTS, AgeforgedArmorConfig.get().japaneseLightDurability);
        register(O_YOROI_ARMOR_NAME, AgeforgedArmorMaterials.O_YOROI, HELMET, AgeforgedArmorConfig.get().oYoroiDurability);
        register(O_YOROI_ARMOR_NAME, AgeforgedArmorMaterials.O_YOROI, CHESTPLATE, AgeforgedArmorConfig.get().oYoroiDurability);
        register(O_YOROI_ARMOR_NAME, AgeforgedArmorMaterials.O_YOROI, LEGGINGS, AgeforgedArmorConfig.get().oYoroiDurability);
        register(O_YOROI_ARMOR_NAME, AgeforgedArmorMaterials.O_YOROI, BOOTS, AgeforgedArmorConfig.get().oYoroiDurability);
        register(PHARAOH_ARMOR_NAME, AgeforgedArmorMaterials.PHARAOH, HELMET, AgeforgedArmorConfig.get().pharaohDurability);
        register(PHARAOH_ARMOR_NAME, AgeforgedArmorMaterials.PHARAOH, CHESTPLATE, AgeforgedArmorConfig.get().pharaohDurability);
        register(PHARAOH_ARMOR_NAME, AgeforgedArmorMaterials.PHARAOH, LEGGINGS, AgeforgedArmorConfig.get().pharaohDurability);
        register(PHARAOH_ARMOR_NAME, AgeforgedArmorMaterials.PHARAOH, BOOTS, AgeforgedArmorConfig.get().pharaohDurability);
        register(QUETZALCOATL_ARMOR_NAME, AgeforgedArmorMaterials.QUETZALCOATL, HELMET, AgeforgedArmorConfig.get().quetzalcoatlDurability);
        register(QUETZALCOATL_ARMOR_NAME, AgeforgedArmorMaterials.QUETZALCOATL, CHESTPLATE, AgeforgedArmorConfig.get().quetzalcoatlDurability);
        register(QUETZALCOATL_ARMOR_NAME, AgeforgedArmorMaterials.QUETZALCOATL, LEGGINGS, AgeforgedArmorConfig.get().quetzalcoatlDurability);
        register(QUETZALCOATL_ARMOR_NAME, AgeforgedArmorMaterials.QUETZALCOATL, BOOTS, AgeforgedArmorConfig.get().quetzalcoatlDurability);
        register(RAIJIN_ARMOR_NAME, AgeforgedArmorMaterials.RAIJIN, HELMET, AgeforgedArmorConfig.get().raijinDurability);
        register(RAIJIN_ARMOR_NAME, AgeforgedArmorMaterials.RAIJIN, CHESTPLATE, AgeforgedArmorConfig.get().raijinDurability);
        register(RAIJIN_ARMOR_NAME, AgeforgedArmorMaterials.RAIJIN, LEGGINGS, AgeforgedArmorConfig.get().raijinDurability);
        register(RAIJIN_ARMOR_NAME, AgeforgedArmorMaterials.RAIJIN, BOOTS, AgeforgedArmorConfig.get().raijinDurability);
        LOGGER.info("ItemRegistry: registered 44 armor pieces + tab icon");
    }

    public abstract Supplier<Item> register(final String name, final Supplier<Item> itemSupplier);

    public abstract void register(String armorSetName, Holder<ArmorMaterial> material, ArmorType slot, int durabilityFactor);
}
