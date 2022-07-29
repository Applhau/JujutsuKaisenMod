package net.Applhau.jjkmod.util.data;

import net.Applhau.jjkmod.JJKMod;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = JJKMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {

    public static void setup(final FMLCommonSetupEvent event){
        IEventBus bus = MinecraftForge.EVENT_BUS;
        CapabilityJJKPlayerVariables.register();

        bus.addGenericListener(Entity.class, JJKPlayerVariablesHandler::onAttackCapabilitiesPlayer);
        bus.addListener(JJKPlayerVariablesHandler::onPlayerCloned);
    }
}
