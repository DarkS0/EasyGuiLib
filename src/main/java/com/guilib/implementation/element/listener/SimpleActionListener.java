package com.guilib.implementation.element.listener;

import javax.annotation.Nonnull;

import com.guilib.api.element.events.IAction;
import com.guilib.api.element.listener.IActionListener;

public abstract class SimpleActionListener implements IActionListener
{
	@Override
	public abstract void onAction(@Nonnull IAction action);

	@Nonnull
	@Override
	public abstract Class<? extends IAction> getActionClass();
}
