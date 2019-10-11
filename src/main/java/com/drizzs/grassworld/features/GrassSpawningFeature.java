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

import static com.drizzs.grassworld.util.lib.GrassFeatureLib.*;

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
        BlockState state = GrassHolders.featureblock;

        for (BlockState state1 = world.getBlockState(pos); (state1.isAir(world, pos) || state1.isIn(BlockTags.LEAVES)) && pos.getY() > 0; state1 = world.getBlockState(pos))
        {
            pos = pos.down();
        }

        int i = 0;

        for (int j = 0; j < 128; ++j)
        {
            BlockPos blockpos = pos.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
            if (world.isAirBlock(blockpos) && state.isValidPosition(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
                ++i;
            }
        }

        return i > 0;
    }

    public BlockState grassFeaturePicker(Random random){

        if(GrassConfigHandler.COMMON.ALLGRASSFEATURE.get()){
            randomGrassPicker(random);
        }
        else if(this.equals(REDGRASS)){
            GrassHolders.featureblock = GrassContentLib.actualgrassred.getDefaultState();
        }
        else if(this.equals(BLUEGRASS)){
            GrassHolders.featureblock = GrassContentLib.actualgrassblue.getDefaultState();
        }
        else if(this.equals(BLACKGRASS)){
            GrassHolders.featureblock = GrassContentLib.actualgrassblack.getDefaultState();
        }
        else if(this.equals(LIMEGREENGRASS)){
            GrassHolders.featureblock = GrassContentLib.actualgrasslimegreen.getDefaultState();
        }
        else if(this.equals(LIGHTBLUEGRASS)){
            GrassHolders.featureblock = GrassContentLib.actualgrasslightblue.getDefaultState();
        }
        else if(this.equals(PINKGRASS)){
            GrassHolders.featureblock = GrassContentLib.actualgrasspink.getDefaultState();
        }
        else if(this.equals(ORANGEGRASS)){
            GrassHolders.featureblock = GrassContentLib.actualgrassorange.getDefaultState();
        }
        else if(this.equals(MAGENTAGRASS)){
            GrassHolders.featureblock = GrassContentLib.actualgrassmagenta.getDefaultState();
        }
        else if(this.equals(PURPLEGRASS)){
            GrassHolders.featureblock = GrassContentLib.actualgrasspurple.getDefaultState();
        }
        else if(this.equals(YELLOWGRASS)){
            GrassHolders.featureblock = GrassContentLib.actualgrassyellow.getDefaultState();
        }
        else if(this.equals(WHITEGRASS)){
            GrassHolders.featureblock = GrassContentLib.actualgrasswhite.getDefaultState();
        }
        else if(this.equals(LIGHTGREYGRASS)){
            GrassHolders.featureblock = GrassContentLib.actualgrasslightgrey.getDefaultState();
        }
        else if(this.equals(GREYGRASS)){
            GrassHolders.featureblock = GrassContentLib.actualgrassgrey.getDefaultState();
        }
        else if(this.equals(CYANGRASS)){
            GrassHolders.featureblock = GrassContentLib.actualgrasscyan.getDefaultState();
        }
        else if(this.equals(BROWNGRASS)){
            GrassHolders.featureblock = GrassContentLib.actualgrassbrown.getDefaultState();
        }
        else if(this.equals(GREENGRASS)){
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
