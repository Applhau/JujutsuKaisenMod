package net.Applhau.jjkmod.util.data;

import net.Applhau.jjkmod.JJKMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = JJKMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {

    public static void init(final FMLCommonSetupEvent event) {
        PlayerVariablesCapabilities.init(event);

        MinecraftForge.EVENT_BUS.addListener(PlayerVariablesHandler::onPlayerRespawned);
        MinecraftForge.EVENT_BUS.addListener(PlayerVariablesHandler::onPlayerLoggedIn);
        MinecraftForge.EVENT_BUS.addListener(PlayerVariablesHandler::onPlayerChangedDimension);
        MinecraftForge.EVENT_BUS.addListener(PlayerVariablesHandler::onAttachCapabilities);
        MinecraftForge.EVENT_BUS.addListener(PlayerVariablesHandler::clonePlayer);
    }

}
