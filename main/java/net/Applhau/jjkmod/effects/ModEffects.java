package net.Applhau.jjkmod.effects;

import net.Applhau.jjkmod.JJKMod;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEffects {

    public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, JJKMod.MOD_ID);

    public static final RegistryObject<Effect> CURSED_BUD_EFFECT = EFFECTS.register
            ("cursed_bud_effect", () -> new CurseBudEffect(EffectType.HARMFUL, 5578058));


}
