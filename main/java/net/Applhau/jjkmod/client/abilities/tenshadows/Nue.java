package net.Applhau.jjkmod.client.abilities.tenshadows;

import net.Applhau.jjkmod.world.entities.ModEntityType;
import net.Applhau.jjkmod.world.entities.mob.DivineDogWhiteEntity;
import net.Applhau.jjkmod.world.entities.mob.NueEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class Nue {

    public static int key;

    public Nue() {
    }

    public Nue(int key) {
        this.key = key;
    }

    public static void encode(Nue message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static Nue decode(PacketBuffer buffer) {
        return new Nue(buffer.readInt());
    }

    public static NueEntity nue = ModEntityType.NUE.get().create(Minecraft.getInstance().world);

    public static void handle(Nue message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();

        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            double x = player.getPosX();
            double z = player.getPosZ();
            double y = player.getPosY();


            World world = player.world;



            nue.setTamedBy(player);

            world.addEntity(nue);

            nue.setPosition(x, y,z);



        });
        context.setPacketHandled(true);
    }
}
