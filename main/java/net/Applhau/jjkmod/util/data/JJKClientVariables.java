package net.Applhau.jjkmod.util.data;

import net.minecraft.nbt.CompoundNBT;

public class JJKClientVariables {
    private static int playertest;

    public static void set(int playertest){
        JJKClientVariables.playertest = playertest;
    }

    public static int getPlayertest(){
        return playertest;
    }


}
