package com.drizzs.grassworld.registries;

import com.drizzs.grassworld.features.IslandFeature;
import com.drizzs.grassworld.features.GrassSpawningFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
public class GrassFeatures {

    @SubscribeEvent
    public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {

        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize,"redgrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize,"cyangrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize,"bluegrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize,"greengrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize,"limegreengrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize,"lightbluegrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize,"yellowgrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize,"purplegrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize,"magentagrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize,"orangegrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize,"blackgrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize,"browngrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize,"whitegrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize,"greygrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize,"lightgreygrassfeature"));
        event.getRegistry().register(new GrassSpawningFeature(NoFeatureConfig::deserialize,"pinkgrassfeature"));

        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize,"redislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize,"cyanislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize,"blueislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize,"greenislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize,"limegreenislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize,"lightblueislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize,"yellowislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize,"pinkislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize,"purpleislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize,"magentaislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize,"orangeislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize,"brownislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize,"blackislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize,"whiteislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize,"greyislandfeature"));
        event.getRegistry().register(new IslandFeature(NoFeatureConfig::deserialize,"lightgreyislandfeature"));

    }



}
