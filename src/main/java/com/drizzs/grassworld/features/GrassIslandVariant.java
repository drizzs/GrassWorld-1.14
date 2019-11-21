package com.drizzs.grassworld.features;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.IStringSerializable;

import java.util.Locale;

import static com.drizzs.grassworld.util.lib.GrassContentLib.*;

public enum GrassIslandVariant implements IStringSerializable {
    BLACK(0, createArray(blackgrass.getDefaultState(), fancyblackgrass.getDefaultState(), enchantedblackgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassblack.getDefaultState(), actualgrassblack.getDefaultState())),
    BLUE(1, createArray(bluegrass.getDefaultState(), fancybluegrass.getDefaultState(), enchantedbluegrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassblue.getDefaultState(), actualgrassblue.getDefaultState())),
    BROWN(2, createArray(browngrass.getDefaultState(), fancybrowngrass.getDefaultState(), enchantedbrowngrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassbrown.getDefaultState(), actualgrassbrown.getDefaultState())),
    CYAN(3, createArray(cyangrass.getDefaultState(), fancycyangrass.getDefaultState(), enchantedcyangrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrasscyan.getDefaultState(), actualgrasscyan.getDefaultState())),
    GREEN(4, createArray(greengrass.getDefaultState(), fancygreengrass.getDefaultState(), enchantedgreengrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassgreen.getDefaultState(), actualgrassgreen.getDefaultState())),
    GREY(5, createArray(greygrass.getDefaultState(), fancygreygrass.getDefaultState(), enchantedgreygrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassgrey.getDefaultState(), actualgrassgrey.getDefaultState())),
    LIGHTBLUE(6, createArray(lightbluegrass.getDefaultState(), fancylightbluegrass.getDefaultState(), enchantedlightbluegrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrasslightblue.getDefaultState(), actualgrasslightblue.getDefaultState())),
    LIGHTGREY(7, createArray(lightgreygrass.getDefaultState(), fancylightgreygrass.getDefaultState(), enchantedlightgreygrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrasslightgrey.getDefaultState(), actualgrasslightgrey.getDefaultState())),
    LIME(8, createArray(limegreengrass.getDefaultState(), fancylimegreengrass.getDefaultState(), enchantedlimegreengrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrasslimegreen.getDefaultState(), actualgrasslimegreen.getDefaultState())),
    MAGENTA(9, createArray(magentagrass.getDefaultState(), fancymagentagrass.getDefaultState(), enchantedmagentagrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassmagenta.getDefaultState(), actualgrassmagenta.getDefaultState())),
    ORANGE(10, createArray(orangegrass.getDefaultState(), fancyorangegrass.getDefaultState(), enchantedorangegrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassorange.getDefaultState(), actualgrassorange.getDefaultState())),
    PURPLE(11, createArray(purplegrass.getDefaultState(), fancypurplegrass.getDefaultState(), enchantedpurplegrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrasspurple.getDefaultState(), actualgrasspurple.getDefaultState())),
    PINK(12, createArray(pinkgrass.getDefaultState(), fancypinkgrass.getDefaultState(), enchantedpinkgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrasspink.getDefaultState(), actualgrasspink.getDefaultState())),
    RED(13, createArray(redgrass.getDefaultState(), fancyredgrass.getDefaultState(), enchantedredgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassred.getDefaultState(), actualgrassred.getDefaultState())),
    WHITE(14, createArray(whitegrass.getDefaultState(), fancywhitegrass.getDefaultState(), enchantedwhitegrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrasswhite.getDefaultState(), actualgrasswhite.getDefaultState())),
    YELLOW(15, createArray(yellowgrass.getDefaultState(), fancyyellowgrass.getDefaultState(), enchantedyellowgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassyellow.getDefaultState(), actualgrassyellow.getDefaultState())),

