package com.drizzs.grassworld.registries;

import com.drizzs.grassworld.features.GrassIslandPiece;
import com.drizzs.grassworld.features.GrassIslandStructure;
import com.drizzs.grassworld.util.GrassConfigHandler;
import com.drizzs.grassworld.util.lib.GrassContentLib;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.placement.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.*;

import static com.drizzs.grassworld.GrassWorld.MOD_ID;
import static net.minecraft.world.biome.Biome.createDecoratedFeature;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(MOD_ID)
public class GrassFeatures {

    @ObjectHolder(MOD_ID + ":grassisland")
    public static Structure<NoFeatureConfig> ISLANDFEATURE;

    @SubscribeEvent
    public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
        BaseRegistryAdapter<Feature<?>> registry = new BaseRegistryAdapter<>(event.getRegistry());
        event.getRegistry().register(new GrassIslandStructure(NoFeatureConfig::deserialize).setRegistryName("grassworld:grassisland"));
        onFeatureRegistryEvent();
    }


    //Grass Feature Stuff
    public static void onFeatureRegistryEvent() {
        if (GrassConfigHandler.COMMON.GRASSFEATURE.get()) {
            if (GrassConfigHandler.COMMON.BLACKGRASSFEATURE.get()) {
                featureOverWorldGrassSpawn(GrassContentLib.actualgrassblack.getDefaultState(), GrassConfigHandler.COMMON.BLACKGRASSFEATUREWEIGHT.get());
            }
            if (GrassConfigHandler.COMMON.BLUEGRASSFEATURE.get()) {
                featureOverWorldGrassSpawn(GrassContentLib.actualgrassblue.getDefaultState(), GrassConfigHandler.COMMON.BLUEGRASSFEATUREWEIGHT.get());
            }
            if (GrassConfigHandler.COMMON.GREYGRASSFEATURE.get()) {
                featureOverWorldGrassSpawn(GrassContentLib.actualgrassgrey.getDefaultState(), GrassConfigHandler.COMMON.GREYGRASSFEATUREWEIGHT.get());
            }
            if (GrassConfigHandler.COMMON.MAGENTAGRASSFEATURE.get()) {
                featureOverWorldGrassSpawn(GrassContentLib.actualgrassmagenta.getDefaultState(), GrassConfigHandler.COMMON.MAGENTAGRASSFEATUREWEIGHT.get());
            }
            if (GrassConfigHandler.COMMON.CYANGRASSFEATURE.get()) {
                featureOverWorldGrassSpawn(GrassContentLib.actualgrasscyan.getDefaultState(), GrassConfigHandler.COMMON.CYANGRASSFEATUREWEIGHT.get());
            }
            if (GrassConfigHandler.COMMON.ORANGEGRASSFEATURE.get()) {
                featureOverWorldGrassSpawn(GrassContentLib.actualgrassorange.getDefaultState(), GrassConfigHandler.COMMON.ORANGEGRASSFEATUREWEIGHT.get());
            }
            if (GrassConfigHandler.COMMON.BROWNGRASSFEATURE.get()) {
                featureOverWorldGrassSpawn(GrassContentLib.actualgrassbrown.getDefaultState(), GrassConfigHandler.COMMON.BROWNGRASSFEATUREWEIGHT.get());
            }
            if (GrassConfigHandler.COMMON.GREENGRASSFEATURE.get()) {
                featureOverWorldGrassSpawn(GrassContentLib.actualgrassgreen.getDefaultState(), GrassConfigHandler.COMMON.GREENGRASSFEATUREWEIGHT.get());
            }
            if (GrassConfigHandler.COMMON.REDGRASSFEATURE.get()) {
                featureOverWorldGrassSpawn(GrassContentLib.actualgrassred.getDefaultState(), GrassConfigHandler.COMMON.REDGRASSFEATUREWEIGHT.get());
            }
            if (GrassConfigHandler.COMMON.PURPLEGRASSFEATURE.get()) {
                featureOverWorldGrassSpawn(GrassContentLib.actualgrasspurple.getDefaultState(), GrassConfigHandler.COMMON.PURPLEGRASSFEATUREWEIGHT.get());
            }
            if (GrassConfigHandler.COMMON.PINKGRASSFEATURE.get()) {
                featureOverWorldGrassSpawn(GrassContentLib.actualgrasspink.getDefaultState(), GrassConfigHandler.COMMON.PINKGRASSFEATUREWEIGHT.get());
            }
            if (GrassConfigHandler.COMMON.WHITEGRASSFEATURE.get()) {
                featureOverWorldGrassSpawn(GrassContentLib.actualgrasswhite.getDefaultState(), GrassConfigHandler.COMMON.WHITEGRASSFEATUREWEIGHT.get());
            }
            if (GrassConfigHandler.COMMON.YELLOWGRASSFEATURE.get()) {
                featureOverWorldGrassSpawn(GrassContentLib.actualgrassyellow.getDefaultState(), GrassConfigHandler.COMMON.YELLOWGRASSFEATUREWEIGHT.get());
            }
            if (GrassConfigHandler.COMMON.LIMEGREENGRASSFEATURE.get()) {
                featureOverWorldGrassSpawn(GrassContentLib.actualgrasslimegreen.getDefaultState(), GrassConfigHandler.COMMON.LIMEGREENGRASSFEATUREWEIGHT.get());
            }
            if (GrassConfigHandler.COMMON.LIGHTGREYGRASSFEATURE.get()) {
                featureOverWorldGrassSpawn(GrassContentLib.actualgrasslightgrey.getDefaultState(), GrassConfigHandler.COMMON.LIGHTGREYGRASSFEATUREWEIGHT.get());
            }
            if (GrassConfigHandler.COMMON.LIGHTBLUEGRASSFEATURE.get()) {
                featureOverWorldGrassSpawn(GrassContentLib.actualgrasslightblue.getDefaultState(), GrassConfigHandler.COMMON.LIGHTBLUEGRASSFEATUREWEIGHT.get());
            }
        }

    }

    public static void featureOverWorldGrassSpawn(BlockState state, int frequency) {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (!biome.getCategory().equals(Biome.Category.NETHER) && !biome.getCategory().equals(Biome.Category.THEEND)) {
                biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(Feature.GRASS, new GrassFeatureConfig(state), Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(frequency)));
            }
        }

    }
    //Island Feature Stuff
    public static void applyFeatures() {

        if (GrassConfigHandler.COMMON.OVERWORLDISLANDFEATURE.get()) {
            for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
                if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
                    addStructure(biome, GenerationStage.Decoration.SURFACE_STRUCTURES, ISLANDFEATURE);
                }

            }
        }
    }

    private static void addStructure(Biome biome, GenerationStage.Decoration stage, Structure<NoFeatureConfig> structure) {
        biome.addStructure(structure, IFeatureConfig.NO_FEATURE_CONFIG);
        biome.addFeature(stage, Biome.createDecoratedFeature(structure, IFeatureConfig.NO_FEATURE_CONFIG, Placement.NOPE, IPlacementConfig.NO_PLACEMENT_CONFIG));
    }

    public static class BaseRegistryAdapter<T extends IForgeRegistryEntry<T>> {

        protected final IForgeRegistry<T> registry;

        public BaseRegistryAdapter(IForgeRegistry<T> registry) {
            this.registry = registry;
        }

        public ResourceLocation getResource(String name) {
            return new ResourceLocation(MOD_ID, name);
        }

        public <I extends T> I register(I forgeRegitryEntry, String name) {
            return this.register(forgeRegitryEntry, this.getResource(name));
        }

        public <I extends T> I register(I forgeRegistryEntry, ResourceLocation location) {
            forgeRegistryEntry.setRegistryName(location);
            registry.register(forgeRegistryEntry);
            return forgeRegistryEntry;
        }
    }
}
