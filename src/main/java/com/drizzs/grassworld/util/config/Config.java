package com.drizzs.grassworld.util.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public final class Config {

    public static class Client {
        public final ForgeConfigSpec.BooleanValue particleOn;



        public Client(ForgeConfigSpec.Builder builder) {

            particleOn = builder
                    .comment("Set this to true if you're not running a server in your mom's basement for 200 people!")
                    .define("particleOn", true);
        }

    }

    public static final Client CLIENT;
    public static final ForgeConfigSpec CLIENT_SPEC;
    static {
        final Pair<Client, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Client::new);
        CLIENT_SPEC = specPair.getRight();
        CLIENT = specPair.getLeft();
    }
}
