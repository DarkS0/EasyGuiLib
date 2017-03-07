package com.foo.testguimod;

import com.guilib.core.GuiEnhanced;

import net.minecraft.util.math.BlockPos;

public class FooGui extends GuiEnhanced{

	public FooGui(BlockPos pos){
		super(pos);
		System.out.println("yay");
	}
	
}
