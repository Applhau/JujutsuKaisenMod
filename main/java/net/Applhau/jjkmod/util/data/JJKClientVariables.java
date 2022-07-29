package net.Applhau.jjkmod.util.data;

public class JJKClientVariables {
    private static int playertest;

    public static void set(int playertest){
        JJKClientVariables.playertest = playertest;
    }

    public static int getPlayertest(){
        return playertest;
    }


}
