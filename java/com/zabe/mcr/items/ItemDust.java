package com.zabe.mcr.items;

import com.zabe.mcr.mcr;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemDust extends Item {
	
	public ItemDust(String unlocalizedName, String registryName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(mcr.MODID, registryName));
		this.setCreativeTab(CreativeTabs.MATERIALS);
	}

}
