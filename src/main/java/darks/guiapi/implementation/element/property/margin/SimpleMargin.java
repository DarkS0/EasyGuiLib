package darks.guiapi.implementation.element.property.margin;

import darks.guiapi.api.element.property.IMargin;

public class SimpleMargin implements IMargin
{
	private float up, right, down, left;

	public SimpleMargin(float up, float right, float down, float left)
	{
		this.up = up;
		this.right = right;
		this.down = down;
		this.left = left;
	}

	@Override
	public float getUp()
	{
		return up;
	}

	@Override
	public void setUp(float up)
	{
		this.up = up;
	}

	@Override
	public float getRight()
	{
		return right;
	}

	@Override
	public void setRight(float right)
	{
		this.right = right;
	}

	@Override
	public float getDown()
	{
		return down;
	}

	@Override
	public void setDown(float down)
	{
		this.down = down;
	}

	@Override
	public float getLeft()
	{
		return left;
	}

	@Override
	public void setLeft(float left)
	{
		this.left = left;
	}
}
