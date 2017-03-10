package com.guilib.implementation.element.property.outline;

import com.guilib.api.element.IElement;
import com.guilib.api.element.property.IOutline;
import com.guilib.util.Color;
import net.minecraft.client.renderer.VertexBuffer;

import javax.annotation.Nonnull;

public class SimpleOutline implements IOutline
{
	private float width;
	@Nonnull
	private IOutlineFill fillStyle;

	public SimpleOutline(float width, @Nonnull IOutlineFill fillStyle)
	{
		this.width = width;
		this.fillStyle = fillStyle;
	}

	@Override
	public void render(@Nonnull IElement element, @Nonnull VertexBuffer buffer)
	{
		fillStyle.render(element, buffer);
	}

	@Override
	public float getWidth()
	{
		return width;
	}

	@Override
	public IOutline setWidth(float width)
	{
		this.width = width;

		return this;
	}

	@Nonnull
	@Override
	public IOutlineFill getFillStyle()
	{
		return fillStyle;
	}

	@Override
	public IOutline setFillStyle(IOutlineFill fillStyle)
	{
		this.fillStyle = fillStyle;

		return this;
	}

	public static abstract class SimpleFillStyle implements IOutlineFill
	{
		private Color color;

		public SimpleFillStyle(Color color)
		{
			this.color = color;
		}

		@Override
		public Color getColor()
		{
			return color;
		}

		@Override
		public abstract void render(@Nonnull IElement element, @Nonnull VertexBuffer buffer);
	}
}
