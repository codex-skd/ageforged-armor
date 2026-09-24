package com.skd.ageforgedarmor.client;

import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;
import java.util.stream.IntStream;

import static com.skd.ageforgedarmor.Constants.MOD_ID;

// Client side
public class AnimatedArmorModelProvider extends ArmorModelProvider {
    public static ArmorModelProvider create(String armorName, EquipmentSlot slot, ArmorModelSupplier modelSupplier, Supplier<LayerDefinition> layerDefinitionSupplier, int numberOfFrames, int ticksPerFrame){
        return new AnimatedArmorModelProvider(armorName, slot, modelSupplier, layerDefinitionSupplier, numberOfFrames, ticksPerFrame);
    }

    public static ArmorModelProvider create(String armorName, EquipmentSlot slot, ArmorModelSupplier modelSupplier, Supplier<LayerDefinition> layerDefinitionSupplier, Supplier<LayerDefinition> slimLayerDefinitionSupplier, int numberOfFrames, int ticksPerFrame){
        return new AnimatedMixedArmorModelProvider(armorName, slot, modelSupplier, layerDefinitionSupplier, slimLayerDefinitionSupplier, numberOfFrames, ticksPerFrame);
    }

    private final Identifier[] resourceLocations;
    private final int ticksPerFrame;

    private AnimatedArmorModelProvider(String armorName, EquipmentSlot slot, ArmorModelSupplier modelSupplier, Supplier<LayerDefinition> layerDefinitionSupplier, int numberOfFrames, int ticksPerFrame){
        super(armorName, slot, modelSupplier, layerDefinitionSupplier);
        this.resourceLocations = IntStream.range(0, numberOfFrames)
                .mapToObj(n -> Identifier.fromNamespaceAndPath(MOD_ID, "textures/models/armor/" + armorName + "_" + (n + 1) + ".png"))
                .toArray(Identifier[]::new);
        this.ticksPerFrame = ticksPerFrame;
    }

    @NotNull
    public Identifier getTexture(Entity entity) {
        return this.resourceLocations[(entity.tickCount / this.ticksPerFrame) % this.resourceLocations.length];
    }

    public static class AnimatedMixedArmorModelProvider extends MixedArmorModelProvider {
        private final Identifier[] resourceLocations;
        private final Identifier[] slimIdentifiers;
        private final int ticksPerFrame;

        private AnimatedMixedArmorModelProvider(String armorName, EquipmentSlot slot, ArmorModelSupplier modelSupplier, Supplier<LayerDefinition> layerDefinitionSupplier, Supplier<LayerDefinition> slimLayerDefinitionSupplier, int numberOfFrames, int ticksPerFrame){
            super(armorName, slot, modelSupplier, layerDefinitionSupplier, slimLayerDefinitionSupplier);
            this.resourceLocations = IntStream.range(0, numberOfFrames)
                    .mapToObj(n -> Identifier.fromNamespaceAndPath(MOD_ID, "textures/models/armor/" + armorName + "_" + (n + 1) + ".png"))
                    .toArray(Identifier[]::new);
            this.slimIdentifiers = IntStream.range(0, numberOfFrames)
                    .mapToObj(n -> Identifier.fromNamespaceAndPath(MOD_ID, "textures/models/armor/" + armorName + "_slim_" + (n + 1) + ".png"))
                    .toArray(Identifier[]::new);
            this.ticksPerFrame = ticksPerFrame;
        }

        @Override
        public @NotNull Identifier getTexture(Entity entity) {
            if(isSlim(entity)){
                return this.slimIdentifiers[(entity.tickCount / this.ticksPerFrame) % this.slimIdentifiers.length];
            }else{
                return this.resourceLocations[(entity.tickCount / this.ticksPerFrame) % this.resourceLocations.length];
            }
        }
    }
}