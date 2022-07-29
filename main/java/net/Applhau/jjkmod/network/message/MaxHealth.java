package net.Applhau.jjkmod.network.message;

import net.Applhau.jjkmod.client.gui.StatGuiScreen;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class MaxHealth {
    private static final java.util.UUID UUID = null;
    public static int key;


    public MaxHealth() {
    }

    public MaxHealth(int key) {
        this.key = key;
    }

    public static void encode(MaxHealth message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static MaxHealth decode(PacketBuffer buffer) {
        return new MaxHealth(buffer.readInt());
    }

    public static void handle(MaxHealth message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            double a = (double)StatGuiScreen.health / 5;
            //AttributeModifier health = new AttributeModifier(UUID.fromString("4ce2f114-cf35-11ec-9d64-0242ac120002"), "player_health", a, AttributeModifier.Operation.ADDITION);

            //player.getAttribute(Attributes.MAX_HEALTH).applyNonPersistentModifier(health);
            //player.getAttribute(Attributes.ATTACK_DAMAGE).applyNonPersistentModifier(strength);

        });
        context.setPacketHandled(true);
    }
}
