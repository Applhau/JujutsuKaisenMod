package net.Applhau.jjkmod.util.data;

import net.Applhau.jjkmod.JJKMod;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(modid = JJKMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {


    public static void init(final FMLCommonSetupEvent event){
        IEventBus bus = MinecraftForge.EVENT_BUS;
        CapabilityJJKPlayerVariables.register();

        bus.addGenericListener(Entity.class, JJKPlayerVariablesHandler::onAttackCapabilitiesPlayer);
        bus.addListener(JJKPlayerVariablesHandler::onPlayerCloned);
    }



}