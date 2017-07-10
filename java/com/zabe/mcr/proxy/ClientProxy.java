package com.zabe.mcr.proxy;

import com.zabe.mcr.mcr;
import com.zabe.mcr.init.ModBlocks;
import com.zabe.mcr.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void RegisterRenders() {
		
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}
	
	 @Override
	public void registerModelBakeryVariants() {
		 ModelBakery.registerItemVariants(ModItems.mold, new ResourceLocation(mcr.MODID, "mold_empty"), new ResourceLocation(mcr.MODID, "mold_chiseled1"), new ResourceLocation(mcr.MODID, "mold_chiseled2"), new ResourceLocation(mcr.MODID, "mold_chiseled3"), new ResourceLocation(mcr.MODID, "mold_encient_bricks"), new ResourceLocation(mcr.MODID, "mold_layered_bricks"), new ResourceLocation(mcr.MODID, "mold_cobbled"), new ResourceLocation(mcr.MODID, "mold_smooth"));
	}
	
}
