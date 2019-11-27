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
            chosenGrass = actualgrassblue;
        } else if (randomGrass == 1) {
            chosenGrass = actualgrassblack;
        } else if (randomGrass == 2) {
            chosenGrass = actualgrassbrown;
        } else if (randomGrass == 3) {
            chosenGrass = actualgrasscyan;
        } else if (randomGrass == 4) {
            chosenGrass = actualgrassgreen;
        } else if (randomGrass == 5) {
            chosenGrass = actualgrassgrey;
        } else if (randomGrass == 6) {
            chosenGrass = actualgrasslightgrey;
        } else if (randomGrass == 7) {
            chosenGrass = actualgrasslightblue;
        } else if (randomGrass == 8) {
            chosenGrass = actualgrasslimegreen;
        } else if (randomGrass == 9) {
            chosenGrass = actualgrassmagenta;
        } else if (randomGrass == 10) {
            chosenGrass = actualgrassorange;
        } else if (randomGrass == 11) {
            chosenGrass = actualgrasspink;
        } else if (randomGrass == 12) {
            chosenGrass = actualgrasspurple;
        } else if (randomGrass == 13) {
            chosenGrass = actualgrassred;
        } else if (randomGrass == 14) {
            chosenGrass = actualgrasswhite;
        } else if (randomGrass == 15) {
            chosenGrass = actualgrassyellow;
        }
        return chosenGrass;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void animateTick(BlockState stateIn, World world, BlockPos pos, Random rand) {
        if (this.equals(enchantedblackgrass)) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 11F, 11F, 11F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedbluegrass)) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 29F, 41F, 216F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedbrowngrass)) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 102F, 51F, 1F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedcyangrass)) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 0F, 1F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedgreygrass)) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 0F, 1F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedgreengrass)) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 0F, 1F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedlightbluegrass)) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 0F, 1F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedlightgreygrass)) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 0F, 1F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedlimegreengrass)) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 0F, 1F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedmagentagrass)) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 153F, 0F, 153F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedorangegrass)) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 255F, 128F, 0F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedpinkgrass)) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 0F, 1F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedpurplegrass)) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 0F, 1F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedyellowgrass)) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 0F, 1F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedwhitegrass)) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 0F, 1F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        } else if (this.equals(enchantedredgrass)) {
            if (rand.nextInt(8) == 0) {
                ShimmerParticleData data = ShimmerParticleData.shimmer(rand.nextFloat() * 0.5F, 1F, 0F, 1F, 1);
                world.addParticle(data, pos.getX() + rand.nextFloat(), pos.getY() + 1.05, pos.getZ() + rand.nextFloat(), 0, 0, 0);
            }
        }
    }

}