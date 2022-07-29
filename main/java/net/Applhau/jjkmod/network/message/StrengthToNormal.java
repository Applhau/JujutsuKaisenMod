package net.Applhau.jjkmod.network.message;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
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

            player.removePotionEffect(Effects.STRENGTH);
            //player.getAttribute(Attributes.ATTACK_DAMAGE).removeModifier(AddStrength.strength);

        });
        context.setPacketHandled(true);
    }
}
