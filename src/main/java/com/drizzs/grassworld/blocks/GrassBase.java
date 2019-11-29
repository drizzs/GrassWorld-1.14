package com.drizzs.grassworld.blocks;

import com.drizzs.grassworld.particle.types.ShimmerParticleData;
import com.drizzs.grassworld.util.GrassConfigHandler;
import net.minecraft.block.*;
import net.minecraft.item.DyeColor;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.IPlantable;

import java.util.List;
import java.util.Random;

import static com.drizzs.grassworld.registries.GrassRegistry.actualgrass;
import static com.drizzs.grassworld.registries.GrassRegistry.enchantedoverworldGrass;
import static com.drizzs.grassworld.util.lib.GrassContentLib.*;

public class GrassBase extends GrassBlock {

    private DyeColor dyeColor;

    public GrassBase(Properties properties, DyeColor dyeColor) {
        super(properties);
        this.dyeColor = dyeColor;
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
        int randomGrass = random.nextInt(15);
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
        if (this.equals(enchantedoverworldGrass.get(DyeColor.BLACK).get())) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 1F, 1F, 1);
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
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 150F, 150F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedoverworldGrass.get(DyeColor.GRAY).get())) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 0F, 1F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedoverworldGrass.get(DyeColor.GREEN).get())) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 255F, 77F, 0F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedoverworldGrass.get(DyeColor.LIGHT_BLUE).get())) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 29F, 41F, 216F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedoverworldGrass.get(DyeColor.LIGHT_GRAY).get())) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 0F, 1F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedoverworldGrass.get(DyeColor.LIME).get())) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 53F, 238F, 1F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedoverworldGrass.get(DyeColor.MAGENTA).get())) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 255F, 0F, 255F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedoverworldGrass.get(DyeColor.ORANGE).get())) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 255F, 77F, 0F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedoverworldGrass.get(DyeColor.PINK).get())) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 95F, 1F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedoverworldGrass.get(DyeColor.PURPLE).get())) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 150F, 50F, 255F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedoverworldGrass.get(DyeColor.YELLOW).get())) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 255F, 100F, 100F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedoverworldGrass.get(DyeColor.WHITE).get())) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 0F, 0F, 0F, 1);
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