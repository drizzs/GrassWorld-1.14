package com.drizzs.grassworld.entity.endtities.enderman;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.world.World;

public class GreenEnderman extends EndermanEntity

{

    public GreenEnderman(EntityType<? extends EndermanEntity> type, World worldIn) {
        super(type, worldIn);
    }
    @Override
    protected void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)0.3F);
        this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
        this.getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(64.0D);
    }


}
