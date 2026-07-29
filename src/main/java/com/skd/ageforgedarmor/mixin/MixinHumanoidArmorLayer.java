package com.skd.ageforgedarmor.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.player.AvatarRenderer;
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
        syncPoseWithLivePlayerModel(model, renderState);
        Identifier texture = provider.getTexture(Minecraft.getInstance().player);
        if (texture == null) return;

        int order = 1000 + slot.ordinal() * 2;

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

    /**
     * Compatibility with animation mods (PlayerAnimationLib / BetterCombat) that rewrite the
     * live player's ModelPart pose directly (e.g. on attack swings) instead of going through
     * HumanoidRenderState. Our armor uses a separate ArmorModel instance, so it never receives
     * those overwrites via its own setupAnim(). We re-run setupAnim() on the actual PlayerModel
     * (forcing a fresh, current-frame pose rather than trusting whatever it last held) and copy
     * the resulting body-part transforms onto the armor model. Harmless when no such mod is
     * installed: PlayerModel.setupAnim() is a pure function of renderState, so the copied pose
     * matches vanilla's own animation.
     */
    @Unique
    private static void syncPoseWithLivePlayerModel(ArmorModel<?> model, HumanoidRenderState renderState) {
        if (!(renderState instanceof AvatarRenderState avatarState)) return;

        AbstractClientPlayer player = Minecraft.getInstance().player;
        if (player == null) return;

        EntityRenderer<?, ?> renderer = Minecraft.getInstance().getEntityRenderDispatcher().getRenderer(player);
        if (!(renderer instanceof AvatarRenderer<?> avatarRenderer)) return;

        Object rawPlayerModel = avatarRenderer.getModel();
        if (!(rawPlayerModel instanceof PlayerModel playerModel)) return;

        //noinspection unchecked
        playerModel.setupAnim(avatarState);

        copyPart(model.head, playerModel.head);
        copyPart(model.body, playerModel.body);
        copyPart(model.rightArm, playerModel.rightArm);
        copyPart(model.leftArm, playerModel.leftArm);
        copyPart(model.rightLeg, playerModel.rightLeg);
        copyPart(model.leftLeg, playerModel.leftLeg);
    }

    @Unique
    private static void copyPart(ModelPart target, ModelPart source) {
        target.x = source.x;
        target.y = source.y;
        target.z = source.z;
        target.xRot = source.xRot;
        target.yRot = source.yRot;
        target.zRot = source.zRot;
        target.xScale = source.xScale;
        target.yScale = source.yScale;
        target.zScale = source.zScale;
    }
}