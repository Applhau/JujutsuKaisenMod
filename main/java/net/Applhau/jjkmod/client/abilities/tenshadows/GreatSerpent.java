package net.Applhau.jjkmod.client.abilities.tenshadows;

import net.Applhau.jjkmod.world.entities.ModEntityType;
import net.Applhau.jjkmod.world.entities.mob.GreatSerpentEntity;
import net.Applhau.jjkmod.world.entities.mob.NueEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class GreatSerpent {
    public static int key;

    public GreatSerpent() {
    }

    public GreatSerpent(int key) {
        this.key = key;
    }

    public static void encode(GreatSerpent message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static GreatSerpent decode(PacketBuffer buffer) {
        return new GreatSerpent(buffer.readInt());
    }

    public static GreatSerpentEntity greatserpent = ModEntityType.GREATSERPENT.get().create(Minecraft.getInstance().world);

    public static void handle(GreatSerpent message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();

        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            double x = player.getPosX();
            double z = player.getPosZ();
            double y = player.getPosY();


            World world = player.world;



            greatserpent.setTamedBy(player);

            world.addEntity(greatserpent);

            greatserpent.setPosition(x, y,z);



        });
        context.setPacketHandled(true);
    }
}
