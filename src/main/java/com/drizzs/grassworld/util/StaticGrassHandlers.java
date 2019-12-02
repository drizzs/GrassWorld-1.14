package com.drizzs.grassworld.util;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.DyeColor;

import java.util.Random;

import static com.drizzs.grassworld.registries.GrassRegistry.*;

public class StaticGrassHandlers
{
    public static Block randomGrassSelector(Random random) {
        int color = random.nextInt(16);
        DyeColor dyeColor = null;
        if(color == 0){dyeColor = DyeColor.BLACK;}
        else if(color == 1){dyeColor = DyeColor.BLUE;}
        else if(color == 2){dyeColor = DyeColor.BROWN;}
        else if(color == 3){dyeColor = DyeColor.CYAN;}
        else if(color == 4){dyeColor = DyeColor.GREEN;}
        else if(color == 5){dyeColor = DyeColor.GRAY;}
        else if(color == 6){dyeColor = DyeColor.LIGHT_BLUE;}
        else if(color == 7){dyeColor = DyeColor.LIGHT_GRAY;}
        else if(color == 8){dyeColor = DyeColor.LIME;}
        else if(color == 9){dyeColor = DyeColor.MAGENTA;}
        else if(color == 10){dyeColor = DyeColor.PINK;}
        else if(color == 11){dyeColor = DyeColor.ORANGE;}
        else if(color == 12){dyeColor = DyeColor.PURPLE;}
        else if(color == 13){dyeColor = DyeColor.RED;}
        else if(color == 14){dyeColor = DyeColor.WHITE;}
        else if(color == 15){dyeColor = DyeColor.YELLOW;}

        return actualgrass.get(dyeColor).get();
    }

    public static Block randomBlockSelector(Random random) {
        int color = random.nextInt(16);
        int next = random.nextInt(4);
        Block topBlock = null;
        DyeColor dyeColor = null;
        if(color == 0){dyeColor = DyeColor.BLACK;}
        else if(color == 1){dyeColor = DyeColor.BLUE;}
        else if(color == 2){dyeColor = DyeColor.BROWN;}
        else if(color == 3){dyeColor = DyeColor.CYAN;}
        else if(color == 4){dyeColor = DyeColor.GREEN;}
        else if(color == 5){dyeColor = DyeColor.GRAY;}
        else if(color == 6){dyeColor = DyeColor.LIGHT_BLUE;}
        else if(color == 7){dyeColor = DyeColor.LIGHT_GRAY;}
        else if(color == 8){dyeColor = DyeColor.LIME;}
        else if(color == 9){dyeColor = DyeColor.MAGENTA;}
        else if(color == 10){dyeColor = DyeColor.PINK;}
        else if(color == 11){dyeColor = DyeColor.ORANGE;}
        else if(color == 12){dyeColor = DyeColor.PURPLE;}
        else if(color == 13){dyeColor = DyeColor.RED;}
        else if(color == 14){dyeColor = DyeColor.WHITE;}
        else if(color == 15){dyeColor = DyeColor.YELLOW;}

        if(next == 0){topBlock = overworldGrass.get(dyeColor).get();}
        else if(next == 1){topBlock = fancyoverworldGrass.get(dyeColor).get();}
        else if(next == 2){topBlock = glowingoverworldGrass.get(dyeColor).get();}
        else if(next == 3){topBlock = enchantedoverworldGrass.get(dyeColor).get();}

        return topBlock;
    }

}
