package net.Applhau.jjkmod.events;

import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.client.Ability;
import net.Applhau.jjkmod.client.abilities.CursedSpeech.CursedSpeechBlowAway;
import net.Applhau.jjkmod.client.abilities.CursedSpeech.CursedSpeechDie;
import net.Applhau.jjkmod.client.abilities.CursedSpeech.CursedSpeechExplosion;
import net.Applhau.jjkmod.client.abilities.disasterplants.Bloom;
import net.Applhau.jjkmod.client.abilities.disasterplants.RootSpike;
import net.Applhau.jjkmod.client.abilities.ratio.Collapse;
import net.Applhau.jjkmod.client.abilities.strawdoll.StrawDollChoose;
import net.Applhau.jjkmod.client.abilities.strawdoll.StrawDollHaipinChoose;
import net.Applhau.jjkmod.client.abilities.strawdoll.StrawDollHairpin;
import net.Applhau.jjkmod.client.abilities.strawdoll.StrawDollResonance;
import net.Applhau.jjkmod.client.abilities.tenshadows.*;
import net.Applhau.jjkmod.client.keybinds.KeybindsInit;
import net.Applhau.jjkmod.item.JJKItems;
import net.Applhau.jjkmod.network.Network;
import net.Applhau.jjkmod.network.message.*;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;


