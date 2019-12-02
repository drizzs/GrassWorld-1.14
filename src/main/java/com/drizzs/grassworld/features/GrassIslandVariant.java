package com.drizzs.grassworld.features;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.DyeColor;
import net.minecraft.util.IStringSerializable;

import java.util.Locale;

import static com.drizzs.grassworld.registries.GrassRegistry.*;

public enum GrassIslandVariant implements IStringSerializable {

    BLACK(0, createArray(overworldGrass.get(DyeColor.BLACK).get(), fancyoverworldGrass.get(DyeColor.BLACK).get(), enchantedoverworldGrass.get(DyeColor.BLACK).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.BLACK).get(), actualgrass.get(DyeColor.BLACK).get())),
    BLUE(1, createArray(overworldGrass.get(DyeColor.BLUE).get(), fancyoverworldGrass.get(DyeColor.BLUE).get(), enchantedoverworldGrass.get(DyeColor.BLUE).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.BLUE).get(), actualgrass.get(DyeColor.BLUE).get())),
    BROWN(2, createArray(overworldGrass.get(DyeColor.BROWN).get(), fancyoverworldGrass.get(DyeColor.BROWN).get(), enchantedoverworldGrass.get(DyeColor.BROWN).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.BROWN).get(), actualgrass.get(DyeColor.BROWN).get())),
    CYAN(3, createArray(overworldGrass.get(DyeColor.CYAN).get(), fancyoverworldGrass.get(DyeColor.CYAN).get(), enchantedoverworldGrass.get(DyeColor.CYAN).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.CYAN).get(), actualgrass.get(DyeColor.CYAN).get())),
    GREEN(4, createArray(overworldGrass.get(DyeColor.GREEN).get(), fancyoverworldGrass.get(DyeColor.GREEN).get(), enchantedoverworldGrass.get(DyeColor.GREEN).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.GREEN).get(), actualgrass.get(DyeColor.GREEN).get())),
    GREY(5, createArray(overworldGrass.get(DyeColor.GRAY).get(), fancyoverworldGrass.get(DyeColor.GRAY).get(), enchantedoverworldGrass.get(DyeColor.GRAY).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.GRAY).get(), actualgrass.get(DyeColor.GRAY).get())),
    LIGHTBLUE(6, createArray(overworldGrass.get(DyeColor.LIGHT_BLUE).get(), fancyoverworldGrass.get(DyeColor.LIGHT_BLUE).get(), enchantedoverworldGrass.get(DyeColor.LIGHT_BLUE).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.LIGHT_BLUE).get(), actualgrass.get(DyeColor.LIGHT_BLUE).get())),
    LIGHTGREY(7, createArray(overworldGrass.get(DyeColor.LIGHT_GRAY).get(), fancyoverworldGrass.get(DyeColor.LIGHT_GRAY).get(), enchantedoverworldGrass.get(DyeColor.LIGHT_GRAY).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.LIGHT_GRAY).get(), actualgrass.get(DyeColor.LIGHT_GRAY).get())),
    LIME(8, createArray(overworldGrass.get(DyeColor.LIME).get(), fancyoverworldGrass.get(DyeColor.LIME).get(), enchantedoverworldGrass.get(DyeColor.LIME).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.LIME).get(), actualgrass.get(DyeColor.LIME).get())),
    MAGENTA(9, createArray(overworldGrass.get(DyeColor.MAGENTA).get(), fancyoverworldGrass.get(DyeColor.MAGENTA).get(), enchantedoverworldGrass.get(DyeColor.MAGENTA).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.MAGENTA).get(), actualgrass.get(DyeColor.MAGENTA).get())),
    ORANGE(10, createArray(overworldGrass.get(DyeColor.ORANGE).get(), fancyoverworldGrass.get(DyeColor.ORANGE).get(), enchantedoverworldGrass.get(DyeColor.ORANGE).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.ORANGE).get(), actualgrass.get(DyeColor.ORANGE).get())),
    PURPLE(11, createArray(overworldGrass.get(DyeColor.PURPLE).get(), fancyoverworldGrass.get(DyeColor.PURPLE).get(), enchantedoverworldGrass.get(DyeColor.PURPLE).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.PURPLE).get(), actualgrass.get(DyeColor.PURPLE).get())),
    PINK(12, createArray(overworldGrass.get(DyeColor.PINK).get(), fancyoverworldGrass.get(DyeColor.PINK).get(), enchantedoverworldGrass.get(DyeColor.PINK).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.PINK).get(), actualgrass.get(DyeColor.PINK).get())),
    RED(13, createArray(overworldGrass.get(DyeColor.RED).get(), fancyoverworldGrass.get(DyeColor.RED).get(), enchantedoverworldGrass.get(DyeColor.RED).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.RED).get(), actualgrass.get(DyeColor.RED).get())),
    WHITE(14, createArray(overworldGrass.get(DyeColor.WHITE).get(), fancyoverworldGrass.get(DyeColor.WHITE).get(), enchantedoverworldGrass.get(DyeColor.WHITE).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.WHITE).get(), actualgrass.get(DyeColor.WHITE).get())),
    YELLOW(15, createArray(overworldGrass.get(DyeColor.YELLOW).get(), fancyoverworldGrass.get(DyeColor.YELLOW).get(), enchantedoverworldGrass.get(DyeColor.YELLOW).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.YELLOW).get(), actualgrass.get(DyeColor.YELLOW).get())),

    BLACKEND(16, createArray(endGrass.get(DyeColor.BLACK).get(), fancyEndGrass.get(DyeColor.BLACK).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.BLACK).get(), actualgrass.get(DyeColor.BLACK).get())),
    BLUEEND(17, createArray(endGrass.get(DyeColor.BLUE).get(), fancyEndGrass.get(DyeColor.BLUE).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.BLUE).get(), actualgrass.get(DyeColor.BLUE).get())),
    BROWNEND(18, createArray(endGrass.get(DyeColor.BROWN).get(), fancyEndGrass.get(DyeColor.BROWN).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.BROWN).get(), actualgrass.get(DyeColor.BROWN).get())),
    CYANEND(19, createArray(endGrass.get(DyeColor.CYAN).get(), fancyEndGrass.get(DyeColor.CYAN).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.CYAN).get(), actualgrass.get(DyeColor.CYAN).get())),
    GREENEND(20, createArray(endGrass.get(DyeColor.GREEN).get(), fancyEndGrass.get(DyeColor.GREEN).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.GREEN).get(), actualgrass.get(DyeColor.GREEN).get())),
    GREYEND(21, createArray(endGrass.get(DyeColor.GRAY).get(), fancyEndGrass.get(DyeColor.GRAY).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.GRAY).get(), actualgrass.get(DyeColor.GRAY).get())),
    LIGHTBLUEEND(22, createArray(endGrass.get(DyeColor.LIGHT_BLUE).get(), fancyEndGrass.get(DyeColor.LIGHT_BLUE).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.LIGHT_BLUE).get(), actualgrass.get(DyeColor.LIGHT_BLUE).get())),
    LIGHTGREYEND(23, createArray(endGrass.get(DyeColor.LIGHT_GRAY).get(), fancyEndGrass.get(DyeColor.LIGHT_GRAY).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.LIGHT_GRAY).get(), actualgrass.get(DyeColor.LIGHT_GRAY).get())),
    LIMEEND(24, createArray(endGrass.get(DyeColor.LIME).get(), fancyEndGrass.get(DyeColor.LIME).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.LIME).get(), actualgrass.get(DyeColor.LIME).get())),
    MAGENTAEND(25, createArray(endGrass.get(DyeColor.MAGENTA).get(), fancyEndGrass.get(DyeColor.MAGENTA).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.MAGENTA).get(), actualgrass.get(DyeColor.MAGENTA).get())),
    ORANGEEND(26, createArray(endGrass.get(DyeColor.ORANGE).get(), fancyEndGrass.get(DyeColor.ORANGE).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.ORANGE).get(), actualgrass.get(DyeColor.ORANGE).get())),
    PURPLEEND(27, createArray(endGrass.get(DyeColor.PURPLE).get(), fancyEndGrass.get(DyeColor.PURPLE).get()), Blocks.WATER.getDefaultState(),  createArray(actualgrass.get(DyeColor.PURPLE).get(), actualgrass.get(DyeColor.PURPLE).get())),
    PINKEND(28, createArray(endGrass.get(DyeColor.PINK).get(), fancyEndGrass.get(DyeColor.PINK).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.PINK).get(), actualgrass.get(DyeColor.PINK).get())),
    REDEND(28, createArray(endGrass.get(DyeColor.RED).get(), fancyEndGrass.get(DyeColor.RED).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.RED).get(), actualgrass.get(DyeColor.RED).get())),
    WHITEEND(30, createArray(endGrass.get(DyeColor.WHITE).get(), fancyEndGrass.get(DyeColor.WHITE).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.WHITE).get(), actualgrass.get(DyeColor.WHITE).get())),
    YELLOWEND(31, createArray(endGrass.get(DyeColor.YELLOW).get(), fancyEndGrass.get(DyeColor.YELLOW).get()), Blocks.WATER.getDefaultState(), createArray(actualgrass.get(DyeColor.YELLOW).get(), actualgrass.get(DyeColor.YELLOW).get())),

    BLACKNETHER(32, createArray(netherGrass.get(DyeColor.BLACK).get(), fancyNetherGrass.get(DyeColor.BLACK).get()), Blocks.LAVA.getDefaultState(), createArray(actualgrass.get(DyeColor.BLACK).get(), actualgrass.get(DyeColor.BLACK).get())),
    BLUENETHER(33, createArray(netherGrass.get(DyeColor.BLUE).get(), fancyNetherGrass.get(DyeColor.BLUE).get()), Blocks.LAVA.getDefaultState(), createArray(actualgrass.get(DyeColor.BLUE).get(), actualgrass.get(DyeColor.BLUE).get())),
    BROWNNETHER(34, createArray(netherGrass.get(DyeColor.BROWN).get(), fancyNetherGrass.get(DyeColor.BROWN).get()), Blocks.LAVA.getDefaultState(), createArray(actualgrass.get(DyeColor.BROWN).get(), actualgrass.get(DyeColor.BROWN).get())),
    CYANNETHER(35, createArray(netherGrass.get(DyeColor.CYAN).get(), fancyNetherGrass.get(DyeColor.CYAN).get()), Blocks.LAVA.getDefaultState(), createArray(actualgrass.get(DyeColor.CYAN).get(), actualgrass.get(DyeColor.CYAN).get())),
    GREENNETHER(36, createArray(netherGrass.get(DyeColor.GREEN).get(), fancyNetherGrass.get(DyeColor.GREEN).get()), Blocks.LAVA.getDefaultState(), createArray(actualgrass.get(DyeColor.GREEN).get(), actualgrass.get(DyeColor.GREEN).get())),
    GREYNETHER(37, createArray(netherGrass.get(DyeColor.GRAY).get(), fancyNetherGrass.get(DyeColor.GRAY).get()), Blocks.LAVA.getDefaultState(), createArray(actualgrass.get(DyeColor.GRAY).get(), actualgrass.get(DyeColor.GRAY).get())),
    LIGHTBLUENETHER(38, createArray(netherGrass.get(DyeColor.LIGHT_BLUE).get(), fancyNetherGrass.get(DyeColor.LIGHT_BLUE).get()), Blocks.LAVA.getDefaultState(), createArray(actualgrass.get(DyeColor.LIGHT_BLUE).get(), actualgrass.get(DyeColor.LIGHT_BLUE).get())),
    LIGHTGREYNETHER(39, createArray(netherGrass.get(DyeColor.LIGHT_GRAY).get(), fancyNetherGrass.get(DyeColor.LIGHT_GRAY).get()), Blocks.LAVA.getDefaultState(), createArray(actualgrass.get(DyeColor.LIGHT_GRAY).get(), actualgrass.get(DyeColor.LIGHT_GRAY).get())),
    LIMENETHER(40, createArray(netherGrass.get(DyeColor.LIME).get(), fancyNetherGrass.get(DyeColor.LIME).get()), Blocks.LAVA.getDefaultState(), createArray(actualgrass.get(DyeColor.LIME).get(), actualgrass.get(DyeColor.LIME).get())),
    MAGENTANETHER(41, createArray(netherGrass.get(DyeColor.MAGENTA).get(), fancyNetherGrass.get(DyeColor.MAGENTA).get()), Blocks.LAVA.getDefaultState(), createArray(actualgrass.get(DyeColor.MAGENTA).get(), actualgrass.get(DyeColor.MAGENTA).get())),
    ORANGENETHER(42, createArray(netherGrass.get(DyeColor.ORANGE).get(), fancyNetherGrass.get(DyeColor.ORANGE).get()), Blocks.LAVA.getDefaultState(), createArray(actualgrass.get(DyeColor.ORANGE).get(), actualgrass.get(DyeColor.ORANGE).get())),
    PURPLENETHER(43, createArray(netherGrass.get(DyeColor.PURPLE).get(), fancyNetherGrass.get(DyeColor.PURPLE).get()), Blocks.LAVA.getDefaultState(),  createArray(actualgrass.get(DyeColor.PURPLE).get(), actualgrass.get(DyeColor.PURPLE).get())),
    PINKNETHER(44, createArray(netherGrass.get(DyeColor.PINK).get(), fancyNetherGrass.get(DyeColor.PINK).get()), Blocks.LAVA.getDefaultState(), createArray(actualgrass.get(DyeColor.PINK).get(), actualgrass.get(DyeColor.PINK).get())),
    REDNETHER(45, createArray(netherGrass.get(DyeColor.RED).get(), fancyNetherGrass.get(DyeColor.RED).get()), Blocks.LAVA.getDefaultState(), createArray(actualgrass.get(DyeColor.RED).get(), actualgrass.get(DyeColor.RED).get())),
    WHITENETHER(46, createArray(netherGrass.get(DyeColor.WHITE).get(), fancyNetherGrass.get(DyeColor.WHITE).get()), Blocks.LAVA.getDefaultState(), createArray(actualgrass.get(DyeColor.WHITE).get(), actualgrass.get(DyeColor.WHITE).get())),
    YELLOWNETHER(47, createArray(netherGrass.get(DyeColor.YELLOW).get(), fancyNetherGrass.get(DyeColor.YELLOW).get()), Blocks.LAVA.getDefaultState(), createArray(actualgrass.get(DyeColor.YELLOW).get(), actualgrass.get(DyeColor.YELLOW).get()));


    private final int index;
    private final Block[] grassBlock;
    private final BlockState lakeFluid;
    private final Block[] tallGrass;

    GrassIslandVariant(int index, Block[] grassBlock, BlockState lakeFluid, Block[] tallGrass) {
        this.index = index;
        this.grassBlock = grassBlock;
        this.tallGrass = tallGrass;
        this.lakeFluid = lakeFluid;


    }

    private static Block[] createArray(Block... states) {
        return states;
    }

    public Block[] getGrassBlock() {
        return this.grassBlock;
    }

    public BlockState getLakeFluid() {
        return this.lakeFluid;
    }

    public Block[] getTallGrass() {
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