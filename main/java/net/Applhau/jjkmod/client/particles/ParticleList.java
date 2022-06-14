package net.Applhau.jjkmod.client.particles;

import net.Applhau.jjkmod.JJKMod;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ParticleList {

    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, JJKMod.MOD_ID);

    public static final RegistryObject<BasicParticleType> RATIO_01 = PARTICLES.register("ratio_one", () -> new BasicParticleType(true));
    public static final RegistryObject<BasicParticleType> NAIL = PARTICLES.register("nail", () -> new BasicParticleType(true));
}
