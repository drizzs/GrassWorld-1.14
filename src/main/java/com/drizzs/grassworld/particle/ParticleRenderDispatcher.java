package com.drizzs.grassworld.particle;

import com.drizzs.grassworld.GrassWorld;
import com.drizzs.grassworld.particle.types.ParticleShimmer;
import com.drizzs.grassworld.particle.types.ShimmerParticleType;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.profiler.IProfiler;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.opengl.GL11;

@Mod.EventBusSubscriber(modid = GrassWorld.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ParticleRenderDispatcher {

	public static int shimmerCount = 0;
	public static int depthIgnoringShimmerCount = 0;

	@SubscribeEvent
	public static void registerFactories(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particles.registerFactory(GrassParticleRegistry.SHIMMER, ShimmerParticleType.FACTORY);
}

	public static void dispatch() {
		Tessellator tessellator = Tessellator.getInstance();

		IProfiler profiler = Minecraft.getInstance().getProfiler();

		profiler.startSection("shimmer");
		ParticleShimmer.dispatchQueuedRenders(tessellator);
		profiler.endSection();

		GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1F);
		GlStateManager.disableBlend();
		GlStateManager.depthMask(true);
		GL11.glPopAttrib();
	}

}