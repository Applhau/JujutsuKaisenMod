package net.Applhau.jjkmod.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum JJKItemtier implements IItemTier {
    KENTOCLEAVER(1, 1000, 4f, 3f, 2, () -> Ingredient.EMPTY),
    WOODENTONFA(1, 750, 4f, 2f, 2, () -> Ingredient.EMPTY),
    MEIMEIAXE(1, 2000, 4f, 5f, 2, () -> Ingredient.EMPTY),
    HARUTOSWORD(1, 1500, 4f, 4f, 2, () -> Ingredient.EMPTY),
    MAKISPEAR(1, 2000, 4f, 5f, 2, () -> Ingredient.EMPTY),
    SLAUGHTERDEMON(1, 1000, 4f, 3f, 2, () -> Ingredient.EMPTY),
    DRAGONBONE(1, 2000, 4f, 6f, 2, () -> Ingredient.EMPTY),
    JETBLACKSWORD(1, 1600, 4f, 4f, 2, () -> Ingredient.EMPTY);



    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    JJKItemtier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }
}
