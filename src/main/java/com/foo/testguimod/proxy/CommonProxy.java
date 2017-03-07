package com.foo.testguimod.proxy;

import com.foo.testguimod.FooGui;
import com.guilib.core.GuiLibHandler;

public class CommonProxy{
	
	
	public void preInit(){
		GuiLibHandler.registerGui(FooGui.class);
	}
	
}
