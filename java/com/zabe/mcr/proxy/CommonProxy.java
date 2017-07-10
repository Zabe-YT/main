package com.zabe.mcr.proxy;

import com.zabe.mcr.mcr;
import com.zabe.mcr.tileentity.TileEntityStoneCutter;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityStoneCutter.class, mcr.MODID+":stone_cutter");
	}
	
	public void RegisterRenders() {
		
	}
	
	public void registerModelBakeryVariants() {
		 
	}

}
