package com.skd.ageforgedarmor.item;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.Model;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import com.skd.ageforgedarmor.ArmorOfTheAgesForge;
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

    public static void registerClientExtensions(RegisterClientExtensionsEvent event) {
        IClientItemExtensions extensions = new IClientItemExtensions() {
            private ArmorModelProvider getProvider(ItemStack stack) {
                if (stack.getItem() instanceof ForgeHumanoidArmorItem armorItem) {
                    return armorItem.getModelProvider();
                }
                return null;
            }

            @Override
            public @NotNull Model getHumanoidArmorModel(ItemStack stack, EquipmentClientInfo.LayerType layerType, Model defaultModel) {
                ArmorModelProvider provider = getProvider(stack);
                if (provider != null && defaultModel instanceof HumanoidModel<?> humanoidDefault) {
                    HumanoidModel<?> model = provider.getArmorModel((Entity) null);
                    if (model != null) {
                        return model;
                    }
                }
                return defaultModel;
            }

            @Override
            public void setupModelAnimations(LivingEntity living, ItemStack stack, EquipmentSlot slot, Model model, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
                if (model instanceof HumanoidModel<?> humanoidModel) {
                    // crouching handled by state in new API
                }
            }
        };

        ArmorOfTheAgesForge.ItemRegistryImpl.DEFERRED_REGISTER.getEntries()
            .stream()
            .map(DeferredHolder::get)
            .filter(item -> item instanceof ForgeHumanoidArmorItem)
            .forEach(item -> event.registerItem(extensions, item));
    }
}
