package com.drizzs.grassworld.util;


import net.minecraft.block.BlockState;

import java.util.Random;

import static com.drizzs.grassworld.util.lib.GrassContentLib.*;

public class StaticGrassHandlers
{
    private static BlockState[] createArray(BlockState... states) {
        return states;
    }

    public static BlockState[] getAllActualGrass() {
        return createArray(actualgrassblack.getDefaultState(), actualgrassblue.getDefaultState(), actualgrassbrown.getDefaultState(), actualgrasscyan.getDefaultState(), actualgrassgreen.getDefaultState(), actualgrassgrey.getDefaultState(), actualgrasslightblue.getDefaultState(), actualgrasslightgrey.getDefaultState(), actualgrasslimegreen.getDefaultState(),
                actualgrassmagenta.getDefaultState(), actualgrassorange.getDefaultState(), actualgrasspink.getDefaultState(), actualgrasspurple.getDefaultState(), actualgrassred.getDefaultState(), actualgrasswhite.getDefaultState(), actualgrassyellow.getDefaultState());
    }

    public static BlockState randomBlockSelector(Random random) {
        int next = random.nextInt(63);
        BlockState topBlock;
        if(next == 0){topBlock = blackgrass.getDefaultState();}
        else if(next == 1){topBlock = fancyblackgrass.getDefaultState();}
        else if(next == 2){topBlock = enchantedblackgrass.getDefaultState();}
        else if(next == 3){topBlock = glowingblackgrass.getDefaultState();}
        else if(next == 4){topBlock = bluegrass.getDefaultState();}
        else if(next == 5){topBlock = fancybluegrass.getDefaultState();}
        else if(next == 6){topBlock = enchantedbluegrass.getDefaultState();}
        else if(next == 7){topBlock = glowingbluegrass.getDefaultState();}
        else if(next == 8){topBlock = browngrass.getDefaultState();}
        else if(next == 9){topBlock = fancybrowngrass.getDefaultState();}
        else if(next == 10){topBlock = enchantedbrowngrass.getDefaultState();}
        else if(next == 11){topBlock = glowingbrowngrass.getDefaultState();}
        else if(next == 12){topBlock = cyangrass.getDefaultState();}
        else if(next == 13){topBlock = fancycyangrass.getDefaultState();}
        else if(next == 14){topBlock = enchantedcyangrass.getDefaultState();}
        else if(next == 15){topBlock = glowingcyangrass.getDefaultState();}
        else if(next == 16){topBlock = greengrass.getDefaultState();}
        else if(next == 17){topBlock = fancygreengrass.getDefaultState();}
        else if(next == 18){topBlock = enchantedgreengrass.getDefaultState();}
        else if(next == 19){topBlock = glowinggreengrass.getDefaultState();}
        else if(next == 20){topBlock = greygrass.getDefaultState();}
        else if(next == 21){topBlock = fancygreygrass.getDefaultState();}
        else if(next == 22){topBlock = enchantedgreygrass.getDefaultState();}
        else if(next == 23){topBlock = glowinggreygrass.getDefaultState();}
        else if(next == 24){topBlock = lightbluegrass.getDefaultState();}
        else if(next == 25){topBlock = fancylightbluegrass.getDefaultState();}
        else if(next == 26){topBlock = enchantedlightbluegrass.getDefaultState();}
        else if(next == 27){topBlock = glowinglightbluegrass.getDefaultState();}
        else if(next == 28){topBlock = lightgreygrass.getDefaultState();}
        else if(next == 29){topBlock = fancylightgreygrass.getDefaultState();}
        else if(next == 30){topBlock = enchantedlightgreygrass.getDefaultState();}
        else if(next == 31){topBlock = glowinglightgreygrass.getDefaultState();}
        else if(next == 32){topBlock = limegreengrass.getDefaultState();}
        else if(next == 33){topBlock = fancylimegreengrass.getDefaultState();}
        else if(next == 34){topBlock = enchantedlimegreengrass.getDefaultState();}
        else if(next == 35){topBlock = glowinglimegreengrass.getDefaultState();}
        else if(next == 36){topBlock = magentagrass.getDefaultState();}
        else if(next == 37){topBlock = fancymagentagrass.getDefaultState();}
        else if(next == 38){topBlock = enchantedmagentagrass.getDefaultState();}
        else if(next == 39){topBlock = glowingmagentagrass.getDefaultState();}
        else if(next == 40){topBlock = orangegrass.getDefaultState();}
        else if(next == 41){topBlock = fancyorangegrass.getDefaultState();}
        else if(next == 42){topBlock = enchantedorangegrass.getDefaultState();}
        else if(next == 43){topBlock = glowingorangegrass.getDefaultState();}
        else if(next == 44){topBlock = pinkgrass.getDefaultState();}
        else if(next == 45){topBlock = fancypinkgrass.getDefaultState();}
        else if(next == 46){topBlock = enchantedpinkgrass.getDefaultState();}
        else if(next == 47){topBlock = glowingpinkgrass.getDefaultState();}
        else if(next == 48){topBlock = purplegrass.getDefaultState();}
        else if(next == 49){topBlock = fancypurplegrass.getDefaultState();}
        else if(next == 50){topBlock = enchantedpurplegrass.getDefaultState();}
        else if(next == 51){topBlock = glowingpurplegrass.getDefaultState();}
        else if(next == 52){topBlock = redgrass.getDefaultState();}
        else if(next == 53){topBlock = fancyredgrass.getDefaultState();}
        else if(next == 54){topBlock = enchantedredgrass.getDefaultState();}
        else if(next == 55){topBlock = glowingredgrass.getDefaultState();}
        else if(next == 56){topBlock = whitegrass.getDefaultState();}
        else if(next == 57){topBlock = fancywhitegrass.getDefaultState();}
        else if(next == 58){topBlock = enchantedwhitegrass.getDefaultState();}
        else if(next == 59){topBlock = glowingwhitegrass.getDefaultState();}
        else if(next == 60){topBlock = yellowgrass.getDefaultState();}
        else if(next == 61){topBlock = fancyyellowgrass.getDefaultState();}
        else if(next == 62){topBlock = enchantedyellowgrass.getDefaultState();}
        else if(next == 63){topBlock = glowingyellowgrass.getDefaultState();}
        else{topBlock = fancywhitegrass.getDefaultState();}
        return topBlock;
    }

}