@EventBusSubscriber(modid = JJKMod.MOD_ID, bus = EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class InputEvents {


    static int Timer = 0;
    static boolean onShield = false;
    public static boolean ratioActivated = false;
    public static boolean resonanceChoose = false;
    public static boolean hairpinChoose = false;

    public static boolean dogRisen = false;
    public static boolean gserpentRisen = false;
    public static boolean nueRisen = false;
    public static boolean dogtRisen = false;

    private static final java.util.UUID UUID = null;

    @SubscribeEvent
    public static void onKeyPressed(InputEvent.KeyInputEvent event) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.world == null) return;
        onInput(mc, event.getKey(), event.getAction());
    }

    @SubscribeEvent
    public static void onKeyReleased(InputEvent.KeyInputEvent event){
        Minecraft mc = Minecraft.getInstance();
        if (mc.world == null) return;
        onInput(mc, event.getKey(), event.getAction());
    }

    @SubscribeEvent
    public static void onMouseClick(InputEvent.MouseInputEvent event) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.world == null) return;
        onInput(mc, event.getButton(), event.getAction());
    }

    private static void onInput(Minecraft mc, int key, int action) {
        if (mc.currentScreen == null && KeybindsInit.cursedEnergySpeed.isKeyDown()) {
            if (Ability.CursedEnergy > 0){
                Network.Channel.sendToServer(new AddSpeed(key));
                if(Timer <= 60){
                    Timer += 1;
                    if(Timer >= 60 && Ability.CursedEnergy >= 0){
                        Ability.CursedEnergy -= 4;
                        Timer = 0;
                    }
                }
            }else{
                Network.Channel.sendToServer(new SpeedToNormal(key));
            }
        }
            else{
            Network.Channel.sendToServer(new SpeedToNormal(key));
        }
        if (mc.currentScreen == null && KeybindsInit.cursedEnergyStrength.isKeyDown()) {
            if (Ability.CursedEnergy > 0){
                Network.Channel.sendToServer(new AddStrength(key));
                if(Timer <= 40){
                    Timer += 1;
                    if(Timer >= 40 && Ability.CursedEnergy >= 0){
                        Ability.CursedEnergy -= 7;
                        Timer = 0;
                    }
                }
            }else{
                Network.Channel.sendToServer(new StrengthToNormal(key));
            }
        }
        if (mc.currentScreen == null && KeybindsInit.cursedEnergyShield.isKeyDown()) {
            if (Ability.CursedEnergy > 5) {
                onShield = true;
            } else {
                onShield = false;
            }

        }

        if (mc.currentScreen == null && KeybindsInit.nextAbility.isPressed()) {
            if(Ability.CursedSpeechTrig == true && Ability.ability < 3){
                Ability.ability += 1;
            }
            if(Ability.RatioTrig == true && Ability.ability < 1){
                Ability.ability += 1;
            }
            if(Ability.ConstructionTrig == true && Ability.ability < 1){
                Ability.ability += 1;
            }
            if(Ability.StrawdollTrig == true && Ability.ability < 1){
                Ability.ability += 1;
            }
            if(Ability.TenShadowsTrig == true && Ability.ability < 3){
                Ability.ability += 1;
            }
            if(Ability.DisasterPlantsTrig == true && Ability.ability < 3){
                Ability.ability += 1;
            }

        }

        if (mc.currentScreen == null && KeybindsInit.previousAbility.isPressed()) {
            if(Ability.ability > 0){
                Ability.ability -= 1;
            }
        }

        if (mc.currentScreen == null && KeybindsInit.activateAbility.isPressed()) {
            if(Ability.CursedSpeechTrig == true){
                if(Ability.ability == 0 && Ability.CursedEnergy >= 12){
                    Network.Channel.sendToServer(new CursedSpeechExplosion(key));
                    //CursedSpeech.explosion();
                    Ability.CursedEnergy -= 12;
                }
                if (Ability.ability == 1 && Ability.CursedEnergy >= 7){
                    Network.Channel.sendToServer(new CursedSpeechBlowAway(key));
                    Ability.CursedEnergy -= 7;
                }
                if (Ability.ability == 2 && Ability.CursedEnergy >= 20){
                    Network.Channel.sendToServer(new CursedSpeechDie(key));
                    Ability.CursedEnergy -= 20;
                }
            }

            if(Ability.RatioTrig == true){
                if(Ability.ability == 0 && !ratioActivated){
                    ratioActivated = true;
                    Minecraft.getInstance().player.sendMessage((ITextComponent)new StringTextComponent("Ratio Activated"), null);
                }else if(ratioActivated){
                    Minecraft.getInstance().player.sendMessage((ITextComponent)new StringTextComponent("Ratio Deactivated"), null);
                    ratioActivated = false;
                }

                if(Ability.ability == 1){
                    Minecraft.getInstance().player.sendMessage((ITextComponent)new StringTextComponent("Collapse"), null);
                    Network.Channel.sendToServer(new Collapse(key));
                    Ability.CursedEnergy -= 15;
                }
            }

            if(Ability.ConstructionTrig == true){
                if(Ability.ability == 0){
                    Minecraft.getInstance().player.inventory.addItemStackToInventory(new ItemStack(JJKItems.BULLET.get(),1));
                    Minecraft.getInstance().player.addPotionEffect(new EffectInstance(Effects.NAUSEA, 500, 2));
                    Ability.CursedEnergy -= 30;
                }
                if(Ability.ability == 1){
                    Minecraft.getInstance().player.inventory.addItemStackToInventory(new ItemStack(JJKItems.MIWAKATANA.get(),1));
                    Minecraft.getInstance().player.addPotionEffect(new EffectInstance(Effects.NAUSEA, 500, 2));
                    Minecraft.getInstance().player.addPotionEffect(new EffectInstance(Effects.HUNGER, 500, 2));
                    Minecraft.getInstance().player.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 500, 2));
                    Ability.CursedEnergy -= 50;
                }
            }

            if(Ability.StrawdollTrig == true){
                if(Ability.ability == 0){
                    if(resonanceChoose == false){
                        Network.Channel.sendToServer(new StrawDollChoose(key));
                        resonanceChoose = true;
                    }else if(resonanceChoose == true){
                        if(Minecraft.getInstance().player.getHeldItemMainhand().getItem() == JJKItems.STRAWDOLL.get()){
                            Network.Channel.sendToServer(new StrawDollResonance(key));
                            resonanceChoose = false;
                            Ability.CursedEnergy -= 7;
                        }
                    }
                }
                if(Ability.ability == 1){
                    if(hairpinChoose == false){
                        Network.Channel.sendToServer(new StrawDollHaipinChoose(key));
                        hairpinChoose = true;
                    }else if(hairpinChoose == true){
                        if(Minecraft.getInstance().player.getHeldItemMainhand().getItem() == JJKItems.HAMMER.get()){
                            Network.Channel.sendToServer(new StrawDollHairpin(key));
                            hairpinChoose = false;
                            Ability.CursedEnergy -= 14;
                        }
                    }
                }
            }
            if(Ability.TenShadowsTrig == true){
                if(Ability.ability == 0 && dogRisen == false){
                    Network.Channel.sendToServer(new DivineDogs(key));
                    Minecraft.getInstance().player.sendMessage((ITextComponent)new StringTextComponent("Divine Dogs"), null);
                    Ability.CursedEnergy -= 10;
                    dogRisen = true;
                }else if(dogRisen == true && Ability.ability == 0){
                    Network.Channel.sendToServer(new DivineDogsDie(key));
                    dogRisen = false;
                }
                if(Ability.ability == 1 && nueRisen == false){
                    Network.Channel.sendToServer(new Nue(key));
                    Minecraft.getInstance().player.sendMessage((ITextComponent)new StringTextComponent("Nue"), null);
                    Ability.CursedEnergy -= 15;
                    nueRisen = true;
                }else if(nueRisen == true && Ability.ability == 1){
                    Network.Channel.sendToServer(new NueDie(key));
                    nueRisen = false;
                }
                if(Ability.ability == 2 && gserpentRisen == false){
                    Network.Channel.sendToServer(new GreatSerpent(key));
                    Minecraft.getInstance().player.sendMessage((ITextComponent)new StringTextComponent("Great Serpent"), null);
                    Ability.CursedEnergy -= 20;
                    gserpentRisen = true;
                }else if(gserpentRisen == true && Ability.ability == 2){
                    Network.Channel.sendToServer(new GreatSerpentDie(key));
                    gserpentRisen = false;
                }
                if(Ability.ability == 3 && dogtRisen == false){
                    Network.Channel.sendToServer(new DivineDogTotality(key));
                    Minecraft.getInstance().player.sendMessage((ITextComponent)new StringTextComponent("Divine Dogs: Totality"), null);
                    Ability.CursedEnergy -= 25;
                    dogtRisen = true;
                }else if(dogtRisen == true && Ability.ability == 3){
                    Network.Channel.sendToServer(new DivineDogTotalityDie(key));
                    dogtRisen = false;
                }

            }
            if(Ability.DisasterPlantsTrig == true){
                if(Ability.ability == 0){
                    Network.Channel.sendToServer(new Bloom(key));
                }
                if(Ability.ability == 3){
                    Network.Channel.sendToServer(new RootSpike(key));
                }
            }
        }

    }

    @SubscribeEvent
    public static void onEntityAttack(LivingHurtEvent event){
        if(onShield){
            event.setAmount(0);
            Ability.CursedEnergy -= 12;
        }


    }


}
