package darks.guiapi.implementation.element.listener;

import darks.guiapi.api.element.action.IAction;
import darks.guiapi.api.element.listener.IActionListener;

import javax.annotation.Nonnull;

public abstract class SimpleActionListener implements IActionListener
{
	@Override
	public abstract void onAction(@Nonnull IAction action);

	@Nonnull
	@Override
	public abstract Class<? extends IAction> getActionClass();
}
