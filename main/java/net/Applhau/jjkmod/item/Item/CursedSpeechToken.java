package net.Applhau.jjkmod.item.Item;

import net.Applhau.jjkmod.client.Ability;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.List;

public class CursedSpeechToken extends Item {
    public CursedSpeechToken(Properties properties) {
        super(properties);
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        Ability.TenShadowsTrig = false;
        Ability.StrawdollTrig= false;
        Ability.RatioTrig= false;
        Ability.LimitlessTrig = false;
        Ability.DisasterPlantsTrig= false;
        Ability.CursedSpeechTrig = true;
        Ability.ConstructionTrig= false;
        Ability.BloodManipulationTrig= false;
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
