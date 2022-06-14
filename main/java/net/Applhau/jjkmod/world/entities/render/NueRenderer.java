package net.Applhau.jjkmod.world.entities.render;

import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.world.entities.mob.GreatSerpentEntity;
import net.Applhau.jjkmod.world.entities.mob.NueEntity;
import net.Applhau.jjkmod.world.entities.model.GreatSerpentModel;
import net.Applhau.jjkmod.world.entities.model.NueModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class NueRenderer extends MobRenderer<NueEntity, NueModel<NueEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(JJKMod.MOD_ID, "textures/entity/mob/nue.png");

    public NueRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new NueModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(NueEntity entity) {
        return TEXTURE;
    }
}