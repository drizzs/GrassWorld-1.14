package com.drizzs.grassworld.registries;

import com.drizzs.grassworld.features.GrassIslandPiece;
import com.drizzs.grassworld.features.OuterIslandPiece;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;

import static com.drizzs.grassworld.GrassWorld.MOD_ID;

public class StructurePieceRegistry {

    public static final IStructurePieceType ISLANDPIECE = register("islandpiece", GrassIslandPiece::new);
    public static final IStructurePieceType OUTERISLANDPIECE = register("outerislandpiece", OuterIslandPiece::new);

    private static IStructurePieceType register(String key, IStructurePieceType type) {
        return Registry.register(Registry.STRUCTURE_PIECE, new ResourceLocation(MOD_ID, key), type);
    }

}
