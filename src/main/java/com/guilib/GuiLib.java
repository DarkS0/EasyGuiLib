package com.guilib;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GuiLib.MOD_ID, name = GuiLib.MOD_NAME, version = GuiLib.VERSION)
public class GuiLib
{

	public static final String MOD_ID = "guilib";
	public static final String MOD_NAME = "GuiLib";
	public static final String VERSION = "0.0.0";

	@Instance(value = MOD_ID)
	public static GuiLib INSTANCE;

	@SidedProxy(modId = MOD_ID, clientSide = "com.guilib.ClientProxy", serverSide = "com.guilib.CommonProxy")
	public static CommonProxy PROXY;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		PROXY.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
//		GuiLibHandler.lock();
	}
}
