package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

public class ItemAnvilDropper extends QuickItem {
    {
        name = "Anvil Dropper";
        texture ="anvil_dropper";
        this.setCreativeTab(CreativeTabs.COMBAT);
    }

    public void onRightClick(){
        BlockPos block = findBlockAtCursor(100);

        if(block != null){

            BlockPos one = block.up(50);
            world.setBlockState(one, Blocks.ANVIL.getDefaultState());

        }

    }
}
