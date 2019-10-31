package com.drizzs.grassworld.util.lib;


import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.GrassFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;
import net.minecraft.world.gen.feature.structure.ScatteredStructure;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder("grassworld")
public class GrassFeatureLib
{
    @ObjectHolder("grassworld:grassisland")
    public static Structure<NoFeatureConfig> ISLANDFEATURE;

    public static IStructurePieceType ISLANDPIECE;




}
