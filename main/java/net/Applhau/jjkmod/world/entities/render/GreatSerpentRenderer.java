package net.Applhau.jjkmod.world.entities.render;

import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.world.entities.mob.DivineDogWhiteEntity;
import net.Applhau.jjkmod.world.entities.mob.GreatSerpentEntity;
import net.Applhau.jjkmod.world.entities.model.DivineDogWhiteModel;
import net.Applhau.jjkmod.world.entities.model.GreatSerpentModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GreatSerpentRenderer extends MobRenderer<GreatSerpentEntity, GreatSerpentModel<GreatSerpentEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(JJKMod.MOD_ID, "textures/entity/mob/great_serpent.png");

    public GreatSerpentRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GreatSerpentModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(GreatSerpentEntity entity) {
        return TEXTURE;
    }
}