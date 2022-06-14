package net.Applhau.jjkmod.client.keybinds;

import net.Applhau.jjkmod.JJKMod;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.awt.event.KeyEvent;

@OnlyIn(Dist.CLIENT)
public class KeybindsInit {
    public static KeyBinding cursedEnergySpeed;
    public static KeyBinding cursedEnergyStrength;
    public static KeyBinding cursedEnergyShield;
    public static KeyBinding activateAbility;

    public static KeyBinding nextAbility;
    public static KeyBinding previousAbility;

    public static void register(final FMLClientSetupEvent event) {
        cursedEnergySpeed = create("cursed_energy_speed", KeyEvent.VK_X);
        cursedEnergyStrength = create("cursed_energy_strength", KeyEvent.VK_Z);
        cursedEnergyShield = create("cursed_energy_shield", KeyEvent.VK_C);
        activateAbility = create("activate_ability", KeyEvent.VK_V);


        nextAbility = create("next_ability", KeyEvent.VK_P);
        previousAbility = create("previous_ability", KeyEvent.VK_L);

        ClientRegistry.registerKeyBinding(cursedEnergySpeed);
        ClientRegistry.registerKeyBinding(cursedEnergyStrength);
        ClientRegistry.registerKeyBinding(cursedEnergyShield);
        ClientRegistry.registerKeyBinding(activateAbility);
        ClientRegistry.registerKeyBinding(nextAbility);
        ClientRegistry.registerKeyBinding(previousAbility);
    }

    private static KeyBinding create(String name, int key){
        return new KeyBinding("key." + JJKMod.MOD_ID + "." + name, key, "key.category." + JJKMod.MOD_ID);
    }
}
