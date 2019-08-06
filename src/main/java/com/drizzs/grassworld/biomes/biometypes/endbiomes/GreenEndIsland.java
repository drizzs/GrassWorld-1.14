package com.drizzs.grassworld.biomes.biometypes.endbiomes;

import com.google.common.collect.ImmutableList;
import javafx.util.Builder;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.EndSpikeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class GreenEndIsland extends Biome
{

    public GreenEndIsland() {

        super((new Builder()).surfaceBuilder(new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, SurfaceBuilder.END_STONE_CONFIG)).precipitation(Biome.RainType.NONE).category(Biome.Category.THEEND).depth(0.1F).scale(0.2F).temperature(0.5F).downfall(0.5F).waterColor(4159204).waterFogColor(329011).parent((String) null));
        this.addFeature(GenerationStage.Decoration.RAW_GENERATION, createDecoratedFeature(Feature.END_ISLAND, IFeatureConfig.NO_FEATURE_CONFIG, Placement.END_ISLAND, IPlacementConfig.NO_PLACEMENT_CONFIG));
        DefaultBiomeFeatures.func_225489_aq(this);

    }
        @OnlyIn(Dist.CLIENT)
        public int getSkyColorByTemp(float currentTemperature) {
        return 0;
    }











}
