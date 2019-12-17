package com.drizzs.grassworld;


import com.drizzs.grassworld.registries.GrassRegistry;
import com.drizzs.grassworld.util.GrassConfigHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.drizzs.grassworld.GrassWorld.MOD_ID;
import static com.drizzs.grassworld.registries.GrassFeatures.applyFeatures;

@Mod(MOD_ID)
public class GrassWorld {
    public static final String MOD_ID = "grassworld";
    public static GrassWorld instance;

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


    public GrassWorld() {

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, GrassConfigHandler.CLIENT_SPEC);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GrassConfigHandler.COMMON_SPEC);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
        GrassRegistry.register(bus);
    }

    private void setup(final FMLCommonSetupEvent event) {
        applyFeatures();
    }
}
