package net.Applhau.jjkmod.world.entities.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.Applhau.jjkmod.world.entities.mob.DivineDogWhiteEntity;
import net.Applhau.jjkmod.world.entities.mob.GreatSerpentEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class GreatSerpentModel <T extends GreatSerpentEntity> extends EntityModel<T> {
    private final ModelRenderer bone3;
    private final ModelRenderer head;
    private final ModelRenderer cube_r1;
    private final ModelRenderer bone2;
    private final ModelRenderer bone4;

    public GreatSerpentModel() {
        textureWidth = 128;
        textureHeight = 128;

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(3.2857F, -2.7143F, 21.8571F);
        setRotationAngle(bone3, 0.0F, 3.1416F, 0.0F);
        bone3.setTextureOffset(0, 67).addBox(-10.7143F, -52.2857F, 94.8571F, 23.0F, 12.0F, 21.0F, 0.0F, false);
        bone3.setTextureOffset(0, 52).addBox(-18.7143F, -43.2857F, 78.8571F, 23.0F, 12.0F, 21.0F, 0.0F, false);
        bone3.setTextureOffset(0, 52).addBox(-22.7143F, -33.2857F, 61.8571F, 23.0F, 12.0F, 21.0F, 0.0F, false);
        bone3.setTextureOffset(0, 52).addBox(-17.7143F, -23.2857F, 42.8571F, 23.0F, 12.0F, 21.0F, 0.0F, false);
        bone3.setTextureOffset(0, 52).addBox(-4.7143F, -14.2857F, 27.8571F, 23.0F, 12.0F, 21.0F, 0.0F, false);
        bone3.setTextureOffset(0, 52).addBox(8.2857F, -4.2857F, 14.8571F, 23.0F, 12.0F, 21.0F, 0.0F, false);
        bone3.setTextureOffset(0, 52).addBox(-6.7143F, 10.7143F, -14.1429F, 23.0F, 12.0F, 21.0F, 0.0F, false);
        bone3.setTextureOffset(0, 52).addBox(-19.7143F, 10.7143F, -31.1429F, 23.0F, 12.0F, 21.0F, 0.0F, false);
        bone3.setTextureOffset(40, 13).addBox(-24.7143F, 10.7143F, -50.1429F, 23.0F, 12.0F, 21.0F, 0.0F, false);
        bone3.setTextureOffset(40, 14).addBox(-14.7143F, 10.7143F, -66.1429F, 23.0F, 12.0F, 21.0F, 0.0F, false);
        bone3.setTextureOffset(42, 16).addBox(-1.7143F, 12.7143F, -81.1429F, 18.0F, 10.0F, 21.0F, 0.0F, false);
        bone3.setTextureOffset(41, 19).addBox(-4.7143F, 14.7143F, -102.1429F, 11.0F, 8.0F, 21.0F, 0.0F, false);
        bone3.setTextureOffset(48, 20).addBox(-7.7143F, 16.7143F, -122.1429F, 6.0F, 6.0F, 21.0F, 0.0F, false);
        bone3.setTextureOffset(0, 52).addBox(2.2857F, 5.7143F, -1.1429F, 23.0F, 12.0F, 21.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(3.2857F, -21.2857F, 116.8571F);
        bone3.addChild(head);
        head.setTextureOffset(46, 99).addBox(-15.0F, -41.0F, -3.0F, 28.0F, 16.0F, 13.0F, 0.0F, false);
        head.setTextureOffset(0, 2).addBox(-13.0F, -37.0F, 8.0F, 23.0F, 12.0F, 25.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-0.5F, -27.2145F, 10.0887F);
        head.addChild(cube_r1);
        setRotationAngle(cube_r1, 2.8536F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(0, 0).addBox(-12.5F, 0.0F, -10.4F, 23.0F, 13.0F, 14.0F, 0.0F, false);

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(16.0F, -5.0F, 0.0F);
        head.addChild(bone2);
        bone2.setTextureOffset(120, 0).addBox(-6.0F, -29.0F, 18.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        bone2.setTextureOffset(83, 0).addBox(-5.7F, -29.0F, 10.6F, 3.0F, 3.0F, 5.0F, 0.0F, false);
        bone2.setTextureOffset(102, 0).addBox(-6.0F, -31.0F, 7.0F, 2.0F, 2.0F, 11.0F, 0.0F, false);
        bone2.setTextureOffset(104, 0).addBox(-6.0F, -26.0F, 8.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(-9.0F, -5.0F, 0.0F);
        head.addChild(bone4);
        bone4.setTextureOffset(120, 0).addBox(-6.0F, -29.0F, 18.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        bone4.setTextureOffset(86, 0).addBox(-6.7F, -29.0F, 10.6F, 3.0F, 3.0F, 5.0F, 0.0F, false);
        bone4.setTextureOffset(102, 0).addBox(-6.0F, -31.0F, 7.0F, 2.0F, 2.0F, 11.0F, 0.0F, false);
        bone4.setTextureOffset(104, 0).addBox(-6.0F, -26.0F, 8.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        bone3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

