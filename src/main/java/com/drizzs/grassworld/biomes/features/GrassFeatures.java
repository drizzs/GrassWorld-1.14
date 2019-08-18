package com.drizzs.grassworld.biomes.features;

import com.drizzs.grassworld.biomes.features.actualgrass.*;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class GrassFeatures {


    public static final Feature<NoFeatureConfig> REDGRASS = new RedGrassFeature(NoFeatureConfig::deserialize);
    public static final Feature<NoFeatureConfig> CYANGRASS = new CyanGrassFeature(NoFeatureConfig::deserialize);
    public static final Feature<NoFeatureConfig> BLUEGRASS = new BlueGrassFeature(NoFeatureConfig::deserialize);
    public static final Feature<NoFeatureConfig> GREENGRASS = new GreenGrassFeature(NoFeatureConfig::deserialize);
    public static final Feature<NoFeatureConfig> LIMEGREENGRASS = new LimeGreenGrassFeature(NoFeatureConfig::deserialize);
    public static final Feature<NoFeatureConfig> LIGHTBLUEGRASS = new LightBlueGrassFeature(NoFeatureConfig::deserialize);
    public static final Feature<NoFeatureConfig> YELLOWGRASS = new YellowGrassFeature(NoFeatureConfig::deserialize);
    public static final Feature<NoFeatureConfig> PINKGRASS = new PinkGrassFeature(NoFeatureConfig::deserialize);
    public static final Feature<NoFeatureConfig> PURPLEGRASS = new PurpleGrassFeature(NoFeatureConfig::deserialize);
    public static final Feature<NoFeatureConfig> MAGENTAGRASS = new MagentaGrassFeature(NoFeatureConfig::deserialize);
    public static final Feature<NoFeatureConfig> ORANGEGRASS = new OrangeGrassFeature(NoFeatureConfig::deserialize);
    public static final Feature<NoFeatureConfig> BLACKGRASS = new BlackGrassFeature(NoFeatureConfig::deserialize);
    public static final Feature<NoFeatureConfig> BROWNGRASS = new BrownGrassFeature(NoFeatureConfig::deserialize);
    public static final Feature<NoFeatureConfig> WHITEGRASS = new WhiteGrassFeature(NoFeatureConfig::deserialize);
    public static final Feature<NoFeatureConfig> GREYGRASS = new GreyGrassFeature(NoFeatureConfig::deserialize);
    public static final Feature<NoFeatureConfig> LIGHTGREYGRASS = new LightGreyGrassFeature(NoFeatureConfig::deserialize);
}
