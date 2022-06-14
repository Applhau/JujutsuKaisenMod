package net.Applhau.jjkmod.world.entities.render;

import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.world.entities.mob.NueEntity;
import net.Applhau.jjkmod.world.entities.mob.RootSpikeEntity;
import net.Applhau.jjkmod.world.entities.model.NueModel;
import net.Applhau.jjkmod.world.entities.model.RootSpikeModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RootSpikeRenderer extends MobRenderer<RootSpikeEntity, RootSpikeModel<RootSpikeEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(JJKMod.MOD_ID, "textures/entity/mob/root_spike.png");

    public RootSpikeRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new RootSpikeModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(RootSpikeEntity entity) {
        return TEXTURE;
    }
}