package net.Applhau.jjkmod.util.data;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.*;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class JJKPlayerVariablesProvider implements ICapabilityProvider, ICapabilitySerializable<CompoundNBT> {

    @CapabilityInject(JJKPlayerVariables.class)
    public static Capability<JJKPlayerVariables> PLAYER_VARIABILITY = null;

    private JJKPlayerVariables playerVariables = null;
    private final LazyOptional<JJKPlayerVariables> lazyOptional = LazyOptional.of(PLAYER_VARIABILITY::getDefaultInstance);

    @Nonnull
    private JJKPlayerVariables createPlayerVariable(){
        if(playerVariables == null){
            playerVariables = new JJKPlayerVariables();
        }
        return playerVariables;
    }

    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap) {
        if(cap == PLAYER_VARIABILITY){
            return  lazyOptional.cast();
        }
        return getCapability(cap);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        return getCapability(cap);
    }

    @Override
    public CompoundNBT serializeNBT() {
        CompoundNBT  nbt = new CompoundNBT();
        createPlayerVariable().saveNBTData(nbt);
        return nbt;
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {
        createPlayerVariable().loadNBTData(nbt);
    }
}
