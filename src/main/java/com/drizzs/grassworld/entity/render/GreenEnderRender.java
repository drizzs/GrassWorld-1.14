package com.drizzs.grassworld.entity.render;

import com.drizzs.grassworld.entity.GrassEntities;
import com.drizzs.grassworld.entity.endtity.GreenEndermanEntity;
import com.drizzs.grassworld.entity.model.GreenEnderModel;
import net.minecraft.client.renderer.entity.EndermanRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class GreenEnderRender extends LivingRenderer<GreenEndermanEntity, GreenEnderModel> {

        public GreenEnderRender(EntityRendererManager manager) {
            super(manager, new GreenEnderModel(), 0f);
        }

        @Nullable
        @Override
        protected ResourceLocation getEntityTexture(GreenEndermanEntity entity) {
            return GrassEntities.location("textures/entity/tutorial_entity.png");
        }

        public static class RenderFactory implements IRenderFactory<GreenEndermanEntity> {
            @Override
            public EntityRenderer<? super GreenEndermanEntity> createRenderFor(EntityRendererManager manager) {
                return new GreenEnderRender(manager);
            }

        }
    }



