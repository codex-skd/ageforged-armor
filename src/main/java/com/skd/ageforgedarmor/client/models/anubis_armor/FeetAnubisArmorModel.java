package com.skd.ageforgedarmor.client.models.anubis_armor;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import com.skd.ageforgedarmor.client.models.ArmorModel;

public class FeetAnubisArmorModel<T extends HumanoidRenderState> extends ArmorModel<T> {

    public FeetAnubisArmorModel(ModelPart root, boolean isSlim) {
        super(root, isSlim);
    }

    @Override
    public <E extends HumanoidRenderState> ArmorModel<E> create(ModelPart root, boolean isSlim) {
        return new FeetAnubisArmorModel<>(root, isSlim);
    }

    public static LayerDefinition createLayerDefinition() {
        MeshDefinition meshdefinition = templateLayerDefinition(0.0F);
        PartDefinition root = meshdefinition.getRoot();
        root.addOrReplaceChild("left_leg", CubeListBuilder.create().mirror()
                        .texOffs(93, 14).addBox(-2.5F, 7.4F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(-0.2F)),
                PartPose.ZERO);

       root.addOrReplaceChild("right_leg", CubeListBuilder.create()
                        .texOffs(93, 14).addBox(-2.5F, 7.4F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(-0.2F)),
                PartPose.ZERO);

        return LayerDefinition.create(meshdefinition, 128, 64);
    }

    @Override
    protected void setupArmorPartAnim(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}
}
