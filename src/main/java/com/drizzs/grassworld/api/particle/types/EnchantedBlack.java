package com.drizzs.grassworld.api.particle.types;

import net.minecraft.client.particle.*;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ObjectHolder;


public class EnchantedBlack extends SpriteTexturedParticle
{

    private EnchantedBlack(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn) {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn, 0.0D, 0.0D, 0.0D);
        this.motionX *= 0.800000011920929D;
        this.motionY *= 0.800000011920929D;
        this.motionZ *= 0.800000011920929D;
        this.motionY = (double)(this.rand.nextFloat() * 0.4F + 0.05F);
        this.particleScale *= this.rand.nextFloat() * 2.0F + 0.2F;
        this.maxAge = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
    }


    public void tick() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        float f = (float)this.age / (float)this.maxAge;

        if (this.age++ >= this.maxAge) {
            this.setExpired();
        } else {
            this.motionY -= 0.03D;
            this.move(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.9990000128746033D;
            this.motionY *= 0.9990000128746033D;
            this.motionZ *= 0.9990000128746033D;
            if (this.onGround) {
                this.motionX *= 0.699999988079071D;
                this.motionZ *= 0.699999988079071D;
            }
        }

    }
    public IParticleRenderType getRenderType() {
        return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    public float getScale(float p_217561_1_) {
        float f = ((float)this.age + p_217561_1_) / (float)this.maxAge;
        return this.particleScale * (1.0F - f * f);
    }

    @OnlyIn(Dist.CLIENT)
    public static class Factory implements IParticleFactory<BasicParticleType> {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite p_i50495_1_) {
            this.spriteSet = p_i50495_1_;
        }

        public Particle makeParticle(BasicParticleType typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            EnchantedBlack enchantedblack = new EnchantedBlack(worldIn, x, y, z);
            enchantedblack.selectSpriteRandomly(this.spriteSet);
            return enchantedblack;
        }
    }

}