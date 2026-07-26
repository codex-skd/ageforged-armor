package com.skd.ageforgedarmor.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
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

    @Inject(
        method = "renderRightHand(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;ZLnet/minecraft/client/player/AbstractClientPlayer;)V",
        at = @At("TAIL")
    )
    private void afterRenderRightHand(PoseStack poseStack, SubmitNodeCollector collector, int packedLight,
                                      Identifier skinTexture, boolean hasSleeve, AbstractClientPlayer player,
                                      CallbackInfo ci) {
        renderArmorOnArm(poseStack, collector, packedLight, player, false);
    }

    @Inject(
        method = "renderLeftHand(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;ZLnet/minecraft/client/player/AbstractClientPlayer;)V",
        at = @At("TAIL")
    )
    private void afterRenderLeftHand(PoseStack poseStack, SubmitNodeCollector collector, int packedLight,
                                     Identifier skinTexture, boolean hasSleeve, AbstractClientPlayer player,
                                     CallbackInfo ci) {
        renderArmorOnArm(poseStack, collector, packedLight, player, true);
    }

    @Unique
    private void renderArmorOnArm(PoseStack poseStack, SubmitNodeCollector collector, int packedLight,
                                   AbstractClientPlayer player, boolean isLeft) {
        ItemStack chestStack = player.getItemBySlot(EquipmentSlot.CHEST);
        if (!(chestStack.getItem() instanceof HumanoidArmorItem armorItem)) return;

        ArmorModelProvider provider = armorItem.getModelProvider();
        if (provider == null) return;

        ArmorModel<?> model = provider.getArmorModel(player);
        if (model == null) return;

        Identifier texture = provider.getTexture(player);
        if (texture == null) return;

        ModelPart armorArm = isLeft ? model.leftArm : model.rightArm;
        float sneak = player.isCrouching() ? -0.4F : 0.0F;
        armorArm.xRot = -0.1F + sneak;
        armorArm.yRot = 0.0F;
        armorArm.zRot = isLeft ? -0.1F : 0.1F;

        collector.submitModelPart(armorArm, poseStack,
                net.minecraft.client.renderer.rendertype.RenderTypes.armorCutoutNoCull(texture),
                packedLight, OverlayTexture.NO_OVERLAY, null);
    }
}