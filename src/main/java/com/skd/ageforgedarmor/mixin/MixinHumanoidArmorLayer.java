package com.skd.ageforgedarmor.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
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
        boolean useCustomModel = stack.getItem() instanceof HumanoidArmorItem armorItem
                && armorItem.getModelProvider() != null;
        if (useCustomModel) {
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

        // ArmorModel extends PlayerModel (so PlayerAnimationLib's PlayerModel.setupAnim() mixin
        // applies to it when worn by a real player), which only accepts AvatarRenderState - both
        // setupAnim() and submitModel() are generically bound to that type. For any other wearer
        // (an ArmorStand, or the fake entity mods like Legendary Tooltips use to preview items),
        // build a throwaway AvatarRenderState carrying the same pose data instead of skipping the
        // render entirely.
        AvatarRenderState avatarState = renderState instanceof AvatarRenderState real ? real : toAvatarRenderState(renderState);

        ArmorModel model = provider.getArmorModel(Minecraft.getInstance().player);
        if (model == null) return;

        Identifier texture = provider.getTexture(Minecraft.getInstance().player);
        if (texture == null) return;

        model.setupAnim(avatarState);

        int order = 1000 + slot.ordinal() * 2;

        collector.order(order)
                .submitModel(model, avatarState, poseStack,
                        net.minecraft.client.renderer.rendertype.RenderTypes.armorCutoutNoCull(texture),
                        packedLight, OverlayTexture.NO_OVERLAY, -1, null, 0, null);

        if (itemStack.hasFoil()) {
            collector.order(order + 1)
                    .submitModel(model, avatarState, poseStack,
                            net.minecraft.client.renderer.rendertype.RenderTypes.armorEntityGlint(),
                            packedLight, OverlayTexture.NO_OVERLAY, -1, null, 0, null);
        }
    }

    // Only carries pose data (used by HumanoidModel.setupAnim/submitModel); AvatarRenderState-only
    // fields (skin, cape, parrots...) are left at their constructor defaults since PlayerModel's
    // own setupAnim() override never reads them (confirmed by decompiling 26.2.0.37-beta).
    @Unique
    private static AvatarRenderState toAvatarRenderState(HumanoidRenderState source) {
        AvatarRenderState state = new AvatarRenderState();
        state.walkAnimationPos = source.walkAnimationPos;
        state.walkAnimationSpeed = source.walkAnimationSpeed;
        state.ageInTicks = source.ageInTicks;
        state.xRot = source.xRot;
        state.yRot = source.yRot;
        state.swimAmount = source.swimAmount;
        state.speedValue = source.speedValue;
        state.isCrouching = source.isCrouching;
        state.isFallFlying = source.isFallFlying;
        state.isPassenger = source.isPassenger;
        state.isUsingItem = source.isUsingItem;
        state.useItemHand = source.useItemHand;
        state.leftArmPose = source.leftArmPose;
        state.rightArmPose = source.rightArmPose;
        state.mainArm = source.mainArm;
        state.attackArm = source.attackArm;
        state.attackTime = source.attackTime;
        return state;
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
