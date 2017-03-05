package darks.guiapi.api.element.property;

import darks.guiapi.api.element.IElement;
import darks.guiapi.util.Color;
import net.minecraft.client.renderer.VertexBuffer;

import javax.annotation.Nonnull;

public interface IOutline
{
	void render(@Nonnull IElement element, @Nonnull VertexBuffer buffer);

	float getWidth();

	void setWidth(float width);

	IFillStyle getFillStyle();

	void setFillStyle(IFillStyle fillStyle);

	interface IFillStyle
	{
		Color getColor();

		void render(@Nonnull IElement element, @Nonnull VertexBuffer buffer);
	}
}
