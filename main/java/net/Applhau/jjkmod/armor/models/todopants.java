package net.Applhau.jjkmod.armor.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class todopants extends BipedModel<LivingEntity> {
    public final ModelRenderer rightleg;
    public final ModelRenderer rightleg_r1;
    public final ModelRenderer rightleg_r2;
    public final ModelRenderer leftleg;
    public final ModelRenderer leftleg_r1;
    public final ModelRenderer leftleg_r2;

    public todopants() {
        super(64);
        textureWidth = 64;
        textureHeight = 64;

        rightleg = new ModelRenderer(this);
        rightleg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        rightleg.setTextureOffset(0, 33).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.1F, false);

        rightleg_r1 = new ModelRenderer(this);
        rightleg_r1.setRotationPoint(-1.4816F, 7.683F, 0.0F);
        rightleg.addChild(rightleg_r1);
        setRotationAngle(rightleg_r1, 0.0F, 0.0F, -0.7679F);
        rightleg_r1.setTextureOffset(52, 57).addBox(-1.275F, -2.575F, -2.0F, 2.0F, 3.0F, 4.0F, 0.1F, false);

        rightleg_r2 = new ModelRenderer(this);
        rightleg_r2.setRotationPoint(0.0F, 4.0F, 0.0F);
        rightleg.addChild(rightleg_r2);
        setRotationAngle(rightleg_r2, 0.0F, 0.0F, 0.1745F);
        rightleg_r2.setTextureOffset(52, 0).addBox(-3.6F, -4.6F, -2.0F, 2.0F, 8.0F, 4.0F, 0.1F, false);

        leftleg = new ModelRenderer(this);
        leftleg.setRotationPoint(1.9F, 12.0F, 0.0F);
        leftleg.setTextureOffset(0, 33).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.1F, true);

        leftleg_r1 = new ModelRenderer(this);
        leftleg_r1.setRotationPoint(1.5762F, 7.7156F, 0.0F);
        leftleg.addChild(leftleg_r1);
        setRotationAngle(leftleg_r1, 0.0F, 0.0F, 0.7679F);
        leftleg_r1.setTextureOffset(52, 57).addBox(-0.975F, -2.4F, -2.0F, 2.0F, 3.0F, 4.0F, 0.1F, true);

        leftleg_r2 = new ModelRenderer(this);
        leftleg_r2.setRotationPoint(0.0F, 4.0F, 0.0F);
        leftleg.addChild(leftleg_r2);
        setRotationAngle(leftleg_r2, 0.0F, 0.0F, -0.1745F);
        leftleg_r2.setTextureOffset(52, 0).addBox(1.4F, -4.6F, -2.0F, 2.0F, 8.0F, 4.0F, 0.1F, true);

        bipedRightLeg.addChild(rightleg);
        bipedRightLeg.addChild(rightleg_r1);
        bipedRightLeg.addChild(rightleg_r2);
        bipedLeftLeg.addChild(leftleg);
        bipedLeftLeg.addChild(leftleg_r1);
        bipedLeftLeg.addChild(leftleg_r2);
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
