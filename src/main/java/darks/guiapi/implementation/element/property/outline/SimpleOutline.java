package darks.guiapi.implementation.element.property.outline;

import darks.guiapi.api.element.IElement;
import darks.guiapi.api.element.property.IOutline;
import darks.guiapi.util.Color;
import net.minecraft.client.renderer.VertexBuffer;

import javax.annotation.Nonnull;

public class SimpleOutline implements IOutline
{
	private float width;
	@Nonnull
	private IFillStyle fillStyle;

	public SimpleOutline(float width, @Nonnull IFillStyle fillStyle)
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
	public void setWidth(float width)
	{
		this.width = width;
	}

	@Nonnull
	@Override
	public IFillStyle getFillStyle()
	{
		return fillStyle;
	}

	@Override
	public void setFillStyle(IFillStyle fillStyle)
	{
		this.fillStyle = fillStyle;
	}

	public static abstract class SimpleFillStyle implements IFillStyle
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
