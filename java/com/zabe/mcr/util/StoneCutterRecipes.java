package com.zabe.mcr.util;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

import net.minecraft.item.ItemStack;

public class StoneCutterRecipes {

	private static final StoneCutterRecipes CUTTING = new StoneCutterRecipes();
	
	private final Table<ItemStack, ItemStack, ItemStack> stoneCutterList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float >newHashMap();
	
	public static StoneCutterRecipes instance() {
		return CUTTING;
	}
	
	private StoneCutterRecipes() {
		
	}
	
	public void addStoneCutterRecipe(ItemStack blockIn, ItemStack moldIn, ItemStack result, float experience) {
		
		if(getStoneCutterResult(blockIn, moldIn) != null)	{
			}
		this.stoneCutterList.put(blockIn, moldIn, result);
		this.experienceList.put(result, Float.valueOf(experience)); 
	
		}
	
	public ItemStack getStoneCutterResult(ItemStack blockIn, ItemStack moldIn) {
		
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.stoneCutterList.columnMap().entrySet())
			if(this.compareItemStacks(blockIn, (ItemStack)entry.getKey()))
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
					if(this.compareItemStacks(moldIn, (ItemStack)ent.getKey()))
						return (ItemStack)ent.getValue();
		return null;
		
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
		return stack2.getItem() == stack2.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getStoneCutterList() {
		return this.stoneCutterList;
	}
	
	public float getStoneCutterExperience(ItemStack stack) {
		for(Entry<ItemStack, Float> entry : this.experienceList.entrySet())
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey()))
					return ((Float)entry.getValue()).floatValue();
		return 0.0F;
	}
	
}
