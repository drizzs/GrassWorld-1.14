package com.drizzs.grassworld.features;

import com.drizzs.grassworld.util.lib.GrassContentLib;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.IStringSerializable;

import java.util.Locale;

public enum GrassIslandVariant implements IStringSerializable {
    BLACK(0, GrassContentLib.blackgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassblack.getDefaultState(), GrassContentLib.actualgrassblack.getDefaultState())),
    BLUE(1, GrassContentLib.bluegrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassblue.getDefaultState(), GrassContentLib.actualgrassblue.getDefaultState())),
    BROWN(2, GrassContentLib.browngrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassbrown.getDefaultState(), GrassContentLib.actualgrassbrown.getDefaultState())),
    CYAN(3, GrassContentLib.cyangrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrasscyan.getDefaultState(), GrassContentLib.actualgrasscyan.getDefaultState())),
    GREEN(4, GrassContentLib.greengrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassgreen.getDefaultState(), GrassContentLib.actualgrassgreen.getDefaultState())),
    GREY(5, GrassContentLib.greygrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassgrey.getDefaultState(), GrassContentLib.actualgrassgrey.getDefaultState())),
    LIGHTBLUE(6, GrassContentLib.lightbluegrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrasslightblue.getDefaultState(), GrassContentLib.actualgrasslightblue.getDefaultState())),
    LIGHTGREY(7, GrassContentLib.lightgreygrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrasslightgrey.getDefaultState(), GrassContentLib.actualgrasslightgrey.getDefaultState())),
    LIME(8, GrassContentLib.limegreengrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrasslimegreen.getDefaultState(), GrassContentLib.actualgrasslimegreen.getDefaultState())),
    MAGENTA(9, GrassContentLib.magentagrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassmagenta.getDefaultState(), GrassContentLib.actualgrassmagenta.getDefaultState())),
    ORANGE(10, GrassContentLib.orangegrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassorange.getDefaultState(), GrassContentLib.actualgrassorange.getDefaultState())),
    PURPLE(11, GrassContentLib.purplegrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrasspurple.getDefaultState(), GrassContentLib.actualgrasspurple.getDefaultState())),
    PINK(12, GrassContentLib.pinkgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrasspink.getDefaultState(), GrassContentLib.actualgrasspink.getDefaultState())),
    RED(13, GrassContentLib.redgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassred.getDefaultState(), GrassContentLib.actualgrassred.getDefaultState())),
    WHITE(14, GrassContentLib.whitegrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrasswhite.getDefaultState(), GrassContentLib.actualgrasswhite.getDefaultState())),
    YELLOW(15, GrassContentLib.yellowgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassyellow.getDefaultState(), GrassContentLib.actualgrassyellow.getDefaultState())),

    BLACKEND(16, GrassContentLib.blackendgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassblack.getDefaultState(), GrassContentLib.actualgrassblack.getDefaultState())),
    BLUEEND(17, GrassContentLib.blueendgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassblue.getDefaultState(), GrassContentLib.actualgrassblue.getDefaultState())),
    BROWNEND(18, GrassContentLib.brownendgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassbrown.getDefaultState(), GrassContentLib.actualgrassbrown.getDefaultState())),
    CYANEND(19, GrassContentLib.cyanendgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrasscyan.getDefaultState(), GrassContentLib.actualgrasscyan.getDefaultState())),
    GREENEND(20, GrassContentLib.greenendgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassgreen.getDefaultState(), GrassContentLib.actualgrassgreen.getDefaultState())),
    GREYEND(21, GrassContentLib.greengrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassgrey.getDefaultState(), GrassContentLib.actualgrassgrey.getDefaultState())),
    LIGHTBLUEEND(22, GrassContentLib.lightblueendgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrasslightblue.getDefaultState(), GrassContentLib.actualgrasslightblue.getDefaultState())),
    LIGHTGREYEND(23, GrassContentLib.lightgreyendgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrasslightgrey.getDefaultState(), GrassContentLib.actualgrasslightgrey.getDefaultState())),
    LIMEEND(24, GrassContentLib.limegreenendgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrasslimegreen.getDefaultState(), GrassContentLib.actualgrasslimegreen.getDefaultState())),
    MAGENTAEND(25, GrassContentLib.magentaendgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassmagenta.getDefaultState(), GrassContentLib.actualgrassmagenta.getDefaultState())),
    ORANGEEND(26, GrassContentLib.orangeendgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassorange.getDefaultState(), GrassContentLib.actualgrassorange.getDefaultState())),
    PURPLEEND(27, GrassContentLib.purpleendgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrasspurple.getDefaultState(), GrassContentLib.actualgrasspurple.getDefaultState())),
    PINKEND(28, GrassContentLib.pinkendgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrasspink.getDefaultState(), GrassContentLib.actualgrasspink.getDefaultState())),
    REDEND(28, GrassContentLib.redendgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassred.getDefaultState(), GrassContentLib.actualgrassred.getDefaultState())),
    WHITEEND(30, GrassContentLib.whiteendgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrasswhite.getDefaultState(), GrassContentLib.actualgrasswhite.getDefaultState())),
    YELLOWEND(31, GrassContentLib.yellowendgrass.getDefaultState(), Blocks.WATER.getDefaultState(), createArray(GrassContentLib.actualgrassyellow.getDefaultState(), GrassContentLib.actualgrassyellow.getDefaultState())),

    BLACKNETHER(32, GrassContentLib.blacknethergrass.getDefaultState(), Blocks.LAVA.getDefaultState(), createArray(GrassContentLib.actualgrassblack.getDefaultState(), GrassContentLib.actualgrassblack.getDefaultState())),
    BLUENETHER(33, GrassContentLib.bluenethergrass.getDefaultState(), Blocks.LAVA.getDefaultState(), createArray(GrassContentLib.actualgrassblue.getDefaultState(), GrassContentLib.actualgrassblue.getDefaultState())),
    BROWNNETHER(34, GrassContentLib.brownnethergrass.getDefaultState(), Blocks.LAVA.getDefaultState(), createArray(GrassContentLib.actualgrassbrown.getDefaultState(), GrassContentLib.actualgrassbrown.getDefaultState())),
    CYANNETHER(35, GrassContentLib.cyannethergrass.getDefaultState(), Blocks.LAVA.getDefaultState(), createArray(GrassContentLib.actualgrasscyan.getDefaultState(), GrassContentLib.actualgrasscyan.getDefaultState())),
    GREENNETHER(36, GrassContentLib.greennethergrass.getDefaultState(), Blocks.LAVA.getDefaultState(), createArray(GrassContentLib.actualgrassgreen.getDefaultState(), GrassContentLib.actualgrassgreen.getDefaultState())),
    GREYNETHER(37, GrassContentLib.greynethergrass.getDefaultState(), Blocks.LAVA.getDefaultState(), createArray(GrassContentLib.actualgrassgrey.getDefaultState(), GrassContentLib.actualgrassgrey.getDefaultState())),
    LIGHTBLUENETHER(38, GrassContentLib.lightbluenethergrass.getDefaultState(), Blocks.LAVA.getDefaultState(), createArray(GrassContentLib.actualgrasslightblue.getDefaultState(), GrassContentLib.actualgrasslightblue.getDefaultState())),
    LIGHTGREYNETHER(39, GrassContentLib.lightgreynethergrass.getDefaultState(), Blocks.LAVA.getDefaultState(), createArray(GrassContentLib.actualgrasslightgrey.getDefaultState(), GrassContentLib.actualgrasslightgrey.getDefaultState())),
    LIMENETHER(40, GrassContentLib.limegreennethergrass.getDefaultState(), Blocks.LAVA.getDefaultState(), createArray(GrassContentLib.actualgrasslimegreen.getDefaultState(), GrassContentLib.actualgrasslimegreen.getDefaultState())),
    MAGENTANETHER(41, GrassContentLib.magentanethergrass.getDefaultState(), Blocks.LAVA.getDefaultState(), createArray(GrassContentLib.actualgrassmagenta.getDefaultState(), GrassContentLib.actualgrassmagenta.getDefaultState())),
    ORANGENETHER(42, GrassContentLib.orangenethergrass.getDefaultState(), Blocks.LAVA.getDefaultState(), createArray(GrassContentLib.actualgrassorange.getDefaultState(), GrassContentLib.actualgrassorange.getDefaultState())),
    PURPLENETHER(43, GrassContentLib.pinknethergrass.getDefaultState(), Blocks.LAVA.getDefaultState(), createArray(GrassContentLib.actualgrasspurple.getDefaultState(), GrassContentLib.actualgrasspurple.getDefaultState())),
    PINKNETHER(44, GrassContentLib.pinknethergrass.getDefaultState(), Blocks.LAVA.getDefaultState(), createArray(GrassContentLib.actualgrasspink.getDefaultState(), GrassContentLib.actualgrasspink.getDefaultState())),
    REDNETHER(45, GrassContentLib.rednethergrass.getDefaultState(), Blocks.LAVA.getDefaultState(), createArray(GrassContentLib.actualgrassred.getDefaultState(), GrassContentLib.actualgrassred.getDefaultState())),
    WHITENETHER(46, GrassContentLib.whitenethergrass.getDefaultState(), Blocks.LAVA.getDefaultState(), createArray(GrassContentLib.actualgrasswhite.getDefaultState(), GrassContentLib.actualgrasswhite.getDefaultState())),
    YELLOWNETHER(47, GrassContentLib.yellownethergrass.getDefaultState(), Blocks.LAVA.getDefaultState(), createArray(GrassContentLib.actualgrassyellow.getDefaultState(), GrassContentLib.actualgrassyellow.getDefaultState()));


    private final int index;
    private final BlockState grassBlock;
    private final BlockState lakeFluid;
    private final BlockState[] tallGrass;

    GrassIslandVariant(int index, BlockState grassBlock, BlockState lakeFluid, BlockState[] tallGrass) {
        this.index = index;
        this.grassBlock = grassBlock;
        this.tallGrass = tallGrass;
        this.lakeFluid = lakeFluid;


    }

    private static BlockState[] createArray(BlockState... states) {
        return states;
    }

    public BlockState getGrassBlock() {
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