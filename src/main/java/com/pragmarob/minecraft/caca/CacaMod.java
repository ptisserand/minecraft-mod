package com.pragmarob.minecraft.caca;

import com.pragmarob.minecraft.caca.item.ModItems;
import com.pragmarob.minecraft.caca.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CacaMod.modId, acceptedMinecraftVersions = "[1.10.2]")
public class CacaMod {

    public static final String modId = "caca";
    public static final String name = "Caca mod";

    @Mod.Instance(modId)
    public static CacaMod instance;

    @SidedProxy(serverSide = "com.pragmarob.minecraft.caca.proxy.CommonProxy", clientSide = "com.pragmarob.minecraft.caca.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
