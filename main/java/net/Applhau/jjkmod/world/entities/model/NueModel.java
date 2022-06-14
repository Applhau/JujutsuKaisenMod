package net.Applhau.jjkmod.world.entities.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.Applhau.jjkmod.world.entities.mob.GreatSerpentEntity;
import net.Applhau.jjkmod.world.entities.mob.NueEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class NueModel <T extends NueEntity> extends EntityModel<T> {
    private final ModelRenderer bone22;
    private final ModelRenderer bone21;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer bone20;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer bone15;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer bone13;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer bone12;
    private final ModelRenderer cube_r20;
    private final ModelRenderer bone14;
    private final ModelRenderer cube_r21;
    private final ModelRenderer bone4;
    private final ModelRenderer bone3;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer bone2;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer bone7;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer bone8;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer bone9;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer bone10;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer bone11;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer bone24;
    private final ModelRenderer cube_r40;
    private final ModelRenderer bone23;
    private final ModelRenderer bone17;
    private final ModelRenderer cube_r41;
    private final ModelRenderer bone16;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer bone18;
    private final ModelRenderer cube_r46;
    private final ModelRenderer bone19;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer bone25;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;

    public NueModel() {
        textureWidth = 32;
        textureHeight = 32;

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(0.0F, 27.0F, -2.0F);


        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(-2.0F, -23.0F, 0.0F);
        bone22.addChild(bone21);
        setRotationAngle(bone21, 0.7418F, 0.0436F, 0.2618F);
        bone21.setTextureOffset(0, 0).addBox(-3.0498F, -0.5404F, -5.879F, 4.0F, 11.0F, 1.0F, 0.0F, true);
        bone21.setTextureOffset(0, 0).addBox(-8.5106F, -0.7673F, -5.879F, 4.0F, 10.0F, 1.0F, 0.0F, true);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-9.457F, -0.1397F, -1.0F);
        bone21.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, -0.0436F);
        cube_r1.setTextureOffset(0, 0).addBox(-7.0233F, -0.5856F, -4.879F, 8.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-9.5306F, 0.8042F, -1.0F);
        bone21.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -0.1309F);
        cube_r2.setTextureOffset(0, 0).addBox(-6.8114F, -0.5854F, -4.879F, 8.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-9.5306F, 0.8042F, -1.0F);
        bone21.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, -0.48F);
        cube_r3.setTextureOffset(0, 0).addBox(-5.7468F, -0.0406F, -4.879F, 7.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-8.5306F, 1.8042F, -1.0F);
        bone21.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -0.6981F);
        cube_r4.setTextureOffset(0, 0).addBox(-6.0883F, -0.5405F, -4.879F, 7.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-9.5306F, 2.8042F, -1.0F);
        bone21.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, -0.9599F);
        cube_r5.setTextureOffset(0, 0).addBox(-5.6163F, 0.5294F, -4.879F, 7.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-2.0171F, 4.2611F, -1.0F);
        bone21.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, 0.1309F);
        cube_r6.setTextureOffset(0, 0).addBox(-3.1285F, -4.6598F, -4.879F, 3.0F, 11.0F, 1.0F, 0.0F, true);

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(2.0F, -23.0F, 0.0F);
        bone22.addChild(bone20);
        setRotationAngle(bone20, 0.7418F, -0.0436F, -0.2618F);
        bone20.setTextureOffset(0, 0).addBox(-0.9502F, -0.5404F, -5.879F, 4.0F, 10.0F, 1.0F, 0.0F, false);
        bone20.setTextureOffset(0, 0).addBox(4.5106F, -0.7673F, -5.879F, 4.0F, 10.0F, 1.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(9.457F, -0.1397F, -1.0F);
        bone20.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, 0.0436F);
        cube_r7.setTextureOffset(0, 0).addBox(-0.9767F, -0.5856F, -4.879F, 8.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(9.5306F, 0.8042F, -1.0F);
        bone20.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, 0.1309F);
        cube_r8.setTextureOffset(0, 0).addBox(-1.1886F, -0.5854F, -4.879F, 8.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(9.5306F, 0.8042F, -1.0F);
        bone20.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, 0.48F);
        cube_r9.setTextureOffset(0, 0).addBox(-1.2532F, -0.0406F, -4.879F, 8.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(8.5306F, 1.8042F, -1.0F);
        bone20.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, 0.6981F);
        cube_r10.setTextureOffset(0, 0).addBox(-0.9117F, -0.5405F, -4.879F, 8.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(9.5306F, 2.8042F, -1.0F);
        bone20.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 0.0F, 0.9599F);
        cube_r11.setTextureOffset(0, 0).addBox(-1.3837F, 0.5294F, -4.879F, 7.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(2.0171F, 4.2611F, -1.0F);
        bone20.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.0F, -0.1309F);
        cube_r12.setTextureOffset(0, 0).addBox(0.1285F, -4.6598F, -4.879F, 3.0F, 10.0F, 1.0F, 0.0F, false);

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(0.0F, -13.0F, 7.0F);
        bone22.addChild(bone15);
        setRotationAngle(bone15, -0.2618F, 0.0F, 0.0F);
        bone15.setTextureOffset(0, 0).addBox(-2.0F, 0.8791F, -4.7509F, 4.0F, 4.0F, 3.0F, 0.0F, false);
        bone15.setTextureOffset(0, 0).addBox(-2.0F, 2.6346F, -0.2093F, 1.0F, 2.0F, 3.0F, 0.0F, true);
        bone15.setTextureOffset(0, 0).addBox(1.0F, 2.6346F, -0.2093F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(-3.0F, -3.9164F, -2.8175F);
        bone15.addChild(cube_r13);
        setRotationAngle(cube_r13, -0.2182F, 0.0F, 0.0F);
        cube_r13.setTextureOffset(0, 0).addBox(1.0F, 5.7838F, 1.3971F, 1.0F, 2.0F, 3.0F, 0.0F, true);
        cube_r13.setTextureOffset(0, 0).addBox(4.0F, 5.7838F, 1.3971F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(2.0F, -5.3597F, -0.6775F);
        bone15.addChild(cube_r14);
        setRotationAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        cube_r14.setTextureOffset(0, 0).addBox(-3.0F, 7.4802F, 0.6261F, 2.0F, 3.0F, 3.0F, 0.0F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(2.0F, -5.9164F, -2.8175F);
        bone15.addChild(cube_r15);
        setRotationAngle(cube_r15, -0.2618F, 0.0F, 0.0F);
        cube_r15.setTextureOffset(0, 0).addBox(-3.0F, 6.6126F, 2.1476F, 2.0F, 4.0F, 3.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(2.0F, -5.3597F, 2.3225F);
        bone15.addChild(cube_r16);
        setRotationAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        cube_r16.setTextureOffset(0, 0).addBox(-3.0F, 8.4802F, 0.6261F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(0.0F, -3.0F, -7.0F);
        bone22.addChild(bone13);


        cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(0.0F, -9.447F, 5.9702F);
        bone13.addChild(cube_r17);
        setRotationAngle(cube_r17, -0.3491F, 0.0F, 0.0F);
        cube_r17.setTextureOffset(0, 0).addBox(-3.0F, -3.6F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(4.0F, -16.0F, 2.0F);
        bone13.addChild(cube_r18);
        setRotationAngle(cube_r18, -0.829F, 0.0F, 0.0F);
        cube_r18.setTextureOffset(0, 0).addBox(-8.0F, -1.0F, -0.4863F, 8.0F, 5.0F, 6.0F, 0.0F, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setRotationPoint(3.0F, -15.0F, -1.0F);
        bone13.addChild(cube_r19);
        setRotationAngle(cube_r19, -0.9163F, 0.0F, 0.0F);
        cube_r19.setTextureOffset(0, 0).addBox(-5.0F, -3.2525F, 0.1476F, 4.0F, 4.0F, 1.0F, 0.0F, false);

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(0.0F, -22.0F, -4.0F);
        bone13.addChild(bone12);
        setRotationAngle(bone12, 0.2182F, 0.0F, 0.0F);


        cube_r20 = new ModelRenderer(this);
        cube_r20.setRotationPoint(0.0F, -1.3799F, 3.6415F);
        bone12.addChild(cube_r20);
        setRotationAngle(cube_r20, -1.0908F, 0.0F, 0.0F);
        cube_r20.setTextureOffset(0, 0).addBox(-1.75F, 3.5458F, 4.2572F, 3.0F, 3.0F, 3.0F, 0.0F, false);

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0.0F, 0.0763F, -0.6867F);
        bone12.addChild(bone14);
        setRotationAngle(bone14, -0.2618F, 0.0F, 0.0F);
        bone14.setTextureOffset(0, 24).addBox(-2.5F, 1.1928F, 1.1913F, 5.0F, 5.0F, 3.0F, 0.0F, false);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setRotationPoint(0.9072F, -2.7742F, 3.4468F);
        bone14.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.3054F, 0.0F, 0.0F);
        cube_r21.setTextureOffset(0, 0).addBox(-1.0099F, 4.9369F, -2.1904F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r21.setTextureOffset(0, 0).addBox(-1.8046F, 4.9369F, -2.1904F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0F, -1.3015F, 2.9296F);
        bone14.addChild(bone4);
        setRotationAngle(bone4, 0.0436F, 0.0F, 0.0F);


        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(2.0F, -1.5221F, 0.4658F);
        bone4.addChild(bone3);
        setRotationAngle(bone3, 0.2182F, 0.0F, 0.0F);


        cube_r22 = new ModelRenderer(this);
        cube_r22.setRotationPoint(-0.3961F, 0.4211F, 1.2116F);
        bone3.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.0F, 0.6545F, 0.0F);
        cube_r22.setTextureOffset(0, 0).addBox(0.5406F, 5.3578F, -1.0303F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setRotationPoint(-1.0F, 0.4211F, -1.1157F);
        bone3.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0F, 0.2618F, 0.0F);
        cube_r23.setTextureOffset(0, 0).addBox(0.0861F, 5.3578F, -0.7544F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(1.0F, -0.5221F, 1.9658F);
        bone4.addChild(bone2);
        setRotationAngle(bone2, 0.1309F, 0.0F, 0.0F);


        cube_r24 = new ModelRenderer(this);
        cube_r24.setRotationPoint(0.4745F, 0.0053F, -0.5732F);
        bone2.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.0F, 0.6545F, 0.0F);
        cube_r24.setTextureOffset(0, 0).addBox(0.2268F, 5.4487F, -0.6213F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setRotationPoint(0.0F, 0.0053F, -2.4176F);
        bone2.addChild(cube_r25);
        setRotationAngle(cube_r25, 0.0F, 0.2618F, 0.0F);
        cube_r25.setTextureOffset(0, 0).addBox(-0.0473F, 5.4487F, -0.7565F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 21.4779F, 7.9658F);
        bone4.addChild(bone);


        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(1.3451F, -21.0F, -7.1386F);
        bone.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.0F, 0.6545F, 0.0F);
        cube_r26.setTextureOffset(0, 0).addBox(-0.25F, 5.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(1.0F, -21.0F, -8.5F);
        bone.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.0F, 0.2618F, 0.0F);
        cube_r27.setTextureOffset(0, 0).addBox(-0.25F, 5.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, -1.3015F, 2.9296F);
        bone14.addChild(bone5);
        setRotationAngle(bone5, 0.0436F, 0.0F, 0.0F);


        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(-2.0F, -1.5221F, 0.4658F);
        bone5.addChild(bone6);
        setRotationAngle(bone6, 0.2182F, 0.0F, 0.0F);


        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(0.3961F, 0.4211F, 1.2116F);
        bone6.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.0F, -0.6545F, 0.0F);
        cube_r28.setTextureOffset(0, 0).addBox(-1.5406F, 5.3578F, -1.0303F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(1.0F, 0.4211F, -1.1157F);
        bone6.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.0F, -0.2618F, 0.0F);
        cube_r29.setTextureOffset(0, 0).addBox(-1.0861F, 5.3578F, -0.7544F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(-1.0F, -0.5221F, 1.9658F);
        bone5.addChild(bone7);
        setRotationAngle(bone7, 0.1309F, 0.0F, 0.0F);


        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(-0.4745F, 0.0053F, -0.5732F);
        bone7.addChild(cube_r30);
        setRotationAngle(cube_r30, 0.0F, -0.6545F, 0.0F);
        cube_r30.setTextureOffset(0, 0).addBox(-1.2268F, 5.4487F, -0.6213F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(0.0F, 0.0053F, -2.4176F);
        bone7.addChild(cube_r31);
        setRotationAngle(cube_r31, 0.0F, -0.2618F, 0.0F);
        cube_r31.setTextureOffset(0, 0).addBox(-0.9527F, 5.4487F, -0.7565F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, 21.4779F, 7.9658F);
        bone5.addChild(bone8);


        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(-1.3451F, -21.0F, -7.1386F);
        bone8.addChild(cube_r32);
        setRotationAngle(cube_r32, 0.0F, -0.6545F, 0.0F);
        cube_r32.setTextureOffset(0, 0).addBox(-0.75F, 5.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(-1.0F, -21.0F, -8.5F);
        bone8.addChild(cube_r33);
        setRotationAngle(cube_r33, 0.0F, -0.2618F, 0.0F);
        cube_r33.setTextureOffset(0, 0).addBox(-0.75F, 5.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(-1.0F, -2.8236F, 2.3954F);
        bone14.addChild(bone9);
        setRotationAngle(bone9, 0.1309F, 0.0873F, -1.5708F);


        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(0.1625F, -0.1245F, 2.3597F);
        bone9.addChild(cube_r34);
        setRotationAngle(cube_r34, 0.0F, 0.6545F, 0.0F);
        cube_r34.setTextureOffset(0, 0).addBox(-4.8476F, -0.5342F, -3.8549F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setRotationPoint(-0.4414F, -0.1245F, 0.0324F);
        bone9.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.0F, 0.2618F, 0.0F);
        cube_r35.setTextureOffset(0, 0).addBox(-5.9729F, -0.5342F, -1.3021F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(1.0F, -2.8236F, 2.3954F);
        bone14.addChild(bone10);
        setRotationAngle(bone10, 0.1309F, -0.0873F, 1.5708F);


        cube_r36 = new ModelRenderer(this);
        cube_r36.setRotationPoint(-0.1625F, -0.1245F, 2.3597F);
        bone10.addChild(cube_r36);
        setRotationAngle(cube_r36, 0.0F, -0.6545F, 0.0F);
        cube_r36.setTextureOffset(0, 0).addBox(3.8476F, -0.5342F, -3.8549F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setRotationPoint(0.4414F, -0.1245F, 0.0324F);
        bone10.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.0F, -0.2618F, 0.0F);
        cube_r37.setTextureOffset(0, 0).addBox(4.9729F, -0.5342F, -1.3021F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(0.0F, -2.8236F, 6.3954F);
        bone14.addChild(bone11);
        setRotationAngle(bone11, -0.0087F, -0.0873F, 1.5708F);


        cube_r38 = new ModelRenderer(this);
        cube_r38.setRotationPoint(-0.5111F, 0.0493F, -1.6213F);
        bone11.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.0F, -0.6545F, 0.0F);
        cube_r38.setTextureOffset(0, 0).addBox(3.8463F, -0.4977F, -3.8567F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setRotationPoint(0.0928F, 0.0493F, -3.9486F);
        bone11.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.0F, -0.2618F, 0.0F);
        cube_r39.setTextureOffset(0, 0).addBox(4.9723F, -0.4977F, -1.3042F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(6.1983F, -28.1063F, -14.1357F);
        bone13.addChild(bone24);


        cube_r40 = new ModelRenderer(this);
        cube_r40.setRotationPoint(-17.4F, 4.25F, 18.6F);
        bone24.addChild(cube_r40);
        setRotationAngle(cube_r40, 0.0F, -1.5708F, 0.0F);
        cube_r40.setTextureOffset(54, 59).addBox(-8.5F, 4.275F, -13.35F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        cube_r40.setTextureOffset(54, 59).addBox(-8.5F, 5.75F, -13.35F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        cube_r40.setTextureOffset(54, 59).addBox(-8.5F, 4.75F, -10.275F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r40.setTextureOffset(53, 57).addBox(-8.5F, 4.75F, -13.35F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r40.setTextureOffset(54, 59).addBox(-9.0F, 4.75F, -11.825F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r40.setTextureOffset(54, 59).addBox(-9.0F, 6.75F, -12.3F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(0.0F, 13.0F, 0.0F);
        setRotationAngle(bone23, 0.5236F, 0.0F, 0.0F);


        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(-2.025F, -3.0F, 1.0F);
        bone23.addChild(bone17);
        setRotationAngle(bone17, -0.5236F, 0.0F, 0.1309F);
        bone17.setTextureOffset(0, 0).addBox(-0.3218F, 8.9615F, -3.0222F, 1.0F, 3.0F, 2.0F, 0.0F, false);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setRotationPoint(1.0F, 3.0F, -2.0F);
        bone17.addChild(cube_r41);
        setRotationAngle(cube_r41, -0.9599F, 0.0F, 0.0F);
        cube_r41.setTextureOffset(0, 0).addBox(-1.8218F, 0.4376F, 2.8706F, 2.0F, 4.0F, 3.0F, 0.0F, false);

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(-1.0F, 5.7F, -1.525F);
        bone17.addChild(bone16);
        setRotationAngle(bone16, -0.2182F, 0.0F, 0.0F);
        bone16.setTextureOffset(28, 0).addBox(0.6782F, 5.825F, -0.2314F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r42 = new ModelRenderer(this);
        cube_r42.setRotationPoint(1.0F, 1.0F, -1.0F);
        bone16.addChild(cube_r42);
        setRotationAngle(cube_r42, 0.1309F, 0.0F, 0.0F);
        cube_r42.setTextureOffset(26, 0).addBox(-0.3218F, 5.9408F, -2.0026F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r43 = new ModelRenderer(this);
        cube_r43.setRotationPoint(1.0F, 1.0F, -1.0F);
        bone16.addChild(cube_r43);
        setRotationAngle(cube_r43, -0.3491F, 0.0F, 0.0F);
        cube_r43.setTextureOffset(28, 0).addBox(-0.3218F, 5.0398F, 3.6844F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r44 = new ModelRenderer(this);
        cube_r44.setRotationPoint(0.7132F, 1.0F, -0.0904F);
        bone16.addChild(cube_r44);
        setRotationAngle(cube_r44, 0.1309F, -0.6109F, 0.0F);
        cube_r44.setTextureOffset(26, 0).addBox(0.2832F, 5.86F, -2.6157F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r45 = new ModelRenderer(this);
        cube_r45.setRotationPoint(0.2868F, 1.0F, -0.0904F);
        bone16.addChild(cube_r45);
        setRotationAngle(cube_r45, 0.1745F, 0.6109F, 0.0F);
        cube_r45.setTextureOffset(26, 0).addBox(-0.1721F, 5.9845F, -2.105F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(1.975F, -3.0F, 1.0F);
        bone23.addChild(bone18);
        setRotationAngle(bone18, -0.5236F, 0.0F, -0.1309F);
        bone18.setTextureOffset(0, 0).addBox(-0.7032F, 8.9615F, -3.0222F, 1.0F, 3.0F, 2.0F, 0.0F, false);

        cube_r46 = new ModelRenderer(this);
        cube_r46.setRotationPoint(-1.0F, 3.0F, -2.0F);
        bone18.addChild(cube_r46);
        setRotationAngle(cube_r46, -0.8727F, 0.0F, 0.0F);
        cube_r46.setTextureOffset(0, 0).addBox(-0.1782F, 0.849F, 2.3775F, 2.0F, 4.0F, 3.0F, 0.0F, true);

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(1.0F, 5.4F, -1.2F);
        bone18.addChild(bone19);
        setRotationAngle(bone19, -0.2182F, 0.0F, 0.0F);
        bone19.setTextureOffset(58, 0).addBox(-1.6782F, 5.825F, -0.2314F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r47 = new ModelRenderer(this);
        cube_r47.setRotationPoint(-1.0F, 1.0F, -1.0F);
        bone19.addChild(cube_r47);
        setRotationAngle(cube_r47, 0.1309F, 0.0F, 0.0F);
        cube_r47.setTextureOffset(58, 0).addBox(-0.6782F, 5.9408F, -2.0026F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        cube_r48 = new ModelRenderer(this);
        cube_r48.setRotationPoint(-1.0F, 1.0F, -1.0F);
        bone19.addChild(cube_r48);
        setRotationAngle(cube_r48, -0.3491F, 0.0F, 0.0F);
        cube_r48.setTextureOffset(58, 0).addBox(-0.6782F, 5.0398F, 3.6844F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r49 = new ModelRenderer(this);
        cube_r49.setRotationPoint(-0.7132F, 1.0F, -0.0904F);
        bone19.addChild(cube_r49);
        setRotationAngle(cube_r49, 0.1309F, 0.6109F, 0.0F);
        cube_r49.setTextureOffset(58, 0).addBox(-1.2832F, 5.86F, -2.6157F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        cube_r50 = new ModelRenderer(this);
        cube_r50.setRotationPoint(-0.2868F, 1.0F, -0.0904F);
        bone19.addChild(cube_r50);
        setRotationAngle(cube_r50, 0.1745F, -0.6109F, 0.0F);
        cube_r50.setTextureOffset(58, 0).addBox(-0.8279F, 5.9845F, -2.105F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        bone25 = new ModelRenderer(this);
        bone25.setRotationPoint(6.4509F, 22.9072F, 0.5F);


        cube_r51 = new ModelRenderer(this);
        cube_r51.setRotationPoint(-4.8024F, -3.0171F, 10.3221F);
        bone25.addChild(cube_r51);
        setRotationAngle(cube_r51, 1.815F, -0.4293F, -1.49F);
        cube_r51.setTextureOffset(0, 0).addBox(-0.544F, -9.2701F, 1.8495F, 1.0F, 9.0F, 6.0F, 0.0F, false);

        cube_r52 = new ModelRenderer(this);
        cube_r52.setRotationPoint(-4.8024F, -3.0171F, 10.3221F);
        bone25.addChild(cube_r52);
        setRotationAngle(cube_r52, 1.3786F, -0.4293F, -1.49F);
        cube_r52.setTextureOffset(0, 0).addBox(-0.544F, -10.3925F, -3.2973F, 1.0F, 9.0F, 7.0F, 0.0F, false);

        cube_r53 = new ModelRenderer(this);
        cube_r53.setRotationPoint(-4.8024F, -3.0171F, 10.3221F);
        bone25.addChild(cube_r53);
        setRotationAngle(cube_r53, 1.6841F, -0.4293F, -1.49F);
        cube_r53.setTextureOffset(0, 0).addBox(0.456F, -9.165F, -0.529F, 1.0F, 9.0F, 5.0F, 0.0F, false);

        cube_r54 = new ModelRenderer(this);
        cube_r54.setRotationPoint(-4.8024F, -3.0171F, 10.3221F);
        bone25.addChild(cube_r54);
        setRotationAngle(cube_r54, 1.1605F, -0.4293F, -1.49F);
        cube_r54.setTextureOffset(0, 0).addBox(0.456F, -8.1284F, -4.3397F, 1.0F, 9.0F, 5.0F, 0.0F, false);

        cube_r55 = new ModelRenderer(this);
        cube_r55.setRotationPoint(-4.8024F, -3.0171F, 10.3221F);
        bone25.addChild(cube_r55);
        setRotationAngle(cube_r55, 0.9423F, -0.4293F, -1.49F);
        cube_r55.setTextureOffset(0, 0).addBox(-0.544F, -8.7509F, -7.1074F, 1.0F, 9.0F, 5.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        bone22.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        bone23.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        bone25.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

