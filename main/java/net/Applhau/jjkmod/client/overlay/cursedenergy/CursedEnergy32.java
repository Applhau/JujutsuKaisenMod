package net.Applhau.jjkmod.client.overlay.cursedenergy;

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
public class CursedEnergy32 {

    protected static final ResourceLocation CURSEDENERGY = new ResourceLocation(JJKMod.MOD_ID + ":" + "/textures/overlay/cursedenergy_32.png");
    protected static final ResourceLocation CURSEDENERGYEMPTY = new ResourceLocation(JJKMod.MOD_ID + ":" + "/textures/overlay/cursedenergy_0.png");

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void eventHandler(RenderGameOverlayEvent.Post event) {
        if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
            int posX = (event.getWindow().getScaledWidth()) / 2;
            int posY = (event.getWindow().getScaledHeight()) / 2;
            if(Ability.CursedEnergy == 32){
                Minecraft.getInstance().getTextureManager().bindTexture(CURSEDENERGY);
                Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -173, posY + 43, 0, 0, 7, 52, 7, 52);
                Minecraft.getInstance().getTextureManager().bindTexture(CURSEDENERGYEMPTY);
                Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -173, posY + 43, 0, 0, 7, 52, 7, 52);
            }

        }
    }


}




