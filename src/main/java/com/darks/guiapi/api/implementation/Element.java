package com.darks.guiapi.api.implementation;

import com.darks.guiapi.api.element.IElement;
import com.darks.guiapi.api.element.property.*;
import com.darks.guiapi.api.element.action.IAction;
import com.darks.guiapi.api.element.listener.IActionListener;

import java.util.Set;

public abstract class Element implements IElement
{
	private IPosition position;
	private float width, height;
	private IPadding padding;
	private IMargin margin;
	private IOutline outline;
	private IAnimation animation;
	private Set<IExtendedProperty> extendedProperties;
	private Set<IActionListener> actionListeners;

	@Override
	public IPosition getPosition()
	{
		return position;
	}

	@Override
	public void setPosition(IPosition position)
	{
		this.position = position;
	}

	@Override
	public float getWidth()
	{
		return width;
	}

	@Override
	public void setWidth(float width)
	{
		this.width = width;
	}

	@Override
	public float getHeight()
	{
		return height;
	}

	@Override
	public void setHeight(float height)
	{
		this.height = height;
	}

	@Override
	public IPadding getPadding()
	{
		return padding;
	}

	@Override
	public void setPadding(IPadding padding)
	{
		this.padding = padding;
	}

	@Override
	public IMargin getMargin()
	{
		return margin;
	}

	@Override
	public void setMargin(IMargin margin)
	{
		this.margin = margin;
	}

	@Override
	public IOutline getOutline()
	{
		return outline;
	}

	@Override
	public void setOutline(IOutline outline)
	{
		this.outline = outline;
	}

	@Override
	public IAnimation getAnimation()
	{
		return animation;
	}

	@Override
	public void setAnimation(IAnimation animation)
	{
		this.animation = animation;
	}

	@Override
	public Set<IExtendedProperty> getExtendedProperties()
	{
		return extendedProperties;
	}

	@Override
	public IElement withProperty(IExtendedProperty property)
	{
		extendedProperties.add(property);

		return this;
	}

	@Override
	public IExtendedProperty getExtendedProperty(Class<? extends IExtendedProperty> clazz)
	{
		return extendedProperties.stream().filter(property -> property.getClass().equals(clazz)).findFirst().get();
	}

	@Override
	public Set<IActionListener> getActionListeners()
	{
		return actionListeners;
	}

	@Override
	public IElement withActionListener(IActionListener listener)
	{
		actionListeners.add(listener);

		return this;
	}

	@Override
	public IActionListener getActionListener(Class<? extends IAction> clazz)
	{
		return actionListeners.stream().filter(listener -> listener.getActionClass().equals(clazz)).findFirst().get();
	}
}
