package com.zabe.mcr.init;

import com.zabe.mcr.mcr;
import com.zabe.mcr.handlers.EnumHandler;
import com.zabe.mcr.items.ItemAndesite;
import com.zabe.mcr.items.ItemDiorite;
import com.zabe.mcr.items.ItemDust;
import com.zabe.mcr.items.ItemGranite;
import com.zabe.mcr.items.ItemMold;
import com.zabe.mcr.items.ItemRed_Dust;
import com.zabe.mcr.items.ItemRock;
import com.zabe.mcr.util.Utils;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item rock;
	public static Item dust;
	public static Item red_dust;
	public static Item diorite_chunk;
	public static Item granite_chunk;
	public static Item andesite_chunk;
	
	public static Item mold;
	
	public static void init() {
		
		rock = new ItemRock("rock","rock");
		dust = new ItemDust("dust","dust");
		red_dust = new ItemRed_Dust("red_dust","red_dust");
		diorite_chunk = new ItemDiorite("diorite_chunk","diorite_chunk");
		granite_chunk = new ItemGranite("granite_chunk","granite_chunk");
		andesite_chunk = new ItemAndesite("andesite_chunk","andesite_chunk");
		
		mold = new ItemMold("mold","mold");
		
	}
	
	public static void register() {
		
		registerItem(rock);
		registerItem(dust);
		registerItem(red_dust);
		registerItem(diorite_chunk);
		registerItem(granite_chunk);
		registerItem(andesite_chunk);
		
		registerItem(mold);
		
	}
	
	public static void registerRenders() {
		
		registerRender(rock);
		registerRender(dust);
		registerRender(red_dust);
		registerRender(diorite_chunk);
		registerRender(granite_chunk);
		registerRender(andesite_chunk);
		
		for(int i=0; i < EnumHandler.MoldTypes.values().length; i++) {
			 registerRender(mold, i, "mold_" + EnumHandler.MoldTypes.values()[i].getName());
		}
		
	}
	
	public static void registerItem(Item item) {
		
		GameRegistry.register(item);
		Utils.getLogger().info("registered item " + item.getUnlocalizedName().substring(5));
	
	}
	
	public static void registerRender(Item item) {
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(mcr.MODID,item.getUnlocalizedName().substring(5)),"inventory"));
		Utils.getLogger().info("register render for " + item.getUnlocalizedName().substring(5));
	
	}
	
public static void registerRender(Item item, int meta, String fileName) {
		
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(mcr.MODID,fileName),"inventory"));
		Utils.getLogger().info("register render for " + item.getUnlocalizedName().substring(5));
	
	}
	
}