package com.guilib.implementation.element.property.position;

import net.minecraft.util.math.Vec2f;

import javax.annotation.Nonnull;

import com.guilib.api.element.property.IPosition;

public class StaticPosition implements IPosition
{
	private float x, y;

	public StaticPosition(float x, float y)
	{
		this.x = x;
		this.y = y;
	}

	@Nonnull
	@Override
	public Vec2f get()
	{
		return new Vec2f(x, y);
	}
}
