package com.drizzs.grassworld.api.particle;

import com.drizzs.grassworld.api.particle.types.EnchantedBlack;
import com.drizzs.grassworld.util.GWIP;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


    public enum GWParticleSpawn {
        ENCHANTEDBLACK;

        GWParticleSpawn() {
        }

        @OnlyIn(Dist.CLIENT)
        public Particle create(World world, double x, double y, double z, double velocityX, double velocityY, double velocityZ, int... params) {
            return getFactory().makeParticle(world, x, y, z, velocityX, velocityY, velocityZ, params);
        }

        @OnlyIn(Dist.CLIENT)
        public GWIP getFactory() {
            switch (this) {
                case ENCHANTEDBLACK:
                    return new EnchantedBlack.Factory();
            }
            return this.getDefaultParticle().getFactory();
        }

        public GWParticleSpawn getDefaultParticle() {
            return ENCHANTEDBLACK;
        }


        public void spawn(World world, double x, double y, double z, double velocityX, double velocityY, double velocityZ, int... parameters) {

                spawn(create(world, x, y, z, velocityX, velocityY, velocityZ, parameters));

        }

        @OnlyIn(Dist.CLIENT)
        private void spawn(Particle particle) {
            Minecraft.getInstance().particles.addEffect(particle);
        }
    }





