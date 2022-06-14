package net.Applhau.jjkmod.world.entities.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.world.entities.projectile.Bullet;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BulletRenderer extends EntityRenderer<Bullet> {
    public BulletRenderer(EntityRendererManager renderManager) {
        super(renderManager);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void render(Bullet entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        /*IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
        EntityModel model = new BulletModel();
        model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F,1.0F, 1.0F);*/
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }

    @Override
    public ResourceLocation getEntityTexture(Bullet entity) {
        Item referneceItem = entity.getArrowStack().getItem();
        return new ResourceLocation(JJKMod.MOD_ID, "textures/entity/projectiles/" + referneceItem.getRegistryName().getPath() + ".png");
    }

}
