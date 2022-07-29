package net.Applhau.jjkmod.network.message;

import net.Applhau.jjkmod.client.Ability;
import net.Applhau.jjkmod.client.gui.StatGuiScreen;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class AddStrength {
    private static final java.util.UUID UUID = null;
    public static int key;

    public static AttributeModifier strength = new AttributeModifier(UUID.fromString("4ce2f114-cf35-11ec-9d64-0242ac120002"), "player_strength", -5.0D, AttributeModifier.Operation.ADDITION);

    public AddStrength() {
    }

    public AddStrength(int key) {
        this.key = key;
    }

    public static void encode(AddStrength message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static AddStrength decode(PacketBuffer buffer) {
        return new AddStrength(buffer.readInt());
    }

    public static void handle(AddStrength message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            int a = StatGuiScreen.str / 5;

            player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 60, 0 + a, false, false, false));
            //player.getAttribute(Attributes.ATTACK_DAMAGE).applyNonPersistentModifier(strength);

        });
        context.setPacketHandled(true);
    }
}
