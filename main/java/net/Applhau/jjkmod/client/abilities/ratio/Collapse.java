package net.Applhau.jjkmod.client.abilities.ratio;

import net.Applhau.jjkmod.client.Ability;
import net.Applhau.jjkmod.client.abilities.CursedSpeech.CursedSpeechExplosion;
import net.Applhau.jjkmod.client.particles.ParticleList;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.List;
import java.util.function.Supplier;

public class Collapse {

    public static int key;

    public Collapse() {
    }

    public Collapse(int key) {
        this.key = key;
    }

    public static void encode(Collapse message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static Collapse decode(PacketBuffer buffer) {
        return new Collapse(buffer.readInt());
    }

    public static void handle(Collapse message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();
            World world = player.world;
            world.createExplosion(null,
                    (int) (player.world.rayTraceBlocks(new RayTraceContext(player.getEyePosition(1f),
                            player.getEyePosition(1f).add(player.getLook(1f).x * 7, player.getLook(1f).y * 7, player.getLook(1f).z * 7),
                            RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, player)).getPos().getX()),
                    (int) (player.world.rayTraceBlocks(new RayTraceContext(player.getEyePosition(1f),
                            player.getEyePosition(1f).add(player.getLook(1f).x * 7, player.getLook(1f).y * 7, player.getLook(1f).z * 7),
                            RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, player)).getPos().getY()),
                    (int) (player.world.rayTraceBlocks(new RayTraceContext(player.getEyePosition(1f),
                            player.getEyePosition(1f).add(player.getLook(1f).x * 7, player.getLook(1f).y * 7, player.getLook(1f).z * 7),
                            RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, player)).getPos().getZ()),
                    (float) 5, Explosion.Mode.BREAK);

            Minecraft.getInstance().world.addParticle(ParticleList.RATIO_01.get(), (int) (player.world.rayTraceBlocks(new RayTraceContext(player.getEyePosition(1f),
                    player.getEyePosition(1f).add(player.getLook(1f).x * 7, player.getLook(1f).y * 7, player.getLook(1f).z * 7),
                    RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, player)).getPos().getX()) ,(int) (player.world.rayTraceBlocks(new RayTraceContext(player.getEyePosition(1f),
                    player.getEyePosition(1f).add(player.getLook(1f).x * 7, player.getLook(1f).y * 7, player.getLook(1f).z * 7),
                    RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, player)).getPos().getY()),(int) (player.world.rayTraceBlocks(new RayTraceContext(player.getEyePosition(1f),
                    player.getEyePosition(1f).add(player.getLook(1f).x * 7, player.getLook(1f).y * 7, player.getLook(1f).z * 7),
                    RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, player)).getPos().getZ()), 0d, 0d, 0d);

        });
        context.setPacketHandled(true);
    }
}
