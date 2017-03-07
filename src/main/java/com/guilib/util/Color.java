package com.guilib.util;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Color
{
	private float red, green, blue, alpha;

	public Color()
	{
		this(0f, 0f, 0f, 0f);
	}

	public Color(java.awt.Color color)
	{
		this(color.getRed() / 255f, color.getGreen() / 255f, color.getBlue() / 255f, color.getAlpha() / 255f);
	}

	public Color(Color color)
	{
		this(color.red(), color.green(), color.blue(), color.alpha());
	}

	public Color(double red, double green, double blue)
	{
		this((float) red, (float) green, (float) blue, 1f);
	}

	public Color(double red, double green, double blue, double alpha)
	{
		this((float) red, (float) green, (float) blue, (float) alpha);
	}

	public Color(float red, float green, float blue)
	{
		this(red, green, blue, 1f);
	}

	public Color(float red, float green, float blue, float alpha)
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.alpha = alpha;
	}

	public float red()
	{
		return red;
	}

	public void red(float red)
	{
		this.red = MathHelper.clamp(red, 0, 1);
	}

	public float green()
	{
		return green;
	}

	public void green(float green)
	{
		this.green = MathHelper.clamp(green, 0, 1);
	}

	public float blue()
	{
		return blue;
	}

	public void blue(float blue)
	{
		this.blue = MathHelper.clamp(blue, 0, 1);
	}

	public float alpha()
	{
		return alpha;
	}

	public void alpha(float alpha)
	{
		this.alpha = MathHelper.clamp(alpha, 0, 1);
	}

	public Color add(float var)
	{
		red(red + var);
		green(green + var);
		blue(blue + var);
		alpha(alpha + var);
		return this;
	}

	public Color addRed(float red)
	{
		red(this.red + red);
		return this;
	}

	public Color addGreen(float green)
	{
		green(this.green + green);
		return this;
	}

	public Color addBlue(float blue)
	{
		blue(this.blue + blue);
		return this;
	}

	public Color addAlpha(float alpha)
	{
		alpha(this.alpha + alpha);
		return this;
	}

	public Color add(Color color)
	{
		red(red + color.red);
		green(green + color.green);
		blue(blue + color.blue);
		alpha(alpha + color.alpha);
		return this;
	}

	public Color div(float var)
	{
		red(red / var);
		green(green / var);
		blue(blue / var);
		alpha(alpha / var);
		return this;
	}

	public Color divRed(float red)
	{
		red(this.red / red);
		return this;
	}

	public Color divGreen(float green)
	{
		green(this.green / green);
		return this;
	}

	public Color divBlue(float blue)
	{
		blue(this.blue / blue);
		return this;
	}

	public Color divAlpha(float alpha)
	{
		alpha(this.alpha / alpha);
		return this;
	}

	public Color div(Color color)
	{
		red(red / color.red);
		green(green / color.green);
		blue(blue / color.blue);
		alpha(alpha / color.alpha);
		return this;
	}

	public Color mul(float var)
	{
		red(red * var);
		green(green * var);
		blue(blue * var);
		alpha(alpha * var);
		return this;
	}

	public Color mulRed(float red)
	{
		red(this.red * red);
		return this;
	}

	public Color mulGreen(float green)
	{
		green(this.green * green);
		return this;
	}

	public Color mulBlue(float blue)
	{
		blue(this.blue * blue);
		return this;
	}

	public Color mulAlpha(float alpha)
	{
		alpha(this.alpha * alpha);
		return this;
	}

	public Color mul(Color color)
	{
		red(red * color.red);
		green(green * color.green);
		blue(blue * color.blue);
		alpha(alpha * color.alpha);
		return this;
	}

	public Color sub(float sub)
	{
		red(red - sub);
		green(green - sub);
		blue(blue - sub);
		alpha(alpha - sub);
		return this;
	}

	public Color subRed(float red)
	{
		red(this.red - red);
		return this;
	}

	public Color subGreen(float green)
	{
		green(this.green - green);
		return this;
	}

	public Color subBlue(float blue)
	{
		blue(this.blue - blue);
		return this;
	}

	public Color subAlpha(float alpha)
	{
		alpha(alpha() - alpha);
		return this;
	}

	public Color sub(Color color)
	{
		red(red - color.red);
		green(green - color.green);
		blue(blue - color.blue);
		alpha(alpha - color.alpha);
		return this;
	}

	public Color copy()
	{
		return new Color(red(), green(), blue(), alpha());
	}

	public java.awt.Color toAWT()
	{
		return new java.awt.Color(red, green, blue, alpha);
	}

	@SideOnly(Side.CLIENT)
	public void bind(float alpha)
	{
		GlStateManager.color(red, green, blue, alpha);
	}

	@SideOnly(Side.CLIENT)
	public void bind()
	{
		GlStateManager.color(red, green, blue, alpha);
	}
}
