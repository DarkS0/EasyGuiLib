package com.guilib.api.element.property;

import javax.annotation.Nullable;

public interface IExtendedProperty<T>
{
	@Nullable
	T get();

	void set(@Nullable T value);
}
