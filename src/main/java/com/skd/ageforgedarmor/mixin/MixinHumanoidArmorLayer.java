package com.skd.ageforgedarmor.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import com.skd.ageforgedarmor.client.ArmorModelProvider;
import com.skd.ageforgedarmor.client.models.ArmorModel;
import com.skd.ageforgedarmor.item.HumanoidArmorItem;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HumanoidArmorLayer.class)
public abstract class MixinHumanoidArmorLayer {

    @WrapOperation(
        method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/HumanoidRenderState;FF)V",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/renderer/entity/layers/HumanoidArmorLayer;renderArmorPiece(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/EquipmentSlot;ILnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V"
        ),
        require = 0
    )
    private void wrapRenderArmorPiece(HumanoidArmorLayer instance, PoseStack poseStack, SubmitNodeCollector collector, ItemStack stack,
                                       EquipmentSlot slot, int packedLight, HumanoidRenderState state,
                                       Operation<Void> original) {
        if (stack.getItem() instanceof HumanoidArmorItem) {
            original.call(instance, poseStack, collector, ItemStack.EMPTY, slot, packedLight, state);
        } else {
            original.call(instance, poseStack, collector, stack, slot, packedLight, state);
        }
    }

    @Inject(
        method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/HumanoidRenderState;FF)V",
        at = @At("TAIL"),
        require = 0
    )
    private void afterSubmit(PoseStack poseStack, SubmitNodeCollector collector, int packedLight,
                             HumanoidRenderState renderState, float limbSwing, float limbSwingAmount,
                             CallbackInfo ci) {
        renderCustomArmorPiece(poseStack, collector, renderState, EquipmentSlot.HEAD, packedLight);
        renderCustomArmorPiece(poseStack, collector, renderState, EquipmentSlot.CHEST, packedLight);
        renderCustomArmorPiece(poseStack, collector, renderState, EquipmentSlot.LEGS, packedLight);
        renderCustomArmorPiece(poseStack, collector, renderState, EquipmentSlot.FEET, packedLight);
    }

    @Unique
    private void renderCustomArmorPiece(PoseStack poseStack, SubmitNodeCollector collector,
                                         HumanoidRenderState renderState, EquipmentSlot slot, int packedLight) {
        ItemStack itemStack = getEquipmentForSlot(renderState, slot);
        if (!(itemStack.getItem() instanceof HumanoidArmorItem armorItem)) return;

        ArmorModelProvider provider = armorItem.getModelProvider();
        if (provider == null) return;

        ArmorModel model = provider.getArmorModel(Minecraft.getInstance().player);
        if (model == null) return;

        model.setupAnim(renderState);
        Identifier texture = provider.getTexture(Minecraft.getInstance().player);
        if (texture == null) return;

        int order = slot.ordinal() * 2;

        collector.order(order)
                .submitModel(model, renderState, poseStack,
                        net.minecraft.client.renderer.rendertype.RenderTypes.armorCutoutNoCull(texture),
                        packedLight, OverlayTexture.NO_OVERLAY, -1, null, 0, null);

        if (itemStack.hasFoil()) {
            collector.order(order + 1)
                    .submitModel(model, renderState, poseStack,
                            net.minecraft.client.renderer.rendertype.RenderTypes.armorEntityGlint(),
                            packedLight, OverlayTexture.NO_OVERLAY, -1, null, 0, null);
        }
    }

    @Unique
    private static ItemStack getEquipmentForSlot(HumanoidRenderState state, EquipmentSlot slot) {
        return switch (slot) {
            case HEAD -> state.headEquipment;
            case CHEST -> state.chestEquipment;
            case LEGS -> state.legsEquipment;
            case FEET -> state.feetEquipment;
            default -> ItemStack.EMPTY;
        };
    }
}