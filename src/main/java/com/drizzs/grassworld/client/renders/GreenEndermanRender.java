package com.drizzs.grassworld.client.renders;

import com.drizzs.grassworld.client.models.GreenEndermanModel;
import com.drizzs.grassworld.entity.endtities.enderman.GreenEnderman;
import com.drizzs.grassworld.util.GrassRegistries;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class GreenEndermanRender extends LivingRenderer<GreenEnderman, GreenEndermanModel>
{

    public GreenEndermanRender(EntityRendererManager manager)
    {
        super(manager, new GreenEndermanModel(1), 0f);
    }

    @Override
    protected ResourceLocation getEntityTexture(GreenEnderman entity)
    {
        return GrassRegistries.location("textures/entity/greenenderman.png");
    }

    public static class RenderFactory implements IRenderFactory<GreenEnderman>
    {
        @Override
        public EntityRenderer<? super GreenEnderman> createRenderFor(EntityRendererManager manager)
        {
            return new GreenEndermanRender(manager);
        }

    }
}
