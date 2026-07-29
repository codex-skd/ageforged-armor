package com.skd.ageforgedarmor.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static com.skd.ageforgedarmor.Constants.MOD_ID;

public class AgeforgedArmorTags {
    public static class Items {
        private static TagKey<Item> tag(String path) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, path));
        }

        public static final TagKey<Item> IRON_PLATE_REPAIR = tag("repair/iron_plate");
        public static final TagKey<Item> HOLY_REPAIR = tag("repair/holy");
        public static final TagKey<Item> EXALTED_AURUM_REPAIR = tag("repair/exalted_aurum");
        public static final TagKey<Item> JAPANESE_LIGHT_REPAIR = tag("repair/japanese_light");
        public static final TagKey<Item> O_YOROI_REPAIR = tag("repair/o_yoroi");
        public static final TagKey<Item> RAIJIN_REPAIR = tag("repair/raijin");
        public static final TagKey<Item> PHARAOH_REPAIR = tag("repair/pharaoh");
        public static final TagKey<Item> ANUBIS_REPAIR = tag("repair/anubis");
        public static final TagKey<Item> CENTURION_REPAIR = tag("repair/centurion");
        public static final TagKey<Item> QUETZALCOATL_REPAIR = tag("repair/quetzalcoatl");
    }
}
