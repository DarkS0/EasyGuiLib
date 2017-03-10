package com.guilib.api.element.property;

import com.guilib.api.element.IElement;
import com.guilib.util.Color;
import net.minecraft.client.renderer.VertexBuffer;

import javax.annotation.Nonnull;

public interface IPadding
{
	void render(@Nonnull IElement element, @Nonnull VertexBuffer buffer);

	float getUp();

	IPadding setUp(float up);

	float getRight();

	IPadding setRight(float right);

	float getDown();

	IPadding setDown(float down);

	float getLeft();

	IPadding setLeft(float left);

	IPaddingFill getFillStyle();

	IPadding setFillStyle(IPaddingFill fillStyle);

	interface IPaddingFill
	{
		Color getColor();

		void render(@Nonnull IElement element, @Nonnull VertexBuffer buffer);
	}
}
