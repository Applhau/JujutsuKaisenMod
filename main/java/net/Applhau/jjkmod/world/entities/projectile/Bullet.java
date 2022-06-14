package net.Applhau.jjkmod.world.entities.projectile;

import net.Applhau.jjkmod.item.JJKItems;
import net.Applhau.jjkmod.world.entities.ModEntityType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class Bullet extends AbstractArrowEntity {

    private final Item referenceItem;

    public Bullet(EntityType<? extends Bullet> type, World worldIn) {
        super(type, worldIn);
        this.referenceItem = JJKItems.BULLET.get();
    }

    public Bullet(LivingEntity shooter, World worldIn, Item referenceItem) {
        super(ModEntityType.BULLET.get(), shooter, worldIn);
        this.referenceItem = referenceItem;
    }

    @Override
    public ItemStack getArrowStack() {
        return new ItemStack(this.referenceItem);
    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

}
