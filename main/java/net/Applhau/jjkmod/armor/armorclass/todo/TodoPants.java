package net.Applhau.jjkmod.armor.armorclass.todo;

import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.armor.models.todopants;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TodoPants extends ArmorItem {

    net.Applhau.jjkmod.armor.models.todopants todopants = new todopants();

    public TodoPants(IArmorMaterial materialIn, EquipmentSlotType slot, Item.Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public BipedModel getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, BipedModel original) {
        BipedModel armorModel = new BipedModel(1); //what do put here

        if (armorModel != null) {
            /*armorModel.bipedHead.showModel = armorSlot == EquipmentSlotType.HEAD;
            armorModel.bipedHeadwear.showModel = false;
            armorModel.bipedBody.showModel = armorSlot == EquipmentSlotType.CHEST || armorSlot == EquipmentSlotType.LEGS;
            armorModel.bipedRightArm.showModel = armorSlot == EquipmentSlotType.CHEST;
            armorModel.bipedLeftArm.showModel = armorSlot == EquipmentSlotType.CHEST;
            armorModel.bipedRightLeg.showModel = armorSlot == EquipmentSlotType.LEGS || armorSlot == EquipmentSlotType.FEET;
            armorModel.bipedLeftLeg.showModel = armorSlot == EquipmentSlotType.LEGS || armorSlot == EquipmentSlotType.FEET;*/
            armorModel.bipedRightLeg = new todopants().rightleg;
            armorModel.bipedLeftLeg = new todopants().leftleg;
            armorModel.isSneak = entityLiving.isSneaking();
            armorModel.isSitting = original.isSitting;
            armorModel.isChild = entityLiving.isChild();
        }
        return armorModel;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {

        return JJKMod.MOD_ID + ":" + "/textures/models/armor/todo_pants.png";
    }
}

