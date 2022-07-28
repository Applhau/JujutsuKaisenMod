package net.Applhau.jjkmod.util;


import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.client.keybinds.KeybindsInit;
import net.Applhau.jjkmod.world.entities.render.BulletRenderer;
import net.Applhau.jjkmod.world.entities.ModEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = JJKMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {


    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        KeybindsInit.register(event);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityType.BULLET.get(), BulletRenderer::new);
    }


}