package com.guilib.client.rendering.property.padding;

import com.guilib.api.element.property.ISidedProperty.SidedProperty;
import com.guilib.util.ElementSide;

public abstract class PaddingRenderer extends SidedProperty{
	
	public PaddingRenderer(ElementSide side){
		super(side);
	}
	
	public abstract boolean draws();
	
	public abstract void render();
	
}
