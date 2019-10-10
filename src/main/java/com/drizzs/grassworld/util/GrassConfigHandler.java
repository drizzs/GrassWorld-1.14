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

        public Common(ForgeConfigSpec.Builder builder) {
            builder.push("BoneMeal Grass Spawn");
            ALLGRASSGROWTH = builder
                    .comment("If True, Any Colour of Grass will Spawn on any Coloured Grass Block when BoneMeal is Applied")
                    .define("AllGrassGrowth", false);
            builder.pop();

            builder.push("Grass Feature Spawn");
            ALLGRASSFEATURE = builder
                    .comment("If True, Any Colour of Grass will Spawn on any GrassBlock in the world! This happens during Worldgen.")
                    .define("AllGrassFeature", false);
            RAINBOWISLANDS = builder
                    .comment("If True, All Grass Islands will spawn in Multiple Colours instead of the standard single colour.")
                    .define("RainbowIslands", false);
            builder.pop();
        }

    }

}
