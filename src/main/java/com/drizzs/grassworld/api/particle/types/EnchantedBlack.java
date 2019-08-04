package com.drizzs.grassworld.api.particle.types;

import com.drizzs.grassworld.api.particle.GWParticle;
import com.drizzs.grassworld.api.particle.GWParticleTextures;
import com.drizzs.grassworld.util.GWIP;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class EnchantedBlack extends GWParticle
{
    private final float decaySpeed;
    private float angle;
    private final float scale;
    private final int MAX_FRAME_ID = 5;
    protected int currentFrame = 0;
    private boolean directionRight = true;
    private int lastTick = 0;

    public EnchantedBlack(World world, double posX, double posY, double posZ, double motionX, double motionY, double motionZ) {
        super(world, posX, posY, posZ, motionX, motionY, motionZ);
        this.motionX = this.motionX * 0.009999999776482582d + motionX;
        this.motionY = this.motionY * 0.009999999776482582d + motionY;
        this.motionZ = this.motionZ * 0.009999999776482582d + motionZ;
        this.scale = this.particleScale = 0.5f;
        this.decaySpeed = ((float)Math.random() - 0.5F) * 0.1F;
        this.particleAngle = (float)Math.random() * ((float)Math.PI * 2F);
        this.angle = (float)Math.random() * ((float)Math.PI * 2F);
        this.particleGravity = -0.9F;
        this.particleRed = 1f;
        this.particleGreen = 1f;
        this.particleBlue = 1f;
        this.maxAge = (int) (.5d / (Math.random() * 0.8d + 0.2d)) + 4;
    }

    @Override
    public void move(double x, double y, double z) {
        super.move(x, y, z);
    }

    @Override
    public void onPreRender(BufferBuilder buffer, ActiveRenderInfo activeInfo, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
        super.onPreRender(buffer, activeInfo, partialTicks, rotationX, rotationZ, rotationYZ, rotationXY, rotationXZ);
        Entity entity = activeInfo.getRenderViewEntity();
        if (entity.ticksExisted >= this.lastTick + 5) {
            if (this.currentFrame == MAX_FRAME_ID) {
                this.directionRight = false;
            } else if (currentFrame == 0) {
                this.directionRight = true;
            }
            this.currentFrame = this.currentFrame + (directionRight ? 1 : -1);
            this.lastTick = entity.ticksExisted;
        }
        float f = ((float) this.age + partialTicks) / (float) this.maxAge;
        this.particleScale = this.scale * (1f - f * f * 0.5f);
    }

    @Override
    public void tick() {
        super.tick();
        this.prevParticleAngle = this.particleAngle;
        this.particleAngle += (float)Math.PI * this.decaySpeed * 2.0F;
        if (this.onGround) {
            this.prevParticleAngle = this.particleAngle = 0.0F;
        }
        this.motionX += Math.cos(angle) * 0.0025;
        this.motionY *= 1.06D;
        this.motionZ += Math.sin(angle) * 0.0025;
    }

    @Override
    public int getBrightnessForRender(float partialTick) {
        float f = ((float) this.age + partialTick) / (float) this.maxAge;
        f = MathHelper.clamp(f, 0f, 1f);
        int i = super.getBrightnessForRender(partialTick);
        int j = i & 255;
        int k = i >> 16 & 255;
        j = j + (int) (f * 15f * 16f);
        if (j > 240) {
            j = 240;
        }
        return j | k << 16;
    }

    @Override
    public ResourceLocation getTexture() {
        return GWParticleTextures.ENCHANTEDBLACK[currentFrame];
    }

    @OnlyIn(Dist.CLIENT)
    public static class Factory implements GWIP {

        @Override
        public Particle makeParticle(World world, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed, int... params) {
            return new EnchantedBlack(world, x, y, z, xSpeed, ySpeed, zSpeed);
        }

    }


}