package net.Applhau.jjkmod.util.data;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PlayerVariablesHandler {

    @SubscribeEvent
    public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof PlayerEntity ){
            event.addCapability(new ResourceLocation("test", "player_variables"), new PlayerVariablesProvider());
}
    }

    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        if (!event.getPlayer().world.isRemote())
            (event.getPlayer().getCapability(PlayerVariablesCapabilities.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
                    .syncPlayerVariables(event.getPlayer());
    }

    @SubscribeEvent
    public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
        if (!event.getPlayer().world.isRemote())
            (event.getPlayer().getCapability(PlayerVariablesCapabilities.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
                    .syncPlayerVariables(event.getPlayer());
    }

    @SubscribeEvent
    public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
        if (!event.getPlayer().world.isRemote())
            (event.getPlayer().getCapability(PlayerVariablesCapabilities.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
                    .syncPlayerVariables(event.getPlayer());
    }

    @SubscribeEvent
    public static void clonePlayer(PlayerEvent.Clone event) {
        PlayerVariables original = (event.getOriginal().getCapability(PlayerVariablesCapabilities.PLAYER_VARIABLES_CAPABILITY, null)
                .orElse(new PlayerVariables()));
        PlayerVariables clone = (event.getEntity().getCapability(PlayerVariablesCapabilities.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
        clone.test = original.test;
        if (!event.isWasDeath()) {
        }
    }

}
