package com.skd.ageforgedarmor.patreon;

import net.minecraft.server.level.ServerPlayer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.skd.ageforgedarmor.CommonClass;
import com.skd.ageforgedarmor.Constants;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicLong;

public class PatronSyncHandler {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final long COOLDOWN_MS = 30 * 60 * 1000L;
    private static final AtomicLong lastFetchTime = new AtomicLong(0L);

    public static void onPlayerLogin(ServerPlayer player) {
        Path cacheFile = Constants.CONFIG_PATH.resolveSibling(Constants.MOD_ID + "_patrons_cache.json");
        CompletableFuture.runAsync(() -> {
            long now = System.currentTimeMillis();
            long last = lastFetchTime.get();
            if (now - last >= COOLDOWN_MS && lastFetchTime.compareAndSet(last, now)) {
                PatronFetcher.fetchAndCache(cacheFile);
            }
            PatronConfig.load(cacheFile);
            int tier = PatronConfig.getPlayerMaxTier(player.getStringUUID());
            // Dispatch back to server tick thread before sending packet
            player.level().getServer().execute(() ->
                CommonClass.CONFIG_SYNC_HANDLER.sendPatronTierToPlayer(player, tier)
            );
        });
    }
}
