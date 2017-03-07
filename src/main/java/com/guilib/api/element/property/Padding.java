package com.guilib.api.element.property;

import com.guilib.client.rendering.property.padding.PaddingRenderer;
import com.guilib.implementation.element.Element;
import com.guilib.util.ElementSide;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Padding{
	
	private final int[] widths=new int[4];
	
	@SideOnly(Side.CLIENT)
	private final PaddingRenderer[] renderers=new PaddingRenderer[4];
	
	protected final Element parent;
	
	public Padding(Element parent){
		this.parent=parent;
	}
	
	public Padding setWidth(ElementSide side, int width){
		if(width<0)width=0;
		if(widths[side.id]==width)return this;
		
		widths[side.id]=width;
		parent.markDirty();
		
		return this;
	}
	
}
