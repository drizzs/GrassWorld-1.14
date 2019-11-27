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
                    .comment("Set this to true if you're not running a server in your mom's basement for 200 people while you play!")
                    .define("particleOn", true);
            builder.pop();
        }

    }

    public static class Common {

        public final ForgeConfigSpec.BooleanValue ALLGRASSGROWTH;
        public final ForgeConfigSpec.BooleanValue RAINBOWISLANDS;
        public final ForgeConfigSpec.BooleanValue GRASSFEATURE;

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

        public final ForgeConfigSpec.BooleanValue NETHERISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue OVERWORLDISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue ENDISLANDFEATURE;
        public final ForgeConfigSpec.BooleanValue ENDOVERWORLDISLANDFEATURE;

        public Common(ForgeConfigSpec.Builder builder) {
            builder.push("BoneMeal Grass Spawn");
            ALLGRASSGROWTH = builder
                    .comment("If True, Any Colour of Grass will Spawn on any Coloured Grass Block when BoneMeal is Applied")
                    .define("AllGrassGrowth", false);
            builder.pop();

            builder.push("Island Feature");
            RAINBOWISLANDS = builder
                    .comment("If True, All Grass Islands will spawn in Multiple Colours instead of the standard single colour.")
                    .define("RainbowIslands", false);
            OVERWORLDISLANDFEATURE = builder
                    .comment("If True, This will spawn Dirt Islands Floating in the Sky of the Overworld, These Islands will have extra spawn rate for Overworld Mobs")
                    .define("OverworldIslandFeature", false);
            ENDISLANDFEATURE = builder
                    .comment("If True, This will spawn End Islands Floating in the Sky of the Overworld, These Islands will have extra spawn rate for End Mobs")
                    .define("EndIslandFeature", false);
            ENDOVERWORLDISLANDFEATURE = builder
                    .comment("If True, This will spawn End Islands Floating in the Sky of the End, These Islands will have extra spawn rate for End Mobs")
                    .define("EndOverWorldIslandFeature", false);
            NETHERISLANDFEATURE = builder
                    .comment("If True, This will spawn Nether Islands Floating in the Sky of the Overworld, These Islands will have extra spawn rate for Nether Mobs")
                    .define("NetherIslandFeature", false);
            builder.pop();

            builder.push("Grass Feature Spawn");
            GRASSFEATURE = builder
                    .comment("If True, This will activate the spawning grass feature that spawns grass in the world on all grass blocks.")
                    .define("GrassFeature", false);
            BLUEGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("BlueGrassFeature", true);
            BLUEGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("BlueGrassFeatureWeight", 1,0,10);
            BLACKGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("BlackGrassFeature", true);
            BLACKGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("BlackGrassFeatureWeight", 5,0,10);
            BROWNGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("BrownGrassFeature", true);
            BROWNGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("BrownGrassFeatureWeight", 5,0,10);
            CYANGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("CyanGrassFeature", true);
            CYANGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("CyanGrassFeatureWeight", 5,0,10);
            GREENGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("GreenGrassFeature", true);
            GREENGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("GreenGrassFeatureWeight", 5,0,10);
            GREYGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("GreyGrassFeature", true);
            GREYGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("GreyGrassFeatureWeight", 5,0,10);
            LIGHTGREYGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("LightGreyGrassFeature", true);
            LIGHTGREYGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("LightGreyGrassFeatureWeight", 1,0,10);
            LIGHTBLUEGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("LightBlueGrassFeature", true);
            LIGHTBLUEGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("LightBlueGrassFeatureWeight", 1,0,10);
            LIMEGREENGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("LimeGreenGrassFeature", true);
            LIMEGREENGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("LimeGreenGrassFeatureWeight", 2,0,10);
            MAGENTAGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("MagentaGrassFeature", true);
            MAGENTAGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("MagentaGrassFeatureWeight", 1,0,10);
            PINKGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("PinkGrassFeature", true);
            PINKGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("PinkGrassFeatureWeight", 1,0,10);
            PURPLEGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("PurpleGrassFeature", true);
            PURPLEGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("PurpleGrassFeatureWeight", 1,0,10);
            ORANGEGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("OrangeGrassFeature", true);
            ORANGEGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("OrangeGrassFeatureWeight", 1,0,10);
            REDGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("RedGrassFeature", true);
            REDGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("RedGrassFeatureWeight", 1,0,10);
            WHITEGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("WhiteGrassFeature", true);
            WHITEGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("WhiteGrassFeatureWeight", 1,0,10);
            YELLOWGRASSFEATURE = builder
                    .comment("If True, This will spawn this colour grass in the world. Set Grass Feature to false to turn all grass off!")
                    .define("YellowGrassFeature", true);
            YELLOWGRASSFEATUREWEIGHT = builder
                    .comment("Sets the amount of Grass of this colour spawns")
                    .defineInRange("YellowGrassFeatureWeight", 1,0,10);
            builder.pop();

        }
    }

}
