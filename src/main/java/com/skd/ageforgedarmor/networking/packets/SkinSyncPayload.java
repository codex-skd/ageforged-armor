package com.skd.ageforgedarmor.networking.packets;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;
import com.skd.ageforgedarmor.config.CenturionSkin;
import com.skd.ageforgedarmor.config.IronPlateSkin;
import com.skd.ageforgedarmor.config.OYoroiSkin;
import com.skd.ageforgedarmor.config.PharaohSkin;
import com.skd.ageforgedarmor.config.RaijinSkin;
import com.skd.ageforgedarmor.config.SkinSyncState;

import static com.skd.ageforgedarmor.Constants.MOD_ID;

public record SkinSyncPayload(SkinSyncState state) implements CustomPacketPayload {
    public static final Type<SkinSyncPayload> TYPE = new Type<>(Identifier.fromNamespaceAndPath(MOD_ID, "skin_sync"));

    public static final StreamCodec<FriendlyByteBuf, SkinSyncPayload> STREAM_CODEC = StreamCodec.of(
        SkinSyncPayload::encode,
        SkinSyncPayload::decode
    );

    private static void encode(FriendlyByteBuf buf, SkinSyncPayload payload) {
        buf.writeEnum(payload.state().oYoroiSkin());
        buf.writeEnum(payload.state().ironPlateSkin());
        buf.writeEnum(payload.state().centurionSkin());
        buf.writeEnum(payload.state().raijinSkin());
        buf.writeEnum(payload.state().pharaohSkin());
    }

    private static SkinSyncPayload decode(FriendlyByteBuf buf) {
        return new SkinSyncPayload(new SkinSyncState(
            buf.readEnum(OYoroiSkin.class),
            buf.readEnum(IronPlateSkin.class),
            buf.readEnum(CenturionSkin.class),
            buf.readEnum(RaijinSkin.class),
            buf.readEnum(PharaohSkin.class)
        ));
    }

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
