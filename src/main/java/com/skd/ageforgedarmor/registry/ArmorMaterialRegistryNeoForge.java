package com.skd.ageforgedarmor.registry;

import net.minecraft.core.Holder;
import net.minecraft.world.item.equipment.ArmorMaterial;

public class ArmorMaterialRegistryNeoForge extends ArmorMaterialRegistry {
    @Override
    public Holder<ArmorMaterial> register(String name, ArmorMaterial material) {
        return Holder.direct(material);
    }
}