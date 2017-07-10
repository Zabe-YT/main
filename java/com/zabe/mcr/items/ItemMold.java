package com.zabe.mcr.items;

import java.util.List;

import com.zabe.mcr.mcr;
import com.zabe.mcr.handlers.EnumHandler.MoldTypes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemMold extends Item {
	
	public ItemMold(String unlocalizedName, String registryName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(mcr.MODID, registryName));
		this.setCreativeTab(CreativeTabs.MATERIALS);
		
		this.setHasSubtypes(true);
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		
		for(int i = 0; i < MoldTypes.values().length; i++) {
			items.add(new ItemStack(item,1, i));
		}	
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		
		for(int i = 0; i < MoldTypes.values().length; i++) {
			if(stack.getItemDamage() == i) {
				 return this.getUnlocalizedName()+ "." + MoldTypes.values()[i].getName();
			}
			
			else {
				continue;
			}
		}
		return this.getUnlocalizedName() + "." + MoldTypes.EMPTY.getName();
	}
	
}
