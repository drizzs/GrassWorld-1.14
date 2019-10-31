package com.drizzs.grassworld.features.unused;

import com.drizzs.grassworld.util.GrassConfigHandler;
import com.drizzs.grassworld.util.lib.GrassContentLib;
import com.drizzs.grassworld.util.tags.GrassTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;
import net.minecraft.world.gen.feature.structure.TemplateStructurePiece;
import net.minecraft.world.gen.feature.template.BlockIgnoreStructureProcessor;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;

import static com.drizzs.grassworld.util.lib.GrassFeatureLib.ISLANDPIECE;
import static net.minecraft.world.gen.feature.structure.IStructurePieceType.register;

public class GrassIslandPiece2 extends TemplateStructurePiece {

    private final String templateName;



    public GrassIslandPiece2(TemplateManager templateManager, String templateName, BlockPos templatePosition) {
        super(ISLANDPIECE, 0);
        this.templateName = templateName;
        this.templatePosition = templatePosition;
        this.loadTemplate(templateManager);
    }

    public GrassIslandPiece2(TemplateManager templateManager, CompoundNBT nbt) {
        super(ISLANDPIECE, nbt);
        this.templateName = nbt.getString("Template");
        this.loadTemplate(templateManager);
    }

    private void loadTemplate(TemplateManager templateManager) {
        Template template = templateManager.getTemplateDefaulted(new ResourceLocation("grassworld:grassislands/" + this.templateName));
        PlacementSettings placementsettings = (new PlacementSettings()).setIgnoreEntities(true).addProcessor(BlockIgnoreStructureProcessor.STRUCTURE_BLOCK);
        this.setup(template, this.templatePosition, placementsettings);
    }

    @Override
    protected void readAdditional(CompoundNBT tagCompound) {
        super.readAdditional(tagCompound);
        tagCompound.putString("Template", this.templateName);
    }

    @Override
    protected void handleDataMarker(String func , BlockPos pos, IWorld world, Random rand, MutableBoundingBox box) {
        int zz = rand.nextInt(15);
        for(int i = 0; i > -5; --i) {
            for(int k = -5; k < 5; ++k) {
                for(int j = -5; j < 5; ++j) {
                    if ((i * i) + (j * j) + (k * k) < (5 * 5) + 5 + 1) {
                        BlockPos targetpos = pos.add(k,i,j);
                        BlockState state = world.getBlockState(targetpos);
                        BlockState stateup = world.getBlockState(targetpos.up());;
                        if(state.isAir()) {
                            if (stateup.isIn(GrassTags.Blocks.GRASSWORLDGRASS)) {
                                BlockState underblock = underBlockSelector(stateup);
                                world.setBlockState(targetpos, underblock,0);
                            } else {
                                BlockState topBlock;
                                if(GrassConfigHandler.COMMON.RAINBOWISLANDS.get()){
                                    topBlock = randomBlockSelector(rand);
                                }
                                else {
                                    topBlock = topBlockSelector(zz, rand);
                                }

                                world.setBlockState(targetpos, topBlock, 0);;

                            }
                        }
                    }
                }
            }
        }
    }

