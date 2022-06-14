package net.Applhau.jjkmod.events;

import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.item.Item.ModSpawnEggItem;
import net.Applhau.jjkmod.world.entities.ModEntityType;
import net.Applhau.jjkmod.world.entities.mob.DivineDogWhiteEntity;
import net.Applhau.jjkmod.world.entities.mob.GreatSerpentEntity;
import net.Applhau.jjkmod.world.entities.mob.NueEntity;
import net.Applhau.jjkmod.world.entities.mob.RootSpikeEntity;
import net.Applhau.jjkmod.world.entities.projectile.RootBallEntity;
import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JJKMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityType.DIVINEDOGWHITE.get(), DivineDogWhiteEntity.setCustomAttributes().create());
        event.put(ModEntityType.DIVINEDOGBLACK.get(), DivineDogWhiteEntity.setCustomAttributes().create());
        event.put(ModEntityType.DIVINEDOGTOTALITY.get(), DivineDogWhiteEntity.setCustomAttributes().create());
        event.put(ModEntityType.GREATSERPENT.get(), GreatSerpentEntity.setCustomAttributes().create());
        event.put(ModEntityType.NUE.get(), NueEntity.setCustomAttributes().create());
        event.put(ModEntityType.ROOTSPIKE.get(), RootSpikeEntity.setCustomAttributes().create());

    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}
