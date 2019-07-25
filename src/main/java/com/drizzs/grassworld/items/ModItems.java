package com.drizzs.grassworld.items;

import com.drizzs.grassworld.items.enchantedseed.*;
import com.drizzs.grassworld.items.fancyseed.*;
import com.drizzs.grassworld.items.normalseed.*;
import com.drizzs.grassworld.util.ItemGroupGW;
import net.minecraft.item.Item;
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








        GrassWorldItems.gw_icon = registerItem(new Item(new Item.Properties()), "gw_icon");


    }

    public static Item registerItem(Item item, String name)
    {
        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }
}