    public BlockState randomBlockSelector(Random random) {
        int next = random.nextInt(8);
        BlockState topBlock;
        if(next == 0){topBlock = GrassContentLib.blackgrass.getDefaultState();}
        else if(next == 1){topBlock = GrassContentLib.fancyblackgrass.getDefaultState();}
        else if(next == 2){topBlock = GrassContentLib.enchantedblackgrass.getDefaultState();}
        else if(next == 3){topBlock = GrassContentLib.glowingblackgrass.getDefaultState();}
        else if(next == 4){topBlock = GrassContentLib.bluegrass.getDefaultState();}
        else if(next == 5){topBlock = GrassContentLib.fancybluegrass.getDefaultState();}
        else if(next == 6){topBlock = GrassContentLib.enchantedbluegrass.getDefaultState();}
        else if(next == 7){topBlock = GrassContentLib.glowingbluegrass.getDefaultState();}
        else if(next == 8){topBlock = GrassContentLib.browngrass.getDefaultState();}
        else if(next == 9){topBlock = GrassContentLib.fancybrowngrass.getDefaultState();}
        else if(next == 10){topBlock = GrassContentLib.enchantedbrowngrass.getDefaultState();}
        else if(next == 11){topBlock = GrassContentLib.glowingbrowngrass.getDefaultState();}
        else if(next == 12){topBlock = GrassContentLib.cyangrass.getDefaultState();}
        else if(next == 13){topBlock = GrassContentLib.fancycyangrass.getDefaultState();}
        else if(next == 14){topBlock = GrassContentLib.enchantedcyangrass.getDefaultState();}
        else if(next == 15){topBlock = GrassContentLib.glowingcyangrass.getDefaultState();}
        else if(next == 16){topBlock = GrassContentLib.greengrass.getDefaultState();}
        else if(next == 17){topBlock = GrassContentLib.fancygreengrass.getDefaultState();}
        else if(next == 18){topBlock = GrassContentLib.enchantedgreengrass.getDefaultState();}
        else if(next == 19){topBlock = GrassContentLib.glowinggreengrass.getDefaultState();}
        else if(next == 20){topBlock = GrassContentLib.greygrass.getDefaultState();}
        else if(next == 21){topBlock = GrassContentLib.fancygreygrass.getDefaultState();}
        else if(next == 22){topBlock = GrassContentLib.enchantedgreygrass.getDefaultState();}
        else if(next == 23){topBlock = GrassContentLib.glowinggreygrass.getDefaultState();}
        else if(next == 24){topBlock = GrassContentLib.lightbluegrass.getDefaultState();}
        else if(next == 25){topBlock = GrassContentLib.fancylightbluegrass.getDefaultState();}
        else if(next == 26){topBlock = GrassContentLib.enchantedlightbluegrass.getDefaultState();}
        else if(next == 27){topBlock = GrassContentLib.glowinglightbluegrass.getDefaultState();}
        else if(next == 28){topBlock = GrassContentLib.lightgreygrass.getDefaultState();}
        else if(next == 29){topBlock = GrassContentLib.fancylightgreygrass.getDefaultState();}
        else if(next == 30){topBlock = GrassContentLib.enchantedlightgreygrass.getDefaultState();}
        else if(next == 31){topBlock = GrassContentLib.glowinglightgreygrass.getDefaultState();}
        else if(next == 32){topBlock = GrassContentLib.limegreengrass.getDefaultState();}
        else if(next == 33){topBlock = GrassContentLib.fancylimegreengrass.getDefaultState();}
        else if(next == 34){topBlock = GrassContentLib.enchantedlimegreengrass.getDefaultState();}
        else if(next == 35){topBlock = GrassContentLib.glowinglimegreengrass.getDefaultState();}
        else if(next == 36){topBlock = GrassContentLib.magentagrass.getDefaultState();}
        else if(next == 37){topBlock = GrassContentLib.fancymagentagrass.getDefaultState();}
        else if(next == 38){topBlock = GrassContentLib.enchantedmagentagrass.getDefaultState();}
        else if(next == 39){topBlock = GrassContentLib.glowingmagentagrass.getDefaultState();}
        else if(next == 40){topBlock = GrassContentLib.orangegrass.getDefaultState();}
        else if(next == 41){topBlock = GrassContentLib.fancyorangegrass.getDefaultState();}
        else if(next == 42){topBlock = GrassContentLib.enchantedorangegrass.getDefaultState();}
        else if(next == 43){topBlock = GrassContentLib.glowingorangegrass.getDefaultState();}
        else if(next == 44){topBlock = GrassContentLib.pinkgrass.getDefaultState();}
        else if(next == 45){topBlock = GrassContentLib.fancypinkgrass.getDefaultState();}
        else if(next == 46){topBlock = GrassContentLib.enchantedpinkgrass.getDefaultState();}
        else if(next == 47){topBlock = GrassContentLib.glowingpinkgrass.getDefaultState();}
        else if(next == 48){topBlock = GrassContentLib.purplegrass.getDefaultState();}
        else if(next == 49){topBlock = GrassContentLib.fancypurplegrass.getDefaultState();}
        else if(next == 50){topBlock = GrassContentLib.enchantedpurplegrass.getDefaultState();}
        else if(next == 51){topBlock = GrassContentLib.glowingpurplegrass.getDefaultState();}
        else if(next == 52){topBlock = GrassContentLib.redgrass.getDefaultState();}
        else if(next == 53){topBlock = GrassContentLib.fancyredgrass.getDefaultState();}
        else if(next == 54){topBlock = GrassContentLib.enchantedredgrass.getDefaultState();}
        else if(next == 55){topBlock = GrassContentLib.glowingredgrass.getDefaultState();}
        else if(next == 56){topBlock = GrassContentLib.whitegrass.getDefaultState();}
        else if(next == 57){topBlock = GrassContentLib.fancywhitegrass.getDefaultState();}
        else if(next == 58){topBlock = GrassContentLib.enchantedwhitegrass.getDefaultState();}
        else if(next == 59){topBlock = GrassContentLib.glowingwhitegrass.getDefaultState();}
        else if(next == 60){topBlock = GrassContentLib.yellowgrass.getDefaultState();}
        else if(next == 61){topBlock = GrassContentLib.fancyyellowgrass.getDefaultState();}
        else if(next == 62){topBlock = GrassContentLib.enchantedyellowgrass.getDefaultState();}
        else if(next == 63){topBlock = GrassContentLib.glowingyellowgrass.getDefaultState();}
        else{topBlock = GrassContentLib.fancywhitegrass.getDefaultState();}
        return topBlock;
    }


