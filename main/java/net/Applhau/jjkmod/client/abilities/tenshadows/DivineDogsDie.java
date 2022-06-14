package net.Applhau.jjkmod.client.abilities.tenshadows;

import net.Applhau.jjkmod.world.entities.ModEntityType;
import net.Applhau.jjkmod.world.entities.mob.DivineDogWhiteEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class DivineDogsDie {
    public static int key;

    public DivineDogsDie() {
    }

    public DivineDogsDie(int key) {
        this.key = key;
    }

    public static void encode(DivineDogsDie message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static DivineDogsDie decode(PacketBuffer buffer) {
        return new DivineDogsDie(buffer.readInt());
    }

    public static void handle(DivineDogsDie message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();

        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            double x = player.getPosX();
            double z = player.getPosZ();
            double y = player.getPosY();


            World world = player.world;

            DivineDogs.divinedogblack.remove();
            DivineDogs.divinedogwhite.remove();
        });
        context.setPacketHandled(true);
    }
}
