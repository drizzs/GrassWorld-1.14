package com.drizzs.grassworld.util;

import com.drizzs.grassworld.entity.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class GrassRegistries {
    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
    {
        event.getRegistry().registerAll
                (
                        ModEntities.GREENENDERMAN
                );

        ModEntities.registerEntityWorldSpawns();
    }

    public static ResourceLocation location(String name)
    {
        return new ResourceLocation("grassworld", name);
    }
}



