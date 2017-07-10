package com.zabe.mcr.tileentity;

import com.zabe.mcr.util.Utils;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityStoneCutter extends TileEntity implements ITickable {

	private int cooldown;
	
	public TileEntityStoneCutter() {
		this.cooldown=0;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		this.cooldown = nbt.getInteger("Cooldown");
		super.readFromNBT(nbt);
	}
	
	@Override
	public NBTTagCompound writeToNBT (NBTTagCompound nbt) {
		nbt.setInteger("Cooldown", this.cooldown); 
		return super.writeToNBT(nbt);
	}

	@Override
	public void update() {
		this.cooldown++;
		this.cooldown %= 100;
		Utils.getLogger().info("Stone Cutter cooldown: "+this.cooldown);
	}
	
	@Override
	public SPacketUpdateTileEntity getUpdatePacket() {
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);
		int metadata = getBlockMetadata();
		return new SPacketUpdateTileEntity(this.pos, metadata, nbt);
	}
	
	@Override
	public void onDataPacket(NetworkManager net,SPacketUpdateTileEntity pkt) {
		this.readFromNBT(pkt.getNbtCompound());
	}
	
	@Override
	public NBTTagCompound getUpdateTag() {
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);
		return nbt;
	}
	
	@Override
	public void handleUpdateTag(NBTTagCompound tag) {
		this.readFromNBT(tag);
	}
	
	@Override
	public NBTTagCompound getTileData() {
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);
		return nbt;
	}
	
}
