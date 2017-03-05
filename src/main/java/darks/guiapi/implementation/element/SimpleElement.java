package darks.guiapi.implementation.element;

import darks.guiapi.api.element.IElement;
import darks.guiapi.api.element.action.IAction;
import darks.guiapi.api.element.listener.IActionListener;
import darks.guiapi.api.element.property.*;

import javax.annotation.Nonnull;
import java.util.Set;

public abstract class SimpleElement implements IElement
{
	@Nonnull
	private IPosition position;
	private float width, height;
	@Nonnull
	private IPadding padding;
	@Nonnull
	private IMargin margin;
	@Nonnull
	private IOutline outline;
	@Nonnull
	private IAnimation animation;
	@Nonnull
	private Set<IExtendedProperty> extendedProperties;
	@Nonnull
	private Set<IActionListener> actionListeners;

	public SimpleElement(@Nonnull IPosition position, float width, float height, @Nonnull IPadding padding, @Nonnull IMargin margin, @Nonnull IOutline outline, @Nonnull IAnimation animation, @Nonnull Set<IExtendedProperty> extendedProperties, @Nonnull Set<IActionListener> actionListeners)
	{
		this.position = position;
		this.width = width;
		this.height = height;
		this.padding = padding;
		this.margin = margin;
		this.outline = outline;
		this.animation = animation;
		this.extendedProperties = extendedProperties;
		this.actionListeners = actionListeners;
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

	@Nonnull
	@Override
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
	public Set<IExtendedProperty> getExtendedProperties()
	{
		return extendedProperties;
	}

	@Nonnull
	@Override
	public IElement withProperty(@Nonnull IExtendedProperty property)
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
