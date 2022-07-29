package net.Applhau.jjkmod.network.message;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class SpeedToNormal {

    private static final java.util.UUID UUID = null;
    public static int key;

    public SpeedToNormal() {
    }

    public SpeedToNormal(int key) {
        this.key = key;
    }

    public static void encode(SpeedToNormal message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static SpeedToNormal decode(PacketBuffer buffer) {
        return new SpeedToNormal(buffer.readInt());
    }

    public static void handle(SpeedToNormal message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            AttributeModifier speed = new AttributeModifier(UUID.fromString("4aadd9c0-cb9a-11ec-9d64-0242ac120002"), "player_speed", 0.1D, AttributeModifier.Operation.ADDITION);
            player.getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(speed);

        });
        context.setPacketHandled(true);
    }
}
