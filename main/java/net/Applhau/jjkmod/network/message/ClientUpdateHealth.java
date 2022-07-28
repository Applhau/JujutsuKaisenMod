package net.Applhau.jjkmod.network.message;

import net.Applhau.jjkmod.client.gui.StatGuiScreen;
import net.Applhau.jjkmod.util.data.PlayerVariables;
import net.Applhau.jjkmod.util.data.PlayerVariablesCapabilities;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class ClientUpdateHealth {
    private static final java.util.UUID UUID = null;
    public static int key;
    public static int healthstat;
    public static ServerPlayerEntity player;

    public ClientUpdateHealth() {
    }

    public ClientUpdateHealth(int key) {
        this.key = key;
    }

    public static void encode(ClientUpdateHealth message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static ClientUpdateHealth decode(PacketBuffer buffer) {
        return new ClientUpdateHealth(buffer.readInt());
    }

    public static void handle(ClientUpdateHealth message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            player = context.getSender();
            player.getCapability(PlayerVariablesCapabilities.PLAYER_VARIABLES_CAPABILITY).ifPresent(capability -> {
                StatGuiScreen.health = capability.test;
            });

        });
        context.setPacketHandled(true);
    }
}
