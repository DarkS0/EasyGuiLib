package com.guilib.implementation.element.property.padding;

import com.guilib.api.element.IElement;
import com.guilib.api.element.property.IPadding;
import net.minecraft.client.renderer.VertexBuffer;

import javax.annotation.Nonnull;

public class SimplePadding implements IPadding
{
	private float up, right, down, left;
	private IPadding.IPaddingFill fill;

	public SimplePadding(float up, float right, float down, float left)
	{
		this.up = up;
		this.right = right;
		this.down = down;
		this.left = left;
	}

	@Override
	public void render(@Nonnull IElement element, @Nonnull VertexBuffer buffer)
	{
		fill.render(element, buffer);
	}

	@Override
	public float getUp()
	{
		return up;
	}

	@Override
	public IPadding setUp(float up)
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
	public IPadding setRight(float right)
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
	public IPadding setDown(float down)
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
	public IPadding setLeft(float left)
	{
		this.left = left;

		return this;
	}

	@Override
	public IPaddingFill getFillStyle()
	{
		return fill;
	}

	@Override
	public IPadding setFillStyle(IPaddingFill fillStyle)
	{
		this.fill = fillStyle;

		return this;
	}
}
