package com.guilib.core.gui;

import com.guilib.core.GuiEnhanced;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiContainerEnhanced extends GuiContainer{
	
	private final GuiEnhanced gui;
	
	public GuiContainerEnhanced(GuiEnhanced gui){
		super(new ContainerEnhanced(gui));
		this.gui=gui;
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY){
		
	}
	
}
