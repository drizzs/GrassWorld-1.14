package com.drizzs.grassworld.blocks;

import com.drizzs.grassworld.util.GrassHolders;
import com.drizzs.grassworld.util.tags.GrassTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.*;
import net.minecraft.item.DyeColor;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.lighting.LightEngine;

import java.util.Random;

public class UniqueGrassBase extends GrassBase {

    public UniqueGrassBase(Properties properties, DyeColor dyeColor) {
        super(properties, dyeColor);
    }

    private static boolean getLightLevel(BlockState state, IWorldReader iworld, BlockPos pos) {
        BlockPos blockpos = pos.up();
        BlockState blockstate = iworld.getBlockState(blockpos);
        if (blockstate.getBlock() == Blocks.SNOW && blockstate.get(SnowBlock.LAYERS) == 1) {
            return true;
        } else {
            int i = LightEngine.func_215613_a(iworld, state, pos, blockstate, blockpos, Direction.UP, blockstate.getOpacity(iworld, blockpos));
            return i < iworld.getMaxLightLevel();
        }
    }

    private static boolean getFluidState(BlockState state, IWorldReader iworld, BlockPos pos) {
        BlockPos blockpos = pos.up();
        return getLightLevel(state, iworld, pos) && !iworld.getFluidState(blockpos).isTagged(FluidTags.WATER);
    }

    @Deprecated
    @Override
    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
        if (!worldIn.isRemote) {
            if (!worldIn.isAreaLoaded(pos, 3))
                return; // Forge: prevent loading unloaded chunks when checking neighbor's light and spreading
            if (!getLightLevel(state, worldIn, pos)) {
                worldIn.setBlockState(pos, blockGrowth());
            } else {
                if (worldIn.getLight(pos.up()) >= 0) {
                    BlockState blockstate = this.getDefaultState();

                    for (int i = 0; i < 4; ++i) {
                        BlockPos blockpos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                        if (worldIn.getBlockState(blockpos) == blockGrowth() && getFluidState(blockstate, worldIn, blockpos)) {
                            worldIn.setBlockState(blockpos, blockstate.with(SNOWY, Boolean.valueOf(worldIn.getBlockState(blockpos.up()).getBlock() == Blocks.SNOW)));
                        }
                    }
                }
            }
        }
    }

    public BlockState blockGrowth(){
        BlockState state = null;
        if (this.isIn(GrassTags.Blocks.NETHERGRASS)) {
            state = Blocks.NETHERRACK.getDefaultState();
        }
        if (this.isIn(GrassTags.Blocks.ENDGRASS)) {
            state = Blocks.END_STONE.getDefaultState();
        }
        return state;
    }

    public void spawnEntities(World world){
        if(this.isIn(GrassTags.Blocks.ENDGRASS)) {
            world.addEntity(new EndermanEntity(EntityType.ENDERMAN, world));
            world.addEntity(new EndermiteEntity(EntityType.ENDERMITE, world));
        }
        else if(this.isIn(GrassTags.Blocks.NETHERGRASS)) {
            world.addEntity(new GhastEntity(EntityType.GHAST, world));
            world.addEntity(new ZombiePigmanEntity(EntityType.ZOMBIE_PIGMAN, world));
            world.addEntity(new MagmaCubeEntity(EntityType.MAGMA_CUBE, world));
            world.addEntity(new WitherSkeletonEntity(EntityType.WITHER_SKELETON, world));
        }
    }

}
