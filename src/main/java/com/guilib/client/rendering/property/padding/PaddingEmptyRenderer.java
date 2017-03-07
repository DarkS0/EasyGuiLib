package com.guilib.client.rendering.property.padding;

import com.guilib.util.ElementSide;

public class PaddingEmptyRenderer extends PaddingRenderer{
	
	public PaddingEmptyRenderer(ElementSide side){
		super(side);
	}
	
	@Override
	public boolean draws(){
		return false;
	}
	
	@Override
	public void render(){}
	
}