    BLACKEND(16, createArray(blackendgrass.getDefaultState(), fancyblackendgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassblack.getDefaultState(), actualgrassblack.getDefaultState())),
    BLUEEND(17, createArray(blueendgrass.getDefaultState(), fancyblueendgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassblue.getDefaultState(), actualgrassblue.getDefaultState())),
    BROWNEND(18, createArray(brownendgrass.getDefaultState(), fancybrownendgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassbrown.getDefaultState(), actualgrassbrown.getDefaultState())),
    CYANEND(19, createArray(cyanendgrass.getDefaultState(), fancycyanendgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrasscyan.getDefaultState(), actualgrasscyan.getDefaultState())),
    GREENEND(20, createArray(greenendgrass.getDefaultState(), fancygreyendgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassgreen.getDefaultState(), actualgrassgreen.getDefaultState())),
    GREYEND(21, createArray(greengrass.getDefaultState(), fancygreyendgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassgrey.getDefaultState(), actualgrassgrey.getDefaultState())),
    LIGHTBLUEEND(22, createArray(lightblueendgrass.getDefaultState(), fancylightblueendgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrasslightblue.getDefaultState(), actualgrasslightblue.getDefaultState())),
    LIGHTGREYEND(23, createArray(lightgreyendgrass.getDefaultState(), fancylightgreyendgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrasslightgrey.getDefaultState(), actualgrasslightgrey.getDefaultState())),
    LIMEEND(24, createArray(limegreenendgrass.getDefaultState(), fancylimegreenendgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrasslimegreen.getDefaultState(), actualgrasslimegreen.getDefaultState())),
    MAGENTAEND(25, createArray(magentaendgrass.getDefaultState(), fancymagentaendgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassmagenta.getDefaultState(), actualgrassmagenta.getDefaultState())),
    ORANGEEND(26, createArray(orangeendgrass.getDefaultState(), fancyorangeendgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassorange.getDefaultState(), actualgrassorange.getDefaultState())),
    PURPLEEND(27, createArray(purpleendgrass.getDefaultState(), fancypurpleendgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrasspurple.getDefaultState(), actualgrasspurple.getDefaultState())),
    PINKEND(28, createArray(pinkendgrass.getDefaultState(), fancypinkendgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrasspink.getDefaultState(), actualgrasspink.getDefaultState())),
    REDEND(28, createArray(redendgrass.getDefaultState(), fancyredendgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassred.getDefaultState(), actualgrassred.getDefaultState())),
    WHITEEND(30, createArray(whiteendgrass.getDefaultState(), fancywhiteendgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrasswhite.getDefaultState(), actualgrasswhite.getDefaultState())),
    YELLOWEND(31, createArray(yellowendgrass.getDefaultState(), fancyyellowendgrass.getDefaultState()), Blocks.WATER.getDefaultState(), createArray(actualgrassyellow.getDefaultState(), actualgrassyellow.getDefaultState())),

    BLACKNETHER(32, createArray(blacknethergrass.getDefaultState(), fancyblacknethergrass.getDefaultState()), Blocks.LAVA.getDefaultState(), createArray(actualgrassblack.getDefaultState(), actualgrassblack.getDefaultState())),
    BLUENETHER(33, createArray(bluenethergrass.getDefaultState(), fancybluenethergrass.getDefaultState()), Blocks.LAVA.getDefaultState(), createArray(actualgrassblue.getDefaultState(), actualgrassblue.getDefaultState())),
    BROWNNETHER(34, createArray(brownnethergrass.getDefaultState(), fancybrownnethergrass.getDefaultState()), Blocks.LAVA.getDefaultState(), createArray(actualgrassbrown.getDefaultState(), actualgrassbrown.getDefaultState())),
    CYANNETHER(35, createArray(cyannethergrass.getDefaultState(), fancycyannethergrass.getDefaultState()), Blocks.LAVA.getDefaultState(), createArray(actualgrasscyan.getDefaultState(), actualgrasscyan.getDefaultState())),
    GREENNETHER(36, createArray(greennethergrass.getDefaultState(), fancygreynethergrass.getDefaultState()), Blocks.LAVA.getDefaultState(), createArray(actualgrassgreen.getDefaultState(), actualgrassgreen.getDefaultState())),
    GREYNETHER(37, createArray(greynethergrass.getDefaultState(), fancygreynethergrass.getDefaultState()), Blocks.LAVA.getDefaultState(), createArray(actualgrassgrey.getDefaultState(), actualgrassgrey.getDefaultState())),
    LIGHTBLUENETHER(38, createArray(lightbluenethergrass.getDefaultState(), fancylightbluenethergrass.getDefaultState()), Blocks.LAVA.getDefaultState(), createArray(actualgrasslightblue.getDefaultState(), actualgrasslightblue.getDefaultState())),
    LIGHTGREYNETHER(39, createArray(lightgreynethergrass.getDefaultState(), fancylightgreynethergrass.getDefaultState()), Blocks.LAVA.getDefaultState(), createArray(actualgrasslightgrey.getDefaultState(), actualgrasslightgrey.getDefaultState())),
    LIMENETHER(40, createArray(limegreennethergrass.getDefaultState(), fancylimegreennethergrass.getDefaultState()), Blocks.LAVA.getDefaultState(), createArray(actualgrasslimegreen.getDefaultState(), actualgrasslimegreen.getDefaultState())),
    MAGENTANETHER(41, createArray(magentanethergrass.getDefaultState(), fancymagentanethergrass.getDefaultState()), Blocks.LAVA.getDefaultState(), createArray(actualgrassmagenta.getDefaultState(), actualgrassmagenta.getDefaultState())),
    ORANGENETHER(42, createArray(orangenethergrass.getDefaultState(), fancyorangenethergrass.getDefaultState()), Blocks.LAVA.getDefaultState(), createArray(actualgrassorange.getDefaultState(), actualgrassorange.getDefaultState())),
    PURPLENETHER(43, createArray(purplenethergrass.getDefaultState(), fancypurplenethergrass.getDefaultState()), Blocks.LAVA.getDefaultState(), createArray(actualgrasspurple.getDefaultState(), actualgrasspurple.getDefaultState())),
    PINKNETHER(44, createArray(pinknethergrass.getDefaultState(), fancypinknethergrass.getDefaultState()), Blocks.LAVA.getDefaultState(), createArray(actualgrasspink.getDefaultState(), actualgrasspink.getDefaultState())),
    REDNETHER(45, createArray(rednethergrass.getDefaultState(), fancyrednethergrass.getDefaultState()), Blocks.LAVA.getDefaultState(), createArray(actualgrassred.getDefaultState(), actualgrassred.getDefaultState())),
    WHITENETHER(46, createArray(whitenethergrass.getDefaultState(), fancywhitenethergrass.getDefaultState()), Blocks.LAVA.getDefaultState(), createArray(actualgrasswhite.getDefaultState(), actualgrasswhite.getDefaultState())),
    YELLOWNETHER(47, createArray(yellownethergrass.getDefaultState(), fancyyellownethergrass.getDefaultState()), Blocks.LAVA.getDefaultState(), createArray(actualgrassyellow.getDefaultState(), actualgrassyellow.getDefaultState()));


