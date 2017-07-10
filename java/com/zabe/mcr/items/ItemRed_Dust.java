package com.zabe.mcr.items;

import com.zabe.mcr.mcr;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemRed_Dust extends Item {
	
	public ItemRed_Dust(String unlocalizedName, String registryName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(mcr.MODID, registryName));
		this.setCreativeTab(CreativeTabs.MATERIALS);
	}

}
