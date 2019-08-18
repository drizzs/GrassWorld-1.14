package com.drizzs.grassworld.biomes.surfacebuilders;

import com.drizzs.grassworld.biomes.surfacebuilders.endsurface.*;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(
        modid = "grassworld",
        bus = Mod.EventBusSubscriber.Bus.MOD
)
@ObjectHolder("grassworld")
public class GrassSurfaceRegistry {
    public static final SurfaceBuilder<SurfaceBuilderConfig> REDEND = new RedEndSurface();
    public static final SurfaceBuilder<SurfaceBuilderConfig> CYANEND = new CyanEndSurface();
    public static final SurfaceBuilder<SurfaceBuilderConfig> GREENEND = new GreenEndSurface();
    public static final SurfaceBuilder<SurfaceBuilderConfig> LIMEGREENEND = new LimeGreenEndSurface();
    public static final SurfaceBuilder<SurfaceBuilderConfig> LIGHTBLUEEND = new LightBlueEndSurface();
    public static final SurfaceBuilder<SurfaceBuilderConfig> BLUEEND = new BlueEndSurface();
    public static final SurfaceBuilder<SurfaceBuilderConfig> YELLOWEND = new YellowEndSurface();
    public static final SurfaceBuilder<SurfaceBuilderConfig> ORANGEEND = new OrangeEndSurface();
    public static final SurfaceBuilder<SurfaceBuilderConfig> PINKEND = new PinkEndSurface();
    public static final SurfaceBuilder<SurfaceBuilderConfig> PURPLEEND = new PurpleEndSurface();
    public static final SurfaceBuilder<SurfaceBuilderConfig> WHITEEND = new WhiteEndSurface();
    public static final SurfaceBuilder<SurfaceBuilderConfig> BLACKEND = new BlackEndSurface();
    public static final SurfaceBuilder<SurfaceBuilderConfig> BROWNEND = new BrownEndSurface();
    public static final SurfaceBuilder<SurfaceBuilderConfig> MAGENTAEND = new MagentaEndSurface();
    public static final SurfaceBuilder<SurfaceBuilderConfig> LIGHTGREYEND = new LightGreyEndSurface();
    public static final SurfaceBuilder<SurfaceBuilderConfig> GREYEND = new GreyEndSurface();




    private static IForgeRegistry<SurfaceBuilder<?>> registry;

    public GrassSurfaceRegistry() {
    }

    @SubscribeEvent
    public static void onRegisterBiomes(RegistryEvent.Register<SurfaceBuilder<?>> event) {
        if (registry == null) {
            registry = event.getRegistry();
        }

        registerSurfaceBuilder(REDEND, "redend");
        registerSurfaceBuilder(WHITEEND, "whiteend");
        registerSurfaceBuilder(PURPLEEND, "purpleend");
        registerSurfaceBuilder(MAGENTAEND, "magentaend");
        registerSurfaceBuilder(PINKEND, "pinkend");
        registerSurfaceBuilder(CYANEND, "cyanend");
        registerSurfaceBuilder(ORANGEEND, "orangeend");
        registerSurfaceBuilder(LIMEGREENEND, "limegreenend");
        registerSurfaceBuilder(GREENEND, "greenend");
        registerSurfaceBuilder(YELLOWEND, "yellowend");
        registerSurfaceBuilder(BROWNEND, "brownend");
        registerSurfaceBuilder(BLACKEND, "blackend");
        registerSurfaceBuilder(BLUEEND, "blueend");
        registerSurfaceBuilder(LIGHTBLUEEND, "lightblueend");
        registerSurfaceBuilder(LIGHTGREYEND, "lightgreyend");
        registerSurfaceBuilder(GREYEND, "greyend");
    }

    public static SurfaceBuilder<?> registerSurfaceBuilder(SurfaceBuilder<?> surface, String name) {
        if (registry == null) {
            throw new NullPointerException("surface registry aint workin!");
        } else {
            surface.setRegistryName("grassworld", name);
            registry.register(surface);
            return surface;
        }
    }
}
