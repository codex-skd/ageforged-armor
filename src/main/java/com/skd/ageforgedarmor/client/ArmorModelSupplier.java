package com.skd.ageforgedarmor.client;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import com.skd.ageforgedarmor.client.models.ArmorModel;

public interface ArmorModelSupplier {
    <E extends HumanoidRenderState> ArmorModel<E> create(ModelPart root, boolean isSlim);
}