package net.Applhau.jjkmod.world.entities.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.Applhau.jjkmod.world.entities.mob.DivineDogTotalityEntity;
import net.Applhau.jjkmod.world.entities.mob.DivineDogWhiteEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DivineDogTotalityModel <T extends DivineDogTotalityEntity> extends EntityModel<T> {
    private final ModelRenderer bone9;
    private final ModelRenderer bone7;
    private final ModelRenderer bone4_r1;
    private final ModelRenderer bone5_r1;
    private final ModelRenderer bone4_r2;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone4;
    private final ModelRenderer cube_r4_r1;
    private final ModelRenderer bone6_r1;
    private final ModelRenderer bone6_r2;
    private final ModelRenderer cube_r2;
    private final ModelRenderer bb_main;
    private final ModelRenderer bb_main_r1;
    private final ModelRenderer bb_main_r2;
    private final ModelRenderer bone6;
    private final ModelRenderer bone;
    private final ModelRenderer bone8;
    private final ModelRenderer bone5;
    private final ModelRenderer bone3;
    private final ModelRenderer bone5_r2;
    private final ModelRenderer bone5_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r3_r1;
    private final ModelRenderer bone2;
    private final ModelRenderer bone4_r3;
    private final ModelRenderer bone3_r2;
    private final ModelRenderer bone3_r3;
    private final ModelRenderer bone2_r1;

    public DivineDogTotalityModel() {
        textureWidth = 128;
        textureHeight = 128;

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(-10.0F, 30.0F, 0.0F);


        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(22.1667F, -9.4862F, -6.4521F);
        bone9.addChild(bone7);
        setRotationAngle(bone7, -3.1416F, 0.0F, 3.1416F);


        bone4_r1 = new ModelRenderer(this);
        bone4_r1.setRotationPoint(24.8333F, -7.3485F, 2.2549F);
        bone7.addChild(bone4_r1);
        setRotationAngle(bone4_r1, -2.0944F, 0.0F, 0.0F);
        bone4_r1.setTextureOffset(0, 110).addBox(-29.0F, -14.0F, 0.0F, 6.0F, 14.0F, 4.0F, 0.0F, false);

        bone5_r1 = new ModelRenderer(this);
        bone5_r1.setRotationPoint(-1.1667F, 0.5069F, 0.274F);
        bone7.addChild(bone5_r1);
        setRotationAngle(bone5_r1, -1.5708F, 0.0F, 0.0F);
        bone5_r1.setTextureOffset(0, 111).addBox(-3.0F, -23.0F, -1.5F, 6.0F, 14.0F, 4.0F, 0.0F, false);

        bone4_r2 = new ModelRenderer(this);
        bone4_r2.setRotationPoint(4.3333F, -9.5138F, 4.4521F);
        bone7.addChild(bone4_r2);
        setRotationAngle(bone4_r2, 0.2727F, 0.8189F, 0.3413F);
        bone4_r2.setTextureOffset(102, 0).addBox(-5.5F, -8.0F, -9.0F, 7.0F, 13.0F, 6.0F, 0.0F, false);

        bone3_r1 = new ModelRenderer(this);
        bone3_r1.setRotationPoint(4.3333F, -9.5138F, 4.4521F);
        bone7.addChild(bone3_r1);
        setRotationAngle(bone3_r1, 0.0F, 0.0F, 1.0908F);
        bone3_r1.setTextureOffset(33, 0).addBox(-11.5F, -12.0F, -6.0F, 9.0F, 16.0F, 6.0F, 0.0F, false);

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(11.0F, -19.0F, 31.0F);
        bone9.addChild(bone4);
        bone4.setTextureOffset(0, 116).addBox(5.0F, 8.0F, -20.0F, 5.0F, 5.0F, 7.0F, 0.0F, false);

        cube_r4_r1 = new ModelRenderer(this);
        cube_r4_r1.setRotationPoint(5.5F, -8.2186F, -14.9316F);
        bone4.addChild(cube_r4_r1);
        setRotationAngle(cube_r4_r1, -0.6981F, 0.0F, 0.0F);
        cube_r4_r1.setTextureOffset(40, 0).addBox(-1.5F, -10.5F, 2.5F, 7.0F, 19.0F, 7.0F, 0.0F, false);

        bone6_r1 = new ModelRenderer(this);
        bone6_r1.setRotationPoint(5.5F, 6.5F, -5.0F);
        bone4.addChild(bone6_r1);
        setRotationAngle(bone6_r1, 0.6981F, 0.0F, 0.0F);
        bone6_r1.setTextureOffset(95, 114).addBox(-0.5F, -5.5F, -10.0F, 5.0F, 5.0F, 7.0F, 0.0F, false);

        bone6_r2 = new ModelRenderer(this);
        bone6_r2.setRotationPoint(5.5F, 0.5F, -2.0F);
        bone4.addChild(bone6_r2);
        setRotationAngle(bone6_r2, 0.7418F, 0.0F, 0.0F);
        bone6_r2.setTextureOffset(106, 2).addBox(-0.5F, -12.5F, -12.0F, 5.0F, 14.0F, 4.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(5.5F, -11.5F, -6.5F);
        bone4.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.6981F, 0.0F, 0.0F);


        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(10.0F, -1.0F, 0.0F);
        bone9.addChild(bb_main);
        bb_main.setTextureOffset(22, 0).addBox(-6.0F, -36.0F, 17.0F, 15.0F, 13.0F, 10.0F, 0.0F, false);

        bb_main_r1 = new ModelRenderer(this);
        bb_main_r1.setRotationPoint(0.5F, -28.5F, 9.5F);
        bb_main.addChild(bb_main_r1);
        setRotationAngle(bb_main_r1, -0.2182F, 0.0F, 0.0F);
        bb_main_r1.setTextureOffset(16, 0).addBox(-5.5F, -10.5F, -7.5F, 13.0F, 13.0F, 15.0F, 0.0F, false);

        bb_main_r2 = new ModelRenderer(this);
        bb_main_r2.setRotationPoint(0.5F, -30.0F, -5.0F);
        bb_main.addChild(bb_main_r2);
        setRotationAngle(bb_main_r2, 0.2182F, 0.0F, 0.0F);
        bb_main_r2.setTextureOffset(62, 55).addBox(-6.5F, -7.0F, -8.1F, 15.0F, 16.0F, 18.0F, 0.0F, false);

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, -10.0F, -7.0F);
        bb_main.addChild(bone6);
        bone6.setTextureOffset(86, 113).addBox(-2.0F, -25.0F, -21.0F, 6.0F, 3.0F, 7.0F, 0.0F, false);
        bone6.setTextureOffset(89, 31).addBox(-3.0F, -28.0F, -22.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);
        bone6.setTextureOffset(22, 45).addBox(-6.0F, -33.0F, -14.0F, 13.0F, 11.0F, 8.0F, 0.0F, false);

        bone = new ModelRenderer(this);
        bone.setRotationPoint(4.2F, -31.2333F, -8.8333F);
        bone6.addChild(bone);
        setRotationAngle(bone, 0.0F, -0.6981F, 0.0F);
        bone.setTextureOffset(56, 0).addBox(-0.5F, -6.9667F, -1.1667F, 5.0F, 8.0F, 1.0F, 0.0F, false);
        bone.setTextureOffset(50, 0).addBox(1.5F, -6.7667F, -1.1667F, 2.0F, 9.0F, 2.0F, 0.0F, false);
        bone.setTextureOffset(50, 0).addBox(-0.5F, -3.7667F, -0.1667F, 4.0F, 8.0F, 2.0F, 0.0F, false);

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(-2.8F, -31.2333F, -8.8333F);
        bone6.addChild(bone8);
        setRotationAngle(bone8, 0.0F, 0.6981F, 0.0F);
        bone8.setTextureOffset(56, 0).addBox(-2.5F, -6.9667F, -1.1667F, 3.0F, 8.0F, 1.0F, 0.0F, false);
        bone8.setTextureOffset(50, 0).addBox(-3.5F, -5.7667F, -1.1667F, 4.0F, 8.0F, 2.0F, 0.0F, false);
        bone8.setTextureOffset(50, 0).addBox(-3.5F, -4.7667F, -0.1667F, 4.0F, 9.0F, 2.0F, 0.0F, false);

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(10.0F, -12.0F, 12.0F);
        bone9.addChild(bone5);
        bone5.setTextureOffset(54, 0).addBox(-2.0F, -24.0F, 15.0F, 7.0F, 6.0F, 2.0F, 0.0F, false);
        bone5.setTextureOffset(44, 0).addBox(-2.0F, -25.0F, 16.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);
        bone5.setTextureOffset(26, 0).addBox(-4.0F, -28.0F, 19.0F, 11.0F, 13.0F, 12.0F, 0.0F, false);
        bone5.setTextureOffset(10, 5).addBox(-3.0F, -26.0F, 29.0F, 9.0F, 10.0F, 16.0F, 0.0F, false);
        bone5.setTextureOffset(9, 4).addBox(-2.0F, -23.0F, 37.0F, 7.0F, 7.0F, 17.0F, 0.0F, false);

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-1.0F, -19.0F, 31.0F);
        bone9.addChild(bone3);
        bone3.setTextureOffset(0, 116).addBox(3.0F, 8.0F, -20.0F, 5.0F, 5.0F, 7.0F, 0.0F, false);

        bone5_r2 = new ModelRenderer(this);
        bone5_r2.setRotationPoint(5.5F, 6.5F, -5.0F);
        bone3.addChild(bone5_r2);
        setRotationAngle(bone5_r2, 0.6981F, 0.0F, 0.0F);
        bone5_r2.setTextureOffset(95, 114).addBox(-2.5F, -5.5F, -10.0F, 5.0F, 5.0F, 7.0F, 0.0F, false);

        bone5_r3 = new ModelRenderer(this);
        bone5_r3.setRotationPoint(5.5F, 0.5F, -2.0F);
        bone3.addChild(bone5_r3);
        setRotationAngle(bone5_r3, 0.7418F, 0.0F, 0.0F);
        bone5_r3.setTextureOffset(106, 2).addBox(-2.5F, -12.5F, -12.0F, 5.0F, 14.0F, 4.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(5.5F, -11.5F, -6.5F);
        bone3.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.6981F, 0.0F, 0.0F);


        cube_r3_r1 = new ModelRenderer(this);
        cube_r3_r1.setRotationPoint(0.0F, 2.5F, -4.0F);
        cube_r4.addChild(cube_r3_r1);
        setRotationAngle(cube_r3_r1, -1.3963F, 0.0F, 0.0F);
        cube_r3_r1.setTextureOffset(40, 0).addBox(-3.5F, -7.0F, -3.5F, 9.0F, 19.0F, 7.0F, 0.0F, false);

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone9.addChild(bone2);


        bone4_r3 = new ModelRenderer(this);
        bone4_r3.setRotationPoint(-1.0F, -8.9793F, -16.1781F);
        bone2.addChild(bone4_r3);
        setRotationAngle(bone4_r3, -1.5708F, 0.0F, 0.0F);
        bone4_r3.setTextureOffset(0, 111).addBox(-5.0F, 0.0F, -1.5F, 6.0F, 13.0F, 4.0F, 0.0F, false);

        bone3_r2 = new ModelRenderer(this);
        bone3_r2.setRotationPoint(-1.0F, -8.9793F, -16.1781F);
        bone2.addChild(bone3_r2);
        setRotationAngle(bone3_r2, -1.1781F, 0.0F, 0.0F);
        bone3_r2.setTextureOffset(0, 104).addBox(-5.0F, -6.0F, -5.5F, 6.0F, 14.0F, 4.0F, 0.0F, false);

        bone3_r3 = new ModelRenderer(this);
        bone3_r3.setRotationPoint(4.5F, -19.0F, -12.0F);
        bone2.addChild(bone3_r3);
        setRotationAngle(bone3_r3, -1.0057F, -0.7366F, 1.0058F);
        bone3_r3.setTextureOffset(102, 0).addBox(-5.5F, -6.0F, 3.0F, 7.0F, 12.0F, 6.0F, 0.0F, false);

        bone2_r1 = new ModelRenderer(this);
        bone2_r1.setRotationPoint(4.5F, -19.0F, -12.0F);
        bone2.addChild(bone2_r1);
        setRotationAngle(bone2_r1, 0.0F, 0.0F, 1.2654F);
        bone2_r1.setTextureOffset(33, 0).addBox(-9.5F, -10.0F, 1.0F, 9.0F, 16.0F, 6.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        bone9.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}

