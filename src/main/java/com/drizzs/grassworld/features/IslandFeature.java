package com.drizzs.grassworld.features;

import com.drizzs.grassworld.util.GrassConfigHandler;
import com.drizzs.grassworld.util.GrassHolders;
import com.drizzs.grassworld.util.lib.GrassContentLib;
import com.drizzs.grassworld.util.tags.GrassTags;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
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

public class IslandFeature extends Feature<NoFeatureConfig> {
    public IslandFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> config, String id)
    {
        super(config);
        setRegistryName(id);
    }

    public boolean place(IWorld world, ChunkGenerator<? extends GenerationSettings> gen, Random random, BlockPos pos, NoFeatureConfig config) {
        float f = (float)(random.nextInt(3) + 4);

        for(int i = 0; f > 0.5F; --i) {
            for(int k = MathHelper.floor(-f); k <= MathHelper.ceil(f); ++k) {
                for(int j = MathHelper.floor(-f); j <= MathHelper.ceil(f); ++j) {
                    if ((float)(k * k + j * j) <= (f + 1.0F) * (f + 1.0F)) {
                        BlockPos pos1 = pos.add(k, i + 50, j);
                        if(world.getBlockState(pos1.up()).isIn(GrassTags.Blocks.GRASSWORLDGRASS)){
                            this.setBlockState(world, pos1, Blocks.DIRT.getDefaultState());
                        }
                        else{
                            GrassHolders.islandblock = islandGrassColour(random);
                            this.setBlockState(world, pos1, GrassHolders.islandblock);

                        }
                    }
                }
            }

            f = (float)((double)f - ((double)random.nextInt(2) + 0.5D));
        }

        return true;
    }


    public BlockState islandGrassColour(Random random){
        if(GrassConfigHandler.COMMON.RAINBOWISLANDS.get()){


        }
        else if(this.getRegistryName().equals("grassworld:blackislandfeature")){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                GrassHolders.islandblock = GrassContentLib.blackgrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                GrassHolders.islandblock = GrassContentLib.fancyblackgrass.getDefaultState();
            }
            else if(next == 2){
                GrassHolders.islandblock = GrassContentLib.enchantedblackgrass.getDefaultState();
            }
            else if(next == 6){
                GrassHolders.islandblock = GrassContentLib.glowingblackgrass.getDefaultState();
            }
        }
        else if(this.getRegistryName().equals("grassworld:blueislandfeature")){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                GrassHolders.islandblock = GrassContentLib.bluegrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                GrassHolders.islandblock = GrassContentLib.fancybluegrass.getDefaultState();
            }
            else if(next == 2){
                GrassHolders.islandblock = GrassContentLib.enchantedbluegrass.getDefaultState();
            }
            else if(next == 6){
                GrassHolders.islandblock = GrassContentLib.glowingbluegrass.getDefaultState();
            }
        }
        else if(this.getRegistryName().equals("grassworld:brownislandfeature")){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                GrassHolders.islandblock = GrassContentLib.browngrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                GrassHolders.islandblock = GrassContentLib.fancybrowngrass.getDefaultState();
            }
            else if(next == 2){
                GrassHolders.islandblock = GrassContentLib.enchantedbrowngrass.getDefaultState();
            }
            else if(next == 6){
                GrassHolders.islandblock = GrassContentLib.glowingbrowngrass.getDefaultState();
            }
        }
        else if(this.getRegistryName().equals("grassworld:cyanislandfeature")){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                GrassHolders.islandblock = GrassContentLib.cyangrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                GrassHolders.islandblock = GrassContentLib.fancycyangrass.getDefaultState();
            }
            else if(next == 2){
                GrassHolders.islandblock = GrassContentLib.enchantedcyangrass.getDefaultState();
            }
            else if(next == 6){
                GrassHolders.islandblock = GrassContentLib.glowingcyangrass.getDefaultState();
            }
        }
        else if(this.getRegistryName().equals("grassworld:greenislandfeature")){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                GrassHolders.islandblock = GrassContentLib.greengrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                GrassHolders.islandblock = GrassContentLib.fancygreengrass.getDefaultState();
            }
            else if(next == 2){
                GrassHolders.islandblock = GrassContentLib.enchantedgreengrass.getDefaultState();
            }
            else if(next == 6){
                GrassHolders.islandblock = GrassContentLib.glowinggreengrass.getDefaultState();
            }
        }
        else if(this.getRegistryName().equals("grassworld:greyislandfeature")){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                GrassHolders.islandblock = GrassContentLib.greygrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                GrassHolders.islandblock = GrassContentLib.fancygreygrass.getDefaultState();
            }
            else if(next == 2){
                GrassHolders.islandblock = GrassContentLib.enchantedgreygrass.getDefaultState();
            }
            else if(next == 6){
                GrassHolders.islandblock = GrassContentLib.glowinggreygrass.getDefaultState();
            }
        }
        else if(this.getRegistryName().equals("grassworld:lightblueislandfeature")){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                GrassHolders.islandblock = GrassContentLib.lightbluegrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                GrassHolders.islandblock = GrassContentLib.fancylightbluegrass.getDefaultState();
            }
            else if(next == 2){
                GrassHolders.islandblock = GrassContentLib.enchantedlightbluegrass.getDefaultState();
            }
            else if(next == 6){
                GrassHolders.islandblock = GrassContentLib.glowinglightbluegrass.getDefaultState();
            }
        }
        else if(this.getRegistryName().equals("grassworld:lightgreyislandfeature")){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                GrassHolders.islandblock = GrassContentLib.lightgreygrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                GrassHolders.islandblock = GrassContentLib.fancylightgreygrass.getDefaultState();
            }
            else if(next == 2){
                GrassHolders.islandblock = GrassContentLib.enchantedlightgreygrass.getDefaultState();
            }
            else if(next == 6){
                GrassHolders.islandblock = GrassContentLib.glowinglightgreygrass.getDefaultState();
            }
        }
        else if(this.getRegistryName().equals("grassworld:limegreenislandfeature")){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                GrassHolders.islandblock = GrassContentLib.limegreengrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                GrassHolders.islandblock = GrassContentLib.fancylimegreengrass.getDefaultState();
            }
            else if(next == 2){
                GrassHolders.islandblock = GrassContentLib.enchantedlimegreengrass.getDefaultState();
            }
            else if(next == 6){
                GrassHolders.islandblock = GrassContentLib.glowinglimegreengrass.getDefaultState();
            }
        }
        else if(this.getRegistryName().equals("grassworld:magentaislandfeature")){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                GrassHolders.islandblock = GrassContentLib.magentagrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                GrassHolders.islandblock = GrassContentLib.fancymagentagrass.getDefaultState();
            }
            else if(next == 2){
                GrassHolders.islandblock = GrassContentLib.enchantedmagentagrass.getDefaultState();
            }
            else if(next == 6){
                GrassHolders.islandblock = GrassContentLib.glowingmagentagrass.getDefaultState();
            }
        }
        else if(this.getRegistryName().equals("grassworld:orangeislandfeature")){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                GrassHolders.islandblock = GrassContentLib.orangegrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                GrassHolders.islandblock = GrassContentLib.fancyorangegrass.getDefaultState();
            }
            else if(next == 2){
                GrassHolders.islandblock = GrassContentLib.enchantedorangegrass.getDefaultState();
            }
            else if(next == 6){
                GrassHolders.islandblock = GrassContentLib.glowingorangegrass.getDefaultState();
            }
        }
        else if(this.getRegistryName().equals("grassworld:pinkislandfeature")){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                GrassHolders.islandblock = GrassContentLib.pinkgrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                GrassHolders.islandblock = GrassContentLib.fancypinkgrass.getDefaultState();
            }
            else if(next == 2){
                GrassHolders.islandblock = GrassContentLib.enchantedpinkgrass.getDefaultState();
            }
            else if(next == 6){
                GrassHolders.islandblock = GrassContentLib.glowingpinkgrass.getDefaultState();
            }
        }
        else if(this.getRegistryName().equals("grassworld:purpleislandfeature")){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                GrassHolders.islandblock = GrassContentLib.purplegrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                GrassHolders.islandblock = GrassContentLib.fancypurplegrass.getDefaultState();
            }
            else if(next == 2){
                GrassHolders.islandblock = GrassContentLib.enchantedpurplegrass.getDefaultState();
            }
            else if(next == 6){
                GrassHolders.islandblock = GrassContentLib.glowingpurplegrass.getDefaultState();
            }
        }
        else if(this.getRegistryName().equals("grassworld:redislandfeature")){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                GrassHolders.islandblock = GrassContentLib.redgrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                GrassHolders.islandblock = GrassContentLib.fancyredgrass.getDefaultState();
            }
            else if(next == 2){
                GrassHolders.islandblock = GrassContentLib.enchantedredgrass.getDefaultState();
            }
            else if(next == 6){
                GrassHolders.islandblock = GrassContentLib.glowingredgrass.getDefaultState();
            }
        }
        else if(this.getRegistryName().equals("grassworld:whiteislandfeature")){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                GrassHolders.islandblock = GrassContentLib.whitegrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                GrassHolders.islandblock = GrassContentLib.fancywhitegrass.getDefaultState();
            }
            else if(next == 2){
                GrassHolders.islandblock = GrassContentLib.enchantedwhitegrass.getDefaultState();
            }
            else if(next == 6){
                GrassHolders.islandblock = GrassContentLib.glowingwhitegrass.getDefaultState();
            }
        }
        else if(this.getRegistryName().equals("grassworld:yellowislandfeature")){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                GrassHolders.islandblock = GrassContentLib.yellowgrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                GrassHolders.islandblock = GrassContentLib.fancyyellowgrass.getDefaultState();
            }
            else if(next == 2){
                GrassHolders.islandblock = GrassContentLib.enchantedyellowgrass.getDefaultState();
            }
            else if(next == 6){
                GrassHolders.islandblock = GrassContentLib.glowingyellowgrass.getDefaultState();
            }
        }
        return GrassHolders.islandblock;

    }



}
