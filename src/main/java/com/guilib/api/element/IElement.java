package com.guilib.api.element;

import com.guilib.api.element.action.IAction;
import com.guilib.api.element.property.*;
import net.minecraft.block.properties.IProperty;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public interface IElement<T extends IElement>
{
	int getWidth();

	void setWidth(int width);

	int getHeight();

	void setHeight(int height);

	@Nonnull
	IPosition getPosition();

	void setPosition(@Nonnull IPosition position);

	@Nonnull
	IPadding getPadding();

	void setPadding(@Nonnull IPadding padding);

	@Nonnull
	IMargin getMargin();

	void setMargin(@Nonnull IMargin margin);

	@Nonnull
	IOutline getOutline();

	void setOutline(@Nonnull IOutline outline);

	@Nonnull
	IAnimation getAnimation();

	void setAnimation(@Nonnull IAnimation animation);

	@Nonnull
	T withProperty(@Nonnull String name, @Nonnull IExtendedProperty property);

	@Nonnull
	Map<String, IExtendedProperty> getExtendedProperties();

	@Nullable
	<P extends IProperty> P getProperty(String property);

	@Nonnull
	T withActionListener(@Nonnull Consumer<IAction> listener);

	@Nonnull
	List<Consumer<IAction>> getActionListeners();

	@Nullable
	Consumer<IAction> getActionListener(@Nonnull Class<? extends IAction> clazz);

	boolean isDirty();

	void markDirty();

	void markDirty(boolean dirty);
}
