package net.Applhau.jjkmod.world.entities.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.Applhau.jjkmod.world.entities.mob.DivineDogWhiteEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DivineDogWhiteModel<T extends DivineDogWhiteEntity> extends EntityModel<T> {
    private final ModelRenderer bone;
    private final ModelRenderer bone7;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer bone4;
    private final ModelRenderer cube_r6;
    private final ModelRenderer bone2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer bone3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer bone8;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer bone6;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer bone10;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer bone5;
    private final ModelRenderer cube_r22;
    private final ModelRenderer bone9;
    private final ModelRenderer cube_r23;

    public DivineDogWhiteModel() {
        textureWidth = 64;
        textureHeight = 64;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 17.0F, 0.0F);
        setRotationAngle(bone, 0.0F, -1.5708F, 0.0F);


        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(0.0F, -7.0F, -6.0F);
        bone.addChild(bone7);
        bone7.setTextureOffset(0, 0).addBox(-5.4F, -12.45F, 1.0F, 5.0F, 2.0F, 12.0F, 0.0F, false);
        bone7.setTextureOffset(0, 0).addBox(-10.0F, -11.0F, 0.0F, 14.0F, 10.0F, 14.0F, 0.0F, false);
        bone7.setTextureOffset(0, 0).addBox(-10.0F, -2.0F, 0.5F, 10.0F, 2.0F, 13.0F, -0.1F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-12.0F, -5.0F, 4.0F);
        bone7.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7418F);
        cube_r1.setTextureOffset(0, 0).addBox(-1.4F, -1.0F, -2.0F, 9.0F, 6.0F, 10.0F, 0.0F, false);
        cube_r1.setTextureOffset(0, 0).addBox(-1.0F, -6.0F, -1.0F, 8.0F, 11.0F, 8.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-12.0F, -5.0F, 4.0F);
        bone7.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -1.2872F);
        cube_r2.setTextureOffset(0, 0).addBox(-0.025F, -2.675F, -2.0F, 8.0F, 8.0F, 10.0F, 0.0F, false);
        cube_r2.setTextureOffset(0, 0).addBox(-0.025F, -0.75F, -3.0F, 8.0F, 9.0F, 12.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(3.0F, -9.0F, 1.0F);
        bone7.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3491F);
        cube_r3.setTextureOffset(0, 0).addBox(-4.6F, -2.0F, 0.0F, 5.0F, 2.0F, 12.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-9.0F, -9.0F, 1.0F);
        bone7.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3491F);
        cube_r4.setTextureOffset(0, 0).addBox(-0.4F, -2.0F, 0.0F, 5.0F, 2.0F, 12.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-1.0F, 0.0F, 1.0F);
        bone7.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, -0.2182F);
        cube_r5.setTextureOffset(0, 0).addBox(0.0F, -2.0F, 0.0F, 4.0F, 2.0F, 12.0F, -0.2F, false);

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(-3.0F, -3.0F, -2.0F);
        bone7.addChild(bone4);
        bone4.setTextureOffset(0, 0).addBox(-19.0F, -7.5F, 6.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);
        bone4.setTextureOffset(0, 0).addBox(-18.9F, -5.55F, 6.0F, 4.0F, 2.0F, 6.0F, -0.1F, false);
        bone4.setTextureOffset(34, 48).addBox(-15.0F, -11.0F, 5.0F, 7.0F, 8.0F, 8.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-6.0F, -1.0F, 6.0F);
        bone4.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, 0.3927F);
        cube_r6.setTextureOffset(0, 0).addBox(-5.0F, -6.0F, 0.0F, 5.0F, 6.0F, 6.0F, 0.0F, false);

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-13.0F, -11.0F, 6.0F);
        bone4.addChild(bone2);
        setRotationAngle(bone2, 0.2618F, 0.0873F, 0.0436F);


        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(3.0F, 0.0F, -1.0F);
        bone2.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, -0.5236F);
        cube_r7.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(0.0F, 0.0F, -1.0F);
        bone2.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3927F);
        cube_r8.setTextureOffset(0, 0).addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(-13.0F, -11.0F, 12.0F);
        bone4.addChild(bone3);
        setRotationAngle(bone3, -0.2618F, -0.0873F, 0.0436F);


        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(3.0F, 0.0F, 1.0F);
        bone3.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, -0.5236F);
        cube_r9.setTextureOffset(1, 1).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(0.0F, 0.0F, 1.0F);
        bone3.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, 0.3927F);
        cube_r10.setTextureOffset(1, 1).addBox(0.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(16.0F, -10.0F, -4.0F);
        bone.addChild(bone8);
        bone8.setTextureOffset(0, 10).addBox(-12.0F, -8.0F, 0.0F, 10.0F, 8.0F, 10.0F, 0.0F, false);
        bone8.setTextureOffset(0, 3).addBox(0.0F, -4.15F, 3.5F, 4.0F, 3.0F, 3.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(17.0F, -1.15F, 3.0F);
        bone8.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 0.0F, 1.2654F);
        cube_r11.setTextureOffset(0, 3).addBox(-0.275F, 7.95F, 0.5F, 6.0F, 3.0F, 3.0F, 1.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(10.0F, -1.15F, 3.0F);
        bone8.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.0F, 0.6545F);
        cube_r12.setTextureOffset(0, 3).addBox(-6.0F, 1.6F, 0.5F, 6.0F, 3.0F, 3.0F, 0.5F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(19.0F, -1.15F, 3.0F);
        bone8.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, 0.0F, 1.1345F);
        cube_r13.setTextureOffset(0, 3).addBox(5.025F, 11.25F, 0.5F, 3.0F, 2.0F, 3.0F, 0.1F, false);
        cube_r13.setTextureOffset(0, 3).addBox(4.2F, 10.25F, 0.5F, 1.0F, 3.0F, 3.0F, 0.1F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone8.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0F, 0.0F, 0.3927F);
        cube_r14.setTextureOffset(0, 10).addBox(-5.7F, -6.75F, 0.0F, 8.0F, 6.0F, 10.0F, 0.0F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(-12.0F, 1.0F, 1.0F);
        bone8.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.0F, -0.3491F);
        cube_r15.setTextureOffset(0, 8).addBox(0.0F, -2.0F, 0.0F, 10.0F, 2.0F, 8.0F, 0.0F, false);

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, 8.0F, 0.0F);
        bone.addChild(bone6);
        bone6.setTextureOffset(0, 3).addBox(10.0F, -21.0F, -5.0F, 7.0F, 8.0F, 3.0F, 0.0F, false);
        bone6.setTextureOffset(0, 3).addBox(15.0806F, -3.895F, -5.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(13.8107F, -11.3757F, -5.0F);
        bone6.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0F, 0.0F, 0.2618F);
        cube_r16.setTextureOffset(0, 3).addBox(0.0F, -1.0F, 0.0F, 6.0F, 4.0F, 3.0F, 0.0F, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(17.0F, -9.0F, -5.0F);
        bone6.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, 0.0F, -0.1309F);
        cube_r17.setTextureOffset(0, 3).addBox(-4.0F, -7.0F, 0.0F, 4.0F, 7.0F, 3.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(21.0806F, -3.895F, -5.0F);
        bone6.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, 0.0F, -0.1745F);
        cube_r18.setTextureOffset(0, 3).addBox(-4.0F, -7.0F, 0.0F, 4.0F, 7.0F, 3.0F, 0.0F, false);

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(0.0F, 8.0F, 2.0F);
        bone.addChild(bone10);
        bone10.setTextureOffset(3, 6).addBox(10.0F, -21.0F, 2.0F, 7.0F, 8.0F, 3.0F, 0.0F, false);
        bone10.setTextureOffset(3, 6).addBox(15.0806F, -3.895F, 2.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(13.8107F, -11.3757F, 5.0F);
        bone10.addChild(cube_r19);
        setRotationAngle(cube_r19, 0.0F, 0.0F, 0.2618F);
        cube_r19.setTextureOffset(3, 6).addBox(0.0F, -1.0F, -3.0F, 6.0F, 4.0F, 3.0F, 0.0F, false);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(17.0F, -9.0F, 5.0F);
        bone10.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.0F, 0.0F, -0.1309F);
        cube_r20.setTextureOffset(3, 6).addBox(-4.0F, -7.0F, -3.0F, 4.0F, 7.0F, 3.0F, 0.0F, false);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(21.0806F, -3.895F, 5.0F);
        bone10.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.0F, 0.0F, -0.1745F);
        cube_r21.setTextureOffset(3, 6).addBox(-4.0F, -7.0F, -3.0F, 4.0F, 7.0F, 3.0F, 0.0F, false);

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, 10.0F, 0.0F);
        bone.addChild(bone5);
        bone5.setTextureOffset(0, 4).addBox(-8.0F, -6.0F, -8.0F, 5.0F, 3.0F, 4.0F, 0.0F, false);
        bone5.setTextureOffset(0, 4).addBox(-5.0F, -17.0F, -8.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
        bone5.setTextureOffset(0, 4).addBox(-7.0F, -23.0F, -8.0F, 6.0F, 6.0F, 4.0F, 0.1F, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(-1.0F, -10.0F, -8.0F);
        bone5.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.0F, 0.0F, 0.3054F);
        cube_r22.setTextureOffset(0, 4).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(0.0F, 10.0F, 2.0F);
        bone.addChild(bone9);
        bone9.setTextureOffset(4, 8).addBox(-8.0F, -6.0F, 4.0F, 5.0F, 3.0F, 4.0F, 0.0F, false);
        bone9.setTextureOffset(4, 8).addBox(-5.0F, -17.0F, 4.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
        bone9.setTextureOffset(4, 8).addBox(-7.0F, -23.0F, 4.0F, 6.0F, 6.0F, 4.0F, 0.1F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(-1.0F, -10.0F, 8.0F);
        bone9.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0F, 0.0F, 0.3054F);
        cube_r23.setTextureOffset(4, 8).addBox(-4.0F, 0.0F, -4.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
    }



    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

