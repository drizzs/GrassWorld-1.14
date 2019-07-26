package com.drizzs.grassworld.blocks;

import com.drizzs.grassworld.blocks.ActualGrass.ActualGrassOrange;
import com.drizzs.grassworld.blocks.enchantedgrass.*;
import com.drizzs.grassworld.blocks.fancygrass.*;
import com.drizzs.grassworld.blocks.normalgrass.*;
import com.drizzs.grassworld.util.ItemGroupGW;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;


public class ModBlocks
{
    public static void init()
    {
        GrassWorldBlocks.orange_grass = registerBlock(new OrangeGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "orange_grass");
        GrassWorldBlocks.blue_grass = registerBlock(new BlueGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "blue_grass");
        GrassWorldBlocks.black_grass = registerBlock(new BlackGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "black_grass");
        GrassWorldBlocks.white_grass = registerBlock(new WhiteGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "white_grass");
        GrassWorldBlocks.red_grass = registerBlock(new RedGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "red_grass");
        GrassWorldBlocks.yellow_grass = registerBlock(new YellowGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "yellow_grass");
        GrassWorldBlocks.purple_grass = registerBlock(new PurpleGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "purple_grass");
        GrassWorldBlocks.pink_grass = registerBlock(new PinkGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "pink_grass");
        GrassWorldBlocks.brown_grass = registerBlock(new BrownGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "brown_grass");
        GrassWorldBlocks.grey_grass = registerBlock(new GreyGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "grey_grass");
        GrassWorldBlocks.lightgrey_grass = registerBlock(new LightGreyGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "lightgrey_grass");
        GrassWorldBlocks.lightblue_grass = registerBlock(new LightBlueGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "lightblue_grass");
        GrassWorldBlocks.limegreen_grass = registerBlock(new LimeGreenGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "limegreen_grass");
        GrassWorldBlocks.green_grass = registerBlock(new GreenGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "green_grass");
        GrassWorldBlocks.magenta_grass = registerBlock(new MagentaGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "magenta_grass");
        GrassWorldBlocks.cyan_grass = registerBlock(new CyanGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "cyan_grass");

        GrassWorldBlocks.fancy_orange_grass = registerBlock(new FancyOrangeGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancy_orange_grass");
        GrassWorldBlocks.fancy_blue_grass = registerBlock(new FancyBlueGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancy_blue_grass");
        GrassWorldBlocks.fancy_black_grass = registerBlock(new FancyBlackGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancy_black_grass");
        GrassWorldBlocks.fancy_white_grass = registerBlock(new FancyWhiteGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancy_white_grass");
        GrassWorldBlocks.fancy_red_grass = registerBlock(new FancyRedGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancy_red_grass");
        GrassWorldBlocks.fancy_yellow_grass = registerBlock(new FancyYellowGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancy_yellow_grass");
        GrassWorldBlocks.fancy_purple_grass = registerBlock(new FancyPurpleGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancy_purple_grass");
        GrassWorldBlocks.fancy_pink_grass = registerBlock(new FancyPinkGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancy_pink_grass");
        GrassWorldBlocks.fancy_brown_grass = registerBlock(new FancyBrownGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancy_brown_grass");
        GrassWorldBlocks.fancy_grey_grass = registerBlock(new FancyGreyGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancy_grey_grass");
        GrassWorldBlocks.fancy_lightgrey_grass = registerBlock(new FancyLightGreyGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancy_lightgrey_grass");
        GrassWorldBlocks.fancy_lightblue_grass = registerBlock(new FancyLightBlueGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancy_lightblue_grass");
        GrassWorldBlocks.fancy_limegreen_grass = registerBlock(new FancyLimeGreenGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancy_limegreen_grass");
        GrassWorldBlocks.fancy_green_grass = registerBlock(new FancyGreenGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancy_green_grass");
        GrassWorldBlocks.fancy_magenta_grass = registerBlock(new FancyMagentaGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancy_magenta_grass");
        GrassWorldBlocks.fancy_cyan_grass = registerBlock(new FancyCyanGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancy_cyan_grass");

        GrassWorldBlocks.enchanted_orange_grass = registerBlock(new EnchantedOrangeGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "enchanted_orange_grass");
        GrassWorldBlocks.enchanted_blue_grass = registerBlock(new EnchantedBlueGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "enchanted_blue_grass");
        GrassWorldBlocks.enchanted_black_grass = registerBlock(new EnchantedBlackGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "enchanted_black_grass");
        GrassWorldBlocks.enchanted_white_grass = registerBlock(new EnchantedWhiteGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "enchanted_white_grass");
        GrassWorldBlocks.enchanted_red_grass = registerBlock(new EnchantedRedGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "enchanted_red_grass");
        GrassWorldBlocks.enchanted_yellow_grass = registerBlock(new EnchantedYellowGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "enchanted_yellow_grass");
        GrassWorldBlocks.enchanted_purple_grass = registerBlock(new EnchantedPurpleGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "enchanted_purple_grass");
        GrassWorldBlocks.enchanted_pink_grass = registerBlock(new EnchantedPinkGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "enchanted_pink_grass");
        GrassWorldBlocks.enchanted_brown_grass = registerBlock(new EnchantedBrownGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "enchanted_brown_grass");
        GrassWorldBlocks.enchanted_grey_grass = registerBlock(new EnchantedGreyGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "enchanted_grey_grass");
        GrassWorldBlocks.enchanted_lightgrey_grass = registerBlock(new EnchantedLightGreyGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "enchanted_lightgrey_grass");
        GrassWorldBlocks.enchanted_lightblue_grass = registerBlock(new EnchantedLightBlueGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "enchanted_lightblue_grass");
        GrassWorldBlocks.enchanted_limegreen_grass = registerBlock(new EnchantedLimeGreenGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "enchanted_limegreen_grass");
        GrassWorldBlocks.enchanted_green_grass = registerBlock(new EnchantedGreenGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "enchanted_green_grass");
        GrassWorldBlocks.enchanted_magenta_grass = registerBlock(new EnchantedMagentaGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "enchanted_magenta_grass");
        GrassWorldBlocks.enchanted_cyan_grass = registerBlock(new EnchantedCyanGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "enchanted_cyan_grass");

        GrassWorldBlocks.actualgrass_orange = registerBlock(new ActualGrassOrange((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_orange");
        GrassWorldBlocks.actualgrass_cyan = registerBlock(new ActualGrassOrange((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_cyan");
        GrassWorldBlocks.actualgrass_red = registerBlock(new ActualGrassOrange((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_red");
        GrassWorldBlocks.actualgrass_yellow = registerBlock(new ActualGrassOrange((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_yellow");
        GrassWorldBlocks.actualgrass_brown = registerBlock(new ActualGrassOrange((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_brown");
        GrassWorldBlocks.actualgrass_pink = registerBlock(new ActualGrassOrange((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_pink");
        GrassWorldBlocks.actualgrass_purple = registerBlock(new ActualGrassOrange((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_purple");
        GrassWorldBlocks.actualgrass_green = registerBlock(new ActualGrassOrange((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_green");
        GrassWorldBlocks.actualgrass_limegreen = registerBlock(new ActualGrassOrange((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_limegreen");
        GrassWorldBlocks.actualgrass_blue = registerBlock(new ActualGrassOrange((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_blue");
        GrassWorldBlocks.actualgrass_lightblue = registerBlock(new ActualGrassOrange((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_lightblue");
        GrassWorldBlocks.actualgrass_grey = registerBlock(new ActualGrassOrange((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_grey");
        GrassWorldBlocks.actualgrass_lightgrey = registerBlock(new ActualGrassOrange((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_lightgrey");
        GrassWorldBlocks.actualgrass_magenta = registerBlock(new ActualGrassOrange((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_magenta");
        GrassWorldBlocks.actualgrass_black = registerBlock(new ActualGrassOrange((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_black");
        GrassWorldBlocks.actualgrass_white = registerBlock(new ActualGrassOrange((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_white");


    }

    public static Block registerBlock(Block block, String name)
    {
        BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(ItemGroupGW.instance));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }

    public static Block registerBlock(Block block, BlockItem itemBlock, String name)
    {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);

        if (itemBlock != null)
        {
            itemBlock.setRegistryName(name);
            ForgeRegistries.ITEMS.register(itemBlock);
        }

        return block;
    }
}

