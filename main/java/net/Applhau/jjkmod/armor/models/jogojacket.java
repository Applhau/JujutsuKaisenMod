package net.Applhau.jjkmod.armor.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class jogojacket extends BipedModel<LivingEntity> {
    public final ModelRenderer body;
    public final ModelRenderer body_r1;
    public final ModelRenderer rightarm;
    public final ModelRenderer rightarm_r1;
    public final ModelRenderer leftarm;
    public final ModelRenderer leftarm_r1;

    public jogojacket() {
        super(128);
        textureWidth = 128;
        textureHeight = 128;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.setTextureOffset(0, 41).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.1F, false);
        body.setTextureOffset(0, 0).addBox(-5.0F, 0.0F, -3.0F, 10.0F, 10.0F, 6.0F, 0.1F, false);
        body.setTextureOffset(32, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.3F, false);

        body_r1 = new ModelRenderer(this);
        body_r1.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.addChild(body_r1);
        setRotationAngle(body_r1, 0.0873F, 0.0F, 0.0F);
        body_r1.setTextureOffset(0, 16).addBox(-5.0F, -25.0F, -1.0F, 10.0F, 2.0F, 7.0F, 0.1F, false);

        rightarm = new ModelRenderer(this);
        rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        rightarm.setTextureOffset(52, 53).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.1F, false);
        rightarm.setTextureOffset(48, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.3F, false);

        rightarm_r1 = new ModelRenderer(this);
        rightarm_r1.setRotationPoint(2.5254F, 22.6584F, 0.0F);
        rightarm.addChild(rightarm_r1);
        setRotationAngle(rightarm_r1, 0.0F, 0.0F, 0.1745F);
        rightarm_r1.setTextureOffset(0, 25).addBox(-10.0F, -24.0F, -3.0F, 6.0F, 10.0F, 6.0F, 0.1F, false);

        leftarm = new ModelRenderer(this);
        leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        leftarm.setTextureOffset(40, 41).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.1F, false);
        leftarm.setTextureOffset(24, 41).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.3F, false);

        leftarm_r1 = new ModelRenderer(this);
        leftarm_r1.setRotationPoint(-0.5558F, 22.3111F, 0.0F);
        leftarm.addChild(leftarm_r1);
        setRotationAngle(leftarm_r1, 0.0F, 0.0F, -0.1745F);
        leftarm_r1.setTextureOffset(24, 25).addBox(2.0F, -24.0F, -3.0F, 6.0F, 10.0F, 6.0F, 0.1F, false);

        bipedBody.addChild(body);
        bipedBody.addChild(body_r1);
        bipedLeftArm.addChild(leftarm);
        bipedLeftArm.addChild(leftarm_r1);
        bipedRightArm.addChild(rightarm);
        bipedRightArm.addChild(rightarm_r1);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
        leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
