package com.pragmarob.minecraft.mod.tutorial.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

import com.pragmarob.minecraft.mod.tutorial.TutorialMod;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(TutorialMod.modId + ":" + id, "inventory"));
    }
}