package com.zabe.mcr.blocks;

import com.zabe.mcr.mcr;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class block_mossy_cobbled_granite extends Block {

	public block_mossy_cobbled_granite(String unlocalizedName, String registryName) {
		super(Material.ROCK);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(mcr.MODID, registryName));
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

}
