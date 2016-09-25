package com.cloudcc.bags.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by hi112 on 25.09.2016.
 */
public class ItemStructureSpawner extends Item {

    public ItemStructureSpawner(){
        this.setUnlocalizedName("structure_spawner");
        this.setCreativeTab(CreativeTabs.MISC);
        this.maxStackSize = 1;
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        //Bottom Layer
        for(int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                worldIn.setBlockState(new BlockPos(x + i, y, z + j), Blocks.PLANKS.getStateFromMeta(5));
            }
        }


        for(int i = 0; i <= 12; i++)
        {
            worldIn.setBlockState(new BlockPos(x - 1, y + 1, z + i), Blocks.OAK_FENCE.getDefaultState());
            worldIn.setBlockState(new BlockPos(x + 13, y + 1, z + i), Blocks.OAK_FENCE.getDefaultState());
            worldIn.setBlockState(new BlockPos(x + i, y + 1, z - 1), Blocks.OAK_FENCE.getDefaultState());
            worldIn.setBlockState(new BlockPos(x + i, y + 1, z + 13), Blocks.OAK_FENCE.getDefaultState());
        }


        for(int i = 0; i <= 12; i++) {
            for (int j = 0; j <= 12; j++) {
                worldIn.setBlockState(new BlockPos(x + i, y, z + j), Blocks.PLANKS.getStateFromMeta(5));
            }
        }

        for(int i = 5; i <= 7; i++) {
            worldIn.setBlockState(new BlockPos(x + 3, y + 1, z + i), Blocks.WOODEN_SLAB.getStateFromMeta(5));

        }
        for(int i = 4; i <= 10; i++)
        {
            for(int j = 3; j <= 9; j++){
                worldIn.setBlockState(new BlockPos(x + i, y + 1, z + j), Blocks.PLANKS.getStateFromMeta(5));
            }
        }

        for(int i = 2; i <= 4; i++) {
            worldIn.setBlockState(new BlockPos(x + 5, y + i, z + 3), Blocks.DARK_OAK_FENCE.getDefaultState());
            worldIn.setBlockState(new BlockPos(x + 10, y + i, z + 3), Blocks.DARK_OAK_FENCE.getDefaultState());
            worldIn.setBlockState(new BlockPos(x + 5, y + i, z + 9), Blocks.DARK_OAK_FENCE.getDefaultState());
            worldIn.setBlockState(new BlockPos(x + 10, y + i, z + 9), Blocks.DARK_OAK_FENCE.getDefaultState());
        }

        for(int i = 5; i <= 7; i++){
            worldIn.setBlockState(new BlockPos(x + 5, y + 2, z + i), Blocks.WOODEN_SLAB.getStateFromMeta(5));
        }

        for(int i = 4; i <= 8; i++) {
            for (int j = 6; j <= 9; j++) {
                worldIn.setBlockState(new BlockPos(x + j, y + 2, z + i), Blocks.PLANKS.getStateFromMeta(5));
            }
        }


       for(int i = 6; i <= 9; i++) {
            for (int j = 3; j <= 5; j++) {
                worldIn.setBlockState(new BlockPos(x + i, y + j, z + 4), Blocks.PLANKS.getStateFromMeta(5));
            }
        }
        for(int i = 4; i <= 8; i++)
        {
            for(int j = 3; j <= 5; j++){
                worldIn.setBlockState(new BlockPos(x + 9, y + j, z + i), Blocks.PLANKS.getStateFromMeta(5));
            }
        }


        for(int i = 6; i <= 9; i++) {
            for (int j = 3; j <= 5; j++) {
                worldIn.setBlockState(new BlockPos(x + i, y + j, z + 8), Blocks.PLANKS.getStateFromMeta(5));
            }
        }
        for(int i = 2; i <= 5; i++){
            worldIn.setBlockState(new BlockPos(x + 6, y + i, z + 5), Blocks.PLANKS.getStateFromMeta(5));
            worldIn.setBlockState(new BlockPos(x + 6, y + i, z + 7), Blocks.PLANKS.getStateFromMeta(5));
        }

        for(int i = 4; i <= 8; i++) {
            for (int j = 6; j <= 9; j++) {
                worldIn.setBlockState(new BlockPos(x + j, y + 5, z + i), Blocks.PLANKS.getStateFromMeta(5));
            }
        }
      //  ItemDoor.placeDoor(worldIn, new BlockPos(x + 5, y + 3, z + 6),EnumFacing.EAST, Blocks.DARK_OAK_DOOR, false);

        worldIn.setBlockState(new BlockPos(x + 5, y + 4, z + 5), Blocks.TORCH.getStateFromMeta(2));
        worldIn.setBlockState(new BlockPos(x + 5, y + 4, z + 7), Blocks.TORCH.getStateFromMeta(2));
        worldIn.setBlockState(new BlockPos(x + 8, y + 4, z + 6), Blocks.TORCH.getStateFromMeta(2));




        worldIn.setBlockState(new BlockPos(x + 5, y + 5, z + 3), Blocks.PLANKS.getStateFromMeta(4));
        worldIn.setBlockState(new BlockPos(x + 10, y + 5, z + 3), Blocks.PLANKS.getStateFromMeta(4));
        worldIn.setBlockState(new BlockPos(x + 5, y + 5, z + 9), Blocks.PLANKS.getStateFromMeta(4));
        worldIn.setBlockState(new BlockPos(x + 10, y + 5, z + 9), Blocks.PLANKS.getStateFromMeta(4));


        for(int i = 6; i <= 9; i++) {
            worldIn.setBlockState(new BlockPos(x + i, y + 5, z + 3), Blocks.LOG.getDefaultState());
            worldIn.setBlockState(new BlockPos(x + i, y + 5, z + 9), Blocks.LOG.getDefaultState());
        }

        for(int i = 4; i <= 8; i++){
            worldIn.setBlockState(new BlockPos(x + 5, y + 5, z + i), Blocks.LOG.getDefaultState());
            worldIn.setBlockState(new BlockPos(x + 10, y + 5, z + i), Blocks.LOG.getDefaultState());
        }

        worldIn.setBlockState(new BlockPos(x + 5, y + 6, z + 3), Blocks.TORCH.getDefaultState());
        worldIn.setBlockState(new BlockPos(x + 10, y + 6, z + 3), Blocks.TORCH.getDefaultState());
        worldIn.setBlockState(new BlockPos(x + 5, y + 6, z + 9), Blocks.TORCH.getDefaultState());
        worldIn.setBlockState(new BlockPos(x + 5, y + 6, z + 9), Blocks.TORCH.getDefaultState());

        for(int i = 4; i <= 8; i++){
            for(int j = 6; j <= 9; j++){
                worldIn.setBlockState(new BlockPos(x + j, y + 6, z + i), Blocks.WOODEN_SLAB.getStateFromMeta(3));
            }
        }

        for(int i = 5; i <= 7; i++){
            for(int j =  7; j <= 8; j++){
                worldIn.setBlockState(new BlockPos(x + j, y + 6, z + i), Blocks.PLANKS.getStateFromMeta(3));
            }
        }
        return EnumActionResult.SUCCESS;

    }
}
