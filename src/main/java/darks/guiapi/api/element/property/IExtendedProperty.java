package darks.guiapi.api.element.property;

import javax.annotation.Nonnull;

public interface IExtendedProperty<E>
{
	@Nonnull
	E getValue();

	void setValue(@Nonnull E value);
}
