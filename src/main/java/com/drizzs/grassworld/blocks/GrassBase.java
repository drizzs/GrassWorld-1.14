package com.drizzs.grassworld.blocks;

import com.drizzs.grassworld.particle.types.ShimmerParticleData;
import com.drizzs.grassworld.util.GrassConfigHandler;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.*;
import net.minecraft.item.DyeColor;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraft.world.lighting.LightEngine;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.IPlantable;

import java.util.List;
import java.util.Random;

import static com.drizzs.grassworld.registries.GrassRegistry.*;

public class GrassBase extends GrassBlock {

    private DyeColor dyeColor;

    public GrassBase(Properties properties, DyeColor dyeColor) {
        super(properties);
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
        if (this.equals(fancyNetherGrass.get(dyeColor).get()) || this.equals(fancyEndGrass.get(dyeColor).get())) {
            if (!worldIn.getFluidState(pos.up()).isEmpty()) return;
            if (!worldIn.isDaytime()) {
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
    }

    public void grow(World worldIn, Random rand, BlockPos pos, BlockState state) {
        BlockPos blockpos = pos.up();
        BlockState blockstate = null;
        if (GrassConfigHandler.COMMON.ALLGRASSGROWTH.get()) {
            blockstate = randomGrassPicker(rand).getDefaultState();
        } else {
            blockstate = actualgrass.get(dyeColor).get().getDefaultState();
        }
        for (int i = 0; i < 128; ++i) {
            BlockPos blockpos1 = blockpos;
            int j = 0;
            while (true) {
                if (j >= i / 16) {
                    BlockState blockstate2 = worldIn.getBlockState(blockpos1);
                    if (blockstate2.getBlock() == blockstate.getBlock() && rand.nextInt(10) == 0) {
                        ((IGrowable) blockstate.getBlock()).grow(worldIn, rand, blockpos1, blockstate2);
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
                        blockstate1 = ((FlowersFeature) ((DecoratedFeatureConfig) (list.get(0)).config).feature.feature).getRandomFlower(rand, blockpos1);
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
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        BlockState plant = plantable.getPlant(world, pos.offset(facing));

        if (plant.getBlock() == Blocks.SUGAR_CANE && this == Blocks.SUGAR_CANE)
            return true;
        if (plantable instanceof BushBlock) {
            if (plantable == Blocks.GRASS) {
                {
                    return false;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public Block randomGrassPicker(Random random) {
        Block chosenGrass = null;
        int randomGrass = random.nextInt(16);
        if (randomGrass == 0) {
            chosenGrass = actualgrass.get(DyeColor.BLUE).get();
        } else if (randomGrass == 1) {
            chosenGrass = actualgrass.get(DyeColor.BLACK).get();
        } else if (randomGrass == 2) {
            chosenGrass = actualgrass.get(DyeColor.BROWN).get();
        } else if (randomGrass == 3) {
            chosenGrass = actualgrass.get(DyeColor.CYAN).get();
        } else if (randomGrass == 4) {
            chosenGrass = actualgrass.get(DyeColor.GREEN).get();
        } else if (randomGrass == 5) {
            chosenGrass = actualgrass.get(DyeColor.GRAY).get();
        } else if (randomGrass == 6) {
            chosenGrass = actualgrass.get(DyeColor.LIGHT_GRAY).get();
        } else if (randomGrass == 7) {
            chosenGrass = actualgrass.get(DyeColor.LIGHT_BLUE).get();
        } else if (randomGrass == 8) {
            chosenGrass = actualgrass.get(DyeColor.LIME).get();
        } else if (randomGrass == 9) {
            chosenGrass = actualgrass.get(DyeColor.MAGENTA).get();
        } else if (randomGrass == 10) {
            chosenGrass = actualgrass.get(DyeColor.ORANGE).get();
        } else if (randomGrass == 11) {
            chosenGrass = actualgrass.get(DyeColor.PINK).get();
        } else if (randomGrass == 12) {
            chosenGrass = actualgrass.get(DyeColor.PURPLE).get();
        } else if (randomGrass == 13) {
            chosenGrass = actualgrass.get(DyeColor.RED).get();
        } else if (randomGrass == 14) {
            chosenGrass = actualgrass.get(DyeColor.WHITE).get();
        } else if (randomGrass == 15) {
            chosenGrass = actualgrass.get(DyeColor.YELLOW).get();
        }
        return chosenGrass;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void animateTick(BlockState stateIn, World world, BlockPos pos, Random rand) {
        if (GrassConfigHandler.CLIENT.particleOn.get()) {
            if (this.equals(enchantedoverworldGrass.get(DyeColor.BLACK).get())) {
                if (rand.nextInt(8) == 0) {
                    ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 240F, 240F, 240F, 1);
                    world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
                }
            } else if (this.equals(enchantedoverworldGrass.get(DyeColor.BLUE).get())) {
                if (rand.nextInt(8) == 0) {
                    ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 150F, 0F, 255F, 1);
                    world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
                }
            } else if (this.equals(enchantedoverworldGrass.get(DyeColor.BROWN).get())) {
                if (rand.nextInt(8) == 0) {
                    ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 102F, 51F, 1F, 1);
                    world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
                }
            } else if (this.equals(enchantedoverworldGrass.get(DyeColor.CYAN).get())) {
                if (rand.nextInt(8) == 0) {
                    ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 150F, 50F, 255F, 1);
                    world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
                }
            } else if (this.equals(enchantedoverworldGrass.get(DyeColor.GRAY).get())) {
                if (rand.nextInt(8) == 0) {
                    ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 210F, 210F, 210F, 1);
                    world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
                }
            } else if (this.equals(enchantedoverworldGrass.get(DyeColor.GREEN).get())) {
                if (rand.nextInt(8) == 0) {
                    ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 215F, 77F, 215F, 1);
                    world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
                }
            } else if (this.equals(enchantedoverworldGrass.get(DyeColor.LIGHT_BLUE).get())) {
                if (rand.nextInt(8) == 0) {
                    ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 29F, 41F, 216F, 1);
                    world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
                }
            } else if (this.equals(enchantedoverworldGrass.get(DyeColor.LIGHT_GRAY).get())) {
                if (rand.nextInt(8) == 0) {
                    ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 172F, 172F, 172F, 1);
                    world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
                }
            } else if (this.equals(enchantedoverworldGrass.get(DyeColor.LIME).get())) {
                if (rand.nextInt(8) == 0) {
                    ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 200F, 20F, 250F, 1);
                    world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
                }
            } else if (this.equals(enchantedoverworldGrass.get(DyeColor.MAGENTA).get())) {
                if (rand.nextInt(8) == 0) {
                    ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 100F, 200F, 10F, 1);
                    world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
                }
            } else if (this.equals(enchantedoverworldGrass.get(DyeColor.ORANGE).get())) {
                if (rand.nextInt(8) == 0) {
                    ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 250F, 178F, 10F, 1);
                    world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
                }
            } else if (this.equals(enchantedoverworldGrass.get(DyeColor.PINK).get())) {
                if (rand.nextInt(8) == 0) {
                    ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 95F, 1F, 1);
                    world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
                }
            } else if (this.equals(enchantedoverworldGrass.get(DyeColor.PURPLE).get())) {
                if (rand.nextInt(8) == 0) {
                    ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 220F, 250F, 145F, 1);
                    world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
                }
            } else if (this.equals(enchantedoverworldGrass.get(DyeColor.YELLOW).get())) {
                if (rand.nextInt(8) == 0) {
                    ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 255F, 100F, 100F, 1);
                    world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
                }
            } else if (this.equals(enchantedoverworldGrass.get(DyeColor.WHITE).get())) {
                if (rand.nextInt(8) == 0) {
                    ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 11F, 11F, 11F, 1);
                    world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
                }
            } else if (this.equals(enchantedoverworldGrass.get(DyeColor.RED).get())) {
                if (rand.nextInt(8) == 0) {
                    ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 255F, 0F, 1F, 1);
                    world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
                }
            }
        }
    }

    public BlockState blockGrowth() {
        BlockState state = null;
        if (this.equals(overworldGrass.get(dyeColor).get()) || this.equals(fancyoverworldGrass.get(dyeColor).get()) || this.equals(glowingoverworldGrass.get(dyeColor).get()) || this.equals(enchantedoverworldGrass.get(dyeColor).get())) {
            state = Blocks.DIRT.getDefaultState();
        } else if (this.equals(fancyNetherGrass.get(dyeColor).get()) || this.equals(netherGrass.get(dyeColor).get())) {
            state = Blocks.NETHERRACK.getDefaultState();
        } else if (this.equals(fancyEndGrass.get(dyeColor).get()) || this.equals(endGrass.get(dyeColor).get())) {
            state = Blocks.END_STONE.getDefaultState();
        }
        return state;
    }

    private Entity chosenOne(World world, Random random) {
        Entity entity = null;
        if (this.equals(fancyEndGrass.get(dyeColor).get())) {
            int rand = random.nextInt(1);
            if (rand == 0) {
                entity = new EndermanEntity(EntityType.ENDERMAN, world).getType().create(world);
            } else if (rand == 1) {
                entity = new EndermiteEntity(EntityType.ENDERMITE, world).getType().create(world);
            }
        } else if (this.equals(fancyNetherGrass.get(dyeColor).get())) {
            int rand = random.nextInt(200);
            if (rand < 198) {
                int check = random.nextInt(20);
                if (check > 15) {
                    entity = new ZombiePigmanEntity(EntityType.ZOMBIE_PIGMAN, world).getType().create(world);
                } else {
                    entity = new MagmaCubeEntity(EntityType.MAGMA_CUBE, world).getType().create(world);
                }
            } else {
                int check = random.nextInt(20);
                if (check > 15) {
                    entity = new GhastEntity(EntityType.GHAST, world).getType().create(world);
                } else {
                    entity = new WitherSkeletonEntity(EntityType.WITHER_SKELETON, world).getType().create(world);
                }
            }
        }
        return entity;
    }

}