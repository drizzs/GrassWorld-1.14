package com.drizzs.grassworld.util;

import com.drizzs.grassworld.util.lib.GrassContentLib;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;

import java.util.Random;

public class StaticGrassHandlers
{
    private static BlockState[] createArray(BlockState... states) {
        return states;
    }

    public static BlockState[] getAllActualGrass() {
        return createArray(GrassContentLib.actualgrassblack.getDefaultState(), GrassContentLib.actualgrassblue.getDefaultState(), GrassContentLib.actualgrassbrown.getDefaultState(), GrassContentLib.actualgrasscyan.getDefaultState(), GrassContentLib.actualgrassgreen.getDefaultState(), GrassContentLib.actualgrassgrey.getDefaultState(), GrassContentLib.actualgrasslightblue.getDefaultState(), GrassContentLib.actualgrasslightgrey.getDefaultState(), GrassContentLib.actualgrasslimegreen.getDefaultState(), GrassContentLib.actualgrassmagenta.getDefaultState(), GrassContentLib.actualgrassorange.getDefaultState(), GrassContentLib.actualgrasspink.getDefaultState(), GrassContentLib.actualgrasspurple.getDefaultState(), GrassContentLib.actualgrassred.getDefaultState(), GrassContentLib.actualgrasswhite.getDefaultState(), GrassContentLib.actualgrassyellow.getDefaultState());
    }

