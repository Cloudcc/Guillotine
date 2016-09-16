package com.cloudcc.bags.proxy;

import com.cloudcc.bags.Bags;
import com.cloudcc.bags.handlers.GuiHandler;
import com.cloudcc.bags.init.ModBlocks;
import net.minecraftforge.fml.common.network.NetworkRegistry;

/**
 * Created by hi112 on 27.08.2016.
 */
public class ClientProxy implements CommonProxy {
    @Override
    public void init() {

        ModBlocks.registerRender();

    }

    public void registerGuiHandler(){
        NetworkRegistry.INSTANCE.registerGuiHandler(Bags.instance, new GuiHandler());
    }
}
