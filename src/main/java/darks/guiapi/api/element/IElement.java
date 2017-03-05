package darks.guiapi.api.element;

import darks.guiapi.api.element.action.IAction;
import darks.guiapi.api.element.listener.IActionListener;
import darks.guiapi.api.element.property.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Set;

public interface IElement
{
	@Nonnull
	IPosition getPosition();

	void setPosition(@Nonnull IPosition position);

	float getWidth();

	void setWidth(float width);

	float getHeight();

	void setHeight(float height);

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
	Set<IExtendedProperty> getExtendedProperties();

	@Nonnull
	IElement withProperty(@Nonnull IExtendedProperty property);

	@Nullable
	IExtendedProperty getExtendedProperty(@Nonnull Class<? extends IExtendedProperty> clazz);

	@Nonnull
	Set<IActionListener> getActionListeners();

	@Nonnull
	IElement withActionListener(@Nonnull IActionListener listener);

	@Nullable
	IActionListener getActionListener(@Nonnull Class<? extends IAction> clazz);

	boolean isDirty();

	void markDirty();

	void markDirty(boolean dirty);
}
