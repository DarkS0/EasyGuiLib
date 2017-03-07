package com.guilib.core;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import com.guilib.core.gui.ContainerEnhanced;
import com.guilib.core.gui.GuiContainerEnhanced;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;

public class GuiLibHandler implements IGuiHandler{
	
	private static List<Class<? extends GuiEnhanced>>	REGISTRY=new ArrayList<>();
	private static boolean								LOCKED	=false;
	
	public static void registerGui(Class<? extends GuiEnhanced> gui){
		if(!LOCKED&&!REGISTRY.contains(gui)) REGISTRY.add(gui);
	}
	
	public static void lock(){
		LOCKED=true;
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){
		
		return new ContainerEnhanced(getNew(ID,new BlockPos(x, y, z)));
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){
		
		return new GuiContainerEnhanced(getNew(ID,new BlockPos(x, y, z)));
	}
	
	private GuiEnhanced getNew(int id,BlockPos pos){
		Constructor<? extends GuiEnhanced> constructor;
		try{
			constructor=REGISTRY.get(id).getDeclaredConstructor(BlockPos.class);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		try{
			return constructor.newInstance(pos);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	public static void openGui(EntityPlayer player, Class<? extends GuiEnhanced> gui, Vec3i pos){
		openGui(player, gui, pos.getX(), pos.getY(), pos.getZ());
	}
	public static void openGui(EntityPlayer player, Class<? extends GuiEnhanced> gui, int x, int y, int z){
		if(player.world.isRemote) return;
		
		int id=REGISTRY.indexOf(gui);
		if(id==-1) throw new IllegalArgumentException("This gui is not registered!");
		
		FMLNetworkHandler.openGui(player, GuiLib.getGuiLib(), id, player.getEntityWorld(), x, y, z);
	}
}
