package net.Applhau.jjkmod.client;

import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.events.InputEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JJKMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class Ability {

    static int Timer = 0;
    static int timerRatio = 0;
    public static int CursedEnergy = 30;

    public static int ability = 0;

    public static boolean CursedSpeechTrig = false;//done
    public static boolean TenShadowsTrig = false;//done
    public static boolean LimitlessTrig = false;
    public static boolean StrawdollTrig = false;//done
    public static boolean BloodManipulationTrig = false;
    public static boolean RatioTrig = false;//done
    public static boolean ConstructionTrig = false;//done
    public static boolean DisasterPlantsTrig = false;


    @SubscribeEvent
    public static void cursedenergy(TickEvent.ClientTickEvent event){
        //Minecraft.getInstance().player.sendMessage((ITextComponent)new StringTextComponent("Testing"), null);
        if(Timer < 100){
            Timer++;
            //Minecraft.getInstance().player.sendMessage((ITextComponent)new StringTextComponent("Testing1"), null);
            if(Timer == 100){
                Timer = 0;
                if(CursedEnergy < 50){
                    CursedEnergy += 4;
                }

                //Minecraft.getInstance().player.sendMessage((ITextComponent)new StringTextComponent("Testing2"), null);
            }

        }
        if(CursedEnergy >= 50){
            CursedEnergy = 50;
        }
        if(CursedEnergy < 0){
            CursedEnergy = 0;
        }
        if(InputEvents.ratioActivated == true){
                if(timerRatio < 60){
                    timerRatio++;
                    if(timerRatio == 60){
                        timerRatio = 0;
                        Ability.CursedEnergy -= 6;
                    }
                }
            }
        if (InputEvents.ratioActivated && Ability.CursedEnergy <= 0){
            Minecraft.getInstance().player.sendMessage((ITextComponent)new StringTextComponent("Ratio Deactivated"), null);
            InputEvents.ratioActivated = false;
        }


}}


