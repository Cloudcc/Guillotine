package com.cloudcc.bags.init;

import com.cloudcc.bags.item.ItemStructureSpawner;
import com.sun.org.apache.xml.internal.security.encryption.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by hi112 on 28.08.2016.
 */
public class ModItems {

    public static Item structure_spawner;

    public static void init(){
        structure_spawner = new ItemStructureSpawner();
    }

    public static void register(){
        GameRegistry.registerItem(structure_spawner = new ItemStructureSpawner(), structure_spawner.getUnlocalizedName().substring(5));


    }

    public static void registerRenders(){
        registerRender(structure_spawner);

    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(com.cloudcc.bags.Reference.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
    }
}
