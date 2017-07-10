package com.zabe.mcr.init;

import com.zabe.mcr.mcr;
import com.zabe.mcr.blocks.StoneCutter;
import com.zabe.mcr.blocks.block_andesite_encient_bricks;
import com.zabe.mcr.blocks.block_andesite_layered_bricks;
import com.zabe.mcr.blocks.block_carved_andesite;
import com.zabe.mcr.blocks.block_carved_diorite;
import com.zabe.mcr.blocks.block_carved_granite;
import com.zabe.mcr.blocks.block_carved_red_sandstone;
import com.zabe.mcr.blocks.block_carved_sandstone;
import com.zabe.mcr.blocks.block_cobbled_andesite;
import com.zabe.mcr.blocks.block_cobbled_diorite;
import com.zabe.mcr.blocks.block_cobbled_granite;
import com.zabe.mcr.blocks.block_cobbled_red_sandstone;
import com.zabe.mcr.blocks.block_cobbled_sandstone;
import com.zabe.mcr.blocks.block_diorite_encient_bricks;
import com.zabe.mcr.blocks.block_diorite_layered_bricks;
import com.zabe.mcr.blocks.block_granite_encient_bricks;
import com.zabe.mcr.blocks.block_granite_layered_bricks;
import com.zabe.mcr.blocks.block_mossy_andesite_encient_bricks;
import com.zabe.mcr.blocks.block_mossy_cobbled_andesite;
import com.zabe.mcr.blocks.block_mossy_cobbled_diorite;
import com.zabe.mcr.blocks.block_mossy_cobbled_granite;
import com.zabe.mcr.blocks.block_mossy_cobbled_red_sandstone;
import com.zabe.mcr.blocks.block_mossy_cobbled_sandstone;
import com.zabe.mcr.blocks.block_mossy_diorite_encient_bricks;
import com.zabe.mcr.blocks.block_mossy_granite_encient_bricks;
import com.zabe.mcr.blocks.block_mossy_red_sandstone_encient_bricks;
import com.zabe.mcr.blocks.block_mossy_sandstone_encient_bricks;
import com.zabe.mcr.blocks.block_red_sandstone_encient_bricks;
import com.zabe.mcr.blocks.block_red_sandstone_layered_bricks;
import com.zabe.mcr.blocks.block_sandstone_encient_bricks;
import com.zabe.mcr.blocks.block_sandstone_layered_bricks;
import com.zabe.mcr.util.Utils;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block stone_cutter;
	
	public static Block cobbled_sandstone;
	public static Block mossy_cobbled_sandstone;
	public static Block sandstone_layered_bricks;
	public static Block sandstone_encient_bricks;
	public static Block mossy_sandstone_encient_bricks;
	public static Block carved_sandstone;
	
	public static Block cobbled_diorite;
	public static Block mossy_cobbled_diorite;
	public static Block diorite_layered_bricks;
	public static Block diorite_encient_bricks;
	public static Block mossy_diorite_encient_bricks;
	public static Block carved_diorite;
	
	public static Block cobbled_granite;
	public static Block mossy_cobbled_granite;
	public static Block granite_layered_bricks;
	public static Block granite_encient_bricks;
	public static Block mossy_granite_encient_bricks;
	public static Block carved_granite;
	
	public static Block cobbled_andesite;
	public static Block mossy_cobbled_andesite;
	public static Block andesite_layered_bricks;
	public static Block andesite_encient_bricks;
	public static Block mossy_andesite_encient_bricks;
	public static Block carved_andesite;
	
	public static Block cobbled_red_sandstone;
	public static Block mossy_cobbled_red_sandstone;
	public static Block red_sandstone_layered_bricks;
	public static Block red_sandstone_encient_bricks;
	public static Block mossy_red_sandstone_encient_bricks;
	public static Block carved_red_sandstone;
	

	public static void init() {
		
		stone_cutter = new StoneCutter("stone_cutter","stone_cutter");
		
		cobbled_sandstone = new block_cobbled_sandstone("cobbled_sandstone", "cobbled_sandstone");
		mossy_cobbled_sandstone = new block_mossy_cobbled_sandstone("mossy_cobbled_sandstone", "mossy_cobbled_sandstone");
		sandstone_layered_bricks = new block_sandstone_layered_bricks("sandstone_layered_bricks", "sandstone_layered_bricks");
		sandstone_encient_bricks = new block_sandstone_encient_bricks("sandstone_encient_bricks","sandstone_encient_bricks");
		mossy_sandstone_encient_bricks = new block_mossy_sandstone_encient_bricks("mossy_sandstone_encient_bricks", "mossy_sandstone_encient_bricks");
		carved_sandstone = new block_carved_sandstone("carved_sandstone","carved_sandstone");
		
		cobbled_diorite = new block_cobbled_diorite("cobbled_diorite", "cobbled_diorite");
		mossy_cobbled_diorite = new block_mossy_cobbled_diorite("mossy_cobbled_diorite", "mossy_cobbled_diorite");
		diorite_layered_bricks = new block_diorite_layered_bricks("diorite_layered_bricks", "diorite_layered_bricks");
		diorite_encient_bricks = new block_diorite_encient_bricks("diorite_encient_bricks","diorite_encient_bricks");
		mossy_diorite_encient_bricks = new block_mossy_diorite_encient_bricks("mossy_diorite_encient_bricks", "mossy_diorite_encient_bricks");
		carved_diorite = new block_carved_diorite("carved_diorite","carved_diorite");
		
		cobbled_granite = new block_cobbled_granite("cobbled_granite", "cobbled_granite");
		mossy_cobbled_granite = new block_mossy_cobbled_granite("mossy_cobbled_granite", "mossy_cobbled_granite");
		granite_layered_bricks = new block_granite_layered_bricks("granite_layered_bricks", "granite_layered_bricks");
		granite_encient_bricks = new block_granite_encient_bricks("granite_encient_bricks","granite_encient_bricks");
		mossy_granite_encient_bricks = new block_mossy_granite_encient_bricks("mossy_granite_encient_bricks", "mossy_granite_encient_bricks");
		carved_granite = new block_carved_granite("carved_granite","carved_granite");
		
		cobbled_andesite = new block_cobbled_andesite("cobbled_andesite", "cobbled_andesite");
		mossy_cobbled_andesite = new block_mossy_cobbled_andesite("mossy_cobbled_andesite", "mossy_cobbled_andesite");
		andesite_layered_bricks = new block_andesite_layered_bricks("andesite_layered_bricks", "andesite_layered_bricks");
		andesite_encient_bricks = new block_andesite_encient_bricks("andesite_encient_bricks","andesite_encient_bricks");
		mossy_andesite_encient_bricks = new block_mossy_andesite_encient_bricks("mossy_andesite_encient_bricks", "mossy_andesite_encient_bricks");
		carved_andesite = new block_carved_andesite("carved_andesite","carved_andesite");
		
		cobbled_red_sandstone = new block_cobbled_red_sandstone("cobbled_red_sandstone", "cobbled_red_sandstone");
		mossy_cobbled_red_sandstone = new block_mossy_cobbled_red_sandstone("mossy_cobbled_red_sandstone", "mossy_cobbled_red_sandstone");
		red_sandstone_layered_bricks = new block_red_sandstone_layered_bricks("red_sandstone_layered_bricks", "red_sandstone_layered_bricks");
		red_sandstone_encient_bricks = new block_red_sandstone_encient_bricks("red_sandstone_encient_bricks","red_sandstone_encient_bricks");
		mossy_red_sandstone_encient_bricks = new block_mossy_red_sandstone_encient_bricks("mossy_red_sandstone_encient_bricks", "mossy_red_sandstone_encient_bricks");
		carved_red_sandstone = new block_carved_red_sandstone("carved_red_sandstone","carved_red_sandstone");
		
	}
	
	public static void register() {
		
		registerBlock(stone_cutter);
		
		registerBlock(cobbled_sandstone);
		registerBlock(mossy_cobbled_sandstone);
		registerBlock(sandstone_layered_bricks);
		registerBlock(sandstone_encient_bricks);
		registerBlock(mossy_sandstone_encient_bricks);
		registerBlock(carved_sandstone);
		
		registerBlock(cobbled_diorite);
		registerBlock(mossy_cobbled_diorite);
		registerBlock(diorite_layered_bricks);
		registerBlock(diorite_encient_bricks);
		registerBlock(mossy_diorite_encient_bricks);
		registerBlock(carved_diorite);
		
		registerBlock(cobbled_granite);
		registerBlock(mossy_cobbled_granite);
		registerBlock(granite_layered_bricks);
		registerBlock(granite_encient_bricks);
		registerBlock(mossy_granite_encient_bricks);
		registerBlock(carved_granite);
		
		registerBlock(cobbled_andesite);
		registerBlock(mossy_cobbled_andesite);
		registerBlock(andesite_layered_bricks);
		registerBlock(andesite_encient_bricks);
		registerBlock(mossy_andesite_encient_bricks);
		registerBlock(carved_andesite);
		
		registerBlock(cobbled_red_sandstone);
		registerBlock(mossy_cobbled_red_sandstone);
		registerBlock(red_sandstone_layered_bricks);
		registerBlock(red_sandstone_encient_bricks);
		registerBlock(mossy_red_sandstone_encient_bricks);
		registerBlock(carved_red_sandstone);
		
	}
	
	public static void registerRenders() {
		
		registerRender(stone_cutter);
		
		registerRender(cobbled_sandstone);
		registerRender(mossy_cobbled_sandstone);
		registerRender(sandstone_layered_bricks);
		registerRender(sandstone_encient_bricks);
		registerRender(mossy_sandstone_encient_bricks);
		registerRender(carved_sandstone);
		
		registerRender(cobbled_diorite);
		registerRender(mossy_cobbled_diorite);
		registerRender(diorite_layered_bricks);
		registerRender(diorite_encient_bricks);
		registerRender(mossy_diorite_encient_bricks);
		registerRender(carved_diorite);
		
		registerRender(cobbled_granite);
		registerRender(mossy_cobbled_granite);
		registerRender(granite_layered_bricks);
		registerRender(granite_encient_bricks);
		registerRender(mossy_granite_encient_bricks);
		registerRender(carved_granite);
		
		registerRender(cobbled_andesite);
		registerRender(mossy_cobbled_andesite);
		registerRender(andesite_layered_bricks);
		registerRender(andesite_encient_bricks);
		registerRender(mossy_andesite_encient_bricks);
		registerRender(carved_andesite);
		
		registerRender(cobbled_red_sandstone);
		registerRender(mossy_cobbled_red_sandstone);
		registerRender(red_sandstone_layered_bricks);
		registerRender(red_sandstone_encient_bricks);
		registerRender(mossy_red_sandstone_encient_bricks);
		registerRender(carved_red_sandstone);
		
	}
	
	 public static void registerBlock(Block block) {
		 
		 GameRegistry.register(block);
		 GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		 Utils.getLogger().info("registered block" + block.getUnlocalizedName().substring(5));
		 
	 }
	 
	 public static void registerRender(Block block) {
		 
		 ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(mcr.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
		 Utils.getLogger().info("registered render for " + block.getUnlocalizedName().substring(5));
		 
	 }
	
}
