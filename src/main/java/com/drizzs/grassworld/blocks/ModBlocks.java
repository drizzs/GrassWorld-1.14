package com.drizzs.grassworld.blocks;

import com.drizzs.grassworld.blocks.ActualGrass.ActualGrass;
import com.drizzs.grassworld.blocks.enchantedgrass.*;
import com.drizzs.grassworld.blocks.endgrass.normal.*;
import com.drizzs.grassworld.blocks.fancygrass.*;
import com.drizzs.grassworld.blocks.glowinggrass.*;
import com.drizzs.grassworld.blocks.nethergrass.fancy.*;
import com.drizzs.grassworld.blocks.nethergrass.normal.*;
import com.drizzs.grassworld.blocks.normalgrass.*;
import com.drizzs.grassworld.util.ItemGroupGW;
import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks
{

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
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

        GrassWorldBlocks.actualgrass_orange = registerBlock(new ActualGrass((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_orange");
        GrassWorldBlocks.actualgrass_cyan = registerBlock(new ActualGrass((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_cyan");
        GrassWorldBlocks.actualgrass_red = registerBlock(new ActualGrass((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_red");
        GrassWorldBlocks.actualgrass_yellow = registerBlock(new ActualGrass((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_yellow");
        GrassWorldBlocks.actualgrass_brown = registerBlock(new ActualGrass((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_brown");
        GrassWorldBlocks.actualgrass_pink = registerBlock(new ActualGrass((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_pink");
        GrassWorldBlocks.actualgrass_purple = registerBlock(new ActualGrass((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_purple");
        GrassWorldBlocks.actualgrass_green = registerBlock(new ActualGrass((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_green");
        GrassWorldBlocks.actualgrass_limegreen = registerBlock(new ActualGrass((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_limegreen");
        GrassWorldBlocks.actualgrass_blue = registerBlock(new ActualGrass((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_blue");
        GrassWorldBlocks.actualgrass_lightblue = registerBlock(new ActualGrass((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_lightblue");
        GrassWorldBlocks.actualgrass_grey = registerBlock(new ActualGrass((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_grey");
        GrassWorldBlocks.actualgrass_lightgrey = registerBlock(new ActualGrass((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_lightgrey");
        GrassWorldBlocks.actualgrass_magenta = registerBlock(new ActualGrass((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_magenta");
        GrassWorldBlocks.actualgrass_black = registerBlock(new ActualGrass((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_black");
        GrassWorldBlocks.actualgrass_white = registerBlock(new ActualGrass((Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT))), "actualgrass_white");

        GrassWorldBlocks.plankblack = registerBlock(new Block((Block.Properties.create(Material.WOOD, MaterialColor.BLACK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "plankblack");
        GrassWorldBlocks.plankred = registerBlock(new Block((Block.Properties.create(Material.WOOD, MaterialColor.RED).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "plankred");
        GrassWorldBlocks.plankyellow = registerBlock(new Block((Block.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "plankyellow");
        GrassWorldBlocks.plankblue = registerBlock(new Block((Block.Properties.create(Material.WOOD, MaterialColor.BLUE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "plankblue");
        GrassWorldBlocks.planklightblue = registerBlock(new Block((Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_BLUE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "planklightblue");
        GrassWorldBlocks.plankgrey = registerBlock(new Block((Block.Properties.create(Material.WOOD, MaterialColor.GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "plankgrey");
        GrassWorldBlocks.planklightgrey = registerBlock(new Block((Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "planklightgrey");
        GrassWorldBlocks.plankgreen = registerBlock(new Block((Block.Properties.create(Material.WOOD, MaterialColor.GREEN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "plankgreen");
        GrassWorldBlocks.planklimegreen = registerBlock(new Block((Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "planklimegreen");
        GrassWorldBlocks.plankorange = registerBlock(new Block((Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "plankorange");
        GrassWorldBlocks.plankpink = registerBlock(new Block((Block.Properties.create(Material.WOOD, MaterialColor.PINK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "plankpink");
        GrassWorldBlocks.plankmagenta = registerBlock(new Block((Block.Properties.create(Material.WOOD, MaterialColor.MAGENTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "plankmagenta");
        GrassWorldBlocks.plankcyan = registerBlock(new Block((Block.Properties.create(Material.WOOD, MaterialColor.CYAN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "plankcyan");
        GrassWorldBlocks.plankpurple = registerBlock(new Block((Block.Properties.create(Material.WOOD, MaterialColor.PURPLE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "plankpurple");
        GrassWorldBlocks.plankwhite = registerBlock(new Block((Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "plankwhite");
        GrassWorldBlocks.plankbrown = registerBlock(new Block((Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "plankbrown");

        GrassWorldBlocks.orangeendgrass = registerBlock(new OrangeEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "orangeendgrass");
        GrassWorldBlocks.blueendgrass = registerBlock(new BlueEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "blueendgrass");
        GrassWorldBlocks.blackendgrass = registerBlock(new BlackEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "blackendgrass");
        GrassWorldBlocks.whiteendgrass = registerBlock(new WhiteEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "whiteendgrass");
        GrassWorldBlocks.redendgrass = registerBlock(new RedEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "redendgrass");
        GrassWorldBlocks.yellowendgrass = registerBlock(new YellowEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "yellowendgrass");
        GrassWorldBlocks.purpleendgrass = registerBlock(new PurpleEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "purpleendgrass");
        GrassWorldBlocks.pinkendgrass = registerBlock(new PinkEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "pinkendgrass");
        GrassWorldBlocks.brownendgrass = registerBlock(new BrownEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "brownendgrass");
        GrassWorldBlocks.greyendgrass = registerBlock(new GreyEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "greyendgrass");
        GrassWorldBlocks.lightgreyendgrass = registerBlock(new LightGreyEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "lightgreyendgrass");
        GrassWorldBlocks.lightblueendgrass = registerBlock(new LightBlueEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "lightblueendgrass");
        GrassWorldBlocks.limegreenendgrass = registerBlock(new LimeGreenEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "limegreenendgrass");
        GrassWorldBlocks.greenendgrass = registerBlock(new GreenEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "greenendgrass");
        GrassWorldBlocks.magentaendgrass = registerBlock(new MagentaEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "magentaendgrass");
        GrassWorldBlocks.cyanendgrass = registerBlock(new CyanEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "cyanendgrass");

        GrassWorldBlocks.fancyorangeendgrass = registerBlock(new OrangeEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancyorangeendgrass");
        GrassWorldBlocks.fancyblueendgrass = registerBlock(new BlueEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancyblueendgrass");
        GrassWorldBlocks.fancyblackendgrass = registerBlock(new BlackEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancyblackendgrass");
        GrassWorldBlocks.fancywhiteendgrass = registerBlock(new WhiteEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancywhiteendgrass");
        GrassWorldBlocks.fancyredendgrass = registerBlock(new RedEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancyredendgrass");
        GrassWorldBlocks.fancyyellowendgrass = registerBlock(new YellowEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancyyellowendgrass");
        GrassWorldBlocks.fancypurpleendgrass = registerBlock(new PurpleEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancypurpleendgrass");
        GrassWorldBlocks.fancypinkendgrass = registerBlock(new PinkEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancypinkendgrass");
        GrassWorldBlocks.fancybrownendgrass = registerBlock(new BrownEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancybrownendgrass");
        GrassWorldBlocks.fancygreyendgrass = registerBlock(new GreyEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancygreyendgrass");
        GrassWorldBlocks.fancylightgreyendgrass = registerBlock(new LightGreyEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancylightgreyendgrass");
        GrassWorldBlocks.fancylightblueendgrass = registerBlock(new LightBlueEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancylightblueendgrass");
        GrassWorldBlocks.fancylimegreenendgrass = registerBlock(new LimeGreenEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancylimegreenendgrass");
        GrassWorldBlocks.fancygreenendgrass = registerBlock(new GreenEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancygreenendgrass");
        GrassWorldBlocks.fancymagentaendgrass = registerBlock(new MagentaEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancymagentaendgrass");
        GrassWorldBlocks.fancycyanendgrass = registerBlock(new CyanEndGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancycyanendgrass");

        GrassWorldBlocks.orangenethergrass = registerBlock(new OrangeNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "orangenethergrass");
        GrassWorldBlocks.bluenethergrass = registerBlock(new BlueNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "bluenethergrass");
        GrassWorldBlocks.blacknethergrass = registerBlock(new BlackNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "blacknethergrass");
        GrassWorldBlocks.whitenethergrass = registerBlock(new WhiteNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "whitenethergrass");
        GrassWorldBlocks.rednethergrass = registerBlock(new RedNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "rednethergrass");
        GrassWorldBlocks.yellownethergrass = registerBlock(new YellowNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "yellownethergrass");
        GrassWorldBlocks.purplenethergrass = registerBlock(new PurpleNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "purplenethergrass");
        GrassWorldBlocks.pinknethergrass = registerBlock(new PinkNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "pinknethergrass");
        GrassWorldBlocks.brownnethergrass = registerBlock(new BrownNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "brownnethergrass");
        GrassWorldBlocks.greynethergrass = registerBlock(new GreyNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "greynethergrass");
        GrassWorldBlocks.lightgreynethergrass = registerBlock(new LightGreyNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "lightgreynethergrass");
        GrassWorldBlocks.lightbluenethergrass = registerBlock(new LightBlueNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "lightbluenethergrass");
        GrassWorldBlocks.limegreennethergrass = registerBlock(new LimeGreenNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "limegreennethergrass");
        GrassWorldBlocks.greennethergrass = registerBlock(new GreenNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "greennethergrass");
        GrassWorldBlocks.magentanethergrass = registerBlock(new MagentaNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "magentanethergrass");
        GrassWorldBlocks.cyannethergrass = registerBlock(new CyanNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "cyannethergrass");

        GrassWorldBlocks.fancyorangenethergrass = registerBlock(new FancyOrangeNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancyorangenethergrass");
        GrassWorldBlocks.fancybluenethergrass = registerBlock(new FancyBlueNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancybluenethergrass");
        GrassWorldBlocks.fancyblacknethergrass = registerBlock(new FancyBlackNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancyblacknethergrass");
        GrassWorldBlocks.fancywhitenethergrass = registerBlock(new FancyWhiteNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancywhitenethergrass");
        GrassWorldBlocks.fancyrednethergrass = registerBlock(new FancyRedNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancyrednethergrass");
        GrassWorldBlocks.fancyyellownethergrass = registerBlock(new FancyYellowNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancyyellownethergrass");
        GrassWorldBlocks.fancypurplenethergrass = registerBlock(new FancyPurpleNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancypurplenethergrass");
        GrassWorldBlocks.fancypinknethergrass = registerBlock(new FancyPinkNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancypinknethergrass");
        GrassWorldBlocks.fancybrownnethergrass = registerBlock(new FancyBrownNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancybrownnethergrass");
        GrassWorldBlocks.fancygreynethergrass = registerBlock(new FancyGreyNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancygreynethergrass");
        GrassWorldBlocks.fancylightgreynethergrass = registerBlock(new FancyLightGreyNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancylightgreynethergrass");
        GrassWorldBlocks.fancylightbluenethergrass = registerBlock(new FancyLightBlueNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancylightbluenethergrass");
        GrassWorldBlocks.fancylimegreennethergrass = registerBlock(new FancyLimeGreenNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancylimegreennethergrass");
        GrassWorldBlocks.fancygreennethergrass = registerBlock(new FancyGreenNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancygreennethergrass");
        GrassWorldBlocks.fancymagentanethergrass = registerBlock(new FancyMagentaNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancymagentanethergrass");
        GrassWorldBlocks.fancycyannethergrass = registerBlock(new FancyCyanNetherGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "fancycyannethergrass");

        GrassWorldBlocks.black_log = registerBlock(new LogBlock(MaterialColor.BLACK, (Block.Properties.create(Material.WOOD, MaterialColor.BLACK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "black_log");
        GrassWorldBlocks.red_log = registerBlock(new LogBlock(MaterialColor.RED, (Block.Properties.create(Material.WOOD, MaterialColor.RED).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "red_log");
        GrassWorldBlocks.yellow_log = registerBlock(new LogBlock(MaterialColor.YELLOW, (Block.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "yellow_log");
        GrassWorldBlocks.blue_log = registerBlock(new LogBlock(MaterialColor.BLUE, (Block.Properties.create(Material.WOOD, MaterialColor.BLUE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "blue_log");
        GrassWorldBlocks.lightblue_log = registerBlock(new LogBlock(MaterialColor.LIGHT_BLUE, (Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_BLUE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "lightblue_log");
        GrassWorldBlocks.grey_log = registerBlock(new LogBlock(MaterialColor.GRAY, (Block.Properties.create(Material.WOOD, MaterialColor.GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "grey_log");
        GrassWorldBlocks.lightgrey_log = registerBlock(new LogBlock(MaterialColor.LIGHT_GRAY, (Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "lightgrey_log");
        GrassWorldBlocks.green_log = registerBlock(new LogBlock(MaterialColor.GREEN, (Block.Properties.create(Material.WOOD, MaterialColor.GREEN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "green_log");
        GrassWorldBlocks.limegreen_log = registerBlock(new LogBlock(MaterialColor.LIME, (Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "limegreen_log");
        GrassWorldBlocks.orange_log = registerBlock(new LogBlock(MaterialColor.ORANGE_TERRACOTTA, (Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "orange_log");
        GrassWorldBlocks.pink_log = registerBlock(new LogBlock(MaterialColor.PINK, (Block.Properties.create(Material.WOOD, MaterialColor.PINK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "pink_log");
        GrassWorldBlocks.magenta_log = registerBlock(new LogBlock(MaterialColor.MAGENTA, (Block.Properties.create(Material.WOOD, MaterialColor.MAGENTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "magenta_log");
        GrassWorldBlocks.cyan_log = registerBlock(new LogBlock(MaterialColor.CYAN, (Block.Properties.create(Material.WOOD, MaterialColor.CYAN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "cyan_log");
        GrassWorldBlocks.purple_log = registerBlock(new LogBlock(MaterialColor.PURPLE, (Block.Properties.create(Material.WOOD, MaterialColor.PURPLE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "purple_log");
        GrassWorldBlocks.white_log = registerBlock(new LogBlock(MaterialColor.WHITE_TERRACOTTA, (Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "white_log");
        GrassWorldBlocks.brown_log = registerBlock(new LogBlock(MaterialColor.BROWN, (Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))), "brown_log");

        GrassWorldBlocks.black_leaves = registerBlock(new LeavesBlock((Block.Properties.create(Material.LEAVES, MaterialColor.BLACK).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT))), "black_leaves");
        GrassWorldBlocks.red_leaves = registerBlock(new LeavesBlock((Block.Properties.create(Material.LEAVES, MaterialColor.RED).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT))), "red_leaves");
        GrassWorldBlocks.yellow_leaves = registerBlock(new LeavesBlock((Block.Properties.create(Material.LEAVES, MaterialColor.YELLOW).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT))), "yellow_leaves");
        GrassWorldBlocks.blue_leaves = registerBlock(new LeavesBlock((Block.Properties.create(Material.LEAVES, MaterialColor.BLUE).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT))), "blue_leaves");
        GrassWorldBlocks.lightblue_leaves = registerBlock(new LeavesBlock((Block.Properties.create(Material.LEAVES, MaterialColor.LIGHT_BLUE).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT))), "lightblue_leaves");
        GrassWorldBlocks.grey_leaves = registerBlock(new LeavesBlock((Block.Properties.create(Material.LEAVES, MaterialColor.GRAY).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT))), "grey_leaves");
        GrassWorldBlocks.lightgrey_leaves = registerBlock(new LeavesBlock((Block.Properties.create(Material.LEAVES, MaterialColor.LIGHT_GRAY).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT))), "lightgrey_leaves");
        GrassWorldBlocks.green_leaves = registerBlock(new LeavesBlock((Block.Properties.create(Material.LEAVES, MaterialColor.GREEN).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT))), "green_leaves");
        GrassWorldBlocks.limegreen_leaves = registerBlock(new LeavesBlock((Block.Properties.create(Material.LEAVES, MaterialColor.LIME).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT))), "limegreen_leaves");
        GrassWorldBlocks.orange_leaves = registerBlock(new LeavesBlock((Block.Properties.create(Material.LEAVES, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT))), "orange_leaves");
        GrassWorldBlocks.pink_leaves = registerBlock(new LeavesBlock((Block.Properties.create(Material.LEAVES, MaterialColor.PINK).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT))), "pink_leaves");
        GrassWorldBlocks.magenta_leaves = registerBlock(new LeavesBlock((Block.Properties.create(Material.LEAVES, MaterialColor.MAGENTA).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT))), "magenta_leaves");
        GrassWorldBlocks.cyan_leaves = registerBlock(new LeavesBlock((Block.Properties.create(Material.LEAVES, MaterialColor.CYAN).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT))), "cyan_leaves");
        GrassWorldBlocks.purple_leaves = registerBlock(new LeavesBlock((Block.Properties.create(Material.LEAVES, MaterialColor.PURPLE).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT))), "purple_leaves");
        GrassWorldBlocks.white_leaves = registerBlock(new LeavesBlock((Block.Properties.create(Material.LEAVES, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT))), "white_leaves");
        GrassWorldBlocks.brown_leaves = registerBlock(new LeavesBlock((Block.Properties.create(Material.LEAVES, MaterialColor.BROWN).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT))), "brown_leaves");

        GrassWorldBlocks.glowingorangegrass = registerBlock(new GlowingOrangeGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "glowingorangegrass");
        GrassWorldBlocks.glowingbluegrass = registerBlock(new GlowingBlueGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "glowingbluegrass");
        GrassWorldBlocks.glowingblackgrass = registerBlock(new GlowingBlackGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "glowingblackgrass");
        GrassWorldBlocks.glowingwhitegrass = registerBlock(new GlowingWhiteGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "glowingwhitegrass");
        GrassWorldBlocks.glowingredgrass = registerBlock(new GlowingRedGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "glowingredgrass");
        GrassWorldBlocks.glowingyellowgrass = registerBlock(new GlowingYellowGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "glowingyellowgrass");
        GrassWorldBlocks.glowingpurplegrass = registerBlock(new GlowingPurpleGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "glowingpurplegrass");
        GrassWorldBlocks.glowingpinkgrass = registerBlock(new GlowingPinkGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "glowingpinkgrass");
        GrassWorldBlocks.glowingbrowngrass = registerBlock(new GlowingBrownGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "glowingbrowngrass");
        GrassWorldBlocks.glowinggreygrass = registerBlock(new GlowingGreyGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "glowinggreygrass");
        GrassWorldBlocks.glowinglightgreygrass = registerBlock(new GlowingLightGreyGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "glowinglightgreygrass");
        GrassWorldBlocks.glowinglightbluegrass = registerBlock(new GlowingLightBlueGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "glowinglightbluegrass");
        GrassWorldBlocks.glowinglimegreengrass = registerBlock(new GlowingLimeGreenGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "glowinglimegreengrass");
        GrassWorldBlocks.glowinggreengrass = registerBlock(new GlowingGreenGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "glowinggreengrass");
        GrassWorldBlocks.glowingmagentagrass = registerBlock(new GlowingMagentaGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "glowingmagentagrass");
        GrassWorldBlocks.glowingcyangrass = registerBlock(new GlowingCyanGrass((Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT))), "glowingcyangrass");

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

