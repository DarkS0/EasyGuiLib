package com.guilib.implementation.element.property.outline;

import net.minecraft.client.renderer.VertexBuffer;

import javax.annotation.Nonnull;

import com.guilib.api.element.IElement;
import com.guilib.util.Color;

public class NoOutline extends SimpleOutline
{
	public NoOutline()
	{
		super(0, new NoFillStyle());
	}

	public static class NoFillStyle extends SimpleOutline.SimpleFillStyle
	{
		public NoFillStyle()
		{
			super(new Color());
		}

		@Override
		public void render(@Nonnull IElement element, @Nonnull VertexBuffer buffer)
		{

		}
	}
}
