package com.drizzs.grassworld.particle.types;

import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ShimmerParticleType extends ParticleType<ShimmerParticleData> {

    public ShimmerParticleType() {
        super(false, ShimmerParticleData.DESERIALIZER);
    }

    @OnlyIn(Dist.CLIENT)
    public static IParticleFactory<ShimmerParticleData> FACTORY =
            (data, world, x, y, z, xSpeed, ySpeed, zSpeed) ->
                    new ParticleShimmer(world, x, y, z, xSpeed, ySpeed, zSpeed, data.size, data.r, data.g, data.b, data.depthTest, data.maxAge);
}