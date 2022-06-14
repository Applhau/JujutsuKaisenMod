package net.Applhau.jjkmod.network.message;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class StrengthToNormal {
    private static final java.util.UUID UUID = null;
    public static int key;

    public StrengthToNormal() {
    }

    public StrengthToNormal(int key) {
        this.key = key;
    }

    public static void encode(StrengthToNormal message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static StrengthToNormal decode(PacketBuffer buffer) {
        return new StrengthToNormal(buffer.readInt());
    }

    public static void handle(StrengthToNormal message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            AttributeModifier strength = new AttributeModifier(UUID.fromString("4ce2f114-cf35-11ec-9d64-0242ac120002"), "player_strength", 3.0D, AttributeModifier.Operation.ADDITION);
            player.getAttribute(Attributes.ATTACK_DAMAGE).removeModifier(strength);

        });
        context.setPacketHandled(true);
    }
}
