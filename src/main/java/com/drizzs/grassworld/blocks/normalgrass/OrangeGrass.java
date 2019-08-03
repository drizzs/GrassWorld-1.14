package com.drizzs.grassworld.blocks.normalgrass;

import com.drizzs.grassworld.api.particle.GWParticleSpawn;
import com.drizzs.grassworld.blocks.GrassWorldBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;
import java.util.Random;

public class OrangeGrass extends GrassBlock
{

    public OrangeGrass(Properties p_i48388_1_) {
        super(p_i48388_1_);
    }


    public void grow(World worldIn, Random rand, BlockPos pos, BlockState state) {
        BlockPos blockpos = pos.up();
        BlockState blockstate = GrassWorldBlocks.actualgrass_orange.getDefaultState();

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

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {

        if (rand.nextInt(5) == 0) {
            for(int i = 0; i < rand.nextInt(1) + 1; ++i) {
                int v1 = 0.(rand.nextInt(9));
                int v2 = rand.nextInt(9);
                int v3 = rand.nextInt(9);

                GWParticleSpawn.ENCHANTEDBLACK.spawn(worldIn, 0, 0, 0, v1, v2, v3);
            }
        }


    }

}



