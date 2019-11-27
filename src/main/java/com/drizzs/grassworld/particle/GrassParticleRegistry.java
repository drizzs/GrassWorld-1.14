package com.drizzs.grassworld.particle;


import com.drizzs.grassworld.GrassWorld;
import com.drizzs.grassworld.particle.types.ShimmerParticleData;
import com.drizzs.grassworld.particle.types.ShimmerParticleType;
import net.minecraft.client.Minecraft;
import net.minecraft.particles.ParticleType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = GrassWorld.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrassParticleRegistry
{

    @ObjectHolder("grassworld:shimmer")
    public static ParticleType<ShimmerParticleData> SHIMMER;

    @SubscribeEvent
    public static void registerParticles(RegistryEvent.Register<ParticleType<?>> event) {
        register(event.getRegistry(), new ShimmerParticleType(), "shimmer");
    }

    @Mod.EventBusSubscriber(value = Dist.CLIENT, modid = "grassworld", bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Factory {
        @SubscribeEvent
        public static void registerFactories(ParticleFactoryRegisterEvent evt) {
            Minecraft.getInstance().particles.registerFactory(GrassParticleRegistry.SHIMMER, ShimmerParticleType.FACTORY);
        }
    }

    public static <V extends IForgeRegistryEntry<V>> void register(IForgeRegistry<V> reg, IForgeRegistryEntry<V> thing, ResourceLocation name) {
        reg.register(thing.setRegistryName(name));
    }

    public static <V extends IForgeRegistryEntry<V>> void register(IForgeRegistry<V> reg, IForgeRegistryEntry<V> thing, String name) {
        register(reg, thing, new ResourceLocation(GrassWorld.MOD_ID, name));
    }

}
