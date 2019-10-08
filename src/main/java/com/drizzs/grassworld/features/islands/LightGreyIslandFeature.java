package com.drizzs.grassworld.features.islands;

import com.drizzs.grassworld.util.lib.GrassContentLib;
import com.drizzs.grassworld.util.tags.GrassTags;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;
import java.util.function.Function;

public class LightGreyIslandFeature extends Feature<NoFeatureConfig> {
    public LightGreyIslandFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> config) {
        super(config);
    }

    public boolean place(IWorld world, ChunkGenerator<? extends GenerationSettings> gen, Random random, BlockPos pos, NoFeatureConfig config) {
        float f = (float)(random.nextInt(3) + 4);

        for(int i = 0; f > 0.5F; --i) {
            for(int k = MathHelper.floor(-f); k <= MathHelper.ceil(f); ++k) {
                for(int j = MathHelper.floor(-f); j <= MathHelper.ceil(f); ++j) {
                    if ((float)(k * k + j * j) <= (f + 1.0F) * (f + 1.0F)) {
                        BlockPos pos1 = pos.add(k, i + 10, j);
                        if(world.getBlockState(pos1.up()).isIn(GrassTags.Blocks.GRASSWORLDGRASS)){
                            this.setBlockState(world, pos1, Blocks.DIRT.getDefaultState());
                        }
                        else{
                            int next = random.nextInt(8);
                            if(next == 0 || next == 3 || next == 4 || next == 7){
                                this.setBlockState(world, pos1, GrassContentLib.lightgrey_grass.getDefaultState());
                            }
                            else if(next == 1 || next == 5 || next == 8){
                                this.setBlockState(world, pos1, GrassContentLib.fancy_lightgrey_grass.getDefaultState());
                            }
                            else if(next == 2){
                                this.setBlockState(world, pos1, GrassContentLib.enchanted_lightgrey_grass.getDefaultState());
                            }
                            else if(next == 6){
                                this.setBlockState(world, pos1, GrassContentLib.glowinglightgreygrass.getDefaultState());
                            }
                        }
                    }
                }
            }

            f = (float)((double)f - ((double)random.nextInt(2) + 0.5D));
        }

        return true;
    }
}
