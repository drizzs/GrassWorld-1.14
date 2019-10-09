package com.drizzs.grassworld.util.tags;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

import static com.drizzs.grassworld.GrassWorld.MOD_ID;

public class GrassTags {

    public static class Items {
        //GrassColourTags
        public static final Tag<Item> BLUESEED = tag("colours/blueseed");
        public static final Tag<Item> BLACKSEED = tag("colours/blackseed");
        public static final Tag<Item> BROWNSEED = tag("colours/brownseed");
        public static final Tag<Item> CYANSEED = tag("colours/cyanseed");
        public static final Tag<Item> GREENSEED = tag("colours/greenseed");
        public static final Tag<Item> GREYSEED = tag("colours/greyseed");
        public static final Tag<Item> LIGHTGREYSEED = tag("colours/lightgreyseed");
        public static final Tag<Item> LIGHTBLUESEED = tag("colours/lightblueseed");
        public static final Tag<Item> LIMEGREENSEED = tag("colours/limegreenseed");
        public static final Tag<Item> PINKSEED = tag("colours/pinkseed");
        public static final Tag<Item> MAGENTASEED = tag("colours/magentaseed");
        public static final Tag<Item> PURPLESEED = tag("colours/purpleseed");
        public static final Tag<Item> YELLOWSEED = tag("colours/yellowseed");
        public static final Tag<Item> WHITESEED = tag("colours/whiteseed");
        public static final Tag<Item> ORANGESEED = tag("colours/orangeseed");
        public static final Tag<Item> REDSEED = tag("colours/redseed");

        public static final Tag<Item> NORMALSEED = tag("seedtypes/normalseed");
        public static final Tag<Item> FANCYSEED = tag("seedtypes/fancyseed");
        public static final Tag<Item> ENCHANTEDSEED = tag("seedtypes/enchantedseed");
        public static final Tag<Item> GLOWINGSEED = tag("seedtypes/glowingseed");

        public static final Tag<Item> DIRTSEED = tag("worldtypes/dirtseed");
        public static final Tag<Item> NETHERSEED = tag("worldtypes/netherseed");
        public static final Tag<Item> ENDSEED = tag("worldtypes/endseed");

        private static Tag<Item> tag(String name) {
            return new ItemTags.Wrapper(new ResourceLocation(MOD_ID, name));
        }
    }

    public static class Blocks {

        //Basics
        public static final Tag<Block> GRASSWORLDGRASS = tag("grassworldgrass");
        public static final Tag<Block> ISVALIDGROUND = tag("validground");

        //SeedDirtBlocks
        public static final Tag<Block> OVERWORLDSEEDDIRT = tag("seeddirttypes/overworldseeddirt");
        public static final Tag<Block> ENDSEEDDIRT = tag("seeddirttypes/endseeddirt");
        public static final Tag<Block> NETHERSEEDDIRT = tag("seeddirttypes/netherseeddirt");

        //GrassColourTags
        public static final Tag<Block> BLUEGRASS = tag("colours/bluegrass");
        public static final Tag<Block> BLACKGRASS = tag("colours/blackgrass");
        public static final Tag<Block> BROWNGRASS = tag("colours/browngrass");
        public static final Tag<Block> CYANGRASS = tag("colours/cyangrass");
        public static final Tag<Block> GREENGRASS = tag("colours/greengrass");
        public static final Tag<Block> GREYGRASS = tag("colours/greygrass");
        public static final Tag<Block> LIGHTGREYGRASS = tag("colours/lightgreygrass");
        public static final Tag<Block> LIGHTBLUEGRASS = tag("colours/lightbluegrass");
        public static final Tag<Block> LIMEGREENGRASS = tag("colours/limegreengrass");
        public static final Tag<Block> PINKGRASS = tag("colours/pinkgrass");
        public static final Tag<Block> MAGENTAGRASS = tag("colours/magentagrass");
        public static final Tag<Block> PURPLEGRASS = tag("colours/purplegrass");
        public static final Tag<Block> YELLOWGRASS = tag("colours/yellowgrass");
        public static final Tag<Block> WHITEGRASS = tag("colours/whitegrass");
        public static final Tag<Block> ORANGEGRASS = tag("colours/orangegrass");
        public static final Tag<Block> REDGRASS = tag("colours/redgrass");

        //GrassTypes
        public static final Tag<Block> ENCHANTEDGRASS = tag("colours/redgrass");
        public static final Tag<Block> FANCYGRASS = tag("colours/redgrass");
        public static final Tag<Block> GLOWINGGRASS = tag("colours/redgrass");
        public static final Tag<Block> NORMALGRASS = tag("colours/redgrass");

        //DirtTypes
        public static final Tag<Block> ENDGRASS = tag("dirttypes/endgrass");
        public static final Tag<Block> NETHERGRASS = tag("dirttypes/nethergrass");


        private static Tag<Block> tag(String name) {
            return new BlockTags.Wrapper(new ResourceLocation(MOD_ID, name));
        }
    }



}
