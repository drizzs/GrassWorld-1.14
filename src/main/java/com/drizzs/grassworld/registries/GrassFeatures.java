package com.drizzs.grassworld.registries;

import com.drizzs.grassworld.features.IslandFeature;
import com.drizzs.grassworld.features.GrassSpawningFeature;
import com.drizzs.grassworld.util.GrassConfigHandler;
import com.drizzs.grassworld.util.GrassHolders;
import com.drizzs.grassworld.util.lib.GrassFeatureLib;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.world.biome.Biome.createDecoratedFeature;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrassFeatures {

    @SubscribeEvent
    public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {

        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize, "redgrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize, "cyangrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize, "bluegrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize, "greengrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize, "limegreengrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize, "lightbluegrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize, "yellowgrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize, "purplegrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize, "magentagrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize, "orangegrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize, "blackgrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize, "browngrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize, "whitegrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize, "greygrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize, "lightgreygrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize, "pinkgrassfeature"));

        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize, "redislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize, "cyanislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize, "blueislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize, "greenislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize, "limegreenislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize, "lightblueislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize, "yellowislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize, "pinkislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize, "purpleislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize, "magentaislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize, "orangeislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize, "brownislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize, "blackislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize, "whiteislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize, "greyislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize, "lightgreyislandfeature"));

    }

    @SubscribeEvent
    public static void onFeatureRegistryEvent(RegistryEvent.Register<Feature<?>> event) {
        if (GrassConfigHandler.COMMON.GRASSFEATURE.get()) {
            if (GrassConfigHandler.COMMON.BLACKGRASSFEATURE.get()) {
                ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(GrassFeatureLib.BLACKGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(GrassConfigHandler.COMMON.BLACKGRASSFEATUREWEIGHT.get()))));
            } else if (GrassConfigHandler.COMMON.BLUEGRASSFEATURE.get()) {
                ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(GrassFeatureLib.BLUEGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(GrassConfigHandler.COMMON.BLUEGRASSFEATUREWEIGHT.get()))));
            } else if (GrassConfigHandler.COMMON.GREYGRASSFEATURE.get()) {
                ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(GrassFeatureLib.GREYGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(GrassConfigHandler.COMMON.GREYGRASSFEATUREWEIGHT.get()))));
            } else if (GrassConfigHandler.COMMON.MAGENTAGRASSFEATURE.get()) {
                ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(GrassFeatureLib.MAGENTAGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(GrassConfigHandler.COMMON.MAGENTAGRASSFEATUREWEIGHT.get()))));
            } else if (GrassConfigHandler.COMMON.CYANGRASSFEATURE.get()) {
                ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(GrassFeatureLib.CYANGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(GrassConfigHandler.COMMON.CYANGRASSFEATUREWEIGHT.get()))));
            } else if (GrassConfigHandler.COMMON.ORANGEGRASSFEATURE.get()) {
                ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(GrassFeatureLib.ORANGEGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(GrassConfigHandler.COMMON.ORANGEGRASSFEATUREWEIGHT.get()))));
            } else if (GrassConfigHandler.COMMON.BROWNGRASSFEATURE.get()) {
                ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(GrassFeatureLib.BROWNGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(GrassConfigHandler.COMMON.BROWNGRASSFEATUREWEIGHT.get()))));
            } else if (GrassConfigHandler.COMMON.GREENGRASSFEATURE.get()) {
                ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(GrassFeatureLib.GREENGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(GrassConfigHandler.COMMON.GREENGRASSFEATUREWEIGHT.get()))));
            } else if (GrassConfigHandler.COMMON.REDGRASSFEATURE.get()) {
                ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(GrassFeatureLib.REDGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(GrassConfigHandler.COMMON.REDGRASSFEATUREWEIGHT.get()))));
            } else if (GrassConfigHandler.COMMON.PURPLEGRASSFEATURE.get()) {
                ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(GrassFeatureLib.PURPLEGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(GrassConfigHandler.COMMON.PURPLEGRASSFEATUREWEIGHT.get()))));
            } else if (GrassConfigHandler.COMMON.PINKGRASSFEATURE.get()) {
                ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(GrassFeatureLib.PINKGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(GrassConfigHandler.COMMON.PINKGRASSFEATUREWEIGHT.get()))));
            } else if (GrassConfigHandler.COMMON.WHITEGRASSFEATURE.get()) {
                ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(GrassFeatureLib.WHITEGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(GrassConfigHandler.COMMON.WHITEGRASSFEATUREWEIGHT.get()))));
            } else if (GrassConfigHandler.COMMON.YELLOWGRASSFEATURE.get()) {
                ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(GrassFeatureLib.YELLOWGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(GrassConfigHandler.COMMON.YELLOWGRASSFEATUREWEIGHT.get()))));
            } else if (GrassConfigHandler.COMMON.LIMEGREENGRASSFEATURE.get()) {
                ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(GrassFeatureLib.LIMEGREENGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(GrassConfigHandler.COMMON.LIMEGREENGRASSFEATUREWEIGHT.get()))));
            } else if (GrassConfigHandler.COMMON.LIGHTGREYGRASSFEATURE.get()) {
                ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(GrassFeatureLib.LIGHTGREYGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(GrassConfigHandler.COMMON.LIGHTGREYGRASSFEATUREWEIGHT.get()))));
            } else if (GrassConfigHandler.COMMON.LIGHTBLUEGRASSFEATURE.get()) {
                ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(GrassFeatureLib.LIGHTBLUEGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(GrassConfigHandler.COMMON.LIGHTBLUEGRASSFEATUREWEIGHT.get()))));
            }

            if(GrassConfigHandler.COMMON.ISLANDFEATURE.get()){
                if(GrassConfigHandler.COMMON.BLACKISLANDFEATURE.get()) {
                    ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(GrassFeatureLib.BLACKISLANDFEATURE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_32, new FrequencyConfig(GrassConfigHandler.COMMON.BLACKISLANDFEATUREWEIGHT.get()))));
                }
                else if(GrassConfigHandler.COMMON.BLUEISLANDFEATURE.get()) {
                    ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(GrassFeatureLib.BLUEISLANDFEATURE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.END_ISLAND, IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
                else if(GrassConfigHandler.COMMON.BROWNISLANDFEATURE.get()) {
                    ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(GrassFeatureLib.BROWNISLANDFEATURE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.END_ISLAND, IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
                else if(GrassConfigHandler.COMMON.CYANISLANDFEATURE.get()) {
                    ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(GrassFeatureLib.CYANISLANDFEATURE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.END_ISLAND, IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
                else if(GrassConfigHandler.COMMON.GREENISLANDFEATURE.get()) {
                    ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(GrassFeatureLib.GREENISLANDFEATURE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.END_ISLAND, IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
                else if(GrassConfigHandler.COMMON.GREYISLANDFEATURE.get()) {
                    ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(GrassFeatureLib.GREYISLANDFEATURE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.END_ISLAND, IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
                else if(GrassConfigHandler.COMMON.LIGHTBLUEISLANDFEATURE.get()) {
                    ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(GrassFeatureLib.LIGHTBLUEISLANDFEATURE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.END_ISLAND, IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
                else if(GrassConfigHandler.COMMON.LIGHTGREYISLANDFEATURE.get()) {
                    ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(GrassFeatureLib.LIGHTGREYISLANDFEATURE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.END_ISLAND, IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
                else if(GrassConfigHandler.COMMON.LIMEGREENISLANDFEATURE.get()) {
                    ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(GrassFeatureLib.LIMEGREENISLANDFEATURE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.END_ISLAND, IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
                else if(GrassConfigHandler.COMMON.MAGENTAISLANDFEATURE.get()) {
                    ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(GrassFeatureLib.MAGENTAISLANDFEATURE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.END_ISLAND, IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
                else if(GrassConfigHandler.COMMON.ORANGEISLANDFEATURE.get()) {
                    ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(GrassFeatureLib.ORANGEISLANDFEATURE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.END_ISLAND, IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
                else if(GrassConfigHandler.COMMON.PINKISLANDFEATURE.get()) {
                    ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(GrassFeatureLib.PINKISLANDFEATURE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.END_ISLAND, IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
                else if(GrassConfigHandler.COMMON.PURPLEISLANDFEATURE.get()) {
                    ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(GrassFeatureLib.PURPLEISLANDFEATURE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.END_ISLAND, IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
                else if(GrassConfigHandler.COMMON.REDISLANDFEATURE.get()) {
                    ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(GrassFeatureLib.REDISLANDFEATURE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.END_ISLAND, IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
                else if(GrassConfigHandler.COMMON.WHITEISLANDFEATURE.get()) {
                    ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(GrassFeatureLib.WHITEISLANDFEATURE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.END_ISLAND, IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
                else if(GrassConfigHandler.COMMON.YELLOWISLANDFEATURE.get()) {
                    ForgeRegistries.BIOMES.forEach(biome -> biome.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(GrassFeatureLib.YELLOWISLANDFEATURE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.END_ISLAND, IPlacementConfig.NO_PLACEMENT_CONFIG)));
                }
            }

        }
    }
}