    public static BlockState randomBlockSelector() {
        Random random = Minecraft.getInstance().world.rand;
        int next = random.nextInt(8);
        BlockState topBlock;
        if(next == 0){topBlock = GrassContentLib.blackgrass.getDefaultState();}
        else if(next == 1){topBlock = GrassContentLib.fancyblackgrass.getDefaultState();}
        else if(next == 2){topBlock = GrassContentLib.enchantedblackgrass.getDefaultState();}
        else if(next == 3){topBlock = GrassContentLib.glowingblackgrass.getDefaultState();}
        else if(next == 4){topBlock = GrassContentLib.bluegrass.getDefaultState();}
        else if(next == 5){topBlock = GrassContentLib.fancybluegrass.getDefaultState();}
        else if(next == 6){topBlock = GrassContentLib.enchantedbluegrass.getDefaultState();}
        else if(next == 7){topBlock = GrassContentLib.glowingbluegrass.getDefaultState();}
        else if(next == 8){topBlock = GrassContentLib.browngrass.getDefaultState();}
        else if(next == 9){topBlock = GrassContentLib.fancybrowngrass.getDefaultState();}
        else if(next == 10){topBlock = GrassContentLib.enchantedbrowngrass.getDefaultState();}
        else if(next == 11){topBlock = GrassContentLib.glowingbrowngrass.getDefaultState();}
        else if(next == 12){topBlock = GrassContentLib.cyangrass.getDefaultState();}
        else if(next == 13){topBlock = GrassContentLib.fancycyangrass.getDefaultState();}
        else if(next == 14){topBlock = GrassContentLib.enchantedcyangrass.getDefaultState();}
        else if(next == 15){topBlock = GrassContentLib.glowingcyangrass.getDefaultState();}
        else if(next == 16){topBlock = GrassContentLib.greengrass.getDefaultState();}
        else if(next == 17){topBlock = GrassContentLib.fancygreengrass.getDefaultState();}
        else if(next == 18){topBlock = GrassContentLib.enchantedgreengrass.getDefaultState();}
        else if(next == 19){topBlock = GrassContentLib.glowinggreengrass.getDefaultState();}
        else if(next == 20){topBlock = GrassContentLib.greygrass.getDefaultState();}
        else if(next == 21){topBlock = GrassContentLib.fancygreygrass.getDefaultState();}
        else if(next == 22){topBlock = GrassContentLib.enchantedgreygrass.getDefaultState();}
        else if(next == 23){topBlock = GrassContentLib.glowinggreygrass.getDefaultState();}
        else if(next == 24){topBlock = GrassContentLib.lightbluegrass.getDefaultState();}
        else if(next == 25){topBlock = GrassContentLib.fancylightbluegrass.getDefaultState();}
        else if(next == 26){topBlock = GrassContentLib.enchantedlightbluegrass.getDefaultState();}
        else if(next == 27){topBlock = GrassContentLib.glowinglightbluegrass.getDefaultState();}
        else if(next == 28){topBlock = GrassContentLib.lightgreygrass.getDefaultState();}
        else if(next == 29){topBlock = GrassContentLib.fancylightgreygrass.getDefaultState();}
        else if(next == 30){topBlock = GrassContentLib.enchantedlightgreygrass.getDefaultState();}
        else if(next == 31){topBlock = GrassContentLib.glowinglightgreygrass.getDefaultState();}
        else if(next == 32){topBlock = GrassContentLib.limegreengrass.getDefaultState();}
        else if(next == 33){topBlock = GrassContentLib.fancylimegreengrass.getDefaultState();}
        else if(next == 34){topBlock = GrassContentLib.enchantedlimegreengrass.getDefaultState();}
        else if(next == 35){topBlock = GrassContentLib.glowinglimegreengrass.getDefaultState();}
        else if(next == 36){topBlock = GrassContentLib.magentagrass.getDefaultState();}
        else if(next == 37){topBlock = GrassContentLib.fancymagentagrass.getDefaultState();}
        else if(next == 38){topBlock = GrassContentLib.enchantedmagentagrass.getDefaultState();}
        else if(next == 39){topBlock = GrassContentLib.glowingmagentagrass.getDefaultState();}
        else if(next == 40){topBlock = GrassContentLib.orangegrass.getDefaultState();}
        else if(next == 41){topBlock = GrassContentLib.fancyorangegrass.getDefaultState();}
        else if(next == 42){topBlock = GrassContentLib.enchantedorangegrass.getDefaultState();}
        else if(next == 43){topBlock = GrassContentLib.glowingorangegrass.getDefaultState();}
        else if(next == 44){topBlock = GrassContentLib.pinkgrass.getDefaultState();}
        else if(next == 45){topBlock = GrassContentLib.fancypinkgrass.getDefaultState();}
        else if(next == 46){topBlock = GrassContentLib.enchantedpinkgrass.getDefaultState();}
        else if(next == 47){topBlock = GrassContentLib.glowingpinkgrass.getDefaultState();}
        else if(next == 48){topBlock = GrassContentLib.purplegrass.getDefaultState();}
        else if(next == 49){topBlock = GrassContentLib.fancypurplegrass.getDefaultState();}
        else if(next == 50){topBlock = GrassContentLib.enchantedpurplegrass.getDefaultState();}
        else if(next == 51){topBlock = GrassContentLib.glowingpurplegrass.getDefaultState();}
        else if(next == 52){topBlock = GrassContentLib.redgrass.getDefaultState();}
        else if(next == 53){topBlock = GrassContentLib.fancyredgrass.getDefaultState();}
        else if(next == 54){topBlock = GrassContentLib.enchantedredgrass.getDefaultState();}
        else if(next == 55){topBlock = GrassContentLib.glowingredgrass.getDefaultState();}
        else if(next == 56){topBlock = GrassContentLib.whitegrass.getDefaultState();}
        else if(next == 57){topBlock = GrassContentLib.fancywhitegrass.getDefaultState();}
        else if(next == 58){topBlock = GrassContentLib.enchantedwhitegrass.getDefaultState();}
        else if(next == 59){topBlock = GrassContentLib.glowingwhitegrass.getDefaultState();}
        else if(next == 60){topBlock = GrassContentLib.yellowgrass.getDefaultState();}
        else if(next == 61){topBlock = GrassContentLib.fancyyellowgrass.getDefaultState();}
        else if(next == 62){topBlock = GrassContentLib.enchantedyellowgrass.getDefaultState();}
        else if(next == 63){topBlock = GrassContentLib.glowingyellowgrass.getDefaultState();}
        else{topBlock = GrassContentLib.fancywhitegrass.getDefaultState();}
        return topBlock;
    }

}
