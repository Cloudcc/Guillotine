package com.cloudcc.bags;

import com.cloudcc.bags.init.ModBlocks;
import com.cloudcc.bags.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by hi112 on 27.08.2016.
 */
@Mod(modid = Bags.MODID,version = Bags.VERSION, name = Bags.NAME)
public class Bags {

    public static final String MODID = "Bags";
    public static final String NAME = "Bags";
    public static final String VERSION = "0.1";
    public static final String CLIENT_PROXY = "com.cloudcc.bags.proxy.ClientProxy";
    public static final String SERVER_PROXY = "com.cloudcc.bags.proxy.ServerProxy";

    @SidedProxy(clientSide = Bags.CLIENT_PROXY, serverSide = Bags.SERVER_PROXY )
    public static CommonProxy proxy;

    @Mod.Instance
    public static Bags instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        System.out.println("Hallo Minecraft");
        ModBlocks.init();
        ModBlocks.register();

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        proxy.registerGuiHandler();
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }


}
