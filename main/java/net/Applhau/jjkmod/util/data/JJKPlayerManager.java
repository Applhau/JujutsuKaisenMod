package net.Applhau.jjkmod.util.data;

import net.Applhau.jjkmod.network.Network;
import net.Applhau.jjkmod.network.message.ClientUpdateHealth;
import net.minecraft.command.impl.data.StorageAccessor;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerChunkProvider;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.DimensionSavedDataManager;
import net.minecraft.world.storage.SaveFormat;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.network.PacketDistributor;
import org.apache.logging.log4j.core.jmx.Server;

import javax.annotation.Nonnull;
import java.util.logging.Level;


public class JJKPlayerManager {


    private static int counter = 10;

    public void tick(World world){
        counter --;
        if(counter <= 0){
            counter = 10;

            world.getPlayers().forEach(player -> {
                if(player instanceof ServerPlayerEntity){
                    int playertest = ClientUpdateHealth.player.getCapability(JJKPlayerVariablesProvider.PLAYER_VARIABILITY).map(JJKPlayerVariables::getVariable).orElse(-1);
                    Network.Channel.send(PacketDistributor.PLAYER.with(() -> ClientUpdateHealth.player), new ClientUpdateHealth(32));
                    }
                }
            );

        }
    }
}
