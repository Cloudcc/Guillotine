package com.cloudcc.bags.handlers;

import com.cloudcc.bags.blocks.chest.TileEntityBlockChest;
import com.cloudcc.bags.client.gui.GuiBlockChest;
import com.cloudcc.bags.container.ContainerBlockChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * Created by hi112 on 29.08.2016.
 */
public class GuiHandler implements IGuiHandler {

    public  static final int Block_CHEST = 0;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        if(ID == Block_CHEST){
            return new ContainerBlockChest(player.inventory, (TileEntityBlockChest) world.getTileEntity(new BlockPos(x, y, z)));
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == Block_CHEST){
            return new GuiBlockChest(player.inventory, (TileEntityBlockChest) world.getTileEntity(new BlockPos(x, y, z)));
        }
        return null;
    }
}
