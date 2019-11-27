package com.drizzs.grassworld.features;

import com.drizzs.grassworld.blocks.ActualGrass;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.feature.structure.TemplateStructurePiece;
import net.minecraft.world.gen.feature.template.BlockIgnoreStructureProcessor;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;

import static com.drizzs.grassworld.registries.StructurePieceRegistry.ISLANDPIECE;


public class OuterIslandPiece extends TemplateStructurePiece {

    private final String templateName;
    private final GrassIslandVariant variant;
    private final Rotation rotation;
    private final Mirror mirror;

    public OuterIslandPiece(TemplateManager templateManager, GrassIslandVariant variant, String templateName, BlockPos templatePosition, Rotation rotation) {
        this(templateManager, variant, templateName, templatePosition, rotation, Mirror.NONE);
    }

    public OuterIslandPiece(TemplateManager templateManager, GrassIslandVariant variant, String templateName, BlockPos templatePosition, Rotation rotation, Mirror mirror) {
        super(ISLANDPIECE, 0);
        this.templateName = templateName;
        this.variant = variant;
        this.templatePosition = templatePosition;
        this.rotation = rotation;
        this.mirror = mirror;
        this.loadTemplate(templateManager);
    }

    public OuterIslandPiece(TemplateManager templateManager, CompoundNBT nbt) {
        super(ISLANDPIECE, nbt);
        this.templateName = nbt.getString("Template");
        this.variant = GrassIslandVariant.getVariantFromIndex(nbt.getInt("Variant"));
        this.rotation = Rotation.valueOf(nbt.getString("Rotation"));
        this.mirror = Mirror.valueOf(nbt.getString("Mirror"));
        this.loadTemplate(templateManager);
    }

    private void loadTemplate(TemplateManager templateManager) {
        Template template = templateManager.getTemplateDefaulted(new ResourceLocation("grassworld:" + this.templateName));
        PlacementSettings placementsettings = (new PlacementSettings()).setIgnoreEntities(true).setRotation(this.rotation).setMirror(this.mirror).addProcessor(BlockIgnoreStructureProcessor.STRUCTURE_BLOCK);
        this.setup(template, this.templatePosition, placementsettings);
    }

    @Override
    protected void readAdditional(CompoundNBT tagCompound) {
        super.readAdditional(tagCompound);
        tagCompound.putString("Template", this.templateName);
        tagCompound.putInt("Variant", this.variant.getIndex());
        tagCompound.putString("Rotation", this.placeSettings.getRotation().name());
        tagCompound.putString("Mirror", this.placeSettings.getMirror().name());
    }

    @Override
    protected void handleDataMarker(String function, BlockPos pos, IWorld worldIn, Random rand, MutableBoundingBox mbb) {
        switch (function) {
            case "grassworld:grassfloor":
                int grass = rand.nextInt(this.variant.getGrassBlock().length);
                worldIn.setBlockState(pos, this.variant.getGrassBlock()[grass], 2);
                break;
            case "grassworld:lakefluid":
                worldIn.setBlockState(pos, this.variant.getLakeFluid(), 2);
                break;
            case "grassworld:actualgrass":
                worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 2);

                if (rand.nextBoolean()) {
                    int grass_random = rand.nextInt(this.variant.getTallGrass().length);
                    BlockState chosenGrass = this.variant.getTallGrass()[grass_random];

                    if (chosenGrass.getBlock() instanceof ActualGrass) {
                        if (((ActualGrass) chosenGrass.getBlock()).isValidPosition(chosenGrass, worldIn, pos)) {
                            worldIn.setBlockState(pos, chosenGrass, 2);
                        }
                    }
                }
                break;
        }
    }
}