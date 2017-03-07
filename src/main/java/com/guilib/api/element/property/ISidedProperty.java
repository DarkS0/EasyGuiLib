package com.guilib.api.element.property;

import com.guilib.util.ElementSide;

public interface ISidedProperty{
	ElementSide getSide();
	
	public static class SidedProperty implements ISidedProperty{

		private final ElementSide side;
		
		
		public SidedProperty(ElementSide side){
			this.side=side;
		}
		
		@Override
		public ElementSide getSide(){
			return side;
		}
	}
}
