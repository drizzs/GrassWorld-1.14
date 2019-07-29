package com.drizzs.grassworld.api.particle;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleType;
import net.minecraft.util.registry.Registry;

public class GWParticleTypes
{
    public static final BasicParticleType ENCHANTEDBLACK = register("enchantedblack", true);
    public static final BasicParticleType ENCHANTEDBLUE = register("enchantedblue", true);
    public static final BasicParticleType ENCHANTEDGREEN = register("enchantedgreen", true);
    public static final BasicParticleType ENCHANTEDLIGHTBLUE = register("enchantedlightblue", true);
    public static final BasicParticleType ENCHANTEDLIGHTGREY = register("enchantedlightgrey", true);
    public static final BasicParticleType ENCHANTEDGREY = register("enchantedgrey", true);
    public static final BasicParticleType ENCHANTEDLIMEGREEN = register("enchantedlimegreen", true);
    public static final BasicParticleType ENCHANTEDYELLOW = register("enchantedyellow", true);
    public static final BasicParticleType ENCHANTEDORANGE = register("enchantedorange", true);
    public static final BasicParticleType ENCHANTEDPINK = register("enchantedpink", true);
    public static final BasicParticleType ENCHANTEDPURPLE = register("enchantedpurple", true);
    public static final BasicParticleType ENCHANTEDWHITE = register("enchantedwhite", true);
    public static final BasicParticleType ENCHANTEDRED = register("enchantedred", true);
    public static final BasicParticleType ENCHANTEDCYAN = register("enchantedcyan", true);
    public static final BasicParticleType ENCHANTEDMAGENTA = register("enchantedmagenta", true);
    public static final BasicParticleType ENCHANTEDBROWN = register("enchantedbrown", true);




    private static BasicParticleType register(String key, boolean alwaysShow) {
        return (BasicParticleType) Registry.<ParticleType<? extends IParticleData>>register(Registry.PARTICLE_TYPE, key, new BasicParticleType(alwaysShow));
    }

    private static <T extends IParticleData> ParticleType<T> register(String key, IParticleData.IDeserializer<T> deserializer) {
        return Registry.register(Registry.PARTICLE_TYPE, key, new ParticleType<>(false, deserializer));
    }


    }

