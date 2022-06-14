package net.Applhau.jjkmod.armor.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class mahitoshoes extends BipedModel<LivingEntity> {
    public final ModelRenderer rightshoes;
    public final ModelRenderer leftshoes;

    public mahitoshoes() {
        super(32);
        textureWidth = 32;
        textureHeight = 32;

        rightshoes = new ModelRenderer(this);
        rightshoes.setRotationPoint(-1.9F, 12.0F, 0.0F);
        rightshoes.setTextureOffset(12, 10).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.11F, false);
        rightshoes.setTextureOffset(12, 3).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.31F, false);

        leftshoes = new ModelRenderer(this);
        leftshoes.setRotationPoint(1.9F, 12.0F, 0.0F);
        leftshoes.setTextureOffset(0, 7).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.11F, false);
        leftshoes.setTextureOffset(0, 0).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.31F, false);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        rightshoes.render(matrixStack, buffer, packedLight, packedOverlay);
        leftshoes.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

