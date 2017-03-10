package com.guilib.api.parser;

import javax.annotation.Nonnull;
import java.util.List;

public interface IParser
{
	@Nonnull
	List<Object> parseString(@Nonnull String s) throws GuiParserException;
}
