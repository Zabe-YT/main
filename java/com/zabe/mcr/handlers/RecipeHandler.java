package com.zabe.mcr.handlers;

import com.zabe.mcr.init.ModBlocks;
import com.zabe.mcr.init.ModItems;
import com.zabe.mcr.util.Utils;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.*;
import net.minecraft.init.Blocks;

public class RecipeHandler {
	
	public static void registerCraftingRecipes() {
		
		rockCrafting();
		
		Utils.getLogger().info("registered crafting recipes");
		
	}
	
	public static void registerFurnaceRecipes() {
		
		cobblesSmelting();
		
		Utils.getLogger().info("registered smelting recipes");
		
	}
	
	private static void rockCrafting() {
		stonesToRocks();
		cobblesToRocks();
		rocksToCobbles();
	}
	
	private static void stonesToRocks() {
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.andesite_chunk,4), new ItemStack(Blocks.STONE,1,5));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.diorite_chunk,4), new ItemStack(Blocks.STONE,1,3));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dust,4), new ItemStack(Blocks.SANDSTONE));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.granite_chunk,4), new ItemStack(Blocks.STONE,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.red_dust,4), new ItemStack(Blocks.RED_SANDSTONE));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.rock,4), new ItemStack(Blocks.STONE));
	}
	
	private static void cobblesToRocks() {
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.andesite_chunk,4), new ItemStack(ModBlocks.cobbled_andesite));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.diorite_chunk,4), new ItemStack(ModBlocks.cobbled_granite));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dust,4), new ItemStack(ModBlocks.cobbled_sandstone));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.granite_chunk,4), new ItemStack(ModBlocks.cobbled_granite));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.red_dust,4), new ItemStack(ModBlocks.cobbled_red_sandstone));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.rock,4), new ItemStack(Blocks.COBBLESTONE));
	}
	
	private static void rocksToCobbles() {
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.COBBLESTONE), new Object[] {"XX ","XX ","   ",'X',ModItems.rock});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.COBBLESTONE), new Object[] {" XX"," XX","   ",'X',ModItems.rock});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.COBBLESTONE), new Object[] {"   ","XX ","XX ",'X',ModItems.rock});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.COBBLESTONE), new Object[] {"   "," XX"," XX",'X',ModItems.rock});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_andesite), new Object[] {"XX ","XX ","   ",'X',ModItems.andesite_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_andesite), new Object[] {" XX"," XX","   ",'X',ModItems.andesite_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_andesite), new Object[] {"   ","XX ","XX ",'X',ModItems.andesite_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_andesite), new Object[] {"   "," XX"," XX",'X',ModItems.andesite_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_diorite), new Object[] {"XX ","XX ","   ",'X',ModItems.diorite_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_diorite), new Object[] {" XX"," XX","   ",'X',ModItems.diorite_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_diorite), new Object[] {"   ","XX ","XX ",'X',ModItems.diorite_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_diorite), new Object[] {"   "," XX"," XX",'X',ModItems.diorite_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_sandstone), new Object[] {"XX ","XX ","   ",'X',ModItems.dust});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_sandstone), new Object[] {" XX"," XX","   ",'X',ModItems.dust});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_sandstone), new Object[] {"   ","XX ","XX ",'X',ModItems.dust});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_sandstone), new Object[] {"   "," XX"," XX",'X',ModItems.dust});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_granite), new Object[] {"XX ","XX ","   ",'X',ModItems.granite_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_granite), new Object[] {" XX"," XX","   ",'X',ModItems.granite_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_granite), new Object[] {"   ","XX ","XX ",'X',ModItems.granite_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_granite), new Object[] {"   "," XX"," XX",'X',ModItems.granite_chunk});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_red_sandstone), new Object[] {"XX ","XX ","   ",'X',ModItems.red_dust});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_red_sandstone), new Object[] {" XX"," XX","   ",'X',ModItems.red_dust});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_red_sandstone), new Object[] {"   ","XX ","XX ",'X',ModItems.red_dust});
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cobbled_red_sandstone), new Object[] {"   "," XX"," XX",'X',ModItems.red_dust});
		
	}
	
	private static void cobblesSmelting() {
		GameRegistry.addSmelting(ModBlocks.cobbled_andesite, new ItemStack(Blocks.STONE,1,5), 0.7f);
		GameRegistry.addSmelting(ModBlocks.cobbled_granite, new ItemStack(Blocks.STONE,1,3), 0.7f);
		GameRegistry.addSmelting(ModBlocks.cobbled_granite, new ItemStack(Blocks.STONE,1,1), 0.7f);
		GameRegistry.addSmelting(ModBlocks.cobbled_red_sandstone, new ItemStack(Blocks.RED_SANDSTONE), 0.7f);
		GameRegistry.addSmelting(ModBlocks.cobbled_sandstone, new ItemStack(Blocks.SANDSTONE), 0.7f);
	}

}
