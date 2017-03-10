package com.guilib.implementation.element;

import com.guilib.api.element.IElement;
import com.guilib.api.element.events.IAction;
import com.guilib.api.element.property.*;
import net.minecraft.block.properties.IProperty;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Element implements IElement<Element>
{
	private int width, height;
	@Nonnull
	private IPosition position;
	@Nonnull
	private IPadding padding;
	@Nonnull
	private IMargin margin;
	@Nonnull
	private IOutline outline;
	@Nonnull
	private IAnimation animation;
	@Nonnull
	private Map<String, IExtendedProperty> extendedProperties;
	@Nonnull
	private List<Consumer<IAction>> actionListeners;

	private boolean dirty;

	public Element()
	{

	}

	@Override
	public int getWidth()
	{
		return width;
	}

	@Override
	public void setWidth(int width)
	{
		this.width = width;
	}

	@Override
	public int getHeight()
	{
		return height;
	}

	@Override
	public void setHeight(int height)
	{
		this.height = height;
	}

	@Nonnull
	@Override
	public IPosition getPosition()
	{
		return position;
	}

	@Override
	public void setPosition(@Nonnull IPosition position)
	{
		this.position = position;
	}

	@Nonnull
	public IPadding getPadding()
	{
		return padding;
	}

	@Override
	public void setPadding(@Nonnull IPadding padding)
	{
		this.padding = padding;
	}

	@Nonnull
	@Override
	public IMargin getMargin()
	{
		return margin;
	}

	@Override
	public void setMargin(@Nonnull IMargin margin)
	{
		this.margin = margin;
	}

	@Nonnull
	@Override
	public IOutline getOutline()
	{
		return outline;
	}

	@Override
	public void setOutline(@Nonnull IOutline outline)
	{
		this.outline = outline;
	}

	@Nonnull
	@Override
	public IAnimation getAnimation()
	{
		return animation;
	}

	@Override
	public void setAnimation(@Nonnull IAnimation animation)
	{
		this.animation = animation;
	}

	@Nonnull
	@Override
	public Element withProperty(@Nonnull String name, @Nonnull IExtendedProperty property)
	{
		extendedProperties.put(name, property);

		return this;
	}

	@Nonnull
	@Override
	public Map<String, IExtendedProperty> getExtendedProperties()
	{
		return extendedProperties;
	}

	@Nullable
	@Override
	public <P extends IProperty> P getProperty(String property)
	{
		return (P) extendedProperties.get(property);
	}

	@Nonnull
	@Override
	public Element withActionListener(@Nonnull Consumer<IAction> listener)
	{
		actionListeners.add(listener);

		return this;
	}

	@Nonnull
	@Override
	public List<Consumer<IAction>> getActionListeners()
	{
		return actionListeners;
	}

	@Nullable
	@Override
	public Consumer<IAction> getActionListener(@Nonnull Class<? extends IAction> clazz)
	{
		return null;
	}

	@Override
	public boolean isDirty()
	{
		return dirty;
	}

	@Override
	public void markDirty()
	{
		markDirty(true);
	}

	@Override
	public void markDirty(boolean dirty)
	{
		this.dirty = dirty;
	}
}
