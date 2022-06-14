package net.Applhau.jjkmod.world.entities.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.Applhau.jjkmod.world.entities.mob.GreatSerpentEntity;
import net.Applhau.jjkmod.world.entities.mob.RootSpikeEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class RootSpikeModel <T extends RootSpikeEntity> extends EntityModel<T> {
    private final ModelRenderer group2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer group3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer group4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer group5;
    private final ModelRenderer cube_r10;
    private final ModelRenderer group6;
    private final ModelRenderer cube_r11;
    private final ModelRenderer group7;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer group8;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer group9;
    private final ModelRenderer cube_r16;
    private final ModelRenderer group;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;

    public RootSpikeModel() {
        textureWidth = 256;
        textureHeight = 256;

        group2 = new ModelRenderer(this);
        group2.setRotationPoint(0.0F, 6.0F, -5.0F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 1.438F, -3.8504F);
        group2.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(0, 13).addBox(-20.5F, 6.5F, -19.5F, 49.0F, 25.0F, 41.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(14.5F, -1.0933F, -13.3566F);
        group2.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
        cube_r2.setTextureOffset(0, 14).addBox(-29.0F, -12.7821F, -5.8771F, 37.0F, 27.0F, 30.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, -14.9317F, -8.2167F);
        group2.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.3927F, 0.0F, 0.0F);
        cube_r3.setTextureOffset(3, 16).addBox(-9.5F, -31.2695F, -12.098F, 30.0F, 29.0F, 22.0F, 0.0F, true);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(17.5F, -7.2059F, -7.9728F);
        group2.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
        cube_r4.setTextureOffset(7, 19).addBox(-22.0F, -62.5369F, -6.6856F, 22.0F, 27.0F, 17.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(0.0F, -21.7674F, -17.891F);
        group2.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
        cube_r5.setTextureOffset(33, 3).addBox(-0.225F, -83.4488F, -0.1994F, 13.0F, 30.0F, 10.0F, 0.0F, false);
        cube_r5.setTextureOffset(33, 3).addBox(2.175F, -105.4488F, 3.2756F, 8.0F, 25.0F, 5.0F, 0.0F, false);
        cube_r5.setTextureOffset(1, 15).addBox(-2.025F, -67.4488F, -1.7244F, 17.0F, 26.0F, 13.0F, 0.0F, false);

        group3 = new ModelRenderer(this);
        group3.setRotationPoint(17.5F, -6.2059F, -3.9728F);
        group2.addChild(group3);


        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-25.7125F, 4.3359F, 5.8092F);
        group3.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.3927F, 0.0F, 0.0F);
        cube_r6.setTextureOffset(22, 11).addBox(0.0625F, -112.7988F, -0.8869F, 8.0F, 52.0F, 7.0F, 0.0F, false);
        cube_r6.setTextureOffset(22, 11).addBox(-0.9375F, -107.5488F, -1.6619F, 9.0F, 52.0F, 8.0F, 0.0F, false);
        cube_r6.setTextureOffset(22, 11).addBox(-7.9375F, -62.5538F, -7.628F, 24.0F, 52.0F, 7.0F, 0.0F, false);
        cube_r6.setTextureOffset(22, 11).addBox(-8.9375F, -57.3038F, -8.403F, 25.0F, 52.0F, 8.0F, 0.0F, false);
        cube_r6.setTextureOffset(5, 0).addBox(-15.9375F, -23.5539F, -14.5464F, 36.0F, 52.0F, 23.0F, 0.0F, false);
        cube_r6.setTextureOffset(5, 0).addBox(-16.9375F, -18.3039F, -15.3214F, 37.0F, 52.0F, 24.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(-24.6063F, 7.7859F, 5.8467F);
        group3.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, -0.3927F);
        cube_r7.setTextureOffset(17, 12).addBox(35.3222F, -95.5056F, -39.725F, 11.0F, 56.0F, 9.0F, 0.0F, false);
        cube_r7.setTextureOffset(17, 12).addBox(8.5706F, -50.2355F, -26.725F, 27.0F, 56.0F, 9.0F, 0.0F, false);
        cube_r7.setTextureOffset(0, 1).addBox(-13.206F, -16.9759F, -18.725F, 39.0F, 56.0F, 25.0F, 0.0F, false);

        group4 = new ModelRenderer(this);
        group4.setRotationPoint(17.5F, -6.2059F, -3.9728F);
        group2.addChild(group4);


        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(-24.3125F, -12.6641F, -2.1908F);
        group4.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.3927F, 0.0F, 0.0F);
        cube_r8.setTextureOffset(22, 11).addBox(0.1875F, -105.2488F, -0.6619F, 9.0F, 48.0F, 7.0F, 0.0F, false);
        cube_r8.setTextureOffset(22, 11).addBox(-7.8125F, -55.0038F, -7.403F, 25.0F, 48.0F, 7.0F, 0.0F, false);
        cube_r8.setTextureOffset(5, 0).addBox(-15.8125F, -16.0039F, -14.3214F, 37.0F, 48.0F, 23.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-23.2063F, -9.2141F, -2.1533F);
        group4.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, -0.3927F);
        cube_r9.setTextureOffset(22, 11).addBox(36.3222F, -91.5056F, -39.725F, 10.0F, 52.0F, 8.0F, 0.0F, false);
        cube_r9.setTextureOffset(22, 11).addBox(9.5706F, -46.2355F, -26.725F, 26.0F, 52.0F, 8.0F, 0.0F, false);
        cube_r9.setTextureOffset(5, 0).addBox(-12.206F, -12.9759F, -18.725F, 38.0F, 52.0F, 24.0F, 0.0F, false);

        group5 = new ModelRenderer(this);
        group5.setRotationPoint(17.5F, -6.2059F, -3.9728F);
        group2.addChild(group5);
        group5.setTextureOffset(11, 11).addBox(-19.5313F, -105.1034F, -35.3551F, 10.0F, 52.0F, 8.0F, 0.0F, false);
        group5.setTextureOffset(11, 11).addBox(-27.5313F, -56.1034F, -22.3551F, 26.0F, 52.0F, 8.0F, 0.0F, false);
        group5.setTextureOffset(-6, 0).addBox(-35.5313F, -20.1034F, -14.3551F, 38.0F, 52.0F, 24.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(-18.9125F, -5.6641F, 3.4092F);
        group5.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.3927F, 0.0F, 0.0F);
        cube_r10.setTextureOffset(11, 11).addBox(-0.0375F, -106.6488F, 0.7631F, 9.0F, 48.0F, 7.0F, 0.0F, false);
        cube_r10.setTextureOffset(11, 11).addBox(-8.0375F, -56.4038F, -5.978F, 25.0F, 48.0F, 7.0F, 0.0F, false);
        cube_r10.setTextureOffset(-6, 0).addBox(-16.0375F, -17.4039F, -12.8964F, 37.0F, 48.0F, 23.0F, 0.0F, false);

        group6 = new ModelRenderer(this);
        group6.setRotationPoint(17.5F, -6.2059F, -3.9728F);
        group2.addChild(group6);
        group6.setTextureOffset(11, 11).addBox(-17.9562F, -96.1034F, -26.3551F, 11.0F, 57.0F, 8.0F, 0.0F, false);
        group6.setTextureOffset(11, 11).addBox(-25.9562F, -47.1034F, -13.3551F, 27.0F, 57.0F, 8.0F, 0.0F, false);
        group6.setTextureOffset(-6, 0).addBox(-33.9562F, -11.1034F, -5.3551F, 39.0F, 57.0F, 24.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(-16.8625F, 8.3359F, 12.4092F);
        group6.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.3927F, 0.0F, 0.0F);
        cube_r11.setTextureOffset(11, 11).addBox(-0.4625F, -113.7738F, 2.3631F, 10.0F, 53.0F, 7.0F, 0.0F, false);
        cube_r11.setTextureOffset(11, 11).addBox(-8.4625F, -63.5288F, -4.378F, 26.0F, 53.0F, 7.0F, 0.0F, false);
        cube_r11.setTextureOffset(-6, 0).addBox(-16.4625F, -24.5289F, -11.2964F, 38.0F, 53.0F, 23.0F, 0.0F, false);

        group7 = new ModelRenderer(this);
        group7.setRotationPoint(17.5F, -6.2059F, -3.9728F);
        group2.addChild(group7);


        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(-10.5845F, 2.6898F, 5.0029F);
        group7.addChild(cube_r12);
        setRotationAngle(cube_r12, -0.3927F, 0.0F, 0.0F);
        cube_r12.setTextureOffset(29, 11).addBox(-0.6875F, -87.3838F, -73.2901F, 9.0F, 53.0F, 8.0F, 0.0F, false);
        cube_r12.setTextureOffset(29, 11).addBox(-8.6875F, -47.0886F, -42.5282F, 25.0F, 53.0F, 8.0F, 0.0F, false);
        cube_r12.setTextureOffset(12, 0).addBox(-16.6875F, -19.5692F, -21.8933F, 37.0F, 53.0F, 24.0F, 0.0F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(-12.3643F, 10.8966F, 4.7841F);
        group7.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, 0.0F, 0.3927F);
        cube_r13.setTextureOffset(16, 11).addBox(-38.1204F, -99.6163F, -39.95F, 10.0F, 57.0F, 9.0F, 0.0F, false);
        cube_r13.setTextureOffset(16, 11).addBox(-27.3688F, -54.3462F, -26.95F, 26.0F, 57.0F, 9.0F, 0.0F, false);
        cube_r13.setTextureOffset(-1, 0).addBox(-21.5922F, -21.0866F, -18.95F, 38.0F, 57.0F, 25.0F, 0.0F, false);

        group8 = new ModelRenderer(this);
        group8.setRotationPoint(17.5F, -6.2059F, -3.9728F);
        group2.addChild(group8);


        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(-10.5845F, -13.3102F, 0.0029F);
        group8.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.3927F, 0.0F, 0.0F);
        cube_r14.setTextureOffset(29, 11).addBox(-0.5625F, -103.0488F, -1.5994F, 9.0F, 48.0F, 7.0F, 0.0F, false);
        cube_r14.setTextureOffset(29, 11).addBox(-8.5625F, -52.8038F, -8.3405F, 25.0F, 48.0F, 7.0F, 0.0F, false);
        cube_r14.setTextureOffset(12, 0).addBox(-16.5625F, -13.8039F, -15.2589F, 37.0F, 48.0F, 23.0F, 0.0F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(-12.3643F, -5.1034F, -0.2159F);
        group8.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.0F, 0.3927F);
        cube_r15.setTextureOffset(21, 12).addBox(-38.1204F, -94.6163F, -39.95F, 10.0F, 52.0F, 8.0F, 0.0F, false);
        cube_r15.setTextureOffset(21, 12).addBox(-27.3688F, -49.3462F, -26.95F, 26.0F, 52.0F, 8.0F, 0.0F, false);
        cube_r15.setTextureOffset(4, 1).addBox(-21.5922F, -16.0866F, -18.95F, 38.0F, 52.0F, 24.0F, 0.0F, false);

        group9 = new ModelRenderer(this);
        group9.setRotationPoint(17.5F, -6.2059F, -3.9728F);
        group2.addChild(group9);
        group9.setTextureOffset(20, 11).addBox(-17.0335F, -111.4517F, -48.8772F, 9.0F, 48.0F, 7.0F, 0.0F, false);
        group9.setTextureOffset(20, 11).addBox(-25.0335F, -62.4517F, -35.8772F, 15.0F, 48.0F, 7.0F, 0.0F, false);
        group9.setTextureOffset(3, 0).addBox(-33.0335F, -26.4517F, -27.8772F, 18.0F, 48.0F, 23.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(-12.7403F, -4.8F, -7.509F);
        group9.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.7854F, 0.0F, 0.0F);
        cube_r16.setTextureOffset(20, 11).addBox(-4.2182F, -101.4828F, 45.7294F, 9.0F, 48.0F, 7.0F, 0.0F, false);
        cube_r16.setTextureOffset(20, 11).addBox(-5.0569F, -93.1053F, 38.0663F, 10.0F, 52.0F, 8.0F, 0.0F, false);
        cube_r16.setTextureOffset(20, 11).addBox(-12.2182F, -57.6423F, 20.2735F, 25.0F, 48.0F, 7.0F, 0.0F, false);
        cube_r16.setTextureOffset(20, 11).addBox(-13.0569F, -49.2648F, 12.6104F, 26.0F, 52.0F, 8.0F, 0.0F, false);
        cube_r16.setTextureOffset(3, 0).addBox(-20.2182F, -21.5799F, -1.5758F, 37.0F, 48.0F, 23.0F, 0.0F, false);
        cube_r16.setTextureOffset(3, 0).addBox(-21.0569F, -13.2024F, -9.2389F, 38.0F, 52.0F, 24.0F, 0.0F, false);

        group = new ModelRenderer(this);
        group.setRotationPoint(17.5F, -6.2059F, -3.9728F);
        group2.addChild(group);


        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(-12.7403F, 3.2F, -4.509F);
        group.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.3927F, 0.0F, 0.0F);
        cube_r17.setTextureOffset(20, 11).addBox(-6.7932F, -113.1755F, -1.3926F, 9.0F, 48.0F, 7.0F, 0.0F, false);
        cube_r17.setTextureOffset(20, 11).addBox(-6.7932F, -107.2755F, -1.2926F, 9.0F, 48.0F, 7.0F, 0.0F, false);
        cube_r17.setTextureOffset(20, 11).addBox(-14.7932F, -62.9305F, -8.1337F, 25.0F, 48.0F, 7.0F, 0.0F, false);
        cube_r17.setTextureOffset(20, 11).addBox(-14.7932F, -57.0305F, -8.0337F, 25.0F, 48.0F, 7.0F, 0.0F, false);
        cube_r17.setTextureOffset(3, 0).addBox(-22.7932F, -23.9306F, -15.0521F, 37.0F, 48.0F, 23.0F, 0.0F, false);
        cube_r17.setTextureOffset(3, 0).addBox(-22.7932F, -18.0306F, -14.9521F, 37.0F, 48.0F, 23.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(-12.7403F, 3.2F, -4.509F);
        group.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.7854F, 0.0F, 0.0F);
        cube_r18.setTextureOffset(20, 11).addBox(-7.8069F, -93.1053F, 38.0663F, 10.0F, 52.0F, 8.0F, 0.0F, false);
        cube_r18.setTextureOffset(20, 11).addBox(-15.8069F, -49.2648F, 12.6104F, 26.0F, 52.0F, 8.0F, 0.0F, false);
        cube_r18.setTextureOffset(3, 0).addBox(-23.8069F, -13.2024F, -9.2389F, 38.0F, 52.0F, 24.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }


    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        group2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

