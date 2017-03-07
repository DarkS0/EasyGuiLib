package com.guilib.core.proxy;

import com.guilib.core.GuiLib;
import com.guilib.core.GuiLibHandler;

import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy{
	
	
	public void preInit(){
		NetworkRegistry.INSTANCE.registerGuiHandler(GuiLib.getGuiLib(), new GuiLibHandler());
	}
	
}
