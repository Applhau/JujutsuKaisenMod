package net.Applhau.jjkmod.client.abilities.tenshadows;

import net.Applhau.jjkmod.client.abilities.strawdoll.StrawDollChoose;
import net.Applhau.jjkmod.client.abilities.strawdoll.StrawDollResonance;
import net.Applhau.jjkmod.world.entities.ModEntityType;
import net.Applhau.jjkmod.world.entities.mob.DivineDogWhiteEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.List;
import java.util.function.Supplier;

public class DivineDogs {
    public static int key;

    public DivineDogs() {
    }

    public DivineDogs(int key) {
        this.key = key;
    }

    public static void encode(DivineDogs message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static DivineDogs decode(PacketBuffer buffer) {
        return new DivineDogs(buffer.readInt());
    }

    public static DivineDogWhiteEntity divinedogwhite = ModEntityType.DIVINEDOGWHITE.get().create(Minecraft.getInstance().world);
    public static DivineDogWhiteEntity divinedogblack = ModEntityType.DIVINEDOGBLACK.get().create(Minecraft.getInstance().world);

    public static void handle(DivineDogs message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();

        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            double x = player.getPosX();
            double z = player.getPosZ();
            double y = player.getPosY();


            World world = player.world;



            divinedogblack.setTamedBy(player);
            divinedogwhite.setTamedBy(player);

            world.addEntity(divinedogwhite);
            world.addEntity(divinedogblack);

            divinedogblack.setPosition(x, y,z);
            divinedogwhite.setPosition(x, y,z);



        });
        context.setPacketHandled(true);
    }
}
