package net.Applhau.jjkmod.client;

import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.client.particles.ParticleList;
import net.Applhau.jjkmod.client.particles.Ratio01Particle;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JJKMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ParticleUtil {

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerParticles(ParticleFactoryRegisterEvent event){
        Minecraft.getInstance().particles.registerFactory(ParticleList.RATIO_01.get(), Ratio01Particle.Factory::new);
        Minecraft.getInstance().particles.registerFactory(ParticleList.NAIL.get(), Ratio01Particle.Factory::new);
    }
}
