package net.Applhau.jjkmod.client.abilities.ratio;


import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.client.Ability;
import net.Applhau.jjkmod.client.particles.ParticleList;
import net.Applhau.jjkmod.events.InputEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.CriticalHitEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber(modid = JJKMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class Ratio {

    @SubscribeEvent
    public static void critHit(CriticalHitEvent event){
        Entity entityHit = event.getTarget();
        Random rand = null;
        double x = entityHit.getPosX();
        double y = entityHit.getPosY() + entityHit.getBoundingBox().getYSize();
        double z = entityHit.getPosZ();
        if(Ability.RatioTrig == true && InputEvents.ratioActivated == true){
            Minecraft.getInstance().player.sendMessage((ITextComponent)new StringTextComponent("7:3"), null);
            entityHit.attackEntityFrom(DamageSource.GENERIC, 6);
            Ability.CursedEnergy -= 7;
            Minecraft.getInstance().world.addParticle(ParticleList.RATIO_01.get(), x ,y,z, 0d, 0d, 0d);
        }
    }




}
