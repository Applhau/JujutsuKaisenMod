package net.Applhau.jjkmod.util.data;

import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

public class PlayerVariablesProvider implements ICapabilitySerializable<INBT> {

    private final LazyOptional<PlayerVariables> instance = LazyOptional.of(PlayerVariablesCapabilities.PLAYER_VARIABLES_CAPABILITY::getDefaultInstance);
    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        return cap == PlayerVariablesCapabilities.PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
    }

    @Override
    public INBT serializeNBT() {
        return PlayerVariablesCapabilities.PLAYER_VARIABLES_CAPABILITY.getStorage().writeNBT(PlayerVariablesCapabilities.PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new),
                null);
    }

    @Override
    public void deserializeNBT(INBT nbt) {
        PlayerVariablesCapabilities.PLAYER_VARIABLES_CAPABILITY.getStorage().readNBT(PlayerVariablesCapabilities.PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new), null,
                nbt);
    }
}
