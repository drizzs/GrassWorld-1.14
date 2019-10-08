package com.drizzs.grassworld.update.blocks;

import com.drizzs.grassworld.update.util.lib.GrassContentLib;
import com.drizzs.grassworld.update.util.tags.GrassTags;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class ActualGrass extends TallGrassBlock {


    public ActualGrass(Block.Properties properties) {
        super(properties);
    }

    @Override
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        Block block = state.getBlock();
        return block.isIn(GrassTags.Blocks.ISVALIDGROUND);
    }


}

