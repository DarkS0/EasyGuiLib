package darks.guiapi.api.implementation.element.property.outline;

import darks.guiapi.api.element.IElement;
import darks.guiapi.api.element.property.IOutline;
import net.minecraft.client.renderer.VertexBuffer;

import javax.annotation.Nonnull;

public class SimpleOutline implements IOutline
{
	private float width;
	private int color;
	@Nonnull
	private IFillStyle fillStyle;

	public SimpleOutline(float width, int color, @Nonnull IFillStyle fillStyle)
	{
		this.width = width;
		this.color = color;
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

	@Override
	public int getColor()
	{
		return color;
	}

	@Override
	public void setColor(int color)
	{
		this.color = color;
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
		private int color;

		public SimpleFillStyle(int color)
		{
			this.color = color;
		}

		@Override
		public int getColor()
		{
			return color;
		}

		@Override
		public abstract void render(@Nonnull IElement element, @Nonnull VertexBuffer buffer);
	}
}
