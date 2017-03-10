package com.guilib.implementation.element.property.margin;

import com.guilib.api.element.property.IMargin;

public class SimpleMargin implements IMargin
{
	private float up, right, down, left;

	public SimpleMargin(float up, float right, float down, float left)
	{
		this.up = up;
		this.right = right;
		this.down = down;
		this.left = left;
	}

	@Override
	public float getUp()
	{
		return up;
	}

	@Override
	public IMargin setUp(float up)
	{
		this.up = up;

		return this;
	}

	@Override
	public float getRight()
	{
		return right;
	}

	@Override
	public IMargin setRight(float right)
	{
		this.right = right;

		return this;
	}

	@Override
	public float getDown()
	{
		return down;
	}

	@Override
	public IMargin setDown(float down)
	{
		this.down = down;

		return this;
	}

	@Override
	public float getLeft()
	{
		return left;
	}

	@Override
	public IMargin setLeft(float left)
	{
		this.left = left;

		return this;
	}
}
