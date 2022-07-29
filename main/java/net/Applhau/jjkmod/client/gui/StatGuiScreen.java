package net.Applhau.jjkmod.client.gui;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;

import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.client.Ability;
import net.Applhau.jjkmod.network.Network;
import net.Applhau.jjkmod.network.message.ClientUpdateHealth;
import net.Applhau.jjkmod.network.message.IncreaseHealth;
import net.Applhau.jjkmod.network.message.SpeedToNormal;
import net.Applhau.jjkmod.util.data.JJKClientVariables;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.play.client.CClientStatusPacket;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.fml.network.PacketDistributor;

public class StatGuiScreen extends Screen {

    public static PlayerEntity player = ClientUpdateHealth.player;
    private static final int BUTTON_WIDTH = 8;

    private static final int BUTTON_HEIGHT = 8;

    private static final ResourceLocation STAT_GUI = new ResourceLocation(JJKMod.MOD_ID,
            "textures/overlay/jjkui3.png");
    private static final ResourceLocation EXP_BAR = new ResourceLocation(JJKMod.MOD_ID,
            "textures/overlay/expbarfull.png");
    public static int str;
    public static int spd;
    public static int health;
    public static int stm;
    public static int ce;
    public static int rce;


    public StatGuiScreen(ITextComponent titleIn) {
        super(titleIn);
    }


    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        this.minecraft.textureManager.bindTexture(STAT_GUI);
        this.blit(matrixStack, this.width + -380, this.height + -300, 0, 0, 131, 217, 131, 217);
        this.minecraft.textureManager.bindTexture(EXP_BAR);
        this.blit(matrixStack, this.width + -369, this.height + -243, 0, 0, Ability.expGUI, 7, 214, 13);
        this.addButton(new Button(
                this.width - 370, this.height - 225, BUTTON_WIDTH, BUTTON_HEIGHT, new TranslationTextComponent("+"),
                e -> {
                    if (true && Ability.strStat <= 99 && Ability.statPoint > 0) {
                        // Action performed when the button is pressed
                        Ability.strStat += 1;
                        str = Ability.strStat;
                        Ability.statPoint -= 1;
                    }
                }));
        this.addButton(new Button(
                this.width - 370, this.height - 207, BUTTON_WIDTH, BUTTON_HEIGHT, new TranslationTextComponent("+"),
                e -> {
                    if (true && Ability.spdStat <= 99 && Ability.statPoint > 0) {
                        Ability.spdStat += 1;
                        spd = Ability.spdStat;
                        Ability.statPoint -= 1;
                    }
                }));
        this.addButton(new Button(
                this.width - 370, this.height - 187, BUTTON_WIDTH, BUTTON_HEIGHT, new TranslationTextComponent("+"),
                e -> {
                    if (true && Ability.stmStat <= 99 && Ability.statPoint > 0) {
                        // Action performed when the button is pressed
                        Ability.stmStat += 1;
                        stm = Ability.stmStat;
                        Ability.statPoint -= 1;
                    }
                }));
        this.addButton(new Button(
                this.width - 370, this.height - 166, BUTTON_WIDTH, BUTTON_HEIGHT, new TranslationTextComponent("+"),
                e -> {
                    if (true && Ability.healthStat <= 99 && Ability.statPoint > 0) {
                        // Action performed when the button is pressed
                        Network.Channel.sendToServer(new IncreaseHealth(31));
                        Ability.statPoint -= 1;
                    }
                }));
        this.addButton(new Button(
                this.width - 370, this.height - 145, BUTTON_WIDTH, BUTTON_HEIGHT, new TranslationTextComponent("+"),
                e -> {
                    if (true && Ability.ceStat <= 99 && Ability.statPoint > 0) {
                        // Action performed when the button is pressed
                        Ability.ceStat += 1;
                        ce = Ability.ceStat;
                        Ability.statPoint -= 1;
                    }
                }));
        this.addButton(new Button(
                this.width - 370, this.height - 125, BUTTON_WIDTH, BUTTON_HEIGHT, new TranslationTextComponent("+"),
                e -> {
                    if (true && Ability.rceStat <= 99 && Ability.statPoint > 0) {
                        // Action performed when the button is pressed
                        Ability.rceStat += 1;
                        rce = Ability.rceStat;
                        Ability.statPoint -= 1;
                    }
                }));
        this.font.drawString(matrixStack, String.valueOf(Ability.strStat), this.width - 270, this.height - 225, -16777216);
        this.font.drawString(matrixStack, String.valueOf(Ability.spdStat), this.width - 270, this.height - 207, -16777216);
        this.font.drawString(matrixStack, String.valueOf(Ability.stmStat), this.width - 270, this.height - 187, -16777216);
        this.font.drawString(matrixStack, String.valueOf(health), this.width - 270, this.height - 166, -16777216);
        this.font.drawString(matrixStack, String.valueOf(Ability.ceStat), this.width - 270, this.height - 145, -16777216);
        this.font.drawString(matrixStack, String.valueOf(Ability.rceStat), this.width - 270, this.height - 125, -16777216);
        this.font.drawString(matrixStack, String.valueOf(Ability.statPoint), this.width - 270, this.height - 104, -16777216);
        if(Ability.rank == 1){
            this.font.drawString(matrixStack, "Grade 4", this.width - 335, this.height - 268, -16777216);

        }else if(Ability.rank == 2){
            this.font.drawString(matrixStack, "Grade 3", this.width - 335, this.height - 268, -16777216);

        }else if(Ability.rank == 3){
            this.font.drawString(matrixStack, "Semi-Grade 2", this.width - 335, this.height - 268, -16777216);

        }else if(Ability.rank == 4){
            this.font.drawString(matrixStack, "Grade 2", this.width - 335, this.height - 268, -16777216);

        }else if(Ability.rank == 5){
            this.font.drawString(matrixStack, "Semi-Grade 1", this.width - 335, this.height - 268, -16777216);

        }else if(Ability.rank == 6){
            this.font.drawString(matrixStack, "Grade 1", this.width - 335, this.height - 268, -16777216);

        }else if(Ability.rank == 7){
            this.font.drawString(matrixStack, "Special Grade 1", this.width - 335, this.height - 268, -16777216);

        }else if(Ability.rank == 8){
            this.font.drawString(matrixStack, "Special Grade", this.width - 335, this.height - 268, -16777216);

        }
        super.render(matrixStack, mouseX, mouseY, partialTicks);
    }

    @Override
    public void renderBackground(MatrixStack ms, int vOffset) {
        RenderSystem.color4f(1, 1, 1, 1);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
        super.renderBackground(ms, vOffset);
    }

    @Override
    public void init(Minecraft minecraft, int width, int height) {

        super.init(minecraft, width, height);

    }
}

