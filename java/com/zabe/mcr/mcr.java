package com.zabe.mcr;

import com.zabe.mcr.handlers.RecipeHandler;
import com.zabe.mcr.init.ModBlocks;
import com.zabe.mcr.init.ModItems;
import com.zabe.mcr.proxy.CommonProxy;
import com.zabe.mcr.util.Utils;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = mcr.MODID, version = mcr.VERSION)
public class mcr{
	//set modid and version that are referenced in mcmod.info
    public static final String MODID = "mcr";
    public static final String VERSION = "1.0";
    
    @Mod.Instance(MODID)
    public static mcr instance;
    
    //proxy class locations
    public static final String SERVER_PROXY_CLASS = "com.zabe.mcr.proxy.CommonProxy";
    public static final String CLIENT_PROXY_CLASS = "com.zabe.mcr.proxy.ClientProxy";
    
    //proxy sides
    @SidedProxy(serverSide = SERVER_PROXY_CLASS, clientSide = CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    	//pre-initializes mod
    	Utils.getLogger().info("MCR Pre-Initialization");
    	
    	ModItems.init();
    	ModBlocks.init();
    	ModItems.register();
    	ModBlocks.register();
    	
    	proxy.RegisterRenders();
    	proxy.registerTileEntities();
    	proxy.registerModelBakeryVariants();
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	//initializes mod
    	
    	RecipeHandler.registerCraftingRecipes();
    	RecipeHandler.registerFurnaceRecipes();
    	
    	Utils.getLogger().info("MCR Initialization");
        
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {
    	//post-initializes mod
    	Utils.getLogger().info("MCR Post-Initialization");
    	
    }
}
