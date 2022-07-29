package net.Applhau.jjkmod.util.data;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;

import javax.annotation.Nullable;

public class CapabilityJJKPlayerVariables {

    public static void register() {
        CapabilityManager.INSTANCE.register(JJKPlayerVariables.class, new Storage(), JJKPlayerVariables::new);
    }

    public static class Storage implements Capability.IStorage<JJKPlayerVariables> {

        @Nullable
        @Override
        public INBT writeNBT(Capability<JJKPlayerVariables> capability, JJKPlayerVariables instance, Direction side) {
            CompoundNBT tag = new CompoundNBT();
            tag.putInt("test", instance.getVariable());
            return tag;
        }

        @Override
        public void readNBT(Capability<JJKPlayerVariables> capability, JJKPlayerVariables instance, Direction side, INBT nbt) {
            int test = ((CompoundNBT) nbt).getInt("test");
            instance.setVariable(test);
        }
    }
}
