package com.drizzs.grassworld.blocks.nethergrass.normal;

import com.drizzs.grassworld.blocks.Base.NetherGrassBase;
import com.drizzs.grassworld.blocks.GrassWorldBlocks;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.FlowersFeature;

import java.util.List;
import java.util.Random;

public class RedNetherGrass extends NetherGrassBase
{

    public RedNetherGrass(Properties p_i48388_1_) {
        super(p_i48388_1_);
    }

    public void grow(World worldIn, Random rand, BlockPos pos, BlockState state) {
        BlockPos blockpos = pos.up();
        BlockState blockstate = GrassWorldBlocks.actualgrass_red.getDefaultState();

        for(int i = 0; i < 128; ++i) {
            BlockPos blockpos1 = blockpos;
            int j = 0;

            while(true) {
                if (j >= i / 16) {
                    BlockState blockstate2 = worldIn.getBlockState(blockpos1);
                    if (blockstate2.getBlock() == blockstate.getBlock() && rand.nextInt(10) == 0) {
                        ((IGrowable)blockstate.getBlock()).grow(worldIn, rand, blockpos1, blockstate2);
                    }

                    if (!blockstate2.isAir()) {
                        break;
                    }

                    BlockState blockstate1;
                    if (rand.nextInt(8) == 0) {
                        List<ConfiguredFeature<?>> list = worldIn.getBiome(blockpos1).getFlowers();
                        if (list.isEmpty()) {
                            break;
                        }

                        blockstate1 = ((FlowersFeature)((DecoratedFeatureConfig)(list.get(0)).config).feature.feature).getRandomFlower(rand, blockpos1);
                    } else {
                        blockstate1 = blockstate;
                    }

                    if (blockstate1.isValidPosition(worldIn, blockpos1)) {
                        worldIn.setBlockState(blockpos1, blockstate1, 3);
                    }
                    break;
                }

                blockpos1 = blockpos1.add(rand.nextInt(3) - 1, (rand.nextInt(3) - 1) * rand.nextInt(3) / 2, rand.nextInt(3) - 1);
                if (worldIn.getBlockState(blockpos1.down()).getBlock() != this || worldIn.getBlockState(blockpos1).func_224756_o(worldIn, blockpos1)) {
                    break;
                }

                ++j;
            }
        }

    }
    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, net.minecraftforge.common.IPlantable plantable) {
        BlockState plant = plantable.getPlant(world, pos.offset(facing));
        net.minecraftforge.common.PlantType type = plantable.getPlantType(world, pos.offset(facing));

        if (plant.getBlock() == Blocks.SUGAR_CANE && this == Blocks.SUGAR_CANE)
            return true;

        if (plantable instanceof BushBlock)
            return true;

        switch (type) {
            case Desert: return this.getBlock() == Blocks.SAND || this.getBlock() == Blocks.TERRACOTTA || this.getBlock() instanceof GlazedTerracottaBlock;
            case Nether: return this.getBlock() == Blocks.SOUL_SAND;
            case Crop:   return this.getBlock() == Blocks.FARMLAND;
            case Cave:   return Block.hasSolidSide(state, world, pos, Direction.UP);
            case Plains: return this.getBlock() == Blocks.GRASS_BLOCK || Block.isDirt(this) || this.getBlock() == Blocks.FARMLAND;
            case Water:  return state.getMaterial() == Material.WATER; //&& state.getValue(BlockLiquidWrapper)
            case Beach:
                boolean isBeach = this.getBlock() == Blocks.GRASS_BLOCK || Block.isDirt(this) || this.getBlock() == Blocks.SAND;
                boolean hasWater = (world.getBlockState(pos.east()).getMaterial() == Material.WATER ||
                        world.getBlockState(pos.west()).getMaterial() == Material.WATER ||
                        world.getBlockState(pos.north()).getMaterial() == Material.WATER ||
                        world.getBlockState(pos.south()).getMaterial() == Material.WATER);
                return isBeach && hasWater;
        }
        return false;
    }
}
