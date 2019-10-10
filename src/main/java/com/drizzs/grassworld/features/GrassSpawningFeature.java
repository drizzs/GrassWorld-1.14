package com.drizzs.grassworld.features;

import com.drizzs.grassworld.util.GrassConfigHandler;
import com.drizzs.grassworld.util.GrassHolders;
import com.drizzs.grassworld.util.lib.GrassContentLib;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;
import java.util.function.Function;

public class GrassSpawningFeature extends Feature<NoFeatureConfig>
{



    public GrassSpawningFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> deserializer, String id)
    {
        super(deserializer);
       setRegistryName(id);
    }


    @Override
    public boolean place(IWorld world, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, NoFeatureConfig config)
    {
        GrassHolders.featureblock = grassFeaturePicker(rand);
        BlockState BlockState = GrassHolders.featureblock;

        for (BlockState BlockState1 = world.getBlockState(pos); (BlockState1.isAir(world, pos) || BlockState1.isIn(BlockTags.LEAVES)) && pos.getY() > 0; BlockState1 = world.getBlockState(pos))
        {
            pos = pos.down();
        }

        int i = 0;

        for (int j = 0; j < 128; ++j)
        {
            BlockPos blockpos = pos.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
            if (world.isAirBlock(blockpos) && BlockState.isValidPosition(world, blockpos))
            {
                world.setBlockState(blockpos, BlockState, 2);
                ++i;
            }
        }

        return i > 0;
    }

    public BlockState grassFeaturePicker(Random random){

        if(GrassConfigHandler.COMMON.ALLGRASSFEATURE.get()){
            randomGrassPicker(random);
        }
        else if(this.getRegistryName().equals("grassworld:redgrassfeature")){
            GrassHolders.featureblock = GrassContentLib.actualgrassred.getDefaultState();
        }
        else if(this.getRegistryName().equals("grassworld:bluegrassfeature")){
            GrassHolders.featureblock = GrassContentLib.actualgrassblue.getDefaultState();
        }
        else if(this.getRegistryName().equals("grassworld:blackgrassfeature")){
            GrassHolders.featureblock = GrassContentLib.actualgrassblack.getDefaultState();
        }
        else if(this.getRegistryName().equals("grassworld:limegreengrassfeature")){
            GrassHolders.featureblock = GrassContentLib.actualgrasslimegreen.getDefaultState();
        }
        else if(this.getRegistryName().equals("grassworld:lightbluegrassfeature")){
            GrassHolders.featureblock = GrassContentLib.actualgrasslightblue.getDefaultState();
        }
        else if(this.getRegistryName().equals("grassworld:pinkgrassfeature")){
            GrassHolders.featureblock = GrassContentLib.actualgrasspink.getDefaultState();
        }
        else if(this.getRegistryName().equals("grassworld:orangegrassfeature")){
            GrassHolders.featureblock = GrassContentLib.actualgrassorange.getDefaultState();
        }
        else if(this.getRegistryName().equals("grassworld:magentagrassfeature")){
            GrassHolders.featureblock = GrassContentLib.actualgrassmagenta.getDefaultState();
        }
        else if(this.getRegistryName().equals("grassworld:purplegrassfeature")){
            GrassHolders.featureblock = GrassContentLib.actualgrasspurple.getDefaultState();
        }
        else if(this.getRegistryName().equals("grassworld:yellowgrassfeature")){
            GrassHolders.featureblock = GrassContentLib.actualgrassyellow.getDefaultState();
        }
        else if(this.getRegistryName().equals("grassworld:whitegrassfeature")){
            GrassHolders.featureblock = GrassContentLib.actualgrasswhite.getDefaultState();
        }
        else if(this.getRegistryName().equals("grassworld:lightgreygrassfeature")){
            GrassHolders.featureblock = GrassContentLib.actualgrasslightgrey.getDefaultState();
        }
        else if(this.getRegistryName().equals("grassworld:greygrassfeature")){
            GrassHolders.featureblock = GrassContentLib.actualgrassgrey.getDefaultState();
        }
        else if(this.getRegistryName().equals("grassworld:cyangrassfeature")){
            GrassHolders.featureblock = GrassContentLib.actualgrasscyan.getDefaultState();
        }
        else if(this.getRegistryName().equals("grassworld:browngrassfeature")){
            GrassHolders.featureblock = GrassContentLib.actualgrassbrown.getDefaultState();
        }
        else if(this.getRegistryName().equals("grassworld:greengrassfeature")){
            GrassHolders.featureblock = GrassContentLib.actualgrassgreen.getDefaultState();
        }
        else{
            randomGrassPicker(random);
        }

        return GrassHolders.featureblock;
    }


    public BlockState randomGrassPicker(Random random){

        int grass = random.nextInt(15);
        if(grass == 0){
            GrassHolders.featureblock = GrassContentLib.actualgrassblue.getDefaultState();
        }
        else if(grass == 1){
            GrassHolders.featureblock = GrassContentLib.actualgrassblack.getDefaultState();
        }
        else if(grass == 2){
            GrassHolders.featureblock = GrassContentLib.actualgrassbrown.getDefaultState();
        }
        else if(grass == 3){
            GrassHolders.featureblock = GrassContentLib.actualgrasscyan.getDefaultState();
        }
        else if(grass == 4){
            GrassHolders.featureblock = GrassContentLib.actualgrassgreen.getDefaultState();
        }
        else if(grass == 5){
            GrassHolders.featureblock = GrassContentLib.actualgrassgrey.getDefaultState();
        }
        else if(grass == 6){
            GrassHolders.featureblock = GrassContentLib.actualgrasslightgrey.getDefaultState();
        }
        else if(grass == 7){
            GrassHolders.featureblock = GrassContentLib.actualgrasslightblue.getDefaultState();
        }
        else if(grass == 8){
            GrassHolders.featureblock = GrassContentLib.actualgrasslimegreen.getDefaultState();
        }
        else if(grass == 9){
            GrassHolders.featureblock = GrassContentLib.actualgrassmagenta.getDefaultState();
        }
        else if(grass == 10){
            GrassHolders.featureblock = GrassContentLib.actualgrassorange.getDefaultState();
        }
        else if(grass == 11){
            GrassHolders.featureblock = GrassContentLib.actualgrasspink.getDefaultState();
        }
        else if(grass == 12){
            GrassHolders.featureblock = GrassContentLib.actualgrasspurple.getDefaultState();
        }
        else if(grass == 13){
            GrassHolders.featureblock = GrassContentLib.actualgrassred.getDefaultState();
        }
        else if(grass == 14){
            GrassHolders.featureblock = GrassContentLib.actualgrasswhite.getDefaultState();
        }
        else if(grass == 15){
            GrassHolders.featureblock = GrassContentLib.actualgrassyellow.getDefaultState();
        }
        else{
            GrassHolders.featureblock = GrassContentLib.actualgrassyellow.getDefaultState();
        }
        return GrassHolders.featureblock;
    }


}
