package darks.guiapi.api.element.listener;

import darks.guiapi.api.element.action.IAction;

import javax.annotation.Nonnull;

public interface IActionListener<T extends IAction>
{
	void onAction(@Nonnull T action);

	@Nonnull
	Class<? extends IAction> getActionClass();
}