    private final int index;
    private final BlockState[] grassBlock;
    private final BlockState lakeFluid;
    private final BlockState[] tallGrass;

    GrassIslandVariant(int index, BlockState[] grassBlock, BlockState lakeFluid, BlockState[] tallGrass) {
        this.index = index;
        this.grassBlock = grassBlock;
        this.tallGrass = tallGrass;
        this.lakeFluid = lakeFluid;


    }

    private static BlockState[] createArray(BlockState... states) {
        return states;
    }

    public BlockState[] getGrassBlock() {
        return this.grassBlock;
    }

    public BlockState getLakeFluid() {
        return this.lakeFluid;
    }

    public BlockState[] getTallGrass() {
        return this.tallGrass;
    }

    @Override
    public String getName() {
        return this.toString().toLowerCase(Locale.US);
    }

    public int getIndex() {
        return this.index;
    }

    public static GrassIslandVariant getVariantFromIndex(int index) {
        switch (index) {
            case 0:
                return BLACK;
            case 1:
                return BLUE;
            case 2:
                return BROWN;
            case 3:
                return CYAN;
            case 4:
                return GREEN;
            case 5:
                return GREY;
            case 6:
                return LIGHTBLUE;
            case 7:
                return LIGHTGREY;
            case 8:
                return LIME;
            case 9:
                return MAGENTA;
            case 10:
                return ORANGE;
            case 11:
                return PINK;
            case 12:
                return PURPLE;
            case 13:
                return RED;
            case 14:
                return WHITE;
            case 15:
                return YELLOW;
            case 16:
                return BLACKEND;
            case 17:
                return BLUEEND;
            case 18:
                return BROWNEND;
            case 19:
                return CYANEND;
            case 20:
                return GREENEND;
            case 21:
                return GREYEND;
            case 22:
                return LIGHTBLUEEND;
            case 23:
                return LIGHTGREYEND;
            case 24:
                return LIMEEND;
            case 25:
                return MAGENTAEND;
            case 26:
                return ORANGEEND;
            case 27:
                return PINKEND;
            case 28:
                return PURPLEEND;
            case 29:
                return REDEND;
            case 30:
                return WHITEEND;
            case 31:
                return YELLOWEND;
            case 32:
                return BLACKNETHER;
            case 33:
                return BLUENETHER;
            case 34:
                return BROWNNETHER;
            case 35:
                return CYANNETHER;
            case 36:
                return GREENNETHER;
            case 37:
                return GREYNETHER;
            case 38:
                return LIGHTBLUENETHER;
            case 39:
                return LIGHTGREYNETHER;
            case 40:
                return LIMENETHER;
            case 41:
                return MAGENTANETHER;
            case 42:
                return ORANGENETHER;
            case 43:
                return PINKNETHER;
            case 44:
                return PURPLENETHER;
            case 45:
                return REDNETHER;
            case 46:
                return WHITENETHER;
            case 47:
                return YELLOWNETHER;
            default:
                throw new IllegalStateException("Unexpected variant: " + index);
        }
    }
}