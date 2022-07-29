package net.Applhau.jjkmod.network.message;

import net.Applhau.jjkmod.client.Ability;
import net.Applhau.jjkmod.client.gui.StatGuiScreen;
import net.Applhau.jjkmod.network.Network;
import net.Applhau.jjkmod.util.data.JJKClientVariables;
import net.Applhau.jjkmod.util.data.JJKPlayerVariables;
import net.Applhau.jjkmod.util.data.JJKPlayerVariablesProvider;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.simple.SimpleChannel;

import java.util.function.Supplier;

public class IncreaseHealth {
    private static final java.util.UUID UUID = null;
    public static int key;
    public static int healthstat = 0;

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
            System.out.println(JJKClientVariables.getPlayertest());
            player.sendMessage(new StringTextComponent(String.valueOf(JJKClientVariables.getPlayertest())), null);

            /*healthstat += 1;
            AttributeModifier health = new AttributeModifier(UUID.fromString("4ce2f114-cf35-11ec-9d64-0242ac120002"), "player_health", healthstat, AttributeModifier.Operation.ADDITION);
            player.getAttribute(Attributes.MAX_HEALTH).removeModifier(health);
            player.getAttribute(Attributes.MAX_HEALTH).applyPersistentModifier(health);*/
            player.getCapability(JJKPlayerVariablesProvider.PLAYER_VARIABILITY).ifPresent(playertest -> {
                playertest.addTest(1);

            });

        });
        context.setPacketHandled(true);
    }
}
