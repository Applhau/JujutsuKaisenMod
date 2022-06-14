package net.Applhau.jjkmod.armor.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class gakuganjisandals extends BipedModel<LivingEntity> {
    public final ModelRenderer rightshoes;
    public final ModelRenderer leftshoes;

    public gakuganjisandals() {
        super(64);
        textureWidth = 64;
        textureHeight = 64;

        rightshoes = new ModelRenderer(this);
        rightshoes.setRotationPoint(-1.9F, 12.0F, 0.0F);
        rightshoes.setTextureOffset(0, 32).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.11F, false);
        rightshoes.setTextureOffset(0, 43).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.31F, false);

        leftshoes = new ModelRenderer(this);
        leftshoes.setRotationPoint(1.9F, 12.0F, 0.0F);
        leftshoes.setTextureOffset(18, 32).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.11F, true);
        leftshoes.setTextureOffset(16, 43).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.31F, true);

        bipedLeftLeg.addChild(leftshoes);
        bipedRightLeg.addChild(rightshoes);
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

