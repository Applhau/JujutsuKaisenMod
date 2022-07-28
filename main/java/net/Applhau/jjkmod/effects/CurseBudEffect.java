package net.Applhau.jjkmod.effects;

import net.Applhau.jjkmod.client.Ability;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.DamageSource;

public class CurseBudEffect extends Effect {
    protected CurseBudEffect(EffectType typeIn, int liquidColorIn) {
        super(EffectType.HARMFUL, liquidColorIn);
    }

    static int Timer = 0;

    @Override
    public void performEffect(LivingEntity entityLivingBaseIn, int amplifier) {

        Ability.currentCursedEnergy -= Ability.maxCursedEnergy * 0.06;
        entityLivingBaseIn.attackEntityFrom(DamageSource.GENERIC, 2);

    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        return duration % 60 == 0;//every 3 seconds
    }
}
