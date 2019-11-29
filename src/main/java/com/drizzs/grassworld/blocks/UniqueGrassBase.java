package com.drizzs.grassworld.blocks;

import com.drizzs.grassworld.util.tags.GrassTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.monster.*;
import net.minecraft.item.DyeColor;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.lighting.LightEngine;

import java.util.Random;

import static com.drizzs.grassworld.registries.GrassRegistry.*;

public class UniqueGrassBase extends GrassBase {

    private DyeColor dyeColor;

    public UniqueGrassBase(Properties properties, DyeColor dyeColor) {
        super(properties, dyeColor);
        this.dyeColor = dyeColor;
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
                return;
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
        if (!worldIn.getFluidState(pos.up()).isEmpty()) return;
        if(!worldIn.isDaytime()) {
            if (random.nextInt(20) == 0) {
                Entity entity = chosenOne(worldIn, random);
                if (entity != null) {
                    entity.setPosition(pos.getX(), pos.getY() + 1, pos.getZ());
                    if (!worldIn.areCollisionShapesEmpty(entity) || !worldIn.checkNoEntityCollision(entity)) return;
                    worldIn.addEntity(entity);
                }
            }
        }
    }

    public BlockState blockGrowth(){
        BlockState state = null;
        if (this == fancyNetherGrass.get(dyeColor).get() || this == netherGrass.get(dyeColor).get()) {
            state = Blocks.NETHERRACK.getDefaultState();
        }
        if (this == fancyEndGrass.get(dyeColor).get() || this == endGrass.get(dyeColor).get()) {
            state = Blocks.END_STONE.getDefaultState();
        }
        return state;
    }

        private Entity chosenOne(World world, Random random){
            Entity entity = null;
            if(this == fancyEndGrass.get(dyeColor).get()) {
                int rand = random.nextInt(1);
                if(rand == 0) {
                    entity = new EndermanEntity(EntityType.ENDERMAN, world).getType().create(world);
                } else if(rand == 1) {
                    entity = new EndermiteEntity(EntityType.ENDERMITE, world).getType().create(world);
                }
        }else if(this == fancyNetherGrass.get(dyeColor).get()) {
            int rand = random.nextInt(200);
            if(rand < 198){
                int check = random.nextInt(20);
                if(check > 15){
                    entity = new ZombiePigmanEntity(EntityType.ZOMBIE_PIGMAN, world).getType().create(world);
                } else{
                    entity = new MagmaCubeEntity(EntityType.MAGMA_CUBE, world).getType().create(world);
                }
            } else {
                int check = random.nextInt(20);
                if(check > 15){
                    entity = new GhastEntity(EntityType.GHAST, world).getType().create(world);
                } else{
                    entity = new WitherSkeletonEntity(EntityType.WITHER_SKELETON, world).getType().create(world);
                }
            }
        }
        return entity;
    }
}
