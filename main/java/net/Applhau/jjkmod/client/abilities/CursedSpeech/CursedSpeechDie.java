package net.Applhau.jjkmod.client.abilities.CursedSpeech;

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

public class CursedSpeechDie {

    public static int key;

    public CursedSpeechDie() {
    }

    public CursedSpeechDie(int key) {
        this.key = key;
    }

    public static void encode(CursedSpeechDie message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static CursedSpeechDie decode(PacketBuffer buffer) {
        return new CursedSpeechDie(buffer.readInt());
    }

    public static void handle(CursedSpeechDie message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            World world = player.world;
            player.sendMessage((ITextComponent)new StringTextComponent("DIE!!"), null);

            AxisAlignedBB boundingBox = player.getBoundingBox();
            boundingBox = boundingBox.grow(20D);

            double x = player.getPosX();
            double y = player.getPosY();
            double z = player.getPosZ();

            List<Entity> entites = world.getEntitiesWithinAABB(Entity.class,
                    new AxisAlignedBB(x - (40 / 2d), y - (40 / 2d), z - (40 / 2d), x + (40 / 2d), y + (40 / 2d), z + (40 / 2d)));
            player.attackEntityFrom(DamageSource.GENERIC, 12);

            for (Entity entity : entites) {

                if (entity !=player) {
                    entity.attackEntityFrom(DamageSource.GENERIC, 999999999);

                }
            }

        });
        context.setPacketHandled(true);
    }
}
