package net.Applhau.jjkmod.client.abilities.tenshadows;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class GreatSerpentDie {
    public static int key;

    public GreatSerpentDie() {
    }

    public GreatSerpentDie(int key) {
        this.key = key;
    }

    public static void encode(GreatSerpentDie message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static GreatSerpentDie decode(PacketBuffer buffer) {
        return new GreatSerpentDie(buffer.readInt());
    }

    public static void handle(GreatSerpentDie message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();

        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            double x = player.getPosX();
            double z = player.getPosZ();
            double y = player.getPosY();


            World world = player.world;

            GreatSerpent.greatserpent.remove();
        });
        context.setPacketHandled(true);
    }
}
