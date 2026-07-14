package com.skd.ageforgedarmor.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import com.skd.ageforgedarmor.client.ArmorModelProvider;
import com.skd.ageforgedarmor.client.models.ArmorModel;
import com.skd.ageforgedarmor.item.HumanoidArmorItem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(HumanoidArmorLayer.class)
public abstract class MixinHumanoidArmorLayer extends RenderLayer {

    private static final Logger LOGGER = LogManager.getLogger();

    public MixinHumanoidArmorLayer(RenderLayerParent parentLayer) {
        super(parentLayer);
    }

    @Inject(method = "shouldRender(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/EquipmentSlot;)Z", at = @At("HEAD"), cancellable = true)
    private static void onShouldRender(ItemStack stack, EquipmentSlot slot, CallbackInfoReturnable<Boolean> cir) {
        if (stack.getItem() instanceof HumanoidArmorItem) {
            LOGGER.info("[AFA] shouldRender: cancelando rendering vanilla para {} slot {}", stack.getItem(), slot);
            cir.setReturnValue(false);
        }
    }

    @Inject(method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/HumanoidRenderState;FF)V",
            at = @At("TAIL"))
    private void afterSubmit(PoseStack poseStack, SubmitNodeCollector collector, int packedLight,
                             HumanoidRenderState renderState, float limbSwing, float limbSwingAmount,
                             CallbackInfo ci) {
        LOGGER.info("[AFA] afterSubmit: renderizando armaduras personalizadas");
        LOGGER.info("[AFA] afterSubmit: HEAD={}, CHEST={}, LEGS={}, FEET={}",
            renderState.headEquipment.getItem(), renderState.chestEquipment.getItem(),
            renderState.legsEquipment.getItem(), renderState.feetEquipment.getItem());
        renderCustomArmorPiece(poseStack, collector, renderState, EquipmentSlot.HEAD, packedLight);
        renderCustomArmorPiece(poseStack, collector, renderState, EquipmentSlot.CHEST, packedLight);
        renderCustomArmorPiece(poseStack, collector, renderState, EquipmentSlot.LEGS, packedLight);
        renderCustomArmorPiece(poseStack, collector, renderState, EquipmentSlot.FEET, packedLight);
    }

    @Unique
    @SuppressWarnings({"unchecked", "rawtypes"})
    private void renderCustomArmorPiece(PoseStack poseStack, SubmitNodeCollector collector,
                                         HumanoidRenderState renderState, EquipmentSlot slot, int packedLight) {
        ItemStack itemStack = getEquipmentForSlot(renderState, slot);
        LOGGER.info("[AFA] renderCustom: slot={}, item={}", slot, itemStack.getItem());
        if (itemStack.getItem() instanceof HumanoidArmorItem armorItem) {
            ArmorModelProvider provider = armorItem.getModelProvider();
            LOGGER.info("[AFA] renderCustom: provider={}", provider);
            if (provider != null) {
                ArmorModel model = provider.getArmorModel(renderState);
                model.setupAnim(renderState);
                Identifier texture = provider.getTexture(renderState);
                LOGGER.info("[AFA] renderCustom: texture={}", texture);
                if (texture != null) {
                    var renderType = net.minecraft.client.renderer.rendertype.RenderTypes.entityCutout(texture);
                    collector.submitModel(model, renderState, poseStack, renderType,
                            packedLight, OverlayTexture.NO_OVERLAY, -1, null);
                    LOGGER.info("[AFA] renderCustom: submitModel llamado para slot {}", slot);
                }
                if (itemStack.hasFoil()) {
                    collector.submitModel(model, renderState, poseStack,
                            net.minecraft.client.renderer.rendertype.RenderTypes.armorEntityGlint(),
                            packedLight, OverlayTexture.NO_OVERLAY, -1, null);
                    LOGGER.info("[AFA] renderCustom: glint enviado para slot {}", slot);
                }
            }
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

    @Inject(method = "renderArmorPiece", at = @At("HEAD"), cancellable = true)
    private void onRenderArmorPiece(PoseStack poseStack, SubmitNodeCollector collector, ItemStack itemStack,
                                     EquipmentSlot slot, int packedLight, HumanoidRenderState renderState,
                                     CallbackInfo ci) {
        if (itemStack.getItem() instanceof HumanoidArmorItem) {
            LOGGER.info("[AFA] renderArmorPiece: cancelando para {} slot {}", itemStack.getItem(), slot);
            ci.cancel();
        }
    }
}