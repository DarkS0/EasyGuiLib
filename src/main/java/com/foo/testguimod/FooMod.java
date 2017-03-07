package com.foo.testguimod;

import com.foo.testguimod.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid=FooMod.MODID, name=FooMod.MOD_NAME, version=FooMod.VERSION)
public class FooMod{
	
	public static final String	MODID	="foomod";
	public static final String	MOD_NAME="FooMod";
	public static final String	VERSION	="-2";
	
	@SidedProxy(modId=MODID, clientSide="com.foo.testguimod.proxy.ClientProxy", serverSide="com.foo.testguimod.proxy.ServerProxy")
	public static CommonProxy	sidedProxy;
	public static CommonProxy	commonProxy	=new CommonProxy();
	
	//	@EventHandler
	//	public void preInit(FMLPreInitializationEvent event){}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		sidedProxy.preInit();
		commonProxy.preInit();
		FooBlock foo=new FooBlock();
		foo.setCreativeTab(CreativeTabs.MISC);
		foo.setRegistryName(MODID, "foo");
		foo.setUnlocalizedName("foo");
		ItemBlock ib=new ItemBlock(foo);
		GameRegistry.register(foo);
		GameRegistry.register(ib.setRegistryName(MODID, "foo_i"));
	}
	
//	@EventHandler
//	public void postInit(FMLPostInitializationEvent event){}
	
}
