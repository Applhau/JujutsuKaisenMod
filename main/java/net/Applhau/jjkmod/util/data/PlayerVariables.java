package net.Applhau.jjkmod.util.data;

import net.Applhau.jjkmod.JJKMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraftforge.fml.network.PacketDistributor;

public class PlayerVariables implements PlayerV{
    public int test = 0;
    public void syncPlayerVariables(Entity entity) {
        if (entity instanceof ServerPlayerEntity)
            JJKMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) entity), new PlayerVariablesSyncMessages(this));
    }

    @Override
    public void setTest(int test) {
        this.test = test;
    }

    @Override
    public int getTest() {
        return test;
    }
}


