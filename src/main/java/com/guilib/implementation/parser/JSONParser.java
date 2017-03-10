package com.guilib.implementation.parser;

import com.guilib.api.parser.GuiParserException;
import com.guilib.api.parser.IParser;

import javax.annotation.Nonnull;
import java.util.List;

public class JSONParser implements IParser
{
	@Nonnull
	@Override
	public List<Object> parseString(@Nonnull String s) throws GuiParserException
	{
		return null;
	}
}
