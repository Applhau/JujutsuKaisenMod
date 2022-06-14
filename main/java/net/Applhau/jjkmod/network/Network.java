package net.Applhau.jjkmod.network;

import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.client.abilities.CursedSpeech.CursedSpeechBlowAway;
import net.Applhau.jjkmod.client.abilities.CursedSpeech.CursedSpeechDie;
import net.Applhau.jjkmod.client.abilities.CursedSpeech.CursedSpeechExplosion;
import net.Applhau.jjkmod.client.abilities.disasterplants.Bloom;
import net.Applhau.jjkmod.client.abilities.disasterplants.RootSpike;
import net.Applhau.jjkmod.client.abilities.ratio.Collapse;
import net.Applhau.jjkmod.client.abilities.ratio.Ratio;
import net.Applhau.jjkmod.client.abilities.strawdoll.StrawDollChoose;
import net.Applhau.jjkmod.client.abilities.strawdoll.StrawDollHaipinChoose;
import net.Applhau.jjkmod.client.abilities.strawdoll.StrawDollHairpin;
import net.Applhau.jjkmod.client.abilities.strawdoll.StrawDollResonance;
import net.Applhau.jjkmod.client.abilities.tenshadows.*;
import net.Applhau.jjkmod.network.message.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class Network {
    public static final String NETWORK_VERSION = "0.1.0";

    public static final SimpleChannel Channel = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(JJKMod.MOD_ID, "network"), () -> NETWORK_VERSION,
            version -> version.equals(NETWORK_VERSION), version -> version.equals(NETWORK_VERSION));

    public static void init(){
        Channel.registerMessage(0, AddSpeed.class, AddSpeed::encode, AddSpeed::decode, AddSpeed::handle);
        Channel.registerMessage(1, SpeedToNormal.class, SpeedToNormal::encode, SpeedToNormal::decode, SpeedToNormal::handle);
        Channel.registerMessage(2, AddStrength.class, AddStrength::encode, AddStrength::decode, AddStrength::handle);
        Channel.registerMessage(3, StrengthToNormal.class, StrengthToNormal::encode, StrengthToNormal::decode, StrengthToNormal::handle);
        Channel.registerMessage(4, CursedSpeechExplosion.class, CursedSpeechExplosion::encode, CursedSpeechExplosion::decode, CursedSpeechExplosion::handle);
        Channel.registerMessage(5, CursedSpeechBlowAway.class, CursedSpeechBlowAway::encode, CursedSpeechBlowAway::decode, CursedSpeechBlowAway::handle);
        Channel.registerMessage(6, CursedSpeechDie.class, CursedSpeechDie::encode, CursedSpeechDie::decode, CursedSpeechDie::handle);
        Channel.registerMessage(7, Collapse.class, Collapse::encode, Collapse::decode, Collapse::handle);
        Channel.registerMessage(8, StrawDollChoose.class, StrawDollChoose::encode, StrawDollChoose::decode, StrawDollChoose::handle);
        Channel.registerMessage(9, StrawDollResonance.class, StrawDollResonance::encode, StrawDollResonance::decode, StrawDollResonance::handle);
        Channel.registerMessage(10, StrawDollHaipinChoose.class, StrawDollHaipinChoose::encode, StrawDollHaipinChoose::decode, StrawDollHaipinChoose::handle);
        Channel.registerMessage(11, StrawDollHairpin.class, StrawDollHairpin::encode, StrawDollHairpin::decode, StrawDollHairpin::handle);
        Channel.registerMessage(12, DivineDogs.class, DivineDogs::encode, DivineDogs::decode, DivineDogs::handle);
        Channel.registerMessage(13, DivineDogsDie.class, DivineDogsDie::encode, DivineDogsDie::decode, DivineDogsDie::handle);
        Channel.registerMessage(14, Nue.class, Nue::encode, Nue::decode, Nue::handle);
        Channel.registerMessage(15, NueDie.class, NueDie::encode, NueDie::decode, NueDie::handle);
        Channel.registerMessage(16, GreatSerpent.class, GreatSerpent::encode, GreatSerpent::decode, GreatSerpent::handle);
        Channel.registerMessage(17, GreatSerpentDie.class, GreatSerpentDie::encode, GreatSerpentDie::decode, GreatSerpentDie::handle);
        Channel.registerMessage(18, DivineDogTotality.class, DivineDogTotality::encode, DivineDogTotality::decode, DivineDogTotality::handle);
        Channel.registerMessage(19, DivineDogTotalityDie.class, DivineDogTotalityDie::encode, DivineDogTotalityDie::decode, DivineDogTotalityDie::handle);
        Channel.registerMessage(20, RootSpike.class, RootSpike::encode, RootSpike::decode, RootSpike::handle);
        Channel.registerMessage(21, Bloom.class, Bloom::encode, Bloom::decode, Bloom::handle);

    }



}
