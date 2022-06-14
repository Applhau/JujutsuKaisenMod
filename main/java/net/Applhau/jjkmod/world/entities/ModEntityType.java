package net.Applhau.jjkmod.world.entities;

import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.world.entities.mob.*;
import net.Applhau.jjkmod.world.entities.projectile.Bullet;
import net.Applhau.jjkmod.world.entities.projectile.RootBallEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityType {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, JJKMod.MOD_ID);

    //public static final EntityType<ArrowEntity> ARROW = register("arrow", EntityType.Builder.<ArrowEntity>create(ArrowEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).trackingRange(4).updateInterval(20));
    //public static final EntityType<SnowballEntity> SNOWBALL = register("snowball", EntityType.Builder.<SnowballEntity>create(SnowballEntity::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).updateInterval(10));
    //

    public static final RegistryObject<EntityType<Bullet>> BULLET = ENTITIES.register("bullet",
            () -> EntityType.Builder.<Bullet>create(Bullet::new, EntityClassification.MISC).
                    size(3F, 3F).trackingRange(4).updateInterval(20)
                    .build(new ResourceLocation(JJKMod.MOD_ID, "bullet").toString()));

    public static final RegistryObject<EntityType<RootBallEntity>> ROOTBALL = ENTITIES.register("rootball",
            () -> EntityType.Builder.<RootBallEntity>create(RootBallEntity::new, EntityClassification.MISC).
                    size(1F, 1F).trackingRange(4).updateInterval(20)
                    .build(new ResourceLocation(JJKMod.MOD_ID, "rootball").toString()));

    public static final RegistryObject<EntityType<DivineDogWhiteEntity>> DIVINEDOGWHITE =
            ENTITIES.register("divine_dog_white",
                    () -> EntityType.Builder.create(DivineDogWhiteEntity::new,
                            EntityClassification.MONSTER).size(1f, 1f)
                            .build(new ResourceLocation(JJKMod.MOD_ID, "divine_dog_white").toString()));

    public static final RegistryObject<EntityType<DivineDogWhiteEntity>> DIVINEDOGBLACK =
            ENTITIES.register("divine_dog_black",
                    () -> EntityType.Builder.create(DivineDogWhiteEntity::new,
                            EntityClassification.MONSTER).size(1f, 1f)
                            .build(new ResourceLocation(JJKMod.MOD_ID, "divine_dog_black").toString()));

    public static final RegistryObject<EntityType<DivineDogTotalityEntity>> DIVINEDOGTOTALITY =
            ENTITIES.register("divine_dog_totality",
                    () -> EntityType.Builder.create(DivineDogTotalityEntity::new,
                            EntityClassification.MONSTER).size(1f, 1f)
                            .build(new ResourceLocation(JJKMod.MOD_ID, "divine_dog_totality").toString()));

    public static final RegistryObject<EntityType<GreatSerpentEntity>> GREATSERPENT =
            ENTITIES.register("great_serpent",
                    () -> EntityType.Builder.create(GreatSerpentEntity::new,
                            EntityClassification.MONSTER).size(1f, 1f)
                            .build(new ResourceLocation(JJKMod.MOD_ID, "great_serpent").toString()));

    public static final RegistryObject<EntityType<NueEntity>> NUE =
            ENTITIES.register("nue",
                    () -> EntityType.Builder.create(NueEntity::new,
                            EntityClassification.MONSTER).size(1f, 1f)
                            .build(new ResourceLocation(JJKMod.MOD_ID, "nue").toString()));

    public static final RegistryObject<EntityType<RootSpikeEntity>> ROOTSPIKE =
            ENTITIES.register("rootspike",
                    () -> EntityType.Builder.create(RootSpikeEntity::new,
                            EntityClassification.MONSTER).size(3f, 20f)
                            .build(new ResourceLocation(JJKMod.MOD_ID, "rootspike").toString()));

    public static void register(IEventBus eventBus){
        ENTITIES.register(eventBus);
    }
}
