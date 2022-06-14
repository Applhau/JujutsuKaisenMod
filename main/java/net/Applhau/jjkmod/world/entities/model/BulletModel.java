package net.Applhau.jjkmod.world.entities.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class BulletModel extends EntityModel<Entity> {
    private final ModelRenderer group;

    public BulletModel() {
        textureWidth = 16;
        textureHeight = 16;

        group = new ModelRenderer(this);
        group.setRotationPoint(-0.1F, 23.2F, 0.375F);
        setRotationAngle(group, 0.0F, 1.5708F, 0.0F);
        group.setTextureOffset(0, 0).addBox(-0.5F, -0.5F, -1.375F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        group.setTextureOffset(13, 14).addBox(-0.5F, -0.5F, -2.275F, 1.0F, 1.0F, 1.0F, -0.1F, false);
        group.setTextureOffset(0, 1).addBox(-0.5F, -0.5F, 0.825F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        group.setTextureOffset(1, 1).addBox(-0.5F, -0.5F, 0.325F, 1.0F, 1.0F, 1.0F, -0.1F, false);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        group.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
