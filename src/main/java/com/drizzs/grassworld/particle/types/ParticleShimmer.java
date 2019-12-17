package com.drizzs.grassworld.particle.types;

import com.drizzs.grassworld.util.GrassConfigHandler;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.particle.IParticleRenderType;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nonnull;

public class ParticleShimmer extends Particle {

    private static final ResourceLocation grassParticles = new ResourceLocation("grassworld:textures/particle/shimmer.png");
    public static final ResourceLocation particles = new ResourceLocation("shimmer.png");

    protected float particleScale;
    private final boolean depthTest;
    private final float moteParticleScale;
    private final int moteHalfLife;

    public ParticleShimmer(World world, double d, double d1, double d2, double xSpeed, double ySpeed, double zSpeed,
                           float size, float red, float green, float blue, boolean depthTest, float maxAgeMul) {
        super(world, d, d1, d2, 0, 0, 0);

        motionX = xSpeed;
        motionY = ySpeed;
        motionZ = zSpeed;
        particleRed = blue;
        particleGreen = green;
        particleBlue = red;
        particleGravity = 0;
        particleScale = size;
        moteParticleScale = particleScale;
        maxAge = (int) Math.max(Math.max(world.rand.nextInt(10) * 10F,world.rand.nextInt(10) * 10F), world.rand.nextInt(30) * 10F);
        this.depthTest = depthTest;

        moteHalfLife = maxAge / 2;
        setSize(0.01F, 0.01F);

        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;
    }

    @Override
    public void renderParticle(BufferBuilder buffer, ActiveRenderInfo entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {

        float f10 = 0.5F * particleScale;
        float f11 = (float)(prevPosX + (posX - prevPosX) * partialTicks - interpPosX);
        float f12 = (float)(prevPosY + (posY - prevPosY) * partialTicks - interpPosY);
        float f13 = (float)(prevPosZ + (posZ - prevPosZ) * partialTicks - interpPosZ);
        int combined = 15 << 20 | 15 << 4;
        int k3 = combined >> 16 & 0xFFFF;
        int l3 = combined & 0xFFFF;
        buffer.pos(f11 - rotationX * f10 - rotationXY * f10, f12 - rotationZ * f10, f13 - rotationYZ * f10 - rotationXZ * f10).tex(0, 1).lightmap(k3, l3).color(particleRed, particleGreen, particleBlue, 0.3F).endVertex();
        buffer.pos(f11 - rotationX * f10 + rotationXY * f10, f12 + rotationZ * f10, f13 - rotationYZ * f10 + rotationXZ * f10).tex(1, 1).lightmap(k3, l3).color(particleRed, particleGreen, particleBlue, 0.3F).endVertex();
        buffer.pos(f11 + rotationX * f10 + rotationXY * f10, f12 + rotationZ * f10, f13 + rotationYZ * f10 + rotationXZ * f10).tex(1, 0).lightmap(k3, l3).color(particleRed, particleGreen, particleBlue, 0.3F).endVertex();
        buffer.pos(f11 + rotationX * f10 - rotationXY * f10, f12 - rotationZ * f10, f13 + rotationYZ * f10 - rotationXZ * f10).tex(0, 0).lightmap(k3, l3).color(particleRed, particleGreen, particleBlue, 0.3F).endVertex();

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
        this.motionX *= 0;
        this.motionY = 0.003D;
        this.motionZ *= 0;
    }

    @Nonnull
    @Override
    public IParticleRenderType getRenderType() {
        return depthTest ? NORMAL_RENDER : DIW_RENDER;
    }

    private static void beginRenderCommon(BufferBuilder bufferBuilder, TextureManager textureManager) {
        GL11.glPushAttrib(GL11.GL_LIGHTING_BIT);
        GlStateManager.depthMask(false);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
        GlStateManager.alphaFunc(GL11.GL_GREATER, 0.003921569F);
        GlStateManager.disableLighting();

        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 0.75F);
        textureManager.bindTexture(GrassConfigHandler.CLIENT.particleOn.get() ? grassParticles : particles);
        bufferBuilder.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX_LMAP_COLOR);
    }

    private static void endRenderCommon() {
        GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1F);
        GlStateManager.disableBlend();
        GlStateManager.depthMask(true);
        GL11.glPopAttrib();
    }

    private static final IParticleRenderType NORMAL_RENDER = new IParticleRenderType() {
        @Override
        public void beginRender(BufferBuilder bufferBuilder, TextureManager textureManager) {
            beginRenderCommon(bufferBuilder, textureManager);
        }

        @Override
        public void finishRender(Tessellator tessellator) {
            tessellator.draw();
            endRenderCommon();
        }

        @Override
        public String toString() {
            return "grassworld:shimmer";
        }
    };

    private static final IParticleRenderType DIW_RENDER = new IParticleRenderType() {
        @Override
        public void beginRender(BufferBuilder bufferBuilder, TextureManager textureManager) {
            beginRenderCommon(bufferBuilder, textureManager);
            GlStateManager.disableDepthTest();
        }

        @Override
        public void finishRender(Tessellator tessellator) {
            tessellator.draw();
            GlStateManager.enableDepthTest();
            endRenderCommon();
        }

        @Override
        public String toString() {
            return "grassworld:shimmer";
        }
    };
}
