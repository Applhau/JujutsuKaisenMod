package net.Applhau.jjkmod.util.data;

import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class PlayerVariablesSyncMessages {

    public PlayerVariables data;


    public void PlayerVariablesSyncMessages(PacketBuffer buffer) {
        this.data = new PlayerVariables();
        new PlayerVariablesCapabilities.PlayerVariablesStorage().readNBT(null, this.data, null, buffer.readCompoundTag());
    }

    public PlayerVariablesSyncMessages(PlayerVariables data) {
        this.data = data;
    }

    public static void buffer(PlayerVariablesSyncMessages message, PacketBuffer buffer) {
        buffer.writeCompoundTag((CompoundNBT) new PlayerVariablesCapabilities.PlayerVariablesStorage().writeNBT(null, message.data, null));
    }

    public static void handler(PlayerVariablesSyncMessages message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            if (!context.getDirection().getReceptionSide().isServer()) {
                PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PlayerVariablesCapabilities.PLAYER_VARIABLES_CAPABILITY, null)
                        .orElse(new PlayerVariables()));
                variables.test = message.data.test;
            }
        });
        context.setPacketHandled(true);
    }
}
