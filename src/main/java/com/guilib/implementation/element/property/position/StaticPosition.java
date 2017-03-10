package com.guilib.implementation.element.property.position;

import com.guilib.api.element.property.IPosition;
import com.guilib.util.Vec2i;

import javax.annotation.Nonnull;

public class StaticPosition implements IPosition
{
	private int x, y;

	public StaticPosition(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	@Nonnull
	@Override
	public Vec2i get()
	{
		return new Vec2i(x, y);
	}
}
