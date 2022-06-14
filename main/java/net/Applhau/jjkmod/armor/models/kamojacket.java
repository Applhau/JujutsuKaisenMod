package net.Applhau.jjkmod.armor.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class kamojacket extends BipedModel<LivingEntity> {
    public final ModelRenderer body;
    public final ModelRenderer rightarm;
    public final ModelRenderer rightarm_r1_r1;
    public final ModelRenderer leftarm;
    public final ModelRenderer leftarm_r1_r1;

    public kamojacket() {
        super(64);
        textureWidth = 64;
        textureHeight = 64;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.setTextureOffset(39, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 11.0F, 4.0F, 0.1F, false);
        body.setTextureOffset(40, 30).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 11.0F, 4.0F, 0.3F, false);
        body.setTextureOffset(19, 42).addBox(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, 0.1F, false);

        rightarm = new ModelRenderer(this);
        rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        rightarm.setTextureOffset(0, 49).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.1F, false);
        rightarm.setTextureOffset(0, 42).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, false);

        rightarm_r1_r1 = new ModelRenderer(this);
        rightarm_r1_r1.setRotationPoint(5.0F, 22.0F, 0.0F);
        rightarm.addChild(rightarm_r1_r1);
        setRotationAngle(rightarm_r1_r1, 0.0F, 0.0F, 0.1309F);
        rightarm_r1_r1.setTextureOffset(48, 49).addBox(-11.45F, -21.9F, -2.0F, 4.0F, 11.0F, 4.0F, 0.3F, false);

        leftarm = new ModelRenderer(this);
        leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        leftarm.setTextureOffset(0, 49).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.1F, true);
        leftarm.setTextureOffset(0, 42).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, true);

        leftarm_r1_r1 = new ModelRenderer(this);
        leftarm_r1_r1.setRotationPoint(-5.0F, 22.0F, 0.0F);
        leftarm.addChild(leftarm_r1_r1);
        setRotationAngle(leftarm_r1_r1, 0.0F, 0.0F, -0.1309F);
        leftarm_r1_r1.setTextureOffset(48, 49).addBox(7.275F, -21.9F, -2.0F, 4.0F, 11.0F, 4.0F, 0.3F, true);

        bipedBody.addChild(body);
        bipedRightArm.addChild(rightarm_r1_r1);
        bipedRightArm.addChild(rightarm);
        bipedLeftArm.addChild(leftarm_r1_r1);
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
