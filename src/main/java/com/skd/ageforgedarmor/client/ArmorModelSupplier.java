package com.skd.ageforgedarmor.client;

import net.minecraft.client.model.geom.ModelPart;
import com.skd.ageforgedarmor.client.models.ArmorModel;

public interface ArmorModelSupplier {
    ArmorModel create(ModelPart root, boolean isSlim);
}