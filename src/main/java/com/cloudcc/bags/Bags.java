package com.cloudcc.bags;

import com.cloudcc.bags.init.ModBlocks;
import com.cloudcc.bags.init.ModItems;
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
@Mod(modid = Reference.MODID,version = Reference.VERSION, name = Reference.NAME)
public class Bags {



    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY )
    public static CommonProxy proxy;

    @Mod.Instance
    public static Bags instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        System.out.println("Hallo Minecraft");
        ModBlocks.init();
        ModBlocks.register();
        ModItems.init();
        ModItems.register();

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
