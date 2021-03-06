package com.drizzs.grassworld.biomes.endbiomes;

import com.drizzs.grassworld.biomes.features.actualgrass.LimeGreenGrassFeature;
import com.drizzs.grassworld.biomes.features.actualgrass.RedGrassFeature;
import com.drizzs.grassworld.biomes.surfacebuilders.GrassSurfaces;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class LimeGreenEndBiome extends Biome {

    public LimeGreenEndBiome()
    {
        super((new Builder()).surfaceBuilder(SurfaceBuilder.DEFAULT, GrassSurfaces.LIMEGREENEND).precipitation(RainType.NONE).category(Category.THEEND).depth(0.01F).scale(0.2F).temperature(0.5F).downfall(0.5F).waterColor(4159204).waterFogColor(329011).parent((String)null));
        DefaultBiomeFeatures.func_225489_aq(this);


        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new LimeGreenGrassFeature(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(6)));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ENDERMAN, 10, 4, 4));
    }

    @OnlyIn(Dist.CLIENT)
    public int getSkyColorByTemp(float currentTemperature) {
        return 0;
    }
}


