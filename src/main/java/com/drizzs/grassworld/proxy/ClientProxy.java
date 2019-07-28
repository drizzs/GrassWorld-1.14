package com.drizzs.grassworld.proxy;

import com.drizzs.grassworld.api.particle.GWParticleTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ItemParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ClientProxy extends CommonProxy
{

    public ClientProxy()
    {

    }

    @Override
    public void spawnParticle(GWParticleTypes type, World parWorld, double x, double y, double z, Object... info)
    {

    }

}
