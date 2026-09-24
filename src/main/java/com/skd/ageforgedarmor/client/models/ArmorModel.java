package com.skd.ageforgedarmor.client.models;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.util.Mth;
import com.skd.ageforgedarmor.client.ArmorModelSupplier;
import org.jetbrains.annotations.NotNull;

/**
 * Extends PlayerModel (not just HumanoidModel) so that animation mods mixing into
 * PlayerModel.setupAnim() (e.g. PlayerAnimationLib, used by BetterCombat) apply to our
 * armor exactly like they do to vanilla's own armor models, which are PlayerModel
 * instances too (see NeoForge ArmorModelSet). templateLayerDefinition() below adds the
 * empty sleeve/pants/jacket child parts PlayerModel's constructor requires.
 */
public abstract class ArmorModel extends PlayerModel implements ArmorModelSupplier {
    public final boolean isSlim;
    public ArmorModel(ModelPart root, boolean isSlim) {
        super(root, isSlim);
        this.isSlim = isSlim;
    }

    protected abstract void setupArmorPartAnim(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch);

    public static MeshDefinition templateLayerDefinition(float scale) {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F + scale, 0.0F));
        head.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F + scale, 0.0F));
        PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F + scale, 0.0F));
        PartDefinition rightArm = root.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F + scale, 0.0F));
        PartDefinition leftArm = root.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F + scale, 0.0F));
        PartDefinition rightLeg = root.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F + scale, 0.0F));
        PartDefinition leftLeg = root.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F + scale, 0.0F));

        // Empty placeholder parts required by PlayerModel's constructor/setupAnim (getChild lookups).
        // No geometry, so they render nothing - they only exist to satisfy PlayerModel.
        body.addOrReplaceChild("jacket", CubeListBuilder.create(), PartPose.ZERO);
        rightArm.addOrReplaceChild("right_sleeve", CubeListBuilder.create(), PartPose.ZERO);
        leftArm.addOrReplaceChild("left_sleeve", CubeListBuilder.create(), PartPose.ZERO);
        rightLeg.addOrReplaceChild("right_pants", CubeListBuilder.create(), PartPose.ZERO);
        leftLeg.addOrReplaceChild("left_pants", CubeListBuilder.create(), PartPose.ZERO);
        return mesh;
    }

    @Override
    public void setupAnim(@NotNull AvatarRenderState state) {
        super.setupAnim(state);
        this.setupArmorPartAnim(state.walkAnimationPos, state.walkAnimationSpeed, state.ageInTicks, state.yRot, state.xRot);
    }

    public static float sinPI(float f) { return Mth.sin(f * (float) Math.PI); }

    public static float cosPI(float f) { return Mth.cos(f * (float) Math.PI); }
}