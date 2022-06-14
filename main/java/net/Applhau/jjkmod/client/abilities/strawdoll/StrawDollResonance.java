package net.Applhau.jjkmod.client.abilities.strawdoll;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class StrawDollResonance {
    public static int key;

    public StrawDollResonance() {
    }

    public StrawDollResonance(int key) {
        this.key = key;
    }

    public static void encode(StrawDollResonance message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static StrawDollResonance decode(PacketBuffer buffer) {
        return new StrawDollResonance(buffer.readInt());
    }

    public static void handle(StrawDollResonance message, Supplier<NetworkEvent.Context> contextSupplier) {
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
                    new AxisAlignedBB(x - (40 / 2d), y - (40 / 2d), z - (40 / 2d), x + (40 / 2d), y + (40 / 2d), z + (40 / 2d)));

            for(Entity entity : entites){
                if(entity != player){
                    if(entity.getUniqueID() == StrawDollChoose.entityUUID){
                        entity.attackEntityFrom(DamageSource.GENERIC, 6);
                        Minecraft.getInstance().player.sendMessage((ITextComponent)new StringTextComponent("Resonance"), null);
                    }
                }

            }

        });
        context.setPacketHandled(true);
    }
}
