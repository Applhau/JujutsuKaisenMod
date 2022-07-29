package net.Applhau.jjkmod.util.data;

import net.Applhau.jjkmod.JJKMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class JJKPlayerVariablesHandler {

    public static void onAttackCapabilitiesPlayer(AttachCapabilitiesEvent<Entity> event){
        if(event.getObject() instanceof PlayerEntity){
            if(!event.getObject().getCapability(JJKPlayerVariablesProvider.PLAYER_VARIABILITY).isPresent()){
                event.addCapability(new ResourceLocation(JJKMod.MOD_ID, "playertest"), new JJKPlayerVariablesProvider());
            }
        }
    }

    public static void onPlayerCloned(PlayerEvent.Clone event){
        if(event.isWasDeath()){
            event.getOriginal().getCapability(JJKPlayerVariablesProvider.PLAYER_VARIABILITY).ifPresent(oldStore -> {
                event.getPlayer().getCapability(JJKPlayerVariablesProvider.PLAYER_VARIABILITY).ifPresent(newStore -> {
                    newStore.copyFrom(oldStore);
                });
            });
        }
    }

}
