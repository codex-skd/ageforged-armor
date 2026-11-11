package com.skd.ageforgedarmor.registry;

import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.equipment.ArmorMaterial;

public abstract class ArmorMaterialRegistry {
    public static ArmorMaterialRegistry REGISTRY;

    public abstract Holder<ArmorMaterial> register(String name, ArmorMaterial material);

    protected static Identifier id(String name) {
        return Identifier.fromNamespaceAndPath("ageforged_armor", name);
    }
}