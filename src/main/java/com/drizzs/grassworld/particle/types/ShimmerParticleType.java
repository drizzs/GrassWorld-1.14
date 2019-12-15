package com.drizzs.grassworld.particle.types;

import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.particles.ParticleType;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;


public class ShimmerParticleType extends ParticleType<ShimmerParticleData> {

    public ShimmerParticleType() {
        super(false, ShimmerParticleData.DESERIALIZER);
    }


    public static class Factory implements IParticleFactory<ShimmerParticleData> {

        @Nullable
        @Override
        public Particle makeParticle(ShimmerParticleData data, World world, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            return new ParticleShimmer(world, x, y, z, xSpeed, ySpeed, zSpeed, data.size, data.r, data.g, data.b, data.depthTest, data.maxAge);
        }
        /*
        public static IParticleFactory<ShimmerParticleData> FACTORY =
                (data, world, x, y, z, xSpeed, ySpeed, zSpeed) ->
                        new ParticleShimmer(world, x, y, z, xSpeed, ySpeed, zSpeed, data.size, data.r, data.g, data.b, data.depthTest, data.maxAge);*/

    }
}