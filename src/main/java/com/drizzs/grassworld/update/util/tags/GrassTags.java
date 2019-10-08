package com.drizzs.grassworld.update.util.tags;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

import static com.drizzs.grassworld.GrassWorld.MOD_ID;

public class GrassTags {

    public static class Items {


        private static Tag<Item> tag(String name) {
            return new ItemTags.Wrapper(new ResourceLocation(MOD_ID, name));
        }
    }

    public static class Blocks {

        //Heat Sources
        public static final Tag<Block> GRASSWORLDGRASS = tag("grassworldgrass");
        public static final Tag<Block> ISVALIDGROUND = tag("validground");
        public static final Tag<Block> OVERWORLDSEEDDIRT = tag("overworldseeddirt");
        public static final Tag<Block> ENDSEEDDIRT = tag("endseeddirt");
        public static final Tag<Block> NETHERSEEDDIRT = tag("netherseeddirt");

        private static Tag<Block> tag(String name) {
            return new BlockTags.Wrapper(new ResourceLocation(MOD_ID, name));
        }
    }



}