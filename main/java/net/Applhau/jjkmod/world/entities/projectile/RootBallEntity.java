package net.Applhau.jjkmod.world.entities.projectile;

import net.Applhau.jjkmod.item.JJKItems;
import net.Applhau.jjkmod.world.entities.ModEntityType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class RootBallEntity extends ProjectileItemEntity {

    public RootBallEntity(EntityType<? extends RootBallEntity> p_i50159_1_, World p_i50159_2_) {
        super(p_i50159_1_, p_i50159_2_);
    }

    public RootBallEntity(World worldIn, LivingEntity throwerIn) {
        super(ModEntityType.ROOTBALL.get(), throwerIn, worldIn);
    }

    public RootBallEntity(World worldIn, double x, double y, double z) {
        super(ModEntityType.ROOTBALL.get(), x, y, z, worldIn);
    }

    protected Item getDefaultItem() {
        return JJKItems.ROOTBALL.get();
    }

    protected void onEntityHit(EntityRayTraceResult result) {
        super.onEntityHit(result);
        Entity entity = result.getEntity();
        entity.attackEntityFrom(DamageSource.GENERIC, 10);
    }


    protected void onImpact(RayTraceResult result) {
        super.onImpact(result);
        if (!this.world.isRemote) {
            this.world.setEntityState(this, (byte)3);
            this.remove();
        }

    }
}
