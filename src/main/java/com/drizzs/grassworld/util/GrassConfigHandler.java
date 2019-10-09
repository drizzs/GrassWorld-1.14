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

        public final ForgeConfigSpec.BooleanValue ALLGRASS;


        public Common(ForgeConfigSpec.Builder builder) {
            builder.push("Grass Spawn");
            ALLGRASS = builder
                    .comment("If True, Any Colour of Grass will Spawn on any Coloured Grass Block")
                    .define("AllGrass", false);
            builder.pop();

        }

    }

}
