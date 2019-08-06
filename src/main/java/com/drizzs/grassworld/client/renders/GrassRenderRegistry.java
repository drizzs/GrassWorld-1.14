package com.drizzs.grassworld.client.renders;

import com.drizzs.grassworld.entity.endtities.enderman.GreenEnderman;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class GrassRenderRegistry {
    public static void registerEntityRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(GreenEnderman.class, new GreenEndermanRender.RenderFactory());

    }

}
