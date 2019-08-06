package com.drizzs.grassworld.client.models;

import com.drizzs.grassworld.entity.endtities.enderman.GreenEnderman;
import net.minecraft.client.renderer.entity.model.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GreenEndermanModel extends EndermanModel<GreenEnderman>
{


    public GreenEndermanModel(float scale) {
        super(scale);
    }
}
