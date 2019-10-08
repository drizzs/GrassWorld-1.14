package com.drizzs.grassworld.update.registries;

import com.drizzs.grassworld.update.items.GrassWorldEndSeed;
import com.drizzs.grassworld.update.items.GrassWorldNetherSeed;
import com.drizzs.grassworld.update.items.GrassWorldSeed;
import com.drizzs.grassworld.update.util.group.GrassGroup;
import com.drizzs.grassworld.update.util.lib.GrassContentLib;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class GrassItems {

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        GrassContentLib.orangeseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.orange_grass.getDefaultState()), "orangeseed");
        GrassContentLib.blueseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.blue_grass.getDefaultState()), "blueseed");
        GrassContentLib.redseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.red_grass.getDefaultState()), "redseed");
        GrassContentLib.lightblueseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.lightblue_grass.getDefaultState()), "lightblueseed");
        GrassContentLib.greyseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.grey_grass.getDefaultState()), "greyseed");
        GrassContentLib.lightgreyseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.lightgrey_grass.getDefaultState()), "lightgreyseed");
        GrassContentLib.cyanseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.cyan_grass.getDefaultState()), "cyanseed");
        GrassContentLib.magentaseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.magenta_grass.getDefaultState()), "magentaseed");
        GrassContentLib.purpleseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.purple_grass.getDefaultState()), "purpleseed");
        GrassContentLib.pinkseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.pink_grass.getDefaultState()), "pinkseed");
        GrassContentLib.greenseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.green_grass.getDefaultState()), "greenseed");
        GrassContentLib.limegreenseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.limegreen_grass.getDefaultState()), "limegreenseed");
        GrassContentLib.blackseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.black_grass.getDefaultState()), "blackseed");
        GrassContentLib.whiteseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.white_grass.getDefaultState()), "whiteseed");
        GrassContentLib.brownseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.brown_grass.getDefaultState()), "brownseed");
        GrassContentLib.yellowseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.yellow_grass.getDefaultState()), "yellowseed");

        GrassContentLib.fancy_orangeseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancy_orange_grass.getDefaultState()), "fancy_orangeseed");
        GrassContentLib.fancy_blueseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancy_blue_grass.getDefaultState()), "fancy_blueseed");
        GrassContentLib.fancy_redseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancy_red_grass.getDefaultState()), "fancy_redseed");
        GrassContentLib.fancy_lightblueseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancy_lightblue_grass.getDefaultState()), "fancy_lightblueseed");
        GrassContentLib.fancy_greyseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancy_grey_grass.getDefaultState()), "fancy_greyseed");
        GrassContentLib.fancy_lightgreyseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancy_lightgrey_grass.getDefaultState()), "fancy_lightgreyseed");
        GrassContentLib.fancy_cyanseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancy_cyan_grass.getDefaultState()), "fancy_cyanseed");
        GrassContentLib.fancy_magentaseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancy_magenta_grass.getDefaultState()), "fancy_magentaseed");
        GrassContentLib.fancy_purpleseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancy_purple_grass.getDefaultState()), "fancy_purpleseed");
        GrassContentLib.fancy_pinkseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancy_pink_grass.getDefaultState()), "fancy_pinkseed");
        GrassContentLib.fancy_greenseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancy_green_grass.getDefaultState()), "fancy_greenseed");
        GrassContentLib.fancy_limegreenseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancy_limegreen_grass.getDefaultState()), "fancy_limegreenseed");
        GrassContentLib.fancy_blackseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancy_black_grass.getDefaultState()), "fancy_blackseed");
        GrassContentLib.fancy_whiteseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancy_white_grass.getDefaultState()), "fancy_whiteseed");
        GrassContentLib.fancy_brownseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancy_brown_grass.getDefaultState()), "fancy_brownseed");
        GrassContentLib.fancy_yellowseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancy_yellow_grass.getDefaultState()), "fancy_yellowseed");

        GrassContentLib.enchanted_orangeseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.enchanted_orange_grass.getDefaultState()), "enchanted_orangeseed");
        GrassContentLib.enchanted_blueseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.enchanted_blue_grass.getDefaultState()), "enchanted_blueseed");
        GrassContentLib.enchanted_redseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.enchanted_red_grass.getDefaultState()), "enchanted_redseed");
        GrassContentLib.enchanted_lightblueseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.enchanted_lightblue_grass.getDefaultState()), "enchanted_lightblueseed");
        GrassContentLib.enchanted_greyseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.enchanted_grey_grass.getDefaultState()), "enchanted_greyseed");
        GrassContentLib.enchanted_lightgreyseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.enchanted_lightgrey_grass.getDefaultState()), "enchanted_lightgreyseed");
        GrassContentLib.enchanted_cyanseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.enchanted_cyan_grass.getDefaultState()), "enchanted_cyanseed");
        GrassContentLib.enchanted_magentaseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.enchanted_magenta_grass.getDefaultState()), "enchanted_magentaseed");
        GrassContentLib.enchanted_purpleseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.enchanted_purple_grass.getDefaultState()), "enchanted_purpleseed");
        GrassContentLib.enchanted_pinkseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.enchanted_pink_grass.getDefaultState()), "enchanted_pinkseed");
        GrassContentLib.enchanted_greenseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.enchanted_green_grass.getDefaultState()), "enchanted_greenseed");
        GrassContentLib.enchanted_limegreenseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.enchanted_limegreen_grass.getDefaultState()), "enchanted_limegreenseed");
        GrassContentLib.enchanted_blackseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.enchanted_black_grass.getDefaultState()), "enchanted_blackseed");
        GrassContentLib.enchanted_whiteseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.enchanted_white_grass.getDefaultState()), "enchanted_whiteseed");
        GrassContentLib.enchanted_brownseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.enchanted_brown_grass.getDefaultState()), "enchanted_brownseed");
        GrassContentLib.enchanted_yellowseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.enchanted_yellow_grass.getDefaultState()), "enchanted_yellowseed");

        GrassContentLib.glowingorangeseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties(), GrassContentLib.glowingorangegrass.getDefaultState()), "glowingorangeseed");
        GrassContentLib.glowingblueseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties(), GrassContentLib.glowingbluegrass.getDefaultState()), "glowingblueseed");
        GrassContentLib.glowingredseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties(), GrassContentLib.glowingredgrass.getDefaultState()), "glowingredseed");
        GrassContentLib.glowinglightblueseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties(), GrassContentLib.glowinglightbluegrass.getDefaultState()), "glowinglightblueseed");
        GrassContentLib.glowinggreyseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties(), GrassContentLib.glowinggreygrass.getDefaultState()), "glowinggreyseed");
        GrassContentLib.glowinglightgreyseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties(), GrassContentLib.glowinglightgreygrass.getDefaultState()), "glowinglightgreyseed");
        GrassContentLib.glowingcyanseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties(), GrassContentLib.glowingcyangrass.getDefaultState()), "glowingcyanseed");
        GrassContentLib.glowingmagentaseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties(), GrassContentLib.glowingmagentagrass.getDefaultState()), "glowingmagentaseed");
        GrassContentLib.glowingpurpleseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties(), GrassContentLib.glowingpurplegrass.getDefaultState()), "glowingpurpleseed");
        GrassContentLib.glowingpinkseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties(), GrassContentLib.glowingpinkgrass.getDefaultState()), "glowingpinkseed");
        GrassContentLib.glowinggreenseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties(), GrassContentLib.glowinggreengrass.getDefaultState()), "glowinggreenseed");
        GrassContentLib.glowinglimegreenseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties(), GrassContentLib.glowinglimegreengrass.getDefaultState()), "glowinglimegreenseed");
        GrassContentLib.glowingblackseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties(), GrassContentLib.glowingblackgrass.getDefaultState()), "glowingblackseed");
        GrassContentLib.glowingwhiteseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties(), GrassContentLib.glowingwhitegrass.getDefaultState()), "glowingwhiteseed");
        GrassContentLib.glowingbrownseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties(), GrassContentLib.glowingbrowngrass.getDefaultState()), "glowingbrownseed");
        GrassContentLib.glowingyellowseed = registerItem(event.getRegistry(), new GrassWorldSeed(new Item.Properties(), GrassContentLib.glowingyellowgrass.getDefaultState()), "glowingyellowseed");

        GrassContentLib.orangeendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.orangeendgrass.getDefaultState()), "orangeendseed");
        GrassContentLib.blueendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.blueendgrass.getDefaultState()), "blueendseed");
        GrassContentLib.redendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.redendgrass.getDefaultState()), "redendseed");
        GrassContentLib.lightblueendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.lightblueendgrass.getDefaultState()), "lightblueendseed");
        GrassContentLib.greyendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.greyendgrass.getDefaultState()), "greyendseed");
        GrassContentLib.lightgreyendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.lightgreyendgrass.getDefaultState()), "lightgreyendseed");
        GrassContentLib.cyanendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.cyanendgrass.getDefaultState()), "cyanendseed");
        GrassContentLib.magentaendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.magentaendgrass.getDefaultState()), "magentaendseed");
        GrassContentLib.purpleendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.purpleendgrass.getDefaultState()), "purpleendseed");
        GrassContentLib.pinkendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.pinkendgrass.getDefaultState()), "pinkendseed");
        GrassContentLib.greenendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.greenendgrass.getDefaultState()), "greenendseed");
        GrassContentLib.limegreenendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.limegreenendgrass.getDefaultState()), "limegreenendseed");
        GrassContentLib.blackendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.blackendgrass.getDefaultState()), "blackendseed");
        GrassContentLib.whiteendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.whiteendgrass.getDefaultState()), "whiteendseed");
        GrassContentLib.brownendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.brownendgrass.getDefaultState()), "brownendseed");
        GrassContentLib.yellowendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.yellowendgrass.getDefaultState()), "yellowendseed");

        GrassContentLib.fancyorangeendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancyorangeendgrass.getDefaultState()), "fancyorangeendseed");
        GrassContentLib.fancyblueendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancyblueendgrass.getDefaultState()), "fancyblueendseed");
        GrassContentLib.fancyredendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancyredendgrass.getDefaultState()), "fancyredendseed");
        GrassContentLib.fancylightblueendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancylightblueendgrass.getDefaultState()), "fancylightblueendseed");
        GrassContentLib.fancygreyendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancygreyendgrass.getDefaultState()), "fancygreyendseed");
        GrassContentLib.fancylightgreyendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancylightgreyendgrass.getDefaultState()), "fancylightgreyendseed");
        GrassContentLib.fancycyanendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancycyanendgrass.getDefaultState()), "fancycyanendseed");
        GrassContentLib.fancymagentaendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancymagentaendgrass.getDefaultState()), "fancymagentaendseed");
        GrassContentLib.fancypurpleendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancypurpleendgrass.getDefaultState()), "fancypurpleendseed");
        GrassContentLib.fancypinkendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancypinkendgrass.getDefaultState()), "fancypinkendseed");
        GrassContentLib.fancygreenendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancygreenendgrass.getDefaultState()), "fancygreenendseed");
        GrassContentLib.fancylimegreenendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancylimegreenendgrass.getDefaultState()), "fancylimegreenendseed");
        GrassContentLib.fancyblackendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancyblackendgrass.getDefaultState()), "fancyblackendseed");
        GrassContentLib.fancywhiteendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancywhiteendgrass.getDefaultState()), "fancywhiteendseed");
        GrassContentLib.fancybrownendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancybrownendgrass.getDefaultState()), "fancybrownendseed");
        GrassContentLib.fancyyellowendseed = registerItem(event.getRegistry(), new GrassWorldEndSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancyyellowendgrass.getDefaultState()), "fancyyellowendseed");

        GrassContentLib.orangenetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.orangenethergrass.getDefaultState()), "orangenetherseed");
        GrassContentLib.bluenetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.bluenethergrass.getDefaultState()), "bluenetherseed");
        GrassContentLib.rednetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.rednethergrass.getDefaultState()), "rednetherseed");
        GrassContentLib.lightbluenetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.lightbluenethergrass.getDefaultState()), "lightbluenetherseed");
        GrassContentLib.greynetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.greynethergrass.getDefaultState()), "greynetherseed");
        GrassContentLib.lightgreynetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.lightgreynethergrass.getDefaultState()), "lightgreynetherseed");
        GrassContentLib.cyannetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.cyannethergrass.getDefaultState()), "cyannetherseed");
        GrassContentLib.magentanetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.magentanethergrass.getDefaultState()), "magentanetherseed");
        GrassContentLib.purplenetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.purplenethergrass.getDefaultState()), "purplenetherseed");
        GrassContentLib.pinknetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.pinknethergrass.getDefaultState()), "pinknetherseed");
        GrassContentLib.greennetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.greennethergrass.getDefaultState()), "greennetherseed");
        GrassContentLib.limegreennetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.limegreennethergrass.getDefaultState()), "limegreennetherseed");
        GrassContentLib.blacknetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.blacknethergrass.getDefaultState()), "blacknetherseed");
        GrassContentLib.whitenetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.whitenethergrass.getDefaultState()), "whitenetherseed");
        GrassContentLib.brownnetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.brownnethergrass.getDefaultState()), "brownnetherseed");
        GrassContentLib.yellownetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.yellownethergrass.getDefaultState()), "yellownetherseed");

        GrassContentLib.fancyorangenetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.orangenethergrass.getDefaultState()), "fancyorangenetherseed");
        GrassContentLib.fancybluenetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.bluenethergrass.getDefaultState()), "fancybluenetherseed");
        GrassContentLib.fancyrednetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.rednethergrass.getDefaultState()), "fancyrednetherseed");
        GrassContentLib.fancylightbluenetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.lightbluenethergrass.getDefaultState()), "fancylightbluenetherseed");
        GrassContentLib.fancygreynetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.greynethergrass.getDefaultState()), "fancygreynetherseed");
        GrassContentLib.fancylightgreynetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.lightgreynethergrass.getDefaultState()), "fancylightgreynetherseed");
        GrassContentLib.fancycyannetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.cyannethergrass.getDefaultState()), "fancycyannetherseed");
        GrassContentLib.fancymagentanetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.magentanethergrass.getDefaultState()), "fancymagentanetherseed");
        GrassContentLib.fancypurplenetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.purplenethergrass.getDefaultState()), "fancypurplenetherseed");
        GrassContentLib.fancypinknetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.pinknethergrass.getDefaultState()), "fancypinknetherseed");
        GrassContentLib.fancygreennetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.greennethergrass.getDefaultState()), "fancygreennetherseed");
        GrassContentLib.fancylimegreennetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.limegreennethergrass.getDefaultState()), "fancylimegreennetherseed");
        GrassContentLib.fancyblacknetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.blacknethergrass.getDefaultState()), "fancyblacknetherseed");
        GrassContentLib.fancywhitenetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.whitenethergrass.getDefaultState()), "fancywhitenetherseed");
        GrassContentLib.fancybrownnetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.brownnethergrass.getDefaultState()), "fancybrownnetherseed");
        GrassContentLib.fancyyellownetherseed = registerItem(event.getRegistry(), new GrassWorldNetherSeed(new Item.Properties().group(GrassGroup.instance), GrassContentLib.fancyyellownethergrass.getDefaultState()), "fancyyellownetherseed");

        GrassContentLib.gw_icon = registerItem(event.getRegistry(), new Item(new Item.Properties()), "gw_icon");


    }

    public static Item registerItem(IForgeRegistry<Item> registry, Item item, String name) {
        item.setRegistryName(name);
        registry.register(item);
        return item;
    }
}

