package com.drizzs.grassworld.update.registries;

import com.drizzs.grassworld.update.features.GrassFeature;
import com.drizzs.grassworld.update.features.islands.*;
import com.drizzs.grassworld.update.util.lib.GrassContentLib;
import com.drizzs.grassworld.update.util.lib.GrassFeatureLib;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
public class GrassFeatures {

    @SubscribeEvent
    public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {

        GrassFeatureLib.REDGRASS = registerFeature("redgrassfeature", new GrassFeature(NoFeatureConfig::deserialize, GrassContentLib.actualgrass_red.getDefaultState()));
        GrassFeatureLib.CYANGRASS = registerFeature("cyangrassfeature", new GrassFeature(NoFeatureConfig::deserialize, GrassContentLib.actualgrass_cyan.getDefaultState()));
        GrassFeatureLib.BLUEGRASS = registerFeature("bluegrassfeature", new GrassFeature(NoFeatureConfig::deserialize, GrassContentLib.actualgrass_blue.getDefaultState()));
        GrassFeatureLib.GREENGRASS = registerFeature("greengrassfeature", new GrassFeature(NoFeatureConfig::deserialize, GrassContentLib.actualgrass_green.getDefaultState()));
        GrassFeatureLib.LIMEGREENGRASS = registerFeature("limegreengrassfeature", new GrassFeature(NoFeatureConfig::deserialize, GrassContentLib.actualgrass_limegreen.getDefaultState()));
        GrassFeatureLib.LIGHTBLUEGRASS = registerFeature("lightbluegrassfeature", new GrassFeature(NoFeatureConfig::deserialize, GrassContentLib.actualgrass_lightblue.getDefaultState()));
        GrassFeatureLib.YELLOWGRASS = registerFeature("yellowgrassfeature", new GrassFeature(NoFeatureConfig::deserialize, GrassContentLib.actualgrass_yellow.getDefaultState()));
        GrassFeatureLib.PINKGRASS = registerFeature("pinkgrassfeature", new GrassFeature(NoFeatureConfig::deserialize, GrassContentLib.actualgrass_pink.getDefaultState()));
        GrassFeatureLib.PURPLEGRASS = registerFeature("purplegrassfeature", new GrassFeature(NoFeatureConfig::deserialize, GrassContentLib.actualgrass_purple.getDefaultState()));
        GrassFeatureLib.MAGENTAGRASS = registerFeature("magentagrassfeature", new GrassFeature(NoFeatureConfig::deserialize, GrassContentLib.actualgrass_magenta.getDefaultState()));
        GrassFeatureLib.ORANGEGRASS = registerFeature("orangegrassfeature", new GrassFeature(NoFeatureConfig::deserialize, GrassContentLib.actualgrass_orange.getDefaultState()));
        GrassFeatureLib.BLACKGRASS = registerFeature("blackgrassfeature", new GrassFeature(NoFeatureConfig::deserialize, GrassContentLib.actualgrass_black.getDefaultState()));
        GrassFeatureLib.BROWNGRASS = registerFeature("browngrassfeature", new GrassFeature(NoFeatureConfig::deserialize, GrassContentLib.actualgrass_brown.getDefaultState()));
        GrassFeatureLib.WHITEGRASS = registerFeature("whitegrassfeature", new GrassFeature(NoFeatureConfig::deserialize, GrassContentLib.actualgrass_white.getDefaultState()));
        GrassFeatureLib.GREYGRASS = registerFeature("greygrassfeature", new GrassFeature(NoFeatureConfig::deserialize, GrassContentLib.actualgrass_grey.getDefaultState()));
        GrassFeatureLib.LIGHTGREYGRASS = registerFeature("lightgreygrassfeature", new GrassFeature(NoFeatureConfig::deserialize, GrassContentLib.actualgrass_lightgrey.getDefaultState()));

        GrassFeatureLib.REDISLANDFEATURE = registerFeature("redislandfeature", new RedIslandFeature(NoFeatureConfig::deserialize));
        GrassFeatureLib.CYANISLANDFEATURE = registerFeature("cyanislandfeature", new CyanIslandFeature(NoFeatureConfig::deserialize));
        GrassFeatureLib.BLUEISLANDFEATURE = registerFeature("blueislandfeature", new BlueIslandFeature(NoFeatureConfig::deserialize));
        GrassFeatureLib.GREENISLANDFEATURE = registerFeature("greenislandfeature", new GreenIslandFeature(NoFeatureConfig::deserialize));
        GrassFeatureLib.LIMEGREENISLANDFEATURE = registerFeature("limegreenislandfeature", new LimeGreenIslandFeature(NoFeatureConfig::deserialize));
        GrassFeatureLib.LIGHTBLUEISLANDFEATURE = registerFeature("lightblueislandfeature", new LightBlueIslandFeature(NoFeatureConfig::deserialize));
        GrassFeatureLib.YELLOWISLANDFEATURE = registerFeature("yellowislandfeature", new YellowIslandFeature(NoFeatureConfig::deserialize));
        GrassFeatureLib.PINKISLANDFEATURE = registerFeature("pinkislandfeature", new PinkIslandFeature(NoFeatureConfig::deserialize));
        GrassFeatureLib.PURPLEISLANDFEATURE = registerFeature("purpleislandfeature", new PurpleIslandFeature(NoFeatureConfig::deserialize));
        GrassFeatureLib.MAGENTAISLANDFEATURE = registerFeature("magentaislandfeature", new MagentaIslandFeature(NoFeatureConfig::deserialize));
        GrassFeatureLib.ORANGEISLANDFEATURE = registerFeature("orangeislandfeature", new OrangeIslandFeature(NoFeatureConfig::deserialize));
        GrassFeatureLib.BLACKISLANDFEATURE = registerFeature("blackislandfeature", new BlackIslandFeature(NoFeatureConfig::deserialize));
        GrassFeatureLib.BROWNISLANDFEATURE = registerFeature("brownislandfeature", new BrownIslandFeature(NoFeatureConfig::deserialize));
        GrassFeatureLib.WHITEISLANDFEATURE = registerFeature("whiteislandfeature", new WhiteIslandFeature(NoFeatureConfig::deserialize));
        GrassFeatureLib.GREYISLANDFEATURE = registerFeature("greyislandfeature", new GreyIslandFeature(NoFeatureConfig::deserialize));
        GrassFeatureLib.LIGHTGREYISLANDFEATURE = registerFeature("lightgreyislandfeature", new LightGreyIslandFeature(NoFeatureConfig::deserialize));

    }

    private static<C extends IFeatureConfig, F extends Feature<C>> F registerFeature(String name, F feature)
    {
        return (F)(Registry.<Feature<?>>register(Registry.FEATURE, name, feature));

    }


}
