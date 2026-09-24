package com.skd.ageforgedarmor.item;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.Model;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import com.skd.ageforgedarmor.AgeforgedArmor;
import com.skd.ageforgedarmor.client.ArmorModelProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ForgeHumanoidArmorItem extends HumanoidArmorItem{
    /**
    This class only purpose is to match forge standard armor behavior, expected from other mods.
    Some mods call the ForgeHooksClient#getArmorModel() method, to get and use the custom models.
    All the function in this class are never called or used to render our armors by default.
    */
    public ForgeHumanoidArmorItem(@NotNull String armorSetName, Holder<ArmorMaterial> material, ArmorType type, int durabilityFactor) {
        super(armorSetName, material, type, durabilityFactor);
    }

    public ForgeHumanoidArmorItem(@NotNull String armorSetName, Item.Properties properties, Holder<ArmorMaterial> material, ArmorType type, int durabilityFactor) {
        super(armorSetName, properties, material, type, durabilityFactor);
    }

    public static void registerClientExtensions(RegisterClientExtensionsEvent event) {
        IClientItemExtensions extensions = new IClientItemExtensions() {
            @Override
            public @NotNull Model getHumanoidArmorModel(ItemStack stack, EquipmentClientInfo.LayerType layerType, Model defaultModel) {
                return defaultModel;
            }
        };

        AgeforgedArmor.ItemRegistryImpl.DEFERRED_REGISTER.getEntries()
            .stream()
            .map(DeferredHolder::get)
            .filter(item -> item instanceof ForgeHumanoidArmorItem)
            .forEach(item -> event.registerItem(extensions, item));
    }
}
