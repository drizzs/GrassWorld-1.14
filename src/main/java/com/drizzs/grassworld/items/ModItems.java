package com.drizzs.grassworld.items;

import com.drizzs.grassworld.entity.ModEntities;
import com.drizzs.grassworld.items.enchantedseed.*;
import com.drizzs.grassworld.items.endseed.fancy.*;
import com.drizzs.grassworld.items.endseed.normal.*;
import com.drizzs.grassworld.items.fancyseed.*;
import com.drizzs.grassworld.items.netherseed.fancy.*;
import com.drizzs.grassworld.items.netherseed.normal.*;
import com.drizzs.grassworld.items.normalseed.*;
import com.drizzs.grassworld.util.ItemGroupGW;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static void init()
    {
        GrassWorldItems.orangeseed = registerItem(new OrangeSeed(new Item.Properties().group(ItemGroupGW.instance)), "orangeseed");
        GrassWorldItems.blueseed = registerItem(new BlueSeed(new Item.Properties().group(ItemGroupGW.instance)), "blueseed");
        GrassWorldItems.redseed = registerItem(new RedSeed(new Item.Properties().group(ItemGroupGW.instance)), "redseed");
        GrassWorldItems.lightblueseed = registerItem(new LightBlueSeed(new Item.Properties().group(ItemGroupGW.instance)), "lightblueseed");
        GrassWorldItems.greyseed = registerItem(new GreySeed(new Item.Properties().group(ItemGroupGW.instance)), "greyseed");
        GrassWorldItems.lightgreyseed = registerItem(new LightGreySeed(new Item.Properties().group(ItemGroupGW.instance)), "lightgreyseed");
        GrassWorldItems.cyanseed = registerItem(new CyanSeed(new Item.Properties().group(ItemGroupGW.instance)), "cyanseed");
        GrassWorldItems.magentaseed = registerItem(new MagentaSeed(new Item.Properties().group(ItemGroupGW.instance)), "magentaseed");
        GrassWorldItems.purpleseed = registerItem(new PurpleSeed(new Item.Properties().group(ItemGroupGW.instance)), "purpleseed");
        GrassWorldItems.pinkseed = registerItem(new PinkSeed(new Item.Properties().group(ItemGroupGW.instance)), "pinkseed");
        GrassWorldItems.greenseed = registerItem(new GreenSeed(new Item.Properties().group(ItemGroupGW.instance)), "greenseed");
        GrassWorldItems.limegreenseed = registerItem(new LimeGreenSeed(new Item.Properties().group(ItemGroupGW.instance)), "limegreenseed");
        GrassWorldItems.blackseed = registerItem(new BlackSeed(new Item.Properties().group(ItemGroupGW.instance)), "blackseed");
        GrassWorldItems.whiteseed = registerItem(new WhiteSeed(new Item.Properties().group(ItemGroupGW.instance)), "whiteseed");
        GrassWorldItems.brownseed = registerItem(new BrownSeed(new Item.Properties().group(ItemGroupGW.instance)), "brownseed");
        GrassWorldItems.yellowseed = registerItem(new YellowSeed(new Item.Properties().group(ItemGroupGW.instance)), "yellowseed");

        GrassWorldItems.fancy_orangeseed = registerItem(new FancyOrangeSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancy_orangeseed");
        GrassWorldItems.fancy_blueseed = registerItem(new FancyBlueSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancy_blueseed");
        GrassWorldItems.fancy_redseed = registerItem(new FancyRedSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancy_redseed");
        GrassWorldItems.fancy_lightblueseed = registerItem(new FancyLightBlueSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancy_lightblueseed");
        GrassWorldItems.fancy_greyseed = registerItem(new FancyGreySeed(new Item.Properties().group(ItemGroupGW.instance)), "fancy_greyseed");
        GrassWorldItems.fancy_lightgreyseed = registerItem(new FancyLightGreySeed(new Item.Properties().group(ItemGroupGW.instance)), "fancy_lightgreyseed");
        GrassWorldItems.fancy_cyanseed = registerItem(new FancyCyanSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancy_cyanseed");
        GrassWorldItems.fancy_magentaseed = registerItem(new FancyMagentaSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancy_magentaseed");
        GrassWorldItems.fancy_purpleseed = registerItem(new FancyPurpleSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancy_purpleseed");
        GrassWorldItems.fancy_pinkseed = registerItem(new FancyPinkSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancy_pinkseed");
        GrassWorldItems.fancy_greenseed = registerItem(new FancyGreenSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancy_greenseed");
        GrassWorldItems.fancy_limegreenseed = registerItem(new FancyLimeGreenSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancy_limegreenseed");
        GrassWorldItems.fancy_blackseed = registerItem(new FancyBlackSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancy_blackseed");
        GrassWorldItems.fancy_whiteseed = registerItem(new FancyWhiteSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancy_whiteseed");
        GrassWorldItems.fancy_brownseed = registerItem(new FancyBrownSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancy_brownseed");
        GrassWorldItems.fancy_yellowseed = registerItem(new FancyYellowSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancy_yellowseed");

        GrassWorldItems.enchanted_orangeseed = registerItem(new EnchantedOrangeSeed(new Item.Properties().group(ItemGroupGW.instance)), "enchanted_orangeseed");
        GrassWorldItems.enchanted_blueseed = registerItem(new EnchantedBlueSeed(new Item.Properties().group(ItemGroupGW.instance)), "enchanted_blueseed");
        GrassWorldItems.enchanted_redseed = registerItem(new EnchantedRedSeed(new Item.Properties().group(ItemGroupGW.instance)), "enchanted_redseed");
        GrassWorldItems.enchanted_lightblueseed = registerItem(new EnchantedLightBlueSeed(new Item.Properties().group(ItemGroupGW.instance)), "enchanted_lightblueseed");
        GrassWorldItems.enchanted_greyseed = registerItem(new EnchantedGreySeed(new Item.Properties().group(ItemGroupGW.instance)), "enchanted_greyseed");
        GrassWorldItems.enchanted_lightgreyseed = registerItem(new EnchantedLightGreySeed(new Item.Properties().group(ItemGroupGW.instance)), "enchanted_lightgreyseed");
        GrassWorldItems.enchanted_cyanseed = registerItem(new EnchantedCyanSeed(new Item.Properties().group(ItemGroupGW.instance)), "enchanted_cyanseed");
        GrassWorldItems.enchanted_magentaseed = registerItem(new EnchantedMagentaSeed(new Item.Properties().group(ItemGroupGW.instance)), "enchanted_magentaseed");
        GrassWorldItems.enchanted_purpleseed = registerItem(new EnchantedPurpleSeed(new Item.Properties().group(ItemGroupGW.instance)), "enchanted_purpleseed");
        GrassWorldItems.enchanted_pinkseed = registerItem(new EnchantedPinkSeed(new Item.Properties().group(ItemGroupGW.instance)), "enchanted_pinkseed");
        GrassWorldItems.enchanted_greenseed = registerItem(new EnchantedGreenSeed(new Item.Properties().group(ItemGroupGW.instance)), "enchanted_greenseed");
        GrassWorldItems.enchanted_limegreenseed = registerItem(new EnchantedLimeGreenSeed(new Item.Properties().group(ItemGroupGW.instance)), "enchanted_limegreenseed");
        GrassWorldItems.enchanted_blackseed = registerItem(new EnchantedBlackSeed(new Item.Properties().group(ItemGroupGW.instance)), "enchanted_blackseed");
        GrassWorldItems.enchanted_whiteseed = registerItem(new EnchantedWhiteSeed(new Item.Properties().group(ItemGroupGW.instance)), "enchanted_whiteseed");
        GrassWorldItems.enchanted_brownseed = registerItem(new EnchantedBrownSeed(new Item.Properties().group(ItemGroupGW.instance)), "enchanted_brownseed");
        GrassWorldItems.enchanted_yellowseed = registerItem(new EnchantedYellowSeed(new Item.Properties().group(ItemGroupGW.instance)), "enchanted_yellowseed");

        GrassWorldItems.orangeendseed = registerItem(new OrangeEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "orangeendseed");
        GrassWorldItems.blueendseed = registerItem(new BlueEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "blueendseed");
        GrassWorldItems.redendseed = registerItem(new RedEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "redendseed");
        GrassWorldItems.lightblueendseed = registerItem(new LightBlueEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "lightblueendseed");
        GrassWorldItems.greyendseed = registerItem(new GreyEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "greyendseed");
        GrassWorldItems.lightgreyendseed = registerItem(new LightGreyEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "lightgreyendseed");
        GrassWorldItems.cyanendseed = registerItem(new CyanEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "cyanendseed");
        GrassWorldItems.magentaendseed = registerItem(new MagentaEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "magentaendseed");
        GrassWorldItems.purpleendseed = registerItem(new PurpleEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "purpleendseed");
        GrassWorldItems.pinkendseed = registerItem(new PinkEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "pinkendseed");
        GrassWorldItems.greenendseed = registerItem(new GreenEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "greenendseed");
        GrassWorldItems.limegreenendseed = registerItem(new LimeGreenEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "limegreenendseed");
        GrassWorldItems.blackendseed = registerItem(new BlackEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "blackendseed");
        GrassWorldItems.whiteendseed = registerItem(new WhiteEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "whiteendseed");
        GrassWorldItems.brownendseed = registerItem(new BrownEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "brownendseed");
        GrassWorldItems.yellowendseed = registerItem(new YellowEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "yellowendseed");

        GrassWorldItems.orangenetherseed = registerItem(new OrangeNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "orangenetherseed");
        GrassWorldItems.bluenetherseed = registerItem(new BlueNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "bluenetherseed");
        GrassWorldItems.rednetherseed = registerItem(new RedNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "rednetherseed");
        GrassWorldItems.lightbluenetherseed = registerItem(new LightBlueNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "lightbluenetherseed");
        GrassWorldItems.greynetherseed = registerItem(new GreyNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "greynetherseed");
        GrassWorldItems.lightgreynetherseed = registerItem(new LightGreyNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "lightgreynetherseed");
        GrassWorldItems.cyannetherseed = registerItem(new CyanNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "cyannetherseed");
        GrassWorldItems.magentanetherseed = registerItem(new MagentaNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "magentanetherseed");
        GrassWorldItems.purplenetherseed = registerItem(new PurpleNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "purplenetherseed");
        GrassWorldItems.pinknetherseed = registerItem(new PinkNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "pinknetherseed");
        GrassWorldItems.greennetherseed = registerItem(new GreenNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "greennetherseed");
        GrassWorldItems.limegreennetherseed = registerItem(new LimeGreenNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "limegreennetherseed");
        GrassWorldItems.blacknetherseed = registerItem(new BlackNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "blacknetherseed");
        GrassWorldItems.whitenetherseed = registerItem(new WhiteNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "whitenetherseed");
        GrassWorldItems.brownnetherseed = registerItem(new BrownNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "brownnetherseed");
        GrassWorldItems.yellownetherseed = registerItem(new YellowNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "yellownetherseed");

        GrassWorldItems.fancyorangeendseed = registerItem(new FancyOrangeEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancyorangeendseed");
        GrassWorldItems.fancyblueendseed = registerItem(new FancyBlueEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancyblueendseed");
        GrassWorldItems.fancyredendseed = registerItem(new FancyRedEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancyredendseed");
        GrassWorldItems.fancylightblueendseed = registerItem(new FancyLightBlueEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancylightblueendseed");
        GrassWorldItems.fancygreyendseed = registerItem(new FancyGreyEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancygreyendseed");
        GrassWorldItems.fancylightgreyendseed = registerItem(new FancyLightGreyEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancylightgreyendseed");
        GrassWorldItems.fancycyanendseed = registerItem(new FancyCyanEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancycyanendseed");
        GrassWorldItems.fancymagentaendseed = registerItem(new FancyMagentaEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancymagentaendseed");
        GrassWorldItems.fancypurpleendseed = registerItem(new FancyPurpleEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancypurpleendseed");
        GrassWorldItems.fancypinkendseed = registerItem(new FancyPinkEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancypinkendseed");
        GrassWorldItems.fancygreenendseed = registerItem(new FancyGreenEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancygreenendseed");
        GrassWorldItems.fancylimegreenendseed = registerItem(new FancyLimeGreenEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancylimegreenendseed");
        GrassWorldItems.fancyblackendseed = registerItem(new FancyBlackEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancyblackendseed");
        GrassWorldItems.fancywhiteendseed = registerItem(new FancyWhiteEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancywhiteendseed");
        GrassWorldItems.fancybrownendseed = registerItem(new FancyBrownEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancybrownendseed");
        GrassWorldItems.fancyyellowendseed = registerItem(new FancyYellowEndSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancyyellowendseed");

        GrassWorldItems.fancyorangenetherseed = registerItem(new FancyOrangeNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancyorangenetherseed");
        GrassWorldItems.fancybluenetherseed = registerItem(new FancyBlueNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancybluenetherseed");
        GrassWorldItems.fancyrednetherseed = registerItem(new FancyRedNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancyrednetherseed");
        GrassWorldItems.fancylightbluenetherseed = registerItem(new FancyLightBlueNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancylightbluenetherseed");
        GrassWorldItems.fancygreynetherseed = registerItem(new FancyGreyNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancygreynetherseed");
        GrassWorldItems.fancylightgreynetherseed = registerItem(new FancyLightGreyNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancylightgreynetherseed");
        GrassWorldItems.fancycyannetherseed = registerItem(new FancyCyanNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancycyannetherseed");
        GrassWorldItems.fancymagentanetherseed = registerItem(new FancyMagentaNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancymagentanetherseed");
        GrassWorldItems.fancypurplenetherseed = registerItem(new FancyPurpleNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancypurplenetherseed");
        GrassWorldItems.fancypinknetherseed = registerItem(new FancyPinkNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancypinknetherseed");
        GrassWorldItems.fancygreennetherseed = registerItem(new FancyGreenNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancygreennetherseed");
        GrassWorldItems.fancylimegreennetherseed = registerItem(new FancyLimeGreenNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancylimegreennetherseed");
        GrassWorldItems.fancyblacknetherseed = registerItem(new FancyBlackNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancyblacknetherseed");
        GrassWorldItems.fancywhitenetherseed = registerItem(new FancyWhiteNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancywhitenetherseed");
        GrassWorldItems.fancybrownnetherseed = registerItem(new FancyBrownNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancybrownnetherseed");
        GrassWorldItems.fancyyellownetherseed = registerItem(new FancyYellowNetherSeed(new Item.Properties().group(ItemGroupGW.instance)), "fancyyellownetherseed");

        GrassWorldItems.gw_icon = registerItem(new Item(new Item.Properties()), "gw_icon");



    }

        public static Item registerItem(Item item, String name)
        {
            item.setRegistryName(name);
            ForgeRegistries.ITEMS.register(item);
            return item;
        }
}

