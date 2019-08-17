package com.drizzs.grassworld.biomes.surfacebuilders;

import com.drizzs.grassworld.biomes.surfacebuilders.endsurface.RedEndSurface;
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
    private static IForgeRegistry<SurfaceBuilder<?>> registry;

    public GrassSurfaceRegistry() {
    }

    @SubscribeEvent
    public static void onRegisterBiomes(RegistryEvent.Register<SurfaceBuilder<?>> event) {
        if (registry == null) {
            registry = event.getRegistry();
        }

        registerSurfaceBuilder(REDEND, "redend");
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
