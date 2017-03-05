package com.darks.guiapi.api.element.property;

import com.darks.guiapi.api.element.IElement;

public interface IOutline
{
	float getWidth();

	void setWidth(float amount);

	int getColor();

	void setColor(int color);

	IFillStyle getFillStyle();

	void setFillStyle(IFillStyle fillStyle);

	interface IFillStyle
	{
		void render(IElement element);
	}
}
