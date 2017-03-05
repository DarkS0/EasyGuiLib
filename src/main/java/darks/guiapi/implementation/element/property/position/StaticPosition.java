package darks.guiapi.implementation.element.property.position;

import darks.guiapi.api.element.property.IPosition;
import net.minecraft.util.math.Vec2f;

import javax.annotation.Nonnull;

public class StaticPosition implements IPosition
{
	private float x, y;

	public StaticPosition(float x, float y)
	{
		this.x = x;
		this.y = y;
	}

	@Nonnull
	@Override
	public Vec2f get()
	{
		return new Vec2f(x, y);
	}
}
