package com.skd.ageforgedarmor.client.models;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.util.Mth;
import com.skd.ageforgedarmor.client.ArmorModelSupplier;
import org.jetbrains.annotations.NotNull;

public abstract class ArmorModel<T extends HumanoidRenderState> extends HumanoidModel<T> implements ArmorModelSupplier {
    public final boolean isSlim;
    public ArmorModel(ModelPart root, boolean isSlim) {
        super(root);
        this.isSlim = isSlim;
    }

    protected abstract void setupArmorPartAnim(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch);

    public static MeshDefinition templateLayerDefinition(float scale) {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();
        root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F + scale, 0.0F));
        root.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F + scale, 0.0F));
        root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F + scale, 0.0F));
        root.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F + scale, 0.0F));
        root.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F + scale, 0.0F));
        root.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F + scale, 0.0F));
        root.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F + scale, 0.0F));
        return mesh;
    }

    @Override
    public void setupAnim(@NotNull T state) {
        super.setupAnim(state);
        this.setupArmorPartAnim(state.walkAnimationPos, state.walkAnimationSpeed, state.ageInTicks, state.yRot, state.xRot);
    }

    public static float sinPI(float f) { return Mth.sin(f * (float) Math.PI); }

    public static float cosPI(float f) { return Mth.cos(f * (float) Math.PI); }
}