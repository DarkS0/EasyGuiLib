package com.guilib.core;

import com.guilib.implementation.element.Element;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

//TODO: Name placeholder
public abstract class GuiEnhanced{
	
	public final BlockPos pos;
	
	protected Element body=new ;
	
	public GuiEnhanced(BlockPos pos){
		this.pos=pos;
	}
	
	public boolean canInteractWith(EntityPlayer player){
		return player.getDistanceSq(pos)<32;
	}
	
}
