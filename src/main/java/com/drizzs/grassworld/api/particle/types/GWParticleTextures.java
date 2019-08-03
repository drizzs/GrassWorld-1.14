package com.drizzs.grassworld.api.particle.types;

import com.drizzs.grassworld.GrassWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GrassWorld.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GWParticleTextures {

    public static ResourceLocation[] ENCHANTEDBLACK = new ResourceLocation[] {
            new ResourceLocation("grassworld:textures/particles/enchantedblack.png"),
            new ResourceLocation("grassworld:textures/particles/enchantedblack1.png"),
            new ResourceLocation("grassworld:textures/particles/enchantedblack2.png"),
            new ResourceLocation("grassworld:textures/particles/enchantedblack3.png"),
            new ResourceLocation("grassworld:textures/particles/enchantedblack4.png"),
            new ResourceLocation("grassworld:textures/particles/enchantedblack4.png")
    };
    }
