package com.drizzs.grassworld.util.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class BiomeConfig {

    public static ForgeConfigSpec.BooleanValue biome_generation;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
    {
        server.comment("Biome Config");

        biome_generation = server
                .comment("Decide if you want Grass World Biomes to spawn in your server")
                .define("biome.biome_generation", true);
    }









}
