package net.Applhau.jjkmod.world.entities.render;

import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.world.entities.mob.DivineDogTotalityEntity;
import net.Applhau.jjkmod.world.entities.mob.DivineDogWhiteEntity;
import net.Applhau.jjkmod.world.entities.model.DivineDogTotalityModel;
import net.Applhau.jjkmod.world.entities.model.DivineDogWhiteModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DivineDogTotalityRenderer extends MobRenderer<DivineDogTotalityEntity, DivineDogTotalityModel<DivineDogTotalityEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(JJKMod.MOD_ID, "textures/entity/mob/divine_dog_totality.png");

    public DivineDogTotalityRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DivineDogTotalityModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(DivineDogTotalityEntity entity) {
        return TEXTURE;
    }
}