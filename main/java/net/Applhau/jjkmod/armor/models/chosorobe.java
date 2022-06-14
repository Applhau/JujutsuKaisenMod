package net.Applhau.jjkmod.armor.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class chosorobe extends BipedModel<LivingEntity> {
    public final ModelRenderer body;
    public final ModelRenderer body_r1;
    public final ModelRenderer body_r2;
    public final ModelRenderer body_r3;
    public final ModelRenderer body_r4;
    public final ModelRenderer rightarm;
    public final ModelRenderer rightarm_r1;
    public final ModelRenderer leftarm;
    public final ModelRenderer rightarm_r2;

    public chosorobe() {
        super(64);
        textureWidth = 64;
        textureHeight = 64;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.setTextureOffset(24, 12).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 12.0F, 4.0F, 0.1F, false);
        body.setTextureOffset(0, 0).addBox(-4.0F, 2.0F, -3.0F, 8.0F, 10.0F, 6.0F, 0.1F, false);
        body.setTextureOffset(20, 45).addBox(-3.0F, 12.0F, -3.0F, 6.0F, 2.0F, 1.0F, 0.1F, false);
        body.setTextureOffset(28, 9).addBox(-3.0F, 12.0F, 2.0F, 6.0F, 2.0F, 1.0F, 0.1F, false);
        body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.3F, false);

        body_r1 = new ModelRenderer(this);
        body_r1.setRotationPoint(-1.054F, 23.4779F, 5.0F);
        body.addChild(body_r1);
        setRotationAngle(body_r1, 0.0F, 0.0F, 0.1745F);
        body_r1.setTextureOffset(0, 3).addBox(2.0F, -12.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.1F, false);
        body_r1.setTextureOffset(20, 16).addBox(2.0F, -12.0F, -8.0F, 1.0F, 2.0F, 1.0F, 0.1F, false);

        body_r2 = new ModelRenderer(this);
        body_r2.setRotationPoint(-3.87F, 24.3461F, 5.0F);
        body.addChild(body_r2);
        setRotationAngle(body_r2, 0.0F, 0.0F, -0.1745F);
        body_r2.setTextureOffset(0, 0).addBox(2.0F, -12.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.1F, false);
        body_r2.setTextureOffset(0, 16).addBox(2.0F, -12.0F, -8.0F, 1.0F, 2.0F, 1.0F, 0.1F, false);

        body_r3 = new ModelRenderer(this);
        body_r3.setRotationPoint(3.7406F, 22.7553F, 0.0F);
        body.addChild(body_r3);
        setRotationAngle(body_r3, 0.0F, 0.0F, -0.1745F);
        body_r3.setTextureOffset(28, 0).addBox(-4.0F, -24.0F, -3.0F, 2.0F, 3.0F, 6.0F, 0.1F, false);

        body_r4 = new ModelRenderer(this);
        body_r4.setRotationPoint(2.1682F, 23.7972F, 0.0F);
        body.addChild(body_r4);
        setRotationAngle(body_r4, 0.0F, 0.0F, 0.1745F);
        body_r4.setTextureOffset(10, 43).addBox(-4.0F, -24.0F, -3.0F, 2.0F, 3.0F, 6.0F, 0.1F, false);

        rightarm = new ModelRenderer(this);
        rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        rightarm.setTextureOffset(0, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.1F, false);
        rightarm.setTextureOffset(44, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.3F, false);

        rightarm_r1 = new ModelRenderer(this);
        rightarm_r1.setRotationPoint(5.0F, 20.4001F, 6.091F);
        rightarm.addChild(rightarm_r1);
        setRotationAngle(rightarm_r1, 0.1963F, 0.0F, 0.0F);
        rightarm_r1.setTextureOffset(46, 44).addBox(-8.0F, -21.0F, -2.0F, 4.0F, 11.0F, 2.0F, 0.1F, false);

        leftarm = new ModelRenderer(this);
        leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        leftarm.setTextureOffset(20, 28).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.1F, false);
        leftarm.setTextureOffset(36, 28).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.3F, false);

        rightarm_r2 = new ModelRenderer(this);
        rightarm_r2.setRotationPoint(-5.0F, 20.4001F, 6.091F);
        leftarm.addChild(rightarm_r2);
        setRotationAngle(rightarm_r2, 0.1963F, 0.0F, 0.0F);
        rightarm_r2.setTextureOffset(34, 44).addBox(4.0F, -21.0F, -2.0F, 4.0F, 11.0F, 2.0F, 0.1F, false);



        bipedBody.addChild(body);
        bipedBody.addChild(body_r1);
        bipedBody.addChild(body_r2);
        bipedBody.addChild(body_r3);
        bipedBody.addChild(body_r4);
        bipedRightArm.addChild(rightarm);
        bipedRightArm.addChild(rightarm_r1);
        bipedLeftArm.addChild(rightarm_r2);
        bipedLeftArm.addChild(leftarm);

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
