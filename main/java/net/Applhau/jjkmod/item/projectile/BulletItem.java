package net.Applhau.jjkmod.item.projectile;

import net.Applhau.jjkmod.item.JJKItems;
import net.Applhau.jjkmod.world.entities.projectile.Bullet;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BulletItem extends ArrowItem {
    public final float damage;

    public BulletItem(Properties properties, float damage) {
        super(properties);
        this.damage = damage;
    }

    @Override
    public Bullet createArrow(World worldIn, ItemStack stack, LivingEntity shooter) {
        Bullet arrowentity = new Bullet(shooter, worldIn, JJKItems.BULLET.get());
        arrowentity.setDamage(this.damage);
        return arrowentity;
    }

    @Override
    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.PlayerEntity player) {
        int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.enchantment.Enchantments.INFINITY, bow);
        return enchant <= 0 ? false : this.getClass() == BulletItem.class;
    }
}
