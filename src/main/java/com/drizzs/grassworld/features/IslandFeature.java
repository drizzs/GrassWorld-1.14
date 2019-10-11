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

import static com.drizzs.grassworld.util.lib.GrassFeatureLib.*;

public class IslandFeature extends Feature<NoFeatureConfig> {
    public IslandFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> config, String id)
    {
        super(config);
        setRegistryName(id);
    }

    @Override
    public boolean place(IWorld world, ChunkGenerator<? extends GenerationSettings> gen, Random random, BlockPos pos, NoFeatureConfig config) {
        float f = (float)(random.nextInt(3) + 4);

        for(int i = 0; f > 0.5F; --i) {
            for(int k = MathHelper.floor(-f); k <= MathHelper.ceil(f); ++k) {
                for(int j = MathHelper.floor(-f); j <= MathHelper.ceil(f); ++j) {
                    if ((float)(k * k + j * j) <= (f + 1.0F) * (f + 1.0F)) {
                        BlockPos pos1 = pos.add(k, i, j);
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
            int next = random.nextInt(8);
            if(next == 0){GrassHolders.islandblock = GrassContentLib.blackgrass.getDefaultState();}
            else if(next == 1){GrassHolders.islandblock = GrassContentLib.fancyblackgrass.getDefaultState();}
            else if(next == 2){GrassHolders.islandblock = GrassContentLib.enchantedblackgrass.getDefaultState();}
            else if(next == 3){GrassHolders.islandblock = GrassContentLib.glowingblackgrass.getDefaultState();}
            else if(next == 4){GrassHolders.islandblock = GrassContentLib.bluegrass.getDefaultState();}
            else if(next == 5){GrassHolders.islandblock = GrassContentLib.fancybluegrass.getDefaultState();}
            else if(next == 6){GrassHolders.islandblock = GrassContentLib.enchantedbluegrass.getDefaultState();}
            else if(next == 7){GrassHolders.islandblock = GrassContentLib.glowingbluegrass.getDefaultState();}
            else if(next == 8){GrassHolders.islandblock = GrassContentLib.browngrass.getDefaultState();}
            else if(next == 9){GrassHolders.islandblock = GrassContentLib.fancybrowngrass.getDefaultState();}
            else if(next == 10){GrassHolders.islandblock = GrassContentLib.enchantedbrowngrass.getDefaultState();}
            else if(next == 11){GrassHolders.islandblock = GrassContentLib.glowingbrowngrass.getDefaultState();}
            else if(next == 12){GrassHolders.islandblock = GrassContentLib.cyangrass.getDefaultState();}
            else if(next == 13){GrassHolders.islandblock = GrassContentLib.fancycyangrass.getDefaultState();}
            else if(next == 14){GrassHolders.islandblock = GrassContentLib.enchantedcyangrass.getDefaultState();}
            else if(next == 15){GrassHolders.islandblock = GrassContentLib.glowingcyangrass.getDefaultState();}
            else if(next == 16){GrassHolders.islandblock = GrassContentLib.greengrass.getDefaultState();}
            else if(next == 17){GrassHolders.islandblock = GrassContentLib.fancygreengrass.getDefaultState();}
            else if(next == 18){GrassHolders.islandblock = GrassContentLib.enchantedgreengrass.getDefaultState();}
            else if(next == 19){GrassHolders.islandblock = GrassContentLib.glowinggreengrass.getDefaultState();}
            else if(next == 20){GrassHolders.islandblock = GrassContentLib.greygrass.getDefaultState();}
            else if(next == 21){GrassHolders.islandblock = GrassContentLib.fancygreygrass.getDefaultState();}
            else if(next == 22){GrassHolders.islandblock = GrassContentLib.enchantedgreygrass.getDefaultState();}
            else if(next == 23){GrassHolders.islandblock = GrassContentLib.glowinggreygrass.getDefaultState();}
            else if(next == 24){GrassHolders.islandblock = GrassContentLib.lightbluegrass.getDefaultState();}
            else if(next == 25){GrassHolders.islandblock = GrassContentLib.fancylightbluegrass.getDefaultState();}
            else if(next == 26){GrassHolders.islandblock = GrassContentLib.enchantedlightbluegrass.getDefaultState();}
            else if(next == 27){GrassHolders.islandblock = GrassContentLib.glowinglightbluegrass.getDefaultState();}
            else if(next == 28){GrassHolders.islandblock = GrassContentLib.lightgreygrass.getDefaultState();}
            else if(next == 29){GrassHolders.islandblock = GrassContentLib.fancylightgreygrass.getDefaultState();}
            else if(next == 30){GrassHolders.islandblock = GrassContentLib.enchantedlightgreygrass.getDefaultState();}
            else if(next == 31){GrassHolders.islandblock = GrassContentLib.glowinglightgreygrass.getDefaultState();}
            else if(next == 32){GrassHolders.islandblock = GrassContentLib.limegreengrass.getDefaultState();}
            else if(next == 33){GrassHolders.islandblock = GrassContentLib.fancylimegreengrass.getDefaultState();}
            else if(next == 34){GrassHolders.islandblock = GrassContentLib.enchantedlimegreengrass.getDefaultState();}
            else if(next == 35){GrassHolders.islandblock = GrassContentLib.glowinglimegreengrass.getDefaultState();}
            else if(next == 36){GrassHolders.islandblock = GrassContentLib.magentagrass.getDefaultState();}
            else if(next == 37){GrassHolders.islandblock = GrassContentLib.fancymagentagrass.getDefaultState();}
            else if(next == 38){GrassHolders.islandblock = GrassContentLib.enchantedmagentagrass.getDefaultState();}
            else if(next == 39){GrassHolders.islandblock = GrassContentLib.glowingmagentagrass.getDefaultState();}
            else if(next == 40){GrassHolders.islandblock = GrassContentLib.orangegrass.getDefaultState();}
            else if(next == 41){GrassHolders.islandblock = GrassContentLib.fancyorangegrass.getDefaultState();}
            else if(next == 42){GrassHolders.islandblock = GrassContentLib.enchantedorangegrass.getDefaultState();}
            else if(next == 43){GrassHolders.islandblock = GrassContentLib.glowingorangegrass.getDefaultState();}
            else if(next == 44){GrassHolders.islandblock = GrassContentLib.pinkgrass.getDefaultState();}
            else if(next == 45){GrassHolders.islandblock = GrassContentLib.fancypinkgrass.getDefaultState();}
            else if(next == 46){GrassHolders.islandblock = GrassContentLib.enchantedpinkgrass.getDefaultState();}
            else if(next == 47){GrassHolders.islandblock = GrassContentLib.glowingpinkgrass.getDefaultState();}
            else if(next == 48){GrassHolders.islandblock = GrassContentLib.purplegrass.getDefaultState();}
            else if(next == 49){GrassHolders.islandblock = GrassContentLib.fancypurplegrass.getDefaultState();}
            else if(next == 50){GrassHolders.islandblock = GrassContentLib.enchantedpurplegrass.getDefaultState();}
            else if(next == 51){GrassHolders.islandblock = GrassContentLib.glowingpurplegrass.getDefaultState();}
            else if(next == 52){GrassHolders.islandblock = GrassContentLib.redgrass.getDefaultState();}
            else if(next == 53){GrassHolders.islandblock = GrassContentLib.fancyredgrass.getDefaultState();}
            else if(next == 54){GrassHolders.islandblock = GrassContentLib.enchantedredgrass.getDefaultState();}
            else if(next == 55){GrassHolders.islandblock = GrassContentLib.glowingredgrass.getDefaultState();}
            else if(next == 56){GrassHolders.islandblock = GrassContentLib.whitegrass.getDefaultState();}
            else if(next == 57){GrassHolders.islandblock = GrassContentLib.fancywhitegrass.getDefaultState();}
            else if(next == 58){GrassHolders.islandblock = GrassContentLib.enchantedwhitegrass.getDefaultState();}
            else if(next == 59){GrassHolders.islandblock = GrassContentLib.glowingwhitegrass.getDefaultState();}
            else if(next == 60){GrassHolders.islandblock = GrassContentLib.yellowgrass.getDefaultState();}
            else if(next == 61){GrassHolders.islandblock = GrassContentLib.fancyyellowgrass.getDefaultState();}
            else if(next == 62){GrassHolders.islandblock = GrassContentLib.enchantedyellowgrass.getDefaultState();}
            else if(next == 63){GrassHolders.islandblock = GrassContentLib.glowingyellowgrass.getDefaultState();}
            else{GrassHolders.islandblock = GrassContentLib.fancywhitegrass.getDefaultState();}
        }

        else if(this.equals(BLACKISLANDFEATURE)){
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

        else if(this.equals(BLUEISLANDFEATURE)){
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

        else if(this.equals(BROWNISLANDFEATURE)){
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

        else if(this.equals(CYANISLANDFEATURE)){
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

        else if(this.equals(GREENISLANDFEATURE)){
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

        else if(this.equals(GREYISLANDFEATURE)){
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

        else if(this.equals(LIGHTBLUEISLANDFEATURE)){
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

        else if(this.equals(LIGHTGREYISLANDFEATURE)){
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

        else if(this.equals(LIMEGREENISLANDFEATURE)){
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

        else if(this.equals(MAGENTAISLANDFEATURE)){
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

        else if(this.equals(ORANGEISLANDFEATURE)){
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

        else if(this.equals(PINKISLANDFEATURE)){
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

        else if(this.equals(PURPLEISLANDFEATURE)){
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

        else if(this.equals(REDISLANDFEATURE)){
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

        else if(this.equals(WHITEISLANDFEATURE)){
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

        else if(this.equals(YELLOWISLANDFEATURE)){
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
