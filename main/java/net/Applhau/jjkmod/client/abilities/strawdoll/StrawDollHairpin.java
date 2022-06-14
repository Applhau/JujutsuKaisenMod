package net.Applhau.jjkmod.client.abilities.strawdoll;

import net.Applhau.jjkmod.client.particles.ParticleList;
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

public class StrawDollHairpin {

    public static int key;

    public StrawDollHairpin() {
    }

    public StrawDollHairpin(int key) {
        this.key = key;
    }

    public static void encode(StrawDollHairpin message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static StrawDollHairpin decode(PacketBuffer buffer) {
        return new StrawDollHairpin(buffer.readInt());
    }

    public static void handle(StrawDollHairpin message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            World world = player.world;

            AxisAlignedBB boundingBox = player.getBoundingBox();
            boundingBox = boundingBox.grow(20D);

            double x = player.getPosX();
            double y = player.getPosY();
            double z = player.getPosZ();

            List<Entity> entites = world.getEntitiesWithinAABB(Entity.class,
                    new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)));

            for(Entity entity : entites){
                if(entity != player){
                    if(entity.getUniqueID() == StrawDollHaipinChoose.entityUUID){
                        entity.attackEntityFrom(DamageSource.GENERIC, 12);
                        Minecraft.getInstance().world.addParticle(ParticleList.NAIL.get(), entity.getBoundingBox().minX ,entity.getBoundingBox().minY, entity.getBoundingBox().minZ, 0d, 0d, 0d);
                        Minecraft.getInstance().player.sendMessage((ITextComponent)new StringTextComponent("Hairpin"), null);
                    }
                }

            }

        });
        context.setPacketHandled(true);
    }
}
