package net.Applhau.jjkmod.client.abilities.strawdoll;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class StrawDollHaipinChoose {
    public static int key;
    public static UUID entityUUID;

    public StrawDollHaipinChoose() {
    }

    public StrawDollHaipinChoose(int key) {
        this.key = key;
    }

    public static void encode(StrawDollHaipinChoose message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static StrawDollHaipinChoose decode(PacketBuffer buffer) {
        return new StrawDollHaipinChoose(buffer.readInt());
    }

    public static void handle(StrawDollHaipinChoose message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            World world = player.world;

            AxisAlignedBB boundingBox = player.getBoundingBox();
            boundingBox = boundingBox.grow(20D);

            double x = player.getPosX();
            double y = player.getPosY();
            double z = player.getPosZ();



            List<Entity> entites = world.getEntitiesWithinAABB(LivingEntity.class,
                    new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)));

            //get UUID
            for(Entity entity : entites){
                if(entity != player){
                    entityUUID = entity.getUniqueID();
                    Minecraft.getInstance().player.sendMessage((ITextComponent)new StringTextComponent("CHOOSEN"), null);
                }
            }

        });
        context.setPacketHandled(true);
    }
}
