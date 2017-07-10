package com.zabe.mcr.blocks;

import com.zabe.mcr.mcr;
import com.zabe.mcr.tileentity.TileEntityStoneCutter;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class StoneCutter extends Block implements ITileEntityProvider {

	public StoneCutter(String unlocalizedName, String registryName) {
		super(Material.ROCK);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(mcr.MODID, registryName));
		this.setCreativeTab(CreativeTabs.DECORATIONS);
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {

		return new TileEntityStoneCutter();
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		 
		return new TileEntityStoneCutter() ;
	}

	

}
