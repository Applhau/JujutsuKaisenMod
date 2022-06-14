package net.Applhau.jjkmod.client.abilities.disasterplants;

import net.Applhau.jjkmod.world.entities.ModEntityType;
import net.Applhau.jjkmod.world.entities.mob.RootSpikeEntity;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

public class Bloom {
    public static int key;
    public static UUID entityUUID;

    public Bloom() {
    }

    public Bloom(int key) {
        this.key = key;
    }

    public static void encode(Bloom message, PacketBuffer buffer) {
        buffer.writeInt(message.key);
    }

    public static Bloom decode(PacketBuffer buffer) {
        return new Bloom(buffer.readInt());
    }

    public static void handle(Bloom message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            ServerPlayerEntity player = context.getSender();

            World world = player.world;

           double x = player.getPosX();
           double y = player.getPosY();
           double z = player.getPosZ();

           double xStart = x - 10;
           double zStart = z - 10;
           for(int i = 0; i < 20; i++){
               for(int d = 0; d < 20; d++){
                   world.setBlockState(new BlockPos(xStart + i ,y,zStart + d), Blocks.ORANGE_TULIP.getDefaultState());
               }
           }

            List<LivingEntity> entites = world.getEntitiesWithinAABB(LivingEntity.class,
                    new AxisAlignedBB(x - (40 / 2d), y - (40 / 2d), z - (40 / 2d), x + (40 / 2d), y + (40 / 2d), z + (40 / 2d)));


            for(LivingEntity entity : entites){
                if(entity != player){
                    entity.addPotionEffect(new EffectInstance(Effects.NAUSEA, 500, 2));
                    entity.sendMessage((ITextComponent)new StringTextComponent("WOAH!!!!!"), null);
                }
            }
        });
        context.setPacketHandled(true);
    }
}
