package net.Applhau.jjkmod.client.abilities.CursedSpeech;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.List;
import java.util.function.Supplier;

public class CursedSpeechBlowAway {

    public static int key;

    public CursedSpeechBlowAway() {
    }

    public CursedSpeechBlowAway(int key) {
        this.key = key;
    }

    public static void encode(CursedSpeechBlowAway message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static CursedSpeechBlowAway decode(PacketBuffer buffer) {
        return new CursedSpeechBlowAway(buffer.readInt());
    }

    public static void handle(CursedSpeechBlowAway message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();
            World world = player.world;
            player.sendMessage((ITextComponent)new StringTextComponent("BLOW AWAY!!"), null);

            AxisAlignedBB boundingBox = player.getBoundingBox();
            boundingBox = boundingBox.grow(20D);

            double x = player.getPosX();
            double y = player.getPosY();
            double z = player.getPosZ();

            List<Entity> entites = world.getEntitiesWithinAABB(Entity.class,
                    new AxisAlignedBB(x - (40 / 2d), y - (40 / 2d), z - (40 / 2d), x + (40 / 2d), y + (40 / 2d), z + (40 / 2d)));

            double rangeDoubled = 5 * 2;

            for (Entity entity : entites) {
                if (entity != player) {
                    double entityX = entity.getPosX();
                    double entityY = entity.getPosY();
                    double entityZ = entity.getPosZ();

                    double xDiff = entityX - x;
                    double yDiff = entity.getEyeHeight() - y;
                    double zDiff = entityZ - z;

                    //entity.setMotion(7, 5, 7);
                    entity.setMotion(entity.getMotion().add(xDiff * 6, yDiff * 6, zDiff * 6));

                }
            }

        });
        context.setPacketHandled(true);
    }
}
