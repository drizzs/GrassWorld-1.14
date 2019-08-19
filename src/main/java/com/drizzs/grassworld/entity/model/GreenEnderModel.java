package com.drizzs.grassworld.entity.model;

import com.drizzs.grassworld.entity.endtity.GreenEndermanEntity;
import net.minecraft.client.renderer.entity.model.EndermanModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GreenEnderModel extends EndermanModel<GreenEndermanEntity> {

    public GreenEnderModel() {
        super(0);
    }
}
