package com.drizzs.grassworld.util.config;

import com.drizzs.grassworld.GrassWorld;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

import java.io.File;

@Mod.EventBusSubscriber
public class GrassConfig
{
    private static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec config;

    static
    {
        config = builder.build();

    }
    public static void loadConfig(ForgeConfigSpec config, String path)
    {

        GrassWorld.LOGGER.info("Loading Config:" + path);
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
        GrassWorld.LOGGER.info("BuiltConfig:" + path);
        file.load();
        GrassWorld.LOGGER.info("LoadedConfig:" + path);
        config.setConfig(file);
    }

}
