package net.Applhau.jjkmod.world.entities.render;

import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.world.entities.mob.RootSpikeEntity;
import net.Applhau.jjkmod.world.entities.model.RootBallModel;
import net.Applhau.jjkmod.world.entities.model.RootSpikeModel;
import net.Applhau.jjkmod.world.entities.projectile.RootBallEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;


public class RootBallRenderer extends EntityRenderer<RootBallEntity>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(JJKMod.MOD_ID, "textures/entity/projectiles/rootball.png");

    public RootBallRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn);
    }

    @Override
    public ResourceLocation getEntityTexture(RootBallEntity entity) {
        return TEXTURE;
    }
}
