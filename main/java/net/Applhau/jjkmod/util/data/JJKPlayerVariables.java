package net.Applhau.jjkmod.util.data;

import net.minecraft.nbt.CompoundNBT;

public class JJKPlayerVariables {
    private int test;

    public int getVariable(){
        return test;
    }
    public void setVariable(int test){
        this.test = test;
    }


    public void addTest(int test){
        this.test += test;
    }

    public void copyFrom(JJKPlayerVariables source){;
        test = source.test;
    }

    public void saveNBTData(CompoundNBT compoundNBT){
        compoundNBT.putInt("test", test);
    }

    public void loadNBTData(CompoundNBT compoundNBT){
        test = compoundNBT.getInt("test");
    }
}