    public BlockState underBlockSelector(BlockState state) {

        BlockState underblock = null;
        if (state.isIn(GrassTags.Blocks.ISVALIDGROUND) || state.isIn(GrassTags.Blocks.OVERWORLDSEEDDIRT)) {
            underblock = Blocks.DIRT.getDefaultState();
        } else if (state.isIn(GrassTags.Blocks.NETHERGRASS) || state.isIn(GrassTags.Blocks.NETHERSEEDDIRT)) {
            underblock = Blocks.NETHERRACK.getDefaultState();
        } else if (state.isIn(GrassTags.Blocks.ENDGRASS) || state.isIn(GrassTags.Blocks.ENDSEEDDIRT)) {
            underblock = Blocks.END_STONE.getDefaultState();
        }
        return underblock;
    }

    public BlockState topBlockSelector(int type, Random random) {
        BlockState topBlock = null;
        if (type == 0){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                topBlock = GrassContentLib.blackgrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                topBlock = GrassContentLib.fancyblackgrass.getDefaultState();
            }
            else if(next == 2){
                topBlock = GrassContentLib.enchantedblackgrass.getDefaultState();
            }
            else if(next == 6){
                topBlock = GrassContentLib.glowingblackgrass.getDefaultState();
            }
        }
        else if (type == 1){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                topBlock = GrassContentLib.bluegrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                topBlock = GrassContentLib.fancybluegrass.getDefaultState();
            }
            else if(next == 2){
                topBlock = GrassContentLib.enchantedbluegrass.getDefaultState();
            }
            else if(next == 6){
                topBlock = GrassContentLib.glowingbluegrass.getDefaultState();
            }
        }
        else if (type == 2){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                topBlock = GrassContentLib.browngrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                topBlock = GrassContentLib.fancybrowngrass.getDefaultState();
            }
            else if(next == 2){
                topBlock = GrassContentLib.enchantedbrowngrass.getDefaultState();
            }
            else if(next == 6){
                topBlock = GrassContentLib.glowingbrowngrass.getDefaultState();
            }
        }
        else if (type == 3){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                topBlock = GrassContentLib.cyangrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                topBlock = GrassContentLib.fancycyangrass.getDefaultState();
            }
            else if(next == 2){
                topBlock = GrassContentLib.enchantedcyangrass.getDefaultState();
            }
            else if(next == 6){
                topBlock = GrassContentLib.glowingcyangrass.getDefaultState();
            }
        }
        else if (type == 4){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                topBlock = GrassContentLib.greengrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                topBlock = GrassContentLib.fancygreengrass.getDefaultState();
            }
            else if(next == 2){
                topBlock = GrassContentLib.enchantedgreengrass.getDefaultState();
            }
            else if(next == 6){
                topBlock = GrassContentLib.glowinggreengrass.getDefaultState();
            }
        }
        else if (type == 5){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                topBlock = GrassContentLib.greygrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                topBlock = GrassContentLib.fancygreygrass.getDefaultState();
            }
            else if(next == 2){
                topBlock = GrassContentLib.enchantedgreygrass.getDefaultState();
            }
            else if(next == 6){
                topBlock = GrassContentLib.glowinggreygrass.getDefaultState();
            }
        }
        else if (type == 6){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                topBlock = GrassContentLib.lightbluegrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                topBlock = GrassContentLib.fancylightbluegrass.getDefaultState();
            }
            else if(next == 2){
                topBlock = GrassContentLib.enchantedlightbluegrass.getDefaultState();
            }
            else if(next == 6){
                topBlock = GrassContentLib.glowinglightbluegrass.getDefaultState();
            }
        }
        else if (type == 7){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                topBlock = GrassContentLib.lightgreygrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                topBlock = GrassContentLib.fancylightgreygrass.getDefaultState();
            }
            else if(next == 2){
                topBlock = GrassContentLib.enchantedlightgreygrass.getDefaultState();
            }
            else if(next == 6){
                topBlock = GrassContentLib.glowinglightgreygrass.getDefaultState();
            }
        }
        else if (type == 8){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                topBlock = GrassContentLib.limegreengrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                topBlock = GrassContentLib.fancylimegreengrass.getDefaultState();
            }
            else if(next == 2){
                topBlock = GrassContentLib.enchantedlimegreengrass.getDefaultState();
            }
            else if(next == 6){
                topBlock = GrassContentLib.glowinglimegreengrass.getDefaultState();
            }
        }
        else if (type == 9){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                topBlock = GrassContentLib.magentagrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                topBlock = GrassContentLib.fancymagentagrass.getDefaultState();
            }
            else if(next == 2){
                topBlock = GrassContentLib.enchantedmagentagrass.getDefaultState();
            }
            else if(next == 6){
                topBlock = GrassContentLib.glowingmagentagrass.getDefaultState();
            }
        }
        else if (type == 10){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                topBlock = GrassContentLib.orangegrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                topBlock = GrassContentLib.fancyorangegrass.getDefaultState();
            }
            else if(next == 2){
                topBlock = GrassContentLib.enchantedorangegrass.getDefaultState();
            }
            else if(next == 6){
                topBlock = GrassContentLib.glowingorangegrass.getDefaultState();
            }
        }
        else if (type == 11){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                topBlock = GrassContentLib.pinkgrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                topBlock = GrassContentLib.fancypinkgrass.getDefaultState();
            }
            else if(next == 2){
                topBlock = GrassContentLib.enchantedpinkgrass.getDefaultState();
            }
            else if(next == 6){
                topBlock = GrassContentLib.glowingpinkgrass.getDefaultState();
            }
        }
        else if (type == 12){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                topBlock = GrassContentLib.purplegrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                topBlock = GrassContentLib.fancypurplegrass.getDefaultState();
            }
            else if(next == 2){
                topBlock = GrassContentLib.enchantedpurplegrass.getDefaultState();
            }
            else if(next == 6){
                topBlock = GrassContentLib.glowingpurplegrass.getDefaultState();
            }
        }
        else if (type == 13){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                topBlock = GrassContentLib.redgrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                topBlock = GrassContentLib.fancyredgrass.getDefaultState();
            }
            else if(next == 2){
                topBlock = GrassContentLib.enchantedredgrass.getDefaultState();
            }
            else if(next == 6){
                topBlock = GrassContentLib.glowingredgrass.getDefaultState();
            }
        }
        else if (type == 14){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                topBlock = GrassContentLib.whitegrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                topBlock = GrassContentLib.fancywhitegrass.getDefaultState();
            }
            else if(next == 2){
                topBlock = GrassContentLib.enchantedwhitegrass.getDefaultState();
            }
            else if(next == 6){
                topBlock = GrassContentLib.glowingwhitegrass.getDefaultState();
            }
        }
        else if (type == 15){
            int next = random.nextInt(8);
            if(next == 0 || next == 3 || next == 4 || next == 7){
                topBlock = GrassContentLib.yellowgrass.getDefaultState();
            }
            else if(next == 1 || next == 5 || next == 8){
                topBlock = GrassContentLib.fancyyellowgrass.getDefaultState();
            }
            else if(next == 2){
                topBlock = GrassContentLib.enchantedyellowgrass.getDefaultState();
            }
            else if(next == 6){
                topBlock = GrassContentLib.glowingyellowgrass.getDefaultState();
            }
        }
        return topBlock;
    }

}
