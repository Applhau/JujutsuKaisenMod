package net.Applhau.jjkmod.world.entities.render;

import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.world.entities.mob.DivineDogWhiteEntity;
import net.Applhau.jjkmod.world.entities.model.DivineDogWhiteModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DivineDogBlackRenderer extends MobRenderer<DivineDogWhiteEntity, DivineDogWhiteModel<DivineDogWhiteEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(JJKMod.MOD_ID, "textures/entity/mob/divine_dog_black.png");

    public DivineDogBlackRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DivineDogWhiteModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(DivineDogWhiteEntity entity) {
        return TEXTURE;
    }
}
