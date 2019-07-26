package com.drizzs.grassworld.blocks.ActualGrass;

import com.drizzs.grassworld.blocks.GrassWorldBlocks;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.FlowersFeature;

import java.util.List;
import java.util.Random;

public class ActualGrassOrange extends TallGrassBlock {


    public ActualGrassOrange(Block.Properties properties) {
        super(properties);
    }

    @Override
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        Block block = state.getBlock();
        return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.PODZOL || block == Blocks.FARMLAND
                || block == GrassWorldBlocks.orange_grass || block == GrassWorldBlocks.blue_grass || block == GrassWorldBlocks.yellow_grass
                || block == GrassWorldBlocks.red_grass || block == GrassWorldBlocks.limegreen_grass || block == GrassWorldBlocks.green_grass
                || block == GrassWorldBlocks.pink_grass || block == GrassWorldBlocks.lightgrey_grass || block == GrassWorldBlocks.grey_grass
                || block == GrassWorldBlocks.lightblue_grass || block == GrassWorldBlocks.cyan_grass || block == GrassWorldBlocks.magenta_grass
                || block == GrassWorldBlocks.purple_grass || block == GrassWorldBlocks.white_grass || block == GrassWorldBlocks.black_grass
                || block == GrassWorldBlocks.fancy_orange_grass || block == GrassWorldBlocks.fancy_blue_grass || block == GrassWorldBlocks.fancy_yellow_grass
                || block == GrassWorldBlocks.fancy_red_grass || block == GrassWorldBlocks.fancy_limegreen_grass || block == GrassWorldBlocks.fancy_green_grass
                || block == GrassWorldBlocks.fancy_pink_grass || block == GrassWorldBlocks.fancy_lightgrey_grass || block == GrassWorldBlocks.fancy_grey_grass
                || block == GrassWorldBlocks.fancy_lightblue_grass || block == GrassWorldBlocks.fancy_cyan_grass || block == GrassWorldBlocks.fancy_magenta_grass
                || block == GrassWorldBlocks.fancy_purple_grass || block == GrassWorldBlocks.fancy_white_grass || block == GrassWorldBlocks.fancy_black_grass
                || block == GrassWorldBlocks.enchanted_orange_grass || block == GrassWorldBlocks.enchanted_blue_grass || block == GrassWorldBlocks.enchanted_yellow_grass
                || block == GrassWorldBlocks.enchanted_red_grass || block == GrassWorldBlocks.enchanted_limegreen_grass || block == GrassWorldBlocks.enchanted_green_grass
                || block == GrassWorldBlocks.enchanted_pink_grass || block == GrassWorldBlocks.enchanted_lightgrey_grass || block == GrassWorldBlocks.enchanted_grey_grass
                || block == GrassWorldBlocks.enchanted_lightblue_grass || block == GrassWorldBlocks.enchanted_cyan_grass || block == GrassWorldBlocks.enchanted_magenta_grass
                || block == GrassWorldBlocks.enchanted_purple_grass || block == GrassWorldBlocks.enchanted_white_grass || block == GrassWorldBlocks.enchanted_black_grass;
    }


}

