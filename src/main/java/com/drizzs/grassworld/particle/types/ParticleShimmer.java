package com.drizzs.grassworld.particle.types;

import com.drizzs.grassworld.particle.ParticleRenderDispatcher;
import com.drizzs.grassworld.update.util.ConfigHandler;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.IParticleRenderType;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nonnull;
import java.util.ArrayDeque;
import java.util.Queue;

public class ParticleShimmer extends Particle {

    private static final ResourceLocation grassParticles = new ResourceLocation("textures/particle/particles.png");
    public static final ResourceLocation particles = new ResourceLocation("shimmer.png");

    private static final Queue<ParticleShimmer> queuedRenders = new ArrayDeque<>();
    private static final Queue<ParticleShimmer> queuedDepthIgnoringRenders = new ArrayDeque<>();

    private boolean depthTest;
    private final float moteParticleScale;
    private final int moteHalfLife;

    protected float particleScale = (this.rand.nextFloat() * 0.5F + 0.5F) * 2.0F;

    private float s;
    private float s1;
    private float s2;
    private float s3;
    private float s4;
    private float s5;


    public ParticleShimmer(World world, double d, double d1, double d2, double xSpeed, double ySpeed, double zSpeed,
                           float size, float red, float green, float blue, boolean depthTest, float maxAgeMul) {
        super(world, d, d1, d2, 0, 0, 0);

        motionX = xSpeed;
        motionY = ySpeed;
        motionZ = zSpeed;
        particleRed = red;
        particleGreen = green;
        particleBlue = blue;
        particleGravity = 0;
        particleScale *= size;
        moteParticleScale = particleScale;
        maxAge = (int) (28D / (Math.random() * 0.3D + 0.7D) * maxAgeMul);
        this.depthTest = depthTest;

        moteHalfLife = maxAge / 2;
        setSize(0.01F, 0.01F);
        Entity renderentity = Minecraft.getInstance().getRenderViewEntity();

        if (false) {
            int visibleDistance = 50;
            if (!Minecraft.getInstance().gameSettings.fancyGraphics)
                visibleDistance = 25;

            if (renderentity == null || renderentity.getDistanceSq(posX, posY, posZ) > visibleDistance * visibleDistance)
                maxAge = 0;
        }

        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;
    }


    public static void dispatchQueuedRenders(Tessellator tessellator) {
        ParticleRenderDispatcher.shimmerCount = 0;
        ParticleRenderDispatcher.depthIgnoringShimmerCount = 0;

        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 0.75F);
        Minecraft.getInstance().textureManager.bindTexture(ConfigHandler.CLIENT.particleOn.get() ? grassParticles : particles);

        if (!queuedRenders.isEmpty()) {
            tessellator.getBuffer().begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX_LMAP_COLOR);
            for (ParticleShimmer shimmer : queuedRenders)
                shimmer.renderQueued(tessellator, true);
            tessellator.draw();
        }

        if (!queuedDepthIgnoringRenders.isEmpty()) {
            GlStateManager.disableDepthTest();
            tessellator.getBuffer().begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX_LMAP_COLOR);
            for (ParticleShimmer shimmer : queuedDepthIgnoringRenders)
                shimmer.renderQueued(tessellator, false);
            tessellator.draw();
            GlStateManager.enableDepthTest();
        }

        queuedRenders.clear();
        queuedDepthIgnoringRenders.clear();
    }

    private void renderQueued(Tessellator tessellator, boolean depthEnabled) {
        if (depthEnabled) {
            ParticleRenderDispatcher.shimmerCount++;
        } else ParticleRenderDispatcher.depthIgnoringShimmerCount++;

        float agescale = (float) age / (float) moteHalfLife;
        if (agescale > 1F)
            agescale = 2 - agescale;

        particleScale = moteParticleScale * agescale;

        float s10 = 0.5F * particleScale;
        float s11 = (float) (prevPosX + (posX - prevPosX) * s - interpPosX);
        float s12 = (float) (prevPosY + (posY - prevPosY) * s - interpPosY);
        float s13 = (float) (prevPosZ + (posZ - prevPosZ) * s - interpPosZ);
        int combined = 15 << 20 | 15 << 4;
        int k3 = combined >> 16 & 0xFFFF;
        int l3 = combined & 0xFFFF;
        tessellator.getBuffer().pos(s11 - s1 * s10 - s4 * s10, s12 - s2 * s10, s13 - s3 * s10 - s5 * s10).tex(0, 1).lightmap(k3, l3).color(particleRed, particleGreen, particleBlue, 0.5F).endVertex();
        tessellator.getBuffer().pos(s11 - s1 * s10 + s4 * s10, s12 + s2 * s10, s13 - s3 * s10 + s5 * s10).tex(1, 1).lightmap(k3, l3).color(particleRed, particleGreen, particleBlue, 0.5F).endVertex();
        tessellator.getBuffer().pos(s11 + s1 * s10 + s4 * s10, s12 + s2 * s10, s13 + s3 * s10 + s5 * s10).tex(1, 0).lightmap(k3, l3).color(particleRed, particleGreen, particleBlue, 0.5F).endVertex();
        tessellator.getBuffer().pos(s11 + s1 * s10 - s4 * s10, s12 - s2 * s10, s13 + s3 * s10 - s5 * s10).tex(0, 0).lightmap(k3, l3).color(particleRed, particleGreen, particleBlue, 0.5F).endVertex();
    }


    @Override
    public void renderParticle(BufferBuilder buffer, ActiveRenderInfo entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
        this.s = partialTicks;
        this.s1 = rotationX;
        this.s2 = rotationZ;
        this.s3 = rotationYZ;
        this.s4 = rotationXY;
        this.s5 = rotationXZ;

        if (depthTest)
            queuedRenders.add(this);
        else queuedDepthIgnoringRenders.add(this);
    }

    @Nonnull
    @Override
    public IParticleRenderType getRenderType() {
        return IParticleRenderType.CUSTOM;
    }


    @Override
    public void tick() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;

        if (this.age++ >= this.maxAge) {
            this.setExpired();
        }

        this.motionY -= 0.04D * (double) this.particleGravity;
        this.move(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.9800000190734863D;
        this.motionY *= 0.9800000190734863D;
        this.motionZ *= 0.9800000190734863D;
    }

    public void setGravity(float value) {
        particleGravity = value;
    }

    public void setSpeed(float mx, float my, float mz) {
        motionX = mx;
        motionY = my;
        motionZ = mz;
    }
}
