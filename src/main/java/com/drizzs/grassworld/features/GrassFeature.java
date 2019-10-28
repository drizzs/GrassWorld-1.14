package com.drizzs.grassworld.features;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.GrassFeatureConfig;

import java.util.Random;
import java.util.function.Function;

public class GrassFeature extends Feature<GrassFeatureConfig> {

    public GrassFeature(Function<Dynamic<?>, ? extends GrassFeatureConfig> config) {
        super(config);
    }

    public boolean place(IWorld world, ChunkGenerator<? extends GenerationSettings> chunkGen, Random random, BlockPos pos, GrassFeatureConfig config) {
        for (BlockState state = world.getBlockState(pos); (state.isAir() || state.isIn(BlockTags.LEAVES)) && pos.getY() > 0; state = world.getBlockState(pos)) {
            pos = pos.down();
        }

        int j = 0;

        for (int i = 0; i < 128; ++i) {
            BlockPos targetpos = pos.add(random.nextInt(8) - random.nextInt(8), random.nextInt(4) - random.nextInt(4), random.nextInt(8) - random.nextInt(8));
            int f = random.nextInt(4);
            if (world.isAirBlock(targetpos) && config.state.isValidPosition(world, targetpos) && f == 0) {
                world.setBlockState(targetpos, config.state, 2);
                ++j;
            }
        }

        return j > 0;
    }
}