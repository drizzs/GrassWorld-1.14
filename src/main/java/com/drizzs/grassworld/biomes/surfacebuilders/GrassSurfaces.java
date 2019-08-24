package com.drizzs.grassworld.biomes.surfacebuilders;

import afu.org.checkerframework.checker.oigj.qual.O;
import com.drizzs.grassworld.blocks.GrassWorldBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class GrassSurfaces {

    public static final SurfaceBuilderConfig REDEND;
    public static final SurfaceBuilderConfig GREENEND;
    public static final SurfaceBuilderConfig LIMEGREENEND;
    public static final SurfaceBuilderConfig BLUEEND;
    public static final SurfaceBuilderConfig LIGHTBLUEEND;
    public static final SurfaceBuilderConfig GREYEND;
    public static final SurfaceBuilderConfig LIGHTGREYEND;
    public static final SurfaceBuilderConfig YELLOWEND;
    public static final SurfaceBuilderConfig ORANGEEND;
    public static final SurfaceBuilderConfig PINKEND;
    public static final SurfaceBuilderConfig WHITEEND;
    public static final SurfaceBuilderConfig BLACKEND;
    public static final SurfaceBuilderConfig MAGENTAEND;
    public static final SurfaceBuilderConfig BROWNEND;
    public static final SurfaceBuilderConfig CYANEND;
    public static final SurfaceBuilderConfig PURPLEEND;




    public GrassSurfaces(){}

    static
    {

            REDEND = new SurfaceBuilderConfig(GrassWorldBlocks.redendgrass.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
            GREENEND = new SurfaceBuilderConfig(GrassWorldBlocks.greenendgrass.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
        LIMEGREENEND = new SurfaceBuilderConfig(GrassWorldBlocks.limegreenendgrass.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
        BLUEEND = new SurfaceBuilderConfig(GrassWorldBlocks.blueendgrass.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
        LIGHTBLUEEND = new SurfaceBuilderConfig(GrassWorldBlocks.lightblueendgrass.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
        GREYEND = new SurfaceBuilderConfig(GrassWorldBlocks.greyendgrass.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
        LIGHTGREYEND = new SurfaceBuilderConfig(GrassWorldBlocks.lightgreyendgrass.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
        YELLOWEND = new SurfaceBuilderConfig(GrassWorldBlocks.yellowendgrass.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
        ORANGEEND = new SurfaceBuilderConfig(GrassWorldBlocks.orangeendgrass.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
        PINKEND = new SurfaceBuilderConfig(GrassWorldBlocks.pinkendgrass.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
        WHITEEND = new SurfaceBuilderConfig(GrassWorldBlocks.whiteendgrass.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
        BLACKEND = new SurfaceBuilderConfig(GrassWorldBlocks.blackendgrass.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
        MAGENTAEND = new SurfaceBuilderConfig(GrassWorldBlocks.magentaendgrass.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
        BROWNEND = new SurfaceBuilderConfig(GrassWorldBlocks.brownendgrass.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
        CYANEND = new SurfaceBuilderConfig(GrassWorldBlocks.cyanendgrass.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());
        PURPLEEND = new SurfaceBuilderConfig(GrassWorldBlocks.purpleendgrass.getDefaultState(), Blocks.END_STONE.getDefaultState(), Blocks.END_STONE.getDefaultState());

    }

}
