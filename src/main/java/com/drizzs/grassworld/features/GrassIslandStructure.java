package com.drizzs.grassworld.features;

import com.mojang.datafixers.Dynamic;
import net.minecraft.util.Rotation;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.*;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;
import java.util.function.Function;

public class GrassIslandStructure extends ScatteredStructure<NoFeatureConfig> {

    public GrassIslandStructure(Function<Dynamic<?>, ? extends NoFeatureConfig> config) {
        super(config);
    }

    public boolean startStructure(IWorld world, BlockPos pos) {
        StructureStart start = this.getStart(world, pos, true);
        if (start != StructureStart.DUMMY && start instanceof GrassIslandStructure.Start && !start.getComponents().isEmpty()) {
            StructurePiece piece = (StructurePiece)start.getComponents().get(0);
            return piece instanceof GrassIslandPiece;
        } else {
            return false;
        }
    }

    @Override
    protected ChunkPos getStartPositionForPosition(ChunkGenerator<?> chunkGenerator, Random random, int x, int z, int spacingOffsetsX, int spacingOffsetsZ) {
        random.setSeed(this.getSeedModifier());
        int distance = this.getDistance();
        int separation = this.getSeparation();
        int x1 = x + distance * spacingOffsetsX;
        int z1 = z + distance * spacingOffsetsZ;
        int x2 = x1 < 0 ? x1 - distance + 1 : x1;
        int z2 = z1 < 0 ? z1 - distance + 1 : z1;
        int x3 = x2 / distance;
        int z3 = z2 / distance;
        ((SharedSeedRandom) random).setLargeFeatureSeedWithSalt(chunkGenerator.getSeed(), x3, z3, this.getSeedModifier());
        x3 = x3 * distance;
        z3 = z3 * distance;
        x3 = x3 + random.nextInt(distance - separation);
        z3 = z3 + random.nextInt(distance - separation);

        return new ChunkPos(x3, z3);
    }

    protected int getDistance() {
        return 20;
    }

    protected int getSeparation() {
        return 11;
    }

    @Override
    protected int getSeedModifier() {
        return 14357620;
    }

    @Override
    public IStartFactory getStartFactory() {
        return GrassIslandStructure.Start::new;
    }

    @Override
    public String getStructureName() {
        return "GrassIsland";
    }

    @Override
    public int getSize() {
        return 5;
    }

    public static class Start extends StructureStart {

        public Start(Structure<?> structure, int x, int z, Biome biome, MutableBoundingBox box, int refIn, long seed) {
            super(structure, x, z, biome, box, refIn, seed);
        }

        @Override
        public void init(ChunkGenerator<?> generator, TemplateManager templateManagerIn, int chunkX, int chunkZ, Biome biomeIn) {
            int x = chunkX * 16 + 4 + this.rand.nextInt(8);
            int z = chunkZ * 16 + 4 + this.rand.nextInt(8);

            Rotation rotation = Rotation.values()[this.rand.nextInt(Rotation.values().length)];
            int i = 5;
            int j = 5;
            if (rotation == Rotation.CLOCKWISE_90) {
                i = -5;
            }
            else if (rotation == Rotation.CLOCKWISE_180) {
                i = -5;
                j = -5;
            }
            else if (rotation == Rotation.COUNTERCLOCKWISE_90) {
                j = -5;
            }

            int k = x + 7;
            int l = z + 7;
            int i1 = generator.func_222531_c(x, z, Heightmap.Type.WORLD_SURFACE_WG);
            int j1 = generator.func_222531_c(x, z + j, Heightmap.Type.WORLD_SURFACE_WG);
            int k1 = generator.func_222531_c(x + i, z, Heightmap.Type.WORLD_SURFACE_WG);
            int l1 = generator.func_222531_c(x + i, z + j, Heightmap.Type.WORLD_SURFACE_WG);

            int y = Math.min(Math.min(i1, j1), Math.min(k1, l1)) + 50 + this.rand.nextInt(50) + 11;

            String[] sizes = new String[] { "island1", "island2", "island3", "island4", "island5", "island6", "island7", "island8", "island9", "island10",  "island11", "island12", "island13", "island14", "island15", "island16", "island17", "island18", "island19", "island20", "island21", "island22", "island23", "island24", "island25", "island26", "island27", "island28", "island29" };
            GrassIslandPiece piece = new GrassIslandPiece(templateManagerIn, sizes[this.rand.nextInt(sizes.length)],new BlockPos(x, y, z));
            this.components.add(piece);
        }
    }
}
