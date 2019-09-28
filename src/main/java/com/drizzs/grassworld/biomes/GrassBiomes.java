package com.drizzs.grassworld.biomes;

import com.drizzs.grassworld.biomes.endbiomes.*;
import com.drizzs.grassworld.util.config.BiomeConfig;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.biome.provider.EndBiomeProvider;
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

            redend = registerBiome(new RedEndBiome(), "redend", 0, BiomeDictionary.Type.END);
            greenend = registerBiome(new GreenEndBiome(), "greenend", 0, BiomeDictionary.Type.END);
            limegreenend = registerBiome(new LimeGreenEndBiome(), "limegreenend", 0, BiomeDictionary.Type.END);
            blueend = registerBiome(new BlueEndBiome(), "blueend", 0, BiomeDictionary.Type.END);
            lightblueend = registerBiome(new LightBlueEndBiome(), "lightblueend", 0, BiomeDictionary.Type.END);
            greyend = registerBiome(new GreyEndBiome(), "greyend", 0, BiomeDictionary.Type.END);
            lightgreyend = registerBiome(new LightGreyEndBiome(), "lightgreyend", 10, BiomeDictionary.Type.END);
            orangeend = registerBiome(new OrangeEndBiome(), "orangeend", 0, BiomeDictionary.Type.END);
            pinkend = registerBiome(new PinkEndBiome(), "pinkend", 0, BiomeDictionary.Type.END);
            purpleend = registerBiome(new PurpleEndBiome(), "purpleend", 0, BiomeDictionary.Type.END);
            yellowend = registerBiome(new YellowEndBiome(), "yellowend", 0, BiomeDictionary.Type.END);
            whiteend = registerBiome(new WhiteEndBiome(), "whiteend", 0, BiomeDictionary.Type.END);
            blackend = registerBiome(new BlackEndBiome(), "blackend", 0, BiomeDictionary.Type.END);
            brownend = registerBiome(new BrownEndBiome(), "brownend", 0, BiomeDictionary.Type.END);
            cyanend = registerBiome(new CyanEndBiome(), "cyanend", 0, BiomeDictionary.Type.END);
            magentaend = registerBiome(new MagentaEndBiome(), "magentaend", 0, BiomeDictionary.Type.END);
        }





        public static Biome registerBiome (Biome biome, String name,int weight, BiomeDictionary.Type types)
        {
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, weight));
        BiomeDictionary.addTypes(biome, types);
        System.out.println(name + "registered");
        return biome;

    }


}
