package com.guilib.core.gui;

import com.guilib.core.GuiEnhanced;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ContainerEnhanced extends Container{
	
	private final GuiEnhanced gui;
	
	public ContainerEnhanced(GuiEnhanced gui){
		this.gui=gui;
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn){
		return false;
	}
	
}
