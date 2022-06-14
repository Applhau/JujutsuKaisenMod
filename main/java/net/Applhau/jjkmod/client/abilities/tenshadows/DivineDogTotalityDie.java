package net.Applhau.jjkmod.client.abilities.tenshadows;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class DivineDogTotalityDie {
    public static int key;

    public DivineDogTotalityDie() {
    }

    public DivineDogTotalityDie(int key) {
        this.key = key;
    }

    public static void encode(DivineDogTotalityDie message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static DivineDogTotalityDie decode(PacketBuffer buffer) {
        return new DivineDogTotalityDie(buffer.readInt());
    }

    public static void handle(DivineDogTotalityDie message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();

        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            double x = player.getPosX();
            double z = player.getPosZ();
            double y = player.getPosY();


            World world = player.world;

            DivineDogTotality.divinedogtotality.remove();
        });
        context.setPacketHandled(true);
    }
}
