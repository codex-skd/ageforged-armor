package com.skd.ageforgedarmor.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.player.AvatarRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import com.skd.ageforgedarmor.client.ArmorModelProvider;
import com.skd.ageforgedarmor.client.models.ArmorModel;
import com.skd.ageforgedarmor.item.HumanoidArmorItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AvatarRenderer.class)
public abstract class MixinAvatarRenderer {

    @Unique private float capturedRightX, capturedRightY, capturedRightZ;
    @Unique private float capturedLeftX, capturedLeftY, capturedLeftZ;

    @Inject(
        method = "renderRightHand(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;ZLnet/minecraft/client/player/AbstractClientPlayer;)V",
        at = @At("HEAD")
    )
    private void beforeRenderRightHand(PoseStack poseStack, SubmitNodeCollector collector, int packedLight,
                                       Identifier skinTexture, boolean hasSleeve, AbstractClientPlayer player,
                                       CallbackInfo ci) {
        HumanoidModel<?> pm = (HumanoidModel<?>) ((AvatarRenderer) (Object) this).getModel();
        if (pm != null) {
            capturedRightX = pm.rightArm.xRot;
            capturedRightY = pm.rightArm.yRot;
            capturedRightZ = pm.rightArm.zRot;
        }
    }

    @Inject(
        method = "renderLeftHand(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;ZLnet/minecraft/client/player/AbstractClientPlayer;)V",
        at = @At("HEAD")
    )
    private void beforeRenderLeftHand(PoseStack poseStack, SubmitNodeCollector collector, int packedLight,
                                      Identifier skinTexture, boolean hasSleeve, AbstractClientPlayer player,
                                      CallbackInfo ci) {
        HumanoidModel<?> pm = (HumanoidModel<?>) ((AvatarRenderer) (Object) this).getModel();
        if (pm != null) {
            capturedLeftX = pm.leftArm.xRot;
            capturedLeftY = pm.leftArm.yRot;
            capturedLeftZ = pm.leftArm.zRot;
        }
    }

    @Inject(
        method = "renderRightHand(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;ZLnet/minecraft/client/player/AbstractClientPlayer;)V",
        at = @At("TAIL")
    )
    private void afterRenderRightHand(PoseStack poseStack, SubmitNodeCollector collector, int packedLight,
                                      Identifier skinTexture, boolean hasSleeve, AbstractClientPlayer player,
                                      CallbackInfo ci) {
        renderArmorOnArm(poseStack, collector, packedLight, player, false,
                capturedRightX, capturedRightY, capturedRightZ);
    }

    @Inject(
        method = "renderLeftHand(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;ZLnet/minecraft/client/player/AbstractClientPlayer;)V",
        at = @At("TAIL")
    )
    private void afterRenderLeftHand(PoseStack poseStack, SubmitNodeCollector collector, int packedLight,
                                     Identifier skinTexture, boolean hasSleeve, AbstractClientPlayer player,
                                     CallbackInfo ci) {
        renderArmorOnArm(poseStack, collector, packedLight, player, true,
                capturedLeftX, capturedLeftY, capturedLeftZ);
    }

    @Unique
    private void renderArmorOnArm(PoseStack poseStack, SubmitNodeCollector collector, int packedLight,
                                   AbstractClientPlayer player, boolean isLeft,
                                   float rotX, float rotY, float rotZ) {
        ItemStack chestStack = player.getItemBySlot(EquipmentSlot.CHEST);
        if (!(chestStack.getItem() instanceof HumanoidArmorItem armorItem)) return;

        ArmorModelProvider provider = armorItem.getModelProvider();
        if (provider == null) return;

        ArmorModel<?> model = provider.getArmorModel(player);
        if (model == null) return;

        Identifier texture = provider.getTexture(player);
        if (texture == null) return;

        ModelPart armorArm = isLeft ? model.leftArm : model.rightArm;
        armorArm.xRot = rotX;
        armorArm.yRot = rotY;
        armorArm.zRot = rotZ;

        collector.submitModelPart(armorArm, poseStack,
                net.minecraft.client.renderer.rendertype.RenderTypes.armorCutoutNoCull(texture),
                packedLight, OverlayTexture.NO_OVERLAY, null);
    }
}
