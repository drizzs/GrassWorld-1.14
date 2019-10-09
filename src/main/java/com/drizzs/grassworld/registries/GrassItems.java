package com.drizzs.grassworld.registries;

import com.drizzs.grassworld.items.GrassWorldSeed;
import com.drizzs.grassworld.items.GrassWorldSeed;
import com.drizzs.grassworld.items.GrassWorldSeed;
import com.drizzs.grassworld.util.group.GrassGroup;
import com.drizzs.grassworld.util.lib.GrassContentLib;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrassItems {

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {

        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "orangeseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "blueseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "redseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "lightblueseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "greyseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "lightgreyseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "cyanseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "magentaseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "purpleseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "pinkseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "greenseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "limegreenseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "blackseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "whiteseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "brownseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "yellowseed"));

        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancyorangeseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancyblueseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancyredseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancylightblueseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancygreyseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancylightgreyseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancycyanseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancymagentaseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancypurpleseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancypinkseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancygreenseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancylimegreenseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancyblackseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancywhiteseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancybrownseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancyyellowseed"));

        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "enchantedorangeseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "enchantedblueseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "enchantedredseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "enchantedlightblueseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "enchantedgreyseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "enchantedlightgreyseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "enchantedcyanseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "enchantedmagentaseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "enchantedpurpleseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "enchantedpinkseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "enchantedgreenseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "enchantedlimegreenseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "enchantedblackseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "enchantedwhiteseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "enchantedbrownseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "enchantedyellowseed"));

        event.getRegistry().register(new GrassWorldSeed(new Item.Properties(), "glowingorangeseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties(), "glowingblueseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties(), "glowingredseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties(), "glowinglightblueseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties(), "glowinggreyseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties(), "glowinglightgreyseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties(), "glowingcyanseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties(), "glowingmagentaseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties(), "glowingpurpleseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties(), "glowingpinkseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties(), "glowinggreenseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties(), "glowinglimegreenseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties(), "glowingblackseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties(), "glowingwhiteseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties(), "glowingbrownseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties(), "glowingyellowseed"));

        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "orangeendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "blueendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "redendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "lightblueendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "greyendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "lightgreyendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "cyanendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "magentaendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "purpleendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "pinkendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "greenendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "limegreenendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "blackendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "whiteendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "brownendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "yellowendseed"));

        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancyorangeendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancyblueendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancyredendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancylightblueendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancygreyendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancylightgreyendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancycyanendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancymagentaendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancypurpleendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancypinkendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancygreenendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancylimegreenendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancyblackendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancywhiteendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancybrownendseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancyyellowendseed"));

        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "orangenetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "bluenetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "rednetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "lightbluenetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "greynetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "lightgreynetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "cyannetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "magentanetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "purplenetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "pinknetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "greennetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "limegreennetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "blacknetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "whitenetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "brownnetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "yellownetherseed"));

        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancyorangenetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancybluenetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancyrednetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancylightbluenetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancygreynetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancylightgreynetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancycyannetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancymagentanetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancypurplenetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancypinknetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancygreennetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancylimegreennetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancyblacknetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancywhitenetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancybrownnetherseed"));
        event.getRegistry().register(new GrassWorldSeed(new Item.Properties().group(GrassGroup.instance), "fancyyellownetherseed"));

        event.getRegistry().register(new Item(new Item.Properties()).setRegistryName("gwicon"));


    }

}

