package net.Applhau.jjkmod.client.abilities.CursedSpeech;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.List;
import java.util.function.Supplier;

public class CursedSpeechExplosion {

    public static int key;

    public CursedSpeechExplosion() {
    }

    public CursedSpeechExplosion(int key) {
        this.key = key;
    }

    public static void encode(CursedSpeechExplosion message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static CursedSpeechExplosion decode(PacketBuffer buffer) {
        return new CursedSpeechExplosion(buffer.readInt());
    }

    public static void handle(CursedSpeechExplosion message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();
            World world = player.world;
            player.sendMessage((ITextComponent)new StringTextComponent("EXPLODE!!"), null);

            AxisAlignedBB boundingBox = player.getBoundingBox();
            boundingBox = boundingBox.grow(20D);

            double x = player.getPosX();
            double y = player.getPosY();
            double z = player.getPosZ();



            List<Entity> entites = world.getEntitiesWithinAABB(Entity.class,
                    new AxisAlignedBB(x - (40 / 2d), y - (40 / 2d), z - (40 / 2d), x + (40 / 2d), y + (40 / 2d), z + (40 / 2d)));



            for (Entity entity : entites) {
                if (entity !=player) {
                    double entityX = entity.getPosX();
                    double entityY = entity.getPosY() + entity.getBoundingBox().getYSize() + 0.1D;
                    double entityZ = entity.getPosZ();


                    world.createExplosion(null, (int) entityX, (int) entityY , (int) entityZ, (float) 4, Explosion.Mode.NONE);
                }
            }

        });
        context.setPacketHandled(true);
    }
}
