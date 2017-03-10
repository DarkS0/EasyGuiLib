package com.guilib.api.element.property;

import net.minecraft.client.renderer.VertexBuffer;

import javax.annotation.Nonnull;

import com.guilib.api.element.IElement;
import com.guilib.util.Color;

public interface IOutline
{
	void render(@Nonnull IElement element, @Nonnull VertexBuffer buffer);

	float getWidth();

	void setWidth(float width);

	IOutlineFill getFillStyle();

	void setFillStyle(IOutlineFill fillStyle);

	interface IOutlineFill
	{
		Color getColor();

		void render(@Nonnull IElement element, @Nonnull VertexBuffer buffer);
	}
}
