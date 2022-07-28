package net.Applhau.jjkmod.network.message;

import net.Applhau.jjkmod.client.Ability;
import net.Applhau.jjkmod.client.gui.StatGuiScreen;
import net.Applhau.jjkmod.util.data.PlayerVariables;
import net.Applhau.jjkmod.util.data.PlayerVariablesCapabilities;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class IncreaseHealth {
    private static final java.util.UUID UUID = null;
    public static int key;
    public static int healthstat;

    public IncreaseHealth() {
    }

    public IncreaseHealth(int key) {
        this.key = key;
    }

    public static void encode(IncreaseHealth message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static IncreaseHealth decode(PacketBuffer buffer) {
        return new IncreaseHealth(buffer.readInt());
    }

    public static void handle(IncreaseHealth message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();
            player.getCapability(PlayerVariablesCapabilities.PLAYER_VARIABLES_CAPABILITY).ifPresent(capability -> {
                healthstat = (((player.getCapability(PlayerVariablesCapabilities.PLAYER_VARIABLES_CAPABILITY)
                        .orElse(new PlayerVariables())).test) + 1);
                capability.test = healthstat;
            });
            StatGuiScreen.health = healthstat;

        });
        context.setPacketHandled(true);
    }
}
