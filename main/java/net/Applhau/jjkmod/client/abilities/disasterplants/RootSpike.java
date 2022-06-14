package net.Applhau.jjkmod.client.abilities.disasterplants;

import net.Applhau.jjkmod.client.abilities.strawdoll.StrawDollHaipinChoose;
import net.Applhau.jjkmod.world.entities.ModEntityType;
import net.Applhau.jjkmod.world.entities.mob.DivineDogTotalityEntity;
import net.Applhau.jjkmod.world.entities.mob.RootSpikeEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
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

public class RootSpike {
    public static int key;
    public static UUID entityUUID;

    public RootSpike() {
    }

    public RootSpike(int key) {
        this.key = key;
    }

    public static void encode(RootSpike message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static RootSpike decode(PacketBuffer buffer) {
        return new RootSpike(buffer.readInt());
    }

    public static RootSpikeEntity rootSpikeEntity = ModEntityType.ROOTSPIKE.get().create(Minecraft.getInstance().world);

    public static void handle(RootSpike message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            World world = player.world;

            world.addEntity(rootSpikeEntity);

            rootSpikeEntity.setPosition((world.rayTraceBlocks(new RayTraceContext(player.getEyePosition(1f),
                            player.getEyePosition(1f).add(player.getLook(1f).x * 5, player.getLook(1f).y * 5, player.getLook(1f).z * 5),
                            RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, player)).getPos().getX()),
                    player.getPosY(),
                    (world.rayTraceBlocks(new RayTraceContext(player.getEyePosition(1f),
                            player.getEyePosition(1f).add(player.getLook(1f).x * 5, player.getLook(1f).y * 5, player.getLook(1f).z * 5),
                            RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, player)).getPos().getZ()));

        });
        context.setPacketHandled(true);
    }
}
