package net.Applhau.jjkmod.client.overlay.moveset.strawdoll;

import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.client.Ability;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JJKMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class StrawDollAbility1 {
    protected static final ResourceLocation ABILITYSET = new ResourceLocation(JJKMod.MOD_ID + ":" + "/textures/overlay/moveset/strawdoll_moves.png");
    protected static final ResourceLocation ABILITYSELECTOR = new ResourceLocation(JJKMod.MOD_ID + ":" + "/textures/overlay/moveset/ability_selection.png");

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void eventHandler(RenderGameOverlayEvent.Post event) {
        if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
            int posX = (event.getWindow().getScaledWidth()) / 2;
            int posY = (event.getWindow().getScaledHeight()) / 2;
            if(Ability.ability == 0 && Ability.StrawdollTrig == true){
                Minecraft.getInstance().getTextureManager().bindTexture(ABILITYSELECTOR);
                Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -163, posY + 61, 0, 0, 16, 16, 16, 16);
                Minecraft.getInstance().getTextureManager().bindTexture(ABILITYSET);
                Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -165, posY + 57, 0, 0, 43, 26, 43, 26);

            }

        }
    }
}
