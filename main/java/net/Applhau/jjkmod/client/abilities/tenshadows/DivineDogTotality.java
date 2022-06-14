package net.Applhau.jjkmod.client.abilities.tenshadows;

import net.Applhau.jjkmod.world.entities.ModEntityType;
import net.Applhau.jjkmod.world.entities.mob.DivineDogTotalityEntity;
import net.Applhau.jjkmod.world.entities.mob.GreatSerpentEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class DivineDogTotality {
    public static int key;

    public DivineDogTotality() {
    }

    public DivineDogTotality(int key) {
        this.key = key;
    }

    public static void encode(DivineDogTotality message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static DivineDogTotality decode(PacketBuffer buffer) {
        return new DivineDogTotality(buffer.readInt());
    }

    public static DivineDogTotalityEntity divinedogtotality = ModEntityType.DIVINEDOGTOTALITY.get().create(Minecraft.getInstance().world);

    public static void handle(DivineDogTotality message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();

        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            double x = player.getPosX();
            double z = player.getPosZ();
            double y = player.getPosY();


            World world = player.world;



            divinedogtotality.setTamedBy(player);

            world.addEntity(divinedogtotality);

            divinedogtotality.setPosition(x, y,z);



        });
        context.setPacketHandled(true);
    }
}
