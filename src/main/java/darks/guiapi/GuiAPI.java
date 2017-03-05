package darks.guiapi;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GuiAPI.MOD_ID, name = GuiAPI.MOD_NAME, version = GuiAPI.VERSION)
public class GuiAPI
{
	public static final String MOD_ID = "guiapi";
	public static final String MOD_NAME = "GuiAPI";
	public static final String VERSION = "0.0.0";

	@Mod.Instance(MOD_ID)
	public static GuiAPI INSTANCE;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
