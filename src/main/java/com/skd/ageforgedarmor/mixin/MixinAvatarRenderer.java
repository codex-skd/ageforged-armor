package com.skd.ageforgedarmor.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.player.AvatarRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Avatar;
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

    @Inject(
        method = "renderRightHand(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;ZLnet/minecraft/world/entity/Avatar;)V",
        at = @At("TAIL")
    )
    private void afterRenderRightHand(PoseStack poseStack, SubmitNodeCollector collector, int packedLight,
                                      Identifier skinTexture, boolean hasSleeve, Avatar entity,
                                      CallbackInfo ci) {
        if (entity instanceof AbstractClientPlayer player) {
            renderArmorOnArm(poseStack, collector, packedLight, player, false);
        }
    }

    @Inject(
        method = "renderLeftHand(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;ZLnet/minecraft/world/entity/Avatar;)V",
        at = @At("TAIL")
    )
    private void afterRenderLeftHand(PoseStack poseStack, SubmitNodeCollector collector, int packedLight,
                                     Identifier skinTexture, boolean hasSleeve, Avatar entity,
                                     CallbackInfo ci) {
        if (entity instanceof AbstractClientPlayer player) {
            renderArmorOnArm(poseStack, collector, packedLight, player, true);
        }
    }

    @Unique
    private void renderArmorOnArm(PoseStack poseStack, SubmitNodeCollector collector, int packedLight,
                                   AbstractClientPlayer player, boolean isLeft) {
        ItemStack chestStack = player.getItemBySlot(EquipmentSlot.CHEST);
        if (!(chestStack.getItem() instanceof HumanoidArmorItem armorItem)) return;

        ArmorModelProvider provider = armorItem.getModelProvider();
        if (provider == null) return;

        ArmorModel model = provider.getArmorModel(player);
        if (model == null) return;

        Identifier texture = provider.getTexture(player);
        if (texture == null) return;

        ModelPart armorArm = isLeft ? model.leftArm : model.rightArm;

        if (isLeft) {
            armorArm.x = 5.0F;
            armorArm.y = model.isSlim ? 2.5F : 2.0F;
        } else {
            armorArm.x = -5.0F;
            armorArm.y = model.isSlim ? 2.5F : 2.0F;
        }
        armorArm.z = 0.0F;

        AvatarRenderer renderer = (AvatarRenderer) (Object) this;
        net.minecraft.client.model.HumanoidModel<?> pm = (net.minecraft.client.model.HumanoidModel<?>) renderer.getModel();
        if (pm != null) {
            ModelPart playerArm = isLeft ? pm.leftArm : pm.rightArm;
            armorArm.xRot = playerArm.xRot;
            armorArm.yRot = playerArm.yRot;
            armorArm.zRot = playerArm.zRot;
        }

        collector.submitModelPart(armorArm, poseStack,
                net.minecraft.client.renderer.rendertype.RenderTypes.armorCutoutNoCull(texture),
                packedLight, OverlayTexture.NO_OVERLAY, null);
    }
}
