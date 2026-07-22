package com.skd.ageforgedarmor.client;

import net.minecraft.client.Minecraft;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import com.skd.ageforgedarmor.CommonClass;
import com.skd.ageforgedarmor.registry.ModelProviderRegistry;

public class AgeforgedArmorClient {

    static {
        CommonClass.LOCAL_PLAYER_SUPPLIER = () -> Minecraft.getInstance().player;
    }

    /**
     * Registers the LayerDefinitions. Must be client side only !
     * @param event Event called.
     */
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event){
        ModelProviderRegistry.REGISTRY.forEach((name, provider) -> {
            event.registerLayerDefinition(provider.getLayerLocation(), provider::createLayer);
            if(provider instanceof ArmorModelProvider.MixedArmorModelProvider slimProvide){
                event.registerLayerDefinition(slimProvide.getSlimLayerLocation(), slimProvide::createSlimLayer);
            }
        });
    }

    public static void playerLoggedInEvent(ClientPlayerNetworkEvent.LoggingIn event) {
        CommonClass.CONFIG_SYNC_HANDLER.syncConfig();
    }
}
