package com.drizzs.grassworld.entity;

import com.drizzs.grassworld.entity.endtity.GreenEndermanEntity;
import com.drizzs.grassworld.entity.render.GreenEnderRender;
import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class EntityRegistry
{
    @OnlyIn(Dist.CLIENT)
    public static void registryEntityRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(GreenEndermanEntity.class, new GreenEnderRender.RenderFactory());
    }

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
    {
        event.getRegistry().registerAll
                (
                        GrassEntities.green_enderman
                );

    }

}
