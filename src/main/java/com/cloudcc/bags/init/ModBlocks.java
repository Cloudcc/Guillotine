package com.cloudcc.bags.init;

import com.cloudcc.bags.blocks.chest.BlockChest;
import com.cloudcc.bags.blocks.chest.TileEntityBlockChest;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by hi112 on 28.08.2016.
 */
public class ModBlocks {


    public static Block chest;

    public static void init(){
        chest = new BlockChest();

    }

    public static void register(){

        registerBlock(chest);
        GameRegistry.registerTileEntity(TileEntityBlockChest.class, "block_chest");

    }

    private static void registerBlock(Block block){
        GameRegistry.register(block);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
    }

    public static void registerRender(){
        registerRender(chest);
    }

    private static void registerRender(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }


}
