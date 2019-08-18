package com.drizzs.grassworld.entity.render;

import com.drizzs.grassworld.entity.endtity.GreenEndermanEntity;
import com.drizzs.grassworld.entity.model.GreenEnderModel;
import net.minecraft.client.renderer.entity.EndermanRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EndermanModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.ResourceLocation;

public class EnderRender extends EndermanRenderer {

    private static final ResourceLocation TEXTURE = new ResourceLocation("grassworld:textures/entity/greenenderman.png");

    /**
     * Constructor method for renderer
     *
     * @param renderManagerIn the renderManager
     */
    public EnderRender(final EntityRendererManager renderManagerIn)
    {
        super(renderManagerIn, new GreenEnderModel<>(0));
    }


    protected ResourceLocation getEntityTexture(final MobEntity entity)
    {
        return TEXTURE;
    }



}