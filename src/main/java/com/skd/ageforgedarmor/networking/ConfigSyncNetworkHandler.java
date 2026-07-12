package com.skd.ageforgedarmor.networking;

import net.minecraft.server.level.ServerPlayer;
import com.skd.ageforgedarmor.config.PreferredModel;
import com.skd.ageforgedarmor.config.SkinSyncState;

import java.util.HashMap;
import java.util.UUID;
import java.util.function.Consumer;

public interface ConfigSyncNetworkHandler {
    void syncConfig();
    void registerHandler(Consumer<HashMap<UUID, PreferredModel>> handler);
    void registerSkinHandler(Consumer<HashMap<UUID, SkinSyncState>> handler);
    void setup();
    void sendPatronTierToPlayer(ServerPlayer player, int tier);
}
