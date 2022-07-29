package net.Applhau.jjkmod.network.message;

import net.Applhau.jjkmod.client.gui.StatGuiScreen;
import net.Applhau.jjkmod.util.data.JJKClientVariables;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class ClientUpdateHealth {

    public static ServerPlayerEntity player;

    private static int playertest;

    public ClientUpdateHealth() {
    }

    public ClientUpdateHealth(int playertest) {
        this.playertest = playertest;
    }

    public static void encode(ClientUpdateHealth message, PacketBuffer buffer) {
        buffer.writeInt(message.playertest);
    }

    public static ClientUpdateHealth decode(PacketBuffer buffer) {
        return new ClientUpdateHealth(buffer.readInt());
    }

    public static void handle(ClientUpdateHealth message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            player = contextSupplier.get().getSender();
            JJKClientVariables.set(playertest);

        });
        context.setPacketHandled(true);
    }
}
