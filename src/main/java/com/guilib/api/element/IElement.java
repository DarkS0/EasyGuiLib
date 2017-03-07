package com.guilib.api.element;

import java.util.List;
import java.util.function.Consumer;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.guilib.api.element.events.ElementEvents;
import com.guilib.api.element.property.IAnimation;
import com.guilib.api.element.property.IElementValue;
import com.guilib.api.element.property.IMargin;
import com.guilib.api.element.property.IOutline;
import com.guilib.api.element.property.Padding;

public interface IElement<ThisType extends IElement>{
	
	int getWidth();
	
	void setWidth(int width);
	
	int getHeight();
	
	void setHeight(int height);
	
	@Nonnull
	Padding getPadding();
	
	@Nonnull
	IMargin getMargin();
	
	void setMargin(@Nonnull IMargin margin);
	
	@Nonnull
	IOutline getOutline();
	
	void setOutline(@Nonnull IOutline outline);
	
	@Nonnull
	IAnimation getAnimation();
	
	void setAnimation(@Nonnull IAnimation animation);
	
	IElementValue getValue();
	
	@Nonnull
	ThisType setValue(IElementValue property);
	
	@Nonnull
	List<Consumer<ElementEvents>> getActionListeners();
	
	@Nonnull
	ThisType withActionListener(@Nonnull IActionListener listener);
	
	@Nullable
	IActionListener getActionListener(@Nonnull Class<? extends IAction> clazz);
	
	boolean isDirty();
	
	void markDirty();
}
