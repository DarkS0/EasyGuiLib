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
	public void setUp(float up)
	{
		this.up = up;
	}

	@Override
	public float getRight()
	{
		return right;
	}

	@Override
	public void setRight(float right)
	{
		this.right = right;
	}

	@Override
	public float getDown()
	{
		return down;
	}

	@Override
	public void setDown(float down)
	{
		this.down = down;
	}

	@Override
	public float getLeft()
	{
		return left;
	}

	@Override
	public void setLeft(float left)
	{
		this.left = left;
	}

	@Override
	public IPaddingFill getFillStyle()
	{
		return fill;
	}

	@Override
	public void setFillStyle(IPaddingFill fillStyle)
	{
		this.fill = fillStyle;
	}
}
