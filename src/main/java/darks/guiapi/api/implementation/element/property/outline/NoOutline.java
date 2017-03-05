package darks.guiapi.api.implementation.element.property.outline;

import darks.guiapi.api.element.IElement;
import net.minecraft.client.renderer.VertexBuffer;

import javax.annotation.Nonnull;

public class NoOutline extends SimpleOutline
{
	public NoOutline()
	{
		super(0, 0, new NoFillStyle());
	}

	public static class NoFillStyle extends SimpleOutline.SimpleFillStyle
	{
		public NoFillStyle()
		{
			super(0);
		}

		@Override
		public void render(@Nonnull IElement element, @Nonnull VertexBuffer buffer)
		{

		}
	}
}
