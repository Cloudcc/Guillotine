package com.cloudcc.bags.world;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

/**
 * Created by hi112 on 19.09.2016.
 */
public class House extends WorldGenerator {
    @Override
    public boolean generate(World worldIn, Random rand, BlockPos position) {
        int x = position.getX();
        int y = position.getY();
        int z = position.getZ();
        //Bottom Layer
        worldIn.setBlockState(new BlockPos(x + 1, y, z + 1), Blocks.PLANKS.getStateFromMeta(5));
        worldIn.setBlockState(new BlockPos(x + 2, y, z + 2), Blocks.PLANKS.getStateFromMeta(5));
        worldIn.setBlockState(new BlockPos(x + 3, y, z + 3), Blocks.PLANKS.getStateFromMeta(5));
        worldIn.setBlockState(new BlockPos(x + 3, y, z + 3), Blocks.PLANKS.getStateFromMeta(5));
        worldIn.setBlockState(new BlockPos(x + 4, y, z + 4), Blocks.PLANKS.getStateFromMeta(5));
        worldIn.setBlockState(new BlockPos(x + 5, y, z + 5), Blocks.PLANKS.getStateFromMeta(5));
        worldIn.setBlockState(new BlockPos(x + 6, y, z + 6), Blocks.PLANKS.getStateFromMeta(5));
        worldIn.setBlockState(new BlockPos(x + 7, y, z + 7), Blocks.PLANKS.getStateFromMeta(5));
        worldIn.setBlockState(new BlockPos(x + 8, y, z + 8), Blocks.PLANKS.getStateFromMeta(5));
        worldIn.setBlockState(new BlockPos(x + 9, y, z + 9), Blocks.PLANKS.getStateFromMeta(5));
        worldIn.setBlockState(new BlockPos(x + 10, y, z + 10), Blocks.PLANKS.getStateFromMeta(5));
        worldIn.setBlockState(new BlockPos(x + 11, y, z + 11), Blocks.PLANKS.getStateFromMeta(5));
        worldIn.setBlockState(new BlockPos(x + 3, y + 1, z + 5), (IBlockState) Blocks.WOODEN_SLAB);

        //Front



        return true;
    }
}
