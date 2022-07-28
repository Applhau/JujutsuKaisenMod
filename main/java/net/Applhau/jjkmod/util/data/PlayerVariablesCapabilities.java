package net.Applhau.jjkmod.util.data;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class PlayerVariablesCapabilities {

    @CapabilityInject(PlayerVariables.class)
    public static Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = null;

    public static void init(FMLCommonSetupEvent event) {
        CapabilityManager.INSTANCE.register(PlayerVariables.class, new PlayerVariablesStorage(), PlayerVariables::new);
    }


    public static class PlayerVariablesStorage implements Capability.IStorage<PlayerVariables> {
        @Override
        public INBT writeNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side) {
            CompoundNBT nbt = new CompoundNBT();
            nbt.putInt("test", instance.test);
            return nbt;
        }

        @Override
        public void readNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side, INBT inbt) {
            CompoundNBT nbt = (CompoundNBT) inbt;
            instance.test = nbt.getInt("test");
        }
    }

}
