package net.Applhau.jjkmod.client.abilities.tenshadows;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class NueDie {
    public static int key;

    public NueDie() {
    }

    public NueDie(int key) {
        this.key = key;
    }

    public static void encode(NueDie message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static NueDie decode(PacketBuffer buffer) {
        return new NueDie(buffer.readInt());
    }

    public static void handle(NueDie message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();

        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            double x = player.getPosX();
            double z = player.getPosZ();
            double y = player.getPosY();


            World world = player.world;

            Nue.nue.remove();
        });
        context.setPacketHandled(true);
    }
}
