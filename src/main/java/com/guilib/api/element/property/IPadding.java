package com.guilib.api.element.property;

import com.guilib.api.element.IElement;
import com.guilib.util.Color;
import net.minecraft.client.renderer.VertexBuffer;

import javax.annotation.Nonnull;

public interface IPadding
{
	void render(@Nonnull IElement element, @Nonnull VertexBuffer buffer);

	float getUp();

	void setUp(float up);

	float getRight();

	void setRight(float right);

	float getDown();

	void setDown(float down);

	float getLeft();

	void setLeft(float left);

	IPaddingFill getFillStyle();

	void setFillStyle(IPaddingFill fillStyle);

	interface IPaddingFill
	{
		Color getColor();

		void render(@Nonnull IElement element, @Nonnull VertexBuffer buffer);
	}
}
