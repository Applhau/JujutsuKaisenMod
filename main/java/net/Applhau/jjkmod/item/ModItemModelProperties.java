package net.Applhau.jjkmod.item;

import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;

public class ModItemModelProperties {

    public static void makeCrossBow(Item item) {
        ItemModelsProperties.registerProperty(Items.CROSSBOW, new ResourceLocation("pull"), (p_239427_0_, p_239427_1_, p_239427_2_) -> {
            if (p_239427_2_ == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(p_239427_0_) ? 0.0F : (float)(p_239427_0_.getUseDuration() - p_239427_2_.getItemInUseCount()) / (float)CrossbowItem.getChargeTime(p_239427_0_);
            }
        });
        ItemModelsProperties.registerProperty(Items.CROSSBOW, new ResourceLocation("pulling"), (p_239426_0_, p_239426_1_, p_239426_2_) -> {
            return p_239426_2_ != null && p_239426_2_.isHandActive() && p_239426_2_.getActiveItemStack() == p_239426_0_ && !CrossbowItem.isCharged(p_239426_0_) ? 1.0F : 0.0F;
        });
        ItemModelsProperties.registerProperty(Items.CROSSBOW, new ResourceLocation("charged"), (p_239425_0_, p_239425_1_, p_239425_2_) -> {
            return p_239425_2_ != null && CrossbowItem.isCharged(p_239425_0_) ? 1.0F : 0.0F;
        });
    }

}
