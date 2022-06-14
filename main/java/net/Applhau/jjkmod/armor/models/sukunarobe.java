package net.Applhau.jjkmod.armor.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class sukunarobe extends BipedModel<LivingEntity> {
    public final ModelRenderer body;
    public final ModelRenderer rightarm;
    public final ModelRenderer rightarm_r1;
    public final ModelRenderer leftarm;
    public final ModelRenderer rightarm_r2;

    public sukunarobe() {
        super(64);
        textureWidth = 64;
        textureHeight = 64;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.1F, false);
        body.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.3F, false);

        rightarm = new ModelRenderer(this);
        rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        rightarm.setTextureOffset(24, 17).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.1F, false);
        rightarm.setTextureOffset(16, 34).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.3F, false);

        rightarm_r1 = new ModelRenderer(this);
        rightarm_r1.setRotationPoint(5.0F, 22.0F, 0.0F);
        rightarm.addChild(rightarm_r1);
        setRotationAngle(rightarm_r1, 0.1963F, 0.0F, 0.0F);
        rightarm_r1.setTextureOffset(40, 0).addBox(-8.0F, -22.5999F, 4.091F, 4.0F, 11.0F, 2.0F, 0.1F, false);

        leftarm = new ModelRenderer(this);
        leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        leftarm.setTextureOffset(24, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.1F, false);
        leftarm.setTextureOffset(0, 32).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.3F, false);

        rightarm_r2 = new ModelRenderer(this);
        rightarm_r2.setRotationPoint(-5.0F, 22.0F, 0.0F);
        leftarm.addChild(rightarm_r2);
        setRotationAngle(rightarm_r2, 0.1963F, 0.0F, 0.0F);
        rightarm_r2.setTextureOffset(32, 34).addBox(4.0F, -21.3499F, 4.091F, 4.0F, 11.0F, 2.0F, 0.1F, false);

        bipedBody.addChild(body);
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
