package com.pragmarob.minecraft.caca.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCaca extends BlockBase {
    
    public BlockCaca(String name) {
        super(Material.ROCK, name);

        setHardness(3f);
        setResistance(5f);
    }

    @Override
    public BlockCaca setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}