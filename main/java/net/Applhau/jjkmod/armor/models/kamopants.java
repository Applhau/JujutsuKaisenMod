package net.Applhau.jjkmod.armor.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class kamopants extends BipedModel<LivingEntity> {
    public final ModelRenderer rightleg;
    public final ModelRenderer leftleg;

    public kamopants() {
        super(64);
        textureWidth = 64;
        textureHeight = 64;

        rightleg = new ModelRenderer(this);
        rightleg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        rightleg.setTextureOffset(48, 51).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.1F, false);
        rightleg.setTextureOffset(0, 51).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.3F, false);
        rightleg.setTextureOffset(44, 36).addBox(0.225F, -1.3F, -3.3F, 1.0F, 3.0F, 1.0F, 0.1F, false);

        leftleg = new ModelRenderer(this);
        leftleg.setRotationPoint(1.9F, 12.0F, 0.0F);
        leftleg.setTextureOffset(48, 51).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.1F, true);
        leftleg.setTextureOffset(0, 51).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.3F, false);
        leftleg.setTextureOffset(44, 36).addBox(-1.3F, -1.3F, -3.3F, 1.0F, 5.0F, 1.0F, 0.1F, false);
        leftleg.setTextureOffset(44, 36).addBox(-2.4F, -1.6F, -3.3F, 1.0F, 2.0F, 1.0F, 0.1F, false);

        bipedLeftLeg.addChild(leftleg);
        bipedRightLeg.addChild(rightleg);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
        leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

