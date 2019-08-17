package com.drizzs.grassworld.biomes;

import com.drizzs.grassworld.biomes.endbiomes.RedEndBiome;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class GrassBiomes {

    public static Biome redend;
    public static Biome greenend;
    public static Biome limegreenend;
    public static Biome blueend;
    public static Biome lightblueend;
    public static Biome greyend;
    public static Biome lightgreyend;
    public static Biome orangeend;
    public static Biome pinkend;
    public static Biome purpleend;
    public static Biome yellowend;
    public static Biome whiteend;
    public static Biome blackend;
    public static Biome brownend;
    public static Biome cyanend;
    public static Biome magentaend;

    @SubscribeEvent
    public static void registerBiomes(final RegistryEvent.Register<Biome> event)
    {
        redend = registerBiome(new RedEndBiome(), "redend", BiomeDictionary.Type.END);
        greenend = registerBiome(new RedEndBiome(), "greenend", BiomeDictionary.Type.END);
        limegreenend = registerBiome(new RedEndBiome(), "limegreenend", BiomeDictionary.Type.END);
        blueend = registerBiome(new RedEndBiome(), "blueend", BiomeDictionary.Type.END);
        lightblueend = registerBiome(new RedEndBiome(), "lightblueend", BiomeDictionary.Type.END);
        greyend = registerBiome(new RedEndBiome(), "greyend", BiomeDictionary.Type.END);
        lightgreyend = registerBiome(new RedEndBiome(), "lightgreyend", BiomeDictionary.Type.END);
        orangeend = registerBiome(new RedEndBiome(), "orangeend", BiomeDictionary.Type.END);
        pinkend = registerBiome(new RedEndBiome(), "pinkend", BiomeDictionary.Type.END);
        purpleend = registerBiome(new RedEndBiome(), "purpleend", BiomeDictionary.Type.END);
        yellowend = registerBiome(new RedEndBiome(), "yellowend", BiomeDictionary.Type.END);
        whiteend = registerBiome(new RedEndBiome(), "whiteend", BiomeDictionary.Type.END);
        blackend = registerBiome(new RedEndBiome(), "blackend", BiomeDictionary.Type.END);
        brownend = registerBiome(new RedEndBiome(), "brownend", BiomeDictionary.Type.END);
        cyanend = registerBiome(new RedEndBiome(), "cyanend", BiomeDictionary.Type.END);
        magentaend = registerBiome(new RedEndBiome(), "magentaend", BiomeDictionary.Type.END);
    }

    public static Biome registerBiome(Biome biome, String name, BiomeDictionary.Type types) {
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        BiomeManager.addSpawnBiome(biome);
        BiomeDictionary.addTypes(biome, types);
        System.out.println(name + "registered");
        return biome;
    }



}
