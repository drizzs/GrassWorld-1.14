package com.drizzs.grassworld.biomes.features;

import com.drizzs.grassworld.biomes.features.actualgrass.*;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class GrassFeatures {


    public static final Feature<NoFeatureConfig> REDGRASS = registerFeature("lightgreygrassfeature", new RedGrassFeature(NoFeatureConfig::deserialize));
    public static final Feature<NoFeatureConfig> CYANGRASS = registerFeature("lightgreygrassfeature", new CyanGrassFeature(NoFeatureConfig::deserialize));
    public static final Feature<NoFeatureConfig> BLUEGRASS = registerFeature("lightgreygrassfeature", new BlueGrassFeature(NoFeatureConfig::deserialize));
    public static final Feature<NoFeatureConfig> GREENGRASS = registerFeature("lightgreygrassfeature", new GreenGrassFeature(NoFeatureConfig::deserialize));
    public static final Feature<NoFeatureConfig> LIMEGREENGRASS = registerFeature("lightgreygrassfeature", new LimeGreenGrassFeature(NoFeatureConfig::deserialize));
    public static final Feature<NoFeatureConfig> LIGHTBLUEGRASS = registerFeature("lightgreygrassfeature", new LightBlueGrassFeature(NoFeatureConfig::deserialize));
    public static final Feature<NoFeatureConfig> YELLOWGRASS = registerFeature("lightgreygrassfeature", new YellowGrassFeature(NoFeatureConfig::deserialize));
    public static final Feature<NoFeatureConfig> PINKGRASS = registerFeature("lightgreygrassfeature", new PinkGrassFeature(NoFeatureConfig::deserialize));
    public static final Feature<NoFeatureConfig> PURPLEGRASS = registerFeature("lightgreygrassfeature", new PurpleGrassFeature(NoFeatureConfig::deserialize));
    public static final Feature<NoFeatureConfig> MAGENTAGRASS = registerFeature("lightgreygrassfeature", new MagentaGrassFeature(NoFeatureConfig::deserialize));
    public static final Feature<NoFeatureConfig> ORANGEGRASS = registerFeature("lightgreygrassfeature", new OrangeGrassFeature(NoFeatureConfig::deserialize));
    public static final Feature<NoFeatureConfig> BLACKGRASS = registerFeature("lightgreygrassfeature", new BlackGrassFeature(NoFeatureConfig::deserialize));
    public static final Feature<NoFeatureConfig> BROWNGRASS = registerFeature("lightgreygrassfeature", new BrownGrassFeature(NoFeatureConfig::deserialize));
    public static final Feature<NoFeatureConfig> WHITEGRASS = registerFeature("lightgreygrassfeature", new WhiteGrassFeature(NoFeatureConfig::deserialize));
    public static final Feature<NoFeatureConfig> GREYGRASS = registerFeature("lightgreygrassfeature", new GreyGrassFeature(NoFeatureConfig::deserialize));
    public static final Feature<NoFeatureConfig> LIGHTGREYGRASS = registerFeature("lightgreygrassfeature", new LightGreyGrassFeature(NoFeatureConfig::deserialize));


    private static<C extends IFeatureConfig, F extends Feature<C>> F registerFeature(String name, F feature)
    {
        return (F)(Registry.<Feature<?>>register(Registry.FEATURE, name, feature));

    }


}
