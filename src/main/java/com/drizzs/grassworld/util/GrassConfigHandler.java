package com.drizzs.grassworld.util;


import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class GrassConfigHandler {


    public static final Client CLIENT;
    public static final ForgeConfigSpec CLIENT_SPEC;

    public static final Common COMMON;
    public static final ForgeConfigSpec COMMON_SPEC;


    static {
        final Pair<Client, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Client::new);
        CLIENT_SPEC = specPair.getRight();
        CLIENT = specPair.getLeft();
    }

    static {
        final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON_SPEC = specPair.getRight();
        COMMON = specPair.getLeft();
    }

    public static class Client {
        public final ForgeConfigSpec.BooleanValue particleOn;


        public Client(ForgeConfigSpec.Builder builder) {
            builder.push("TestOreGen");
            particleOn = builder
                    .comment("Set this to true if you're not running a server in your mom's basement for 200 people!")
                    .define("particleOn", true);
            builder.pop();
        }

    }

    public static class Common {

        public final ForgeConfigSpec.BooleanValue ALLGRASSGROWTH;
        public final ForgeConfigSpec.BooleanValue ALLGRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue RAINBOWISLANDS;
        public final ForgeConfigSpec.BooleanValue GRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue ISLANDFEATURE;

        public final ForgeConfigSpec.BooleanValue BLUEGRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue BLACKGRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue BROWNGRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue CYANGRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue GREENGRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue GREYGRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue LIGHTBLUEGRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue LIGHTGREYGRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue LIMEGREENGRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue MAGENTAGRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue PINKGRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue PURPLEGRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue ORANGEGRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue REDGRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue WHITEGRASSFEATURE;
        public final ForgeConfigSpec.BooleanValue YELLOWGRASSFEATURE;

        public final ForgeConfigSpec.IntValue BLUEGRASSFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue BLACKGRASSFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue BROWNGRASSFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue CYANGRASSFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue GREENGRASSFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue GREYGRASSFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue LIGHTBLUEGRASSFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue LIGHTGREYGRASSFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue LIMEGREENGRASSFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue MAGENTAGRASSFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue PINKGRASSFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue PURPLEGRASSFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue ORANGEGRASSFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue REDGRASSFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue WHITEGRASSFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue YELLOWGRASSFEATUREWEIGHT;

        public final ForgeConfigSpec.BooleanValue BLUEISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue BLACKISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue BROWNISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue CYANISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue GREENISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue GREYISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue LIGHTBLUEISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue LIGHTGREYISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue LIMEGREENISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue MAGENTAISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue PINKISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue PURPLEISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue ORANGEISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue REDISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue WHITEISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue YELLOWISLANDFEATURE;

        public final ForgeConfigSpec.IntValue BLUEISLANDFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue BLACKISLANDFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue BROWNISLANDFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue CYANISLANDFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue GREENISLANDFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue GREYISLANDFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue LIGHTBLUEISLANDFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue LIGHTGREYISLANDFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue LIMEGREENISLANDFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue MAGENTAISLANDFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue PINKISLANDFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue PURPLEISLANDFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue ORANGEISLANDFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue REDISLANDFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue WHITEISLANDFEATUREWEIGHT;
        public final ForgeConfigSpec.IntValue YELLOWISLANDFEATUREWEIGHT;

        public Common(ForgeConfigSpec.Builder builder) {
            builder.push("BoneMeal Grass Spawn");
            ALLGRASSGROWTH = builder
                    .comment("If True, Any Colour of Grass will Spawn on any Coloured Grass Block when BoneMeal is Applied")
                    .define("AllGrassGrowth", false);
            builder.pop();


            builder.push("Feature General");
            GRASSFEATURE = builder
                    .comment("If True, This will activate the spawning grass feature that spawns grass in the world on all grass blocks. DOES NOT WORK")
                    .define("GrassFeature", false);
            ALLGRASSFEATURE = builder
                    .comment("If True, Any Colour of Grass will Spawn on any GrassBlock in the world! This happens during Worldgen. DOES NOT WORK")
                    .define("AllGrassFeature", false);
            RAINBOWISLANDS = builder
                    .comment("If True, All Grass Islands will spawn in Multiple Colours instead of the standard single colour. DOES NOT WORK")
                    .define("RainbowIslands", false);
            ISLANDFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off! DOES NOT WORK")
                    .define("IslandGrassFeature", true);
            builder.pop();

            builder.push("Blue Grass Feature Spawn");
            BLUEGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("BlueGrassFeature", true);
            BLUEGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("BlueGrassFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Black Grass Feature Spawn");
            BLACKGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("BlackGrassFeature", true);
            BLACKGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("BlackGrassFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Brown Grass Feature Spawn");
            BROWNGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("BrownGrassFeature", true);
            BROWNGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("BrownGrassFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Cyan Grass Feature Spawn");
            CYANGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("CyanGrassFeature", true);
            CYANGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("CyanGrassFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Green Grass Feature Spawn");
            GREENGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("GreenGrassFeature", true);
            GREENGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("GreenGrassFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Grey Grass Feature Spawn");
            GREYGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("GreyGrassFeature", true);
            GREYGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("GreyGrassFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Light Grey Grass Feature Spawn");
            LIGHTGREYGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("LightGreyGrassFeature", true);
            LIGHTGREYGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("LightGreyGrassFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Light Blue Grass Feature Spawn");
            LIGHTBLUEGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("LightBlueGrassFeature", true);
            LIGHTBLUEGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("LightBlueGrassFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Lime Green Grass Feature Spawn");
            LIMEGREENGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("LimeGreenGrassFeature", true);
            LIMEGREENGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("LimeGreenGrassFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Magenta Grass Feature Spawn");
            MAGENTAGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("MagentaGrassFeature", true);
            MAGENTAGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("MagentaGrassFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Pink Grass Feature Spawn");
            PINKGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("PinkGrassFeature", true);
            PINKGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("PinkGrassFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Purple Grass Feature Spawn");
            PURPLEGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("PurpleGrassFeature", true);
            PURPLEGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("PurpleGrassFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Orange Grass Feature Spawn");
            ORANGEGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("OrangeGrassFeature", true);
            ORANGEGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("OrangeGrassFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Red  Grass Feature Spawn");
            REDGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("RedGrassFeature", true);
            REDGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("RedGrassFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("White  Grass Feature Spawn");
            WHITEGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("WhiteGrassFeature", true);
            WHITEGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("WhiteGrassFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Yellow Grass Feature Spawn");
            YELLOWGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("YellowGrassFeature", true);
            YELLOWGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("YellowGrassFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Black Island Feature Spawn");
            BLACKISLANDFEATURE = builder
                    .comment("If True, This will spawn this colour Island in the world. Set Island Feature to false to turn all grass off!")
                    .define("BlackIslandFeature", true);
            BLACKISLANDFEATUREWEIGHT = builder
                    .comment("Sets the amount of Islands of this colour spawns")
                    .defineInRange("BlackIslandFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Blue Island Feature Spawn");
            BLUEISLANDFEATURE = builder
                    .comment("If True, This will spawn this colour Island in the world. Set Island Feature to false to turn all grass off!")
                    .define("BlueIslandFeature", true);
            BLUEISLANDFEATUREWEIGHT = builder
                    .comment("Sets the amount of Islands of this colour spawns")
                    .defineInRange("BlueIslandFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Brown Island Feature Spawn");
            BROWNISLANDFEATURE = builder
                    .comment("If True, This will spawn this colour Island in the world. Set Island Feature to false to turn all grass off!")
                    .define("BrownIslandFeature", true);
            BROWNISLANDFEATUREWEIGHT = builder
                    .comment("Sets the amount of Islands of this colour spawns")
                    .defineInRange("BrownIslandFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Cyan Island Feature Spawn");
            CYANISLANDFEATURE = builder
                    .comment("If True, This will spawn this colour Island in the world. Set Island Feature to false to turn all grass off!")
                    .define("CyanIslandFeature", true);
            CYANISLANDFEATUREWEIGHT = builder
                    .comment("Sets the amount of Islands of this colour spawns")
                    .defineInRange("CyanIslandFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Green Island Feature Spawn");
            GREENISLANDFEATURE = builder
                    .comment("If True, This will spawn this colour Island in the world. Set Island Feature to false to turn all grass off!")
                    .define("IslandFeature", true);
            GREENISLANDFEATUREWEIGHT = builder
                    .comment("Sets the amount of Islands of this colour spawns")
                    .defineInRange("IslandFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Grey Island Feature Spawn");
            GREYISLANDFEATURE = builder
                    .comment("If True, This will spawn this Island grass in the world. Set Island Feature to false to turn all grass off!")
                    .define("GreyIslandFeature", true);
            GREYISLANDFEATUREWEIGHT = builder
                    .comment("Sets the amount of Islands of this colour spawns")
                    .defineInRange("GreyIslandFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Light Blue Island Feature Spawn");
            LIGHTBLUEISLANDFEATURE = builder
                    .comment("If True, This will spawn this colour Island in the world. Set Island Feature to false to turn all grass off!")
                    .define("LightBlueIslandFeature", true);
            LIGHTBLUEISLANDFEATUREWEIGHT = builder
                    .comment("Sets the amount of Islands of this colour spawns")
                    .defineInRange("LightBlueIslandFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Light Grey Island Feature Spawn");
            LIGHTGREYISLANDFEATURE = builder
                    .comment("If True, This will spawn this colour Island in the world. Set Island Feature to false to turn all grass off!")
                    .define("LightGreyIslandFeature", true);
            LIGHTGREYISLANDFEATUREWEIGHT = builder
                    .comment("Sets the amount of Islands of this colour spawns")
                    .defineInRange("LightGreyIslandFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Lime Green Island Feature Spawn");
            LIMEGREENISLANDFEATURE = builder
                    .comment("If True, This will spawn this colour Island in the world. Set Island Feature to false to turn all grass off!")
                    .define("LimeGreenIslandFeature", true);
            LIMEGREENISLANDFEATUREWEIGHT = builder
                    .comment("Sets the amount of Islands of this colour spawns")
                    .defineInRange("LimeGreenIslandFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Magenta Island Feature Spawn");
            MAGENTAISLANDFEATURE = builder
                    .comment("If True, This will spawn this colour Island in the world. Set Island Feature to false to turn all grass off!")
                    .define("MagentaIslandFeature", true);
            MAGENTAISLANDFEATUREWEIGHT = builder
                    .comment("Sets the amount of Islands of this colour spawns")
                    .defineInRange("MagentaIslandFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Pink Island Feature Spawn");
            PINKISLANDFEATURE = builder
                    .comment("If True, This will spawn this colour Island in the world. Set Island Feature to false to turn all grass off!")
                    .define("PinkIslandFeature", true);
            PINKISLANDFEATUREWEIGHT = builder
                    .comment("Sets the amount of Islands of this colour spawns")
                    .defineInRange("PinkIslandFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Purple Island Feature Spawn");
            PURPLEISLANDFEATURE = builder
                    .comment("If True, This will spawn this colour Island in the world. Set Grass Feature to Island to turn all grass off!")
                    .define("PurpleIslandFeature", true);
            PURPLEISLANDFEATUREWEIGHT = builder
                    .comment("Sets the amount of Islands of this colour spawns")
                    .defineInRange("PurpleIslandFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Orange Island Feature Spawn");
            ORANGEISLANDFEATURE = builder
                    .comment("If True, This will spawn this colour Island in the world. Set Grass Feature to Island to turn all grass off!")
                    .define("OrangeIslandFeature", true);
            ORANGEISLANDFEATUREWEIGHT = builder
                    .comment("Sets the amount of Islands of this colour spawns")
                    .defineInRange("OrangeIslandFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Red Island Feature Spawn");
            REDISLANDFEATURE = builder
                    .comment("If True, This will spawn this colour Island in the world. Set Island Feature to false to turn all grass off!")
                    .define("RedIslandFeature", true);
            REDISLANDFEATUREWEIGHT = builder
                    .comment("Sets the amount of Islands of this colour spawns")
                    .defineInRange("RedIslandFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("Yellow Island Feature Spawn");
            YELLOWISLANDFEATURE = builder
                    .comment("If True, This will spawn this colour Island in the world. Set Island Feature to false to turn all grass off!")
                    .define("YellowIslandFeature", true);
            YELLOWISLANDFEATUREWEIGHT = builder
                    .comment("Sets the amount of Islands of this colour spawns")
                    .defineInRange("YellowIslandFeatureWeight", 2,1,10);
            builder.pop();

            builder.push("White Island Feature Spawn");
            WHITEISLANDFEATURE = builder
                    .comment("If True, This will spawn this colour Island in the world. Set Island Feature to false to turn all grass off!")
                    .define("WhiteIslandFeature", true);
            WHITEISLANDFEATUREWEIGHT = builder
                    .comment("Sets the amount of Islands of this colour spawns")
                    .defineInRange("WhiteIslandFeatureWeight", 2,1,10);
            builder.pop();

        }

    }

}
