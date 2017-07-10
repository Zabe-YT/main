 package com.zabe.mcr.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {
	
	public static enum MoldTypes implements IStringSerializable {
		EMPTY("empty", 0),
		CHISELED1("chiseled1", 1),
		CHISELED2("chiseled2", 2),
		CHISELED3("chiseled3", 3),
		ENCIENT_BRICKS("encient_bricks", 4),
		LAYERED_BRICKS("layered_bricks", 5),
		COBBLED("cobbled", 6),
		SMOOTH("smooth", 7);

		private int id;
		private String name;
		
		private MoldTypes(String name, int id) {
			
			 this.id=id;
			 this.name=name;
			
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getId() {
			return  id;
		}
		
		@Override
		public String toString() { 
			return getName(); 
		}
		
	}

}
