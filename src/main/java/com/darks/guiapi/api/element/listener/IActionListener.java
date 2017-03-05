package com.darks.guiapi.api.element.listener;

import com.darks.guiapi.api.element.action.IAction;

public interface IActionListener<T extends IAction>
{
	void onAction(T action);

	Class<? extends IAction> getActionClass();
}
