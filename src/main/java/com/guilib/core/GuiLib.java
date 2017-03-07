package com.guilib.core;

import com.guilib.core.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.Metadata;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=GuiLib.MODID, name=GuiLib.MOD_NAME, version=GuiLib.VERSION)
public class GuiLib extends GenericModContainerImpl{
	
	public static final String	MODID	="guilib";
	public static final String	MOD_NAME="GuiLib";
	public static final String	VERSION	="0.0.0.0.0.0.0.0.0.1 pre alpha";
	
	@Instance(value=MODID)
	private static GuiLib		INSTANCE;
	@Metadata(value=MODID)
	private static ModMetadata	META_DATA;
	
	@SidedProxy(modId=MODID, clientSide="com.guilib.core.proxy.ClientProxy", serverSide="com.guilib.core.proxy.ServerProxy")
	public static CommonProxy sidedProxy;
	public static CommonProxy commonProxy=new CommonProxy();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		sidedProxy.preInit();
		commonProxy.preInit();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		GuiLibHandler.lock();
	}
	
	@Override
	public ModMetadata getMetadata(){
		return META_DATA;
	}
	
	@Override
	public Object getMod(){
		return this;
	}
	
	public static GuiLib getGuiLib(){
		return INSTANCE;
	}
}
