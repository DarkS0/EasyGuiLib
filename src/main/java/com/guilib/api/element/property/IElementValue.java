package com.guilib.api.element.property;

import javax.annotation.Nonnull;

public interface IElementValue<E>{
	
	@Nonnull
	E getValue();
	
	void setValue(@Nonnull E value);
}
