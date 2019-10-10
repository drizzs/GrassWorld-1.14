package com.drizzs.grassworld.items;

import com.drizzs.grassworld.util.GrassHolders;
import com.drizzs.grassworld.util.group.GrassGroup;
import com.drizzs.grassworld.util.lib.GrassContentLib;
import com.drizzs.grassworld.util.tags.GrassTags;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class GrassWorldSeed extends Item {


    public GrassWorldSeed(Properties group, String id) {
        super(new Properties().group(GrassGroup.instance).maxStackSize(16));
        setRegistryName(id);

    }

    @Nonnull
    public ActionResultType onItemUse(ItemUseContext context) {
        World world = context.getWorld();
        BlockPos blockpos = context.getPos();
        ItemStack item = context.getItem();
        if (this.isIn(GrassTags.Items.DIRTSEED)) {
            if (world.getBlockState(blockpos).getBlock().isIn(GrassTags.Blocks.OVERWORLDSEEDDIRT)) {
                GrassHolders.grassBlock = grassBlockPicker();
                world.setBlockState(blockpos, GrassHolders.grassBlock);
                item.shrink(1);
            }
        } else if
        (this.isIn(GrassTags.Items.NETHERSEED)) {
            if (world.getBlockState(blockpos).getBlock().isIn(GrassTags.Blocks.NETHERSEEDDIRT)) {
                GrassHolders.grassBlock = grassBlockPicker();
                world.setBlockState(blockpos, GrassHolders.grassBlock);
                item.shrink(1);
            }

        } else if
        (this.isIn(GrassTags.Items.ENDSEED)) {
            if (world.getBlockState(blockpos).getBlock().isIn(GrassTags.Blocks.ENDSEEDDIRT)) {
                GrassHolders.grassBlock = grassBlockPicker();
                world.setBlockState(blockpos, GrassHolders.grassBlock);
                item.shrink(1);
            }

        }
        return ActionResultType.SUCCESS;

    }

    public BlockState grassBlockPicker() {

        if (this.isIn(GrassTags.Items.DIRTSEED)) {

            if (this.isIn(GrassTags.Items.NORMALSEED)) {

                if (this.isIn(GrassTags.Items.BLUESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.bluegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.BLACKSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.blackgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.BROWNSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.browngrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.GREYSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.greygrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.CYANSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.cyangrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.GREENSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.greengrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIGHTBLUESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.lightbluegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIGHTGREYSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.lightgreygrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIMEGREENSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.limegreengrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.MAGENTASEED)) {
                    GrassHolders.grassBlock = GrassContentLib.magentagrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.ORANGESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.orangegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.PINKSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.pinkgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.PURPLESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.purplegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.REDSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.redgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.WHITESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.whitegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.YELLOWSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.yellowgrass.getDefaultState();
                }

            } else if (this.isIn(GrassTags.Items.FANCYSEED)) {

                if (this.isIn(GrassTags.Items.BLUESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancybluegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.BLACKSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancyblackgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.BROWNSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancybrowngrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.GREYSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancygreygrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.CYANSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancycyangrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.GREENSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancygreengrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIGHTBLUESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancylightbluegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIGHTGREYSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancylightgreygrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIMEGREENSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancylimegreengrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.MAGENTASEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancymagentagrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.ORANGESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancyorangegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.PINKSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancypinkgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.PURPLESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancypurplegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.REDSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancyredgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.WHITESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancywhitegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.YELLOWSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancyyellowgrass.getDefaultState();
                }

            } else if (this.isIn(GrassTags.Items.ENCHANTEDSEED)) {

                if (this.isIn(GrassTags.Items.BLUESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.enchantedbluegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.BLACKSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.enchantedblackgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.BROWNSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.enchantedbrowngrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.GREYSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.enchantedgreygrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.CYANSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.enchantedcyangrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.GREENSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.enchantedgreengrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIGHTBLUESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.enchantedlightbluegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIGHTGREYSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.enchantedlightgreygrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIMEGREENSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.enchantedlimegreengrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.MAGENTASEED)) {
                    GrassHolders.grassBlock = GrassContentLib.enchantedmagentagrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.ORANGESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.enchantedorangegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.PINKSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.enchantedpinkgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.PURPLESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.enchantedpurplegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.REDSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.enchantedredgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.WHITESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.enchantedwhitegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.YELLOWSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.enchantedyellowgrass.getDefaultState();
                }

            } else if (this.isIn(GrassTags.Items.GLOWINGSEED)) {

                if (this.isIn(GrassTags.Items.BLUESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.glowingbluegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.BLACKSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.glowingblackgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.BROWNSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.glowingbrowngrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.GREYSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.glowinggreygrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.CYANSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.glowingcyangrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.GREENSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.glowinggreengrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIGHTBLUESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.glowinglightbluegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIGHTGREYSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.glowinglightgreygrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIMEGREENSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.glowinglimegreengrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.MAGENTASEED)) {
                    GrassHolders.grassBlock = GrassContentLib.glowingmagentagrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.ORANGESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.glowingorangegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.PINKSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.glowingpinkgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.PURPLESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.glowingpurplegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.REDSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.glowingredgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.WHITESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.glowingwhitegrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.YELLOWSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.glowingyellowgrass.getDefaultState();
                }

            }

        } else if (this.isIn(GrassTags.Items.ENDSEED)) {

            if (this.isIn(GrassTags.Items.NORMALSEED)) {

                if (this.isIn(GrassTags.Items.BLUESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.blueendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.BLACKSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.blackendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.BROWNSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.brownendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.GREYSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.greyendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.CYANSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.cyanendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.GREENSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.greenendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIGHTBLUESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.lightblueendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIGHTGREYSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.lightgreyendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIMEGREENSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.limegreenendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.MAGENTASEED)) {
                    GrassHolders.grassBlock = GrassContentLib.magentaendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.ORANGESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.orangeendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.PINKSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.pinkendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.PURPLESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.purpleendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.REDSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.redendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.WHITESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.whiteendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.YELLOWSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.yellowendgrass.getDefaultState();
                }

            } else if (this.isIn(GrassTags.Items.FANCYSEED)) {

                if (this.isIn(GrassTags.Items.BLUESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancyblueendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.BLACKSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancyblackendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.BROWNSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancybrownendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.GREYSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancygreyendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.CYANSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancycyanendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.GREENSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancygreenendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIGHTBLUESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancylightblueendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIGHTGREYSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancylightgreyendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIMEGREENSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancylimegreenendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.MAGENTASEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancymagentaendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.ORANGESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancyorangeendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.PINKSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancypinkendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.PURPLESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancypurpleendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.REDSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancyredendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.WHITESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancywhiteendgrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.YELLOWSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancyyellowendgrass.getDefaultState();
                }

            }

        } else if (this.isIn(GrassTags.Items.NETHERSEED)) {

            if (this.isIn(GrassTags.Items.NORMALSEED)) {
                if (this.isIn(GrassTags.Items.BLUESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.bluenethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.BLACKSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.blacknethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.BROWNSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.brownnethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.GREYSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.greynethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.CYANSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.cyannethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.GREENSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.greennethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIGHTBLUESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.lightbluenethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIGHTGREYSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.lightgreynethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIMEGREENSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.limegreennethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.MAGENTASEED)) {
                    GrassHolders.grassBlock = GrassContentLib.magentanethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.ORANGESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.orangenethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.PINKSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.pinknethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.PURPLESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.purplenethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.REDSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.rednethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.WHITESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.whitenethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.YELLOWSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.yellownethergrass.getDefaultState();
                }

            } else if (this.isIn(GrassTags.Items.FANCYSEED)) {
                if (this.isIn(GrassTags.Items.BLUESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancybluenethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.BLACKSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancyblacknethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.BROWNSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancybrownnethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.GREYSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancygreynethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.CYANSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancycyannethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.GREENSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancygreennethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIGHTBLUESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancylightbluenethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIGHTGREYSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancylightgreynethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.LIMEGREENSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancylimegreennethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.MAGENTASEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancymagentanethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.ORANGESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancyorangenethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.PINKSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancypinknethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.PURPLESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancypurplenethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.REDSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancyrednethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.WHITESEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancywhitenethergrass.getDefaultState();
                } else if (this.isIn(GrassTags.Items.YELLOWSEED)) {
                    GrassHolders.grassBlock = GrassContentLib.fancyyellownethergrass.getDefaultState();
                }

            }

        }

        return GrassHolders.grassBlock;
    }

}
