package com.pragmarob.minecraft.mod.tutorial;

import com.pragmarob.minecraft.mod.tutorial.item.ModItems;
import com.pragmarob.minecraft.mod.tutorial.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TutorialMod.modId, name = TutorialMod.name, version = TutorialMod.version, acceptedMinecraftVersions = "[1.10.2]")
public class TutorialMod {

    public static final String modId = "tutorial";
    public static final String name = "Tutorial mod";
    public static final String version = "0.0.1";

    @Mod.Instance(modId)
    public static TutorialMod instance;

    @SidedProxy(serverSide = "com.pragmarob.minecraft.mod.tutorial.proxy.CommonProxy", clientSide = "com.pragmarob.minecraft.mod.tutorial.proxy.ClientProxy")
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
