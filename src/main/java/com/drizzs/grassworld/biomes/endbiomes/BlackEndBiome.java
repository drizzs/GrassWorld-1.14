package com.drizzs.grassworld.biomes.endbiomes;

import com.drizzs.grassworld.biomes.features.actualgrass.RedGrassFeature;
import com.drizzs.grassworld.biomes.surfacebuilders.GrassSurfaces;
import com.drizzs.grassworld.entity.GrassEntities;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlackEndBiome extends Biome {

    public BlackEndBiome()
    {
        super((new Builder()).surfaceBuilder(SurfaceBuilder.DEFAULT, GrassSurfaces.BLACKEND).precipitation(RainType.NONE).category(Category.THEEND).depth(0.1F).scale(0.2F).temperature(0.5F).downfall(0.5F).waterColor(4159204).waterFogColor(329011).parent((String)null));
        DefaultBiomeFeatures.func_225489_aq(this);


        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(new RedGrassFeature(NoFeatureConfig::deserialize), IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(12)));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(GrassEntities.green_enderman, 10, 4, 4));
    }

    @OnlyIn(Dist.CLIENT)
    public int getSkyColorByTemp(float currentTemperature) {
        return 0;
    }
}


