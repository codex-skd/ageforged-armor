package com.skd.ageforgedarmor;

import com.skd.ageforgedarmor.config.AgeforgedArmorConfig;
import com.skd.ageforgedarmor.config.PreferredModel;
import com.skd.ageforgedarmor.config.SkinSyncState;
import com.skd.ageforgedarmor.networking.ConfigSyncNetworkHandler;
import com.skd.ageforgedarmor.setbonus.SetBonusRegistry;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.Nullable;
import java.util.HashMap;
import java.util.UUID;
import java.util.function.Supplier;

public class CommonClass {
    public static HashMap<UUID, PreferredModel> CURRENT_PREFERRED_MODEL_MAP = new HashMap<>();
    public static HashMap<UUID, SkinSyncState> CURRENT_SKIN_MAP = new HashMap<>();
    public static ConfigSyncNetworkHandler CONFIG_SYNC_HANDLER = null;

    /** Set by client init. Returns null on server or before client is ready. */
    public static Supplier<@Nullable Player> LOCAL_PLAYER_SUPPLIER = () -> null;

    public static void init() {
        SetBonusRegistry.init();
        AgeforgedArmorConfig.CONFIG_CLASS_HANDLER.load();
        CONFIG_SYNC_HANDLER.setup();
        CONFIG_SYNC_HANDLER.registerHandler(uuidPreferredModelHashMap -> {
            CURRENT_PREFERRED_MODEL_MAP = uuidPreferredModelHashMap;
        });
        CONFIG_SYNC_HANDLER.registerSkinHandler(map -> {
            CURRENT_SKIN_MAP = map;
        });
    }
}