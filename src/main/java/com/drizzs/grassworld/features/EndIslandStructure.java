package com.drizzs.grassworld.features;

import com.mojang.datafixers.Dynamic;
import net.minecraft.util.Rotation;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.ScatteredStructure;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;
import java.util.function.Function;

public class EndIslandStructure extends ScatteredStructure<NoFeatureConfig> {

  public EndIslandStructure(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i51476_1_) {
    super(p_i51476_1_);
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
    return 14357800;
  }

  @Override
  public IStartFactory getStartFactory() {
    return EndIslandStructure.Start::new;
  }

  @Override
  public String getStructureName() {
    return "endisland";
  }

  @Override
  public int getSize() {
    return 8;
  }

  public static class Start extends StructureStart {

    public Start(Structure<?> structureIn, int p_i50515_2_, int p_i50515_3_, Biome p_i50515_4_, MutableBoundingBox p_i50515_5_, int p_i50515_6_, long p_i50515_7_) {
      super(structureIn, p_i50515_2_, p_i50515_3_, p_i50515_4_, p_i50515_5_, p_i50515_6_, p_i50515_7_);
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

      int rnr = this.rand.nextInt(15);
      GrassIslandVariant variant = GrassIslandVariant.BLUEEND;

      if (rnr == 1) {
        variant = GrassIslandVariant.BLACKEND;
      }
      else if (rnr == 2) {
        variant = GrassIslandVariant.BROWNEND;
      }
      else if (rnr == 3) {
        variant = GrassIslandVariant.CYANEND;
      }
      else if (rnr == 4) {
        variant = GrassIslandVariant.GREENEND;
      }
      else if (rnr == 5) {
        variant = GrassIslandVariant.GREYEND;
      }
      else if (rnr == 6) {
        variant = GrassIslandVariant.LIGHTBLUEEND;
      }
      else if (rnr == 7) {
        variant = GrassIslandVariant.LIGHTGREYEND;
      }
      else if (rnr == 8) {
        variant = GrassIslandVariant.LIMEEND;
      }
      else if (rnr == 9) {
        variant = GrassIslandVariant.MAGENTAEND;
      }
      else if (rnr == 10) {
        variant = GrassIslandVariant.PINKEND;
      }
      else if (rnr == 11) {
        variant = GrassIslandVariant.PURPLEEND;
      }
      else if (rnr == 12) {
        variant = GrassIslandVariant.ORANGEEND;
      }
      else if (rnr == 13) {
        variant = GrassIslandVariant.REDEND;
      }
      else if (rnr == 14) {
        variant = GrassIslandVariant.WHITEEND;
      }
      else if (rnr == 15) {
        variant = GrassIslandVariant.YELLOWEND;
      }

      GrassIslandPiece grassIslandPiece;
      grassIslandPiece = new GrassIslandPiece(templateManagerIn, variant, "endisland", new BlockPos(x, y, z), rotation);
      this.components.add(grassIslandPiece);
      this.recalculateStructureSize();
    }
  }
}