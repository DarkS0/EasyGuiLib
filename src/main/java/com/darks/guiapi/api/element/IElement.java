package com.darks.guiapi.api.element;

import com.darks.guiapi.api.element.property.*;
import com.darks.guiapi.api.element.action.IAction;
import com.darks.guiapi.api.element.listener.IActionListener;

import java.util.Set;

public interface IElement
{
	IPosition getPosition();

	void setPosition(IPosition position);

	float getWidth();

	void setWidth(float width);

	float getHeight();

	void setHeight(float height);

	IPadding getPadding();

	void setPadding(IPadding padding);

	IMargin getMargin();

	void setMargin(IMargin margin);

	IOutline getOutline();

	void setOutline(IOutline outline);

	IAnimation getAnimation();

	void setAnimation(IAnimation animation);

	Set<IExtendedProperty> getExtendedProperties();

	IElement withProperty(IExtendedProperty property);

	IExtendedProperty getExtendedProperty(Class<? extends IExtendedProperty> clazz);

	Set<IActionListener> getActionListeners();

	IElement withActionListener(IActionListener listener);

	IActionListener getActionListener(Class<? extends IAction> clazz);
}
