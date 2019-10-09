package com.drizzs.grassworld.registries;

import com.drizzs.grassworld.blocks.ActualGrass;
import com.drizzs.grassworld.blocks.GrassBase;
import com.drizzs.grassworld.blocks.UniqueGrassBase;
import com.drizzs.grassworld.util.lib.GrassContentLib;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class GrassBlocks
{

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        //Normal Grass


        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "orangegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "bluegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "blackgrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "whitegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "redgrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "yellowgrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "purplegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "pinkgrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "browngrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "greygrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "lightgreygrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "lightbluegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "limegreengrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "greengrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "magentagrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "cyangrass"));

        //Fancy Grass
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancyorangegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancybluegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancyblackgrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancywhitegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancyredgrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancyyellowgrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancypurplegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancypinkgrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancybrowngrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancygreygrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancylightgreygrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancylightbluegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancylimegreengrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancygreengrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancymagentagrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancycyangrass"));

        //Glowing Grass
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT), "glowingorangegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT), "glowingbluegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT), "glowingblackgrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT), "glowingwhitegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT), "glowingredgrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT), "glowingyellowgrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT), "glowingpurplegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT), "glowingpinkgrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT), "glowingbrowngrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT), "glowinggreygrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT), "glowinglightgreygrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT), "glowinglightbluegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT), "glowinglimegreengrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT), "glowinggreengrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT), "glowingmagentagrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().lightValue(15).hardnessAndResistance(0.6F).sound(SoundType.PLANT), "glowingcyangrass"));

        //Enchanted Grass
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "enchantedorangegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "enchantedbluegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "enchantedblackgrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "enchantedwhitegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "enchantedredgrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "enchantedyellowgrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "enchantedpurplegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "enchantedpinkgrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "enchantedbrowngrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "enchantedgreygrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "enchantedlightgreygrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "enchantedlightbluegrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "enchantedlimegreengrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "enchantedgreengrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "enchantedmagentagrass"));
        event.getRegistry().register(new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "enchantedcyangrass"));

        //Actual Grass
        event.getRegistry().register(new ActualGrass(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT), "actualgrassorange"));
        event.getRegistry().register(new ActualGrass(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT), "actualgrasscyan"));
        event.getRegistry().register(new ActualGrass(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT), "actualgrassred"));
        event.getRegistry().register(new ActualGrass(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT), "actualgrassyellow"));
        event.getRegistry().register(new ActualGrass(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT), "actualgrassbrown"));
        event.getRegistry().register(new ActualGrass(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT), "actualgrasspink"));
        event.getRegistry().register(new ActualGrass(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT), "actualgrasspurple"));
        event.getRegistry().register(new ActualGrass(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT), "actualgrassgreen"));
        event.getRegistry().register(new ActualGrass(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT), "actualgrasslimegreen"));
        event.getRegistry().register(new ActualGrass(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT), "actualgrassblue"));
        event.getRegistry().register(new ActualGrass(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT), "actualgrasslightblue"));
        event.getRegistry().register(new ActualGrass(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT), "actualgrassgrey"));
        event.getRegistry().register(new ActualGrass(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT), "actualgrasslightgrey"));
        event.getRegistry().register(new ActualGrass(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT), "actualgrassmagenta"));
        event.getRegistry().register(new ActualGrass(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT), "actualgrassblack"));
        event.getRegistry().register(new ActualGrass(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().hardnessAndResistance(0).sound(SoundType.PLANT), "actualgrasswhite"));

        //Planks
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.BLACK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("plankblack"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.RED).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("plankblack"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("plankblack"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.BLUE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("plankblack"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_BLUE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("plankblack"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("plankblack"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("plankblack"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.GREEN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("plankblack"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("plankblack"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("plankblack"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.PINK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("plankblack"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.MAGENTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("plankblack"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.CYAN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("plankblack"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.PURPLE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("plankblack"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("plankblack"));
        event.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("plankblack"));

        //Normal End Grass
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "orangeendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "blueendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "blackendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "whiteendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "redendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "yellowendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "purpleendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "pinkendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "brownendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "greyendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "lightgreyendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "lightblueendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "limegreenendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "greenendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "magentaendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "cyanendgrass"));

        //Fancy End Grass
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancyorangeendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancyblueendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancyblackendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancywhiteendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancyredendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancyyellowendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancypurpleendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancypinkendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancybrownendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancygreyendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancylightgreyendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancylightblueendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancylimegreenendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancygreenendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancymagentaendgrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancycyanendgrass"));

        //Normal Nether Grass
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "orangenethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "bluenethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "blacknethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "whitenethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "rednethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "yellownethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "purplenethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "pinknethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "brownnethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "greynethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "lightgreynethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "lightbluenethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "limegreennethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "greennethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "magentanethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "cyannethergrass"));

        //Fancy Nether Grass
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancyorangenethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancybluenethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancyblacknethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancywhitenethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancyrednethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancyyellownethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancypurplenethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancypinknethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancybrownnethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancygreynethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancylightgreynethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancylightbluenethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancylimegreennethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancygreennethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancymagentanethergrass"));
        event.getRegistry().register(new UniqueGrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT), "fancycyannethergrass"));

        //Logs
        event.getRegistry().register(new LogBlock(MaterialColor.BLACK, (Block.Properties.create(Material.WOOD, MaterialColor.BLACK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName("blacklog"));
        event.getRegistry().register(new LogBlock(MaterialColor.RED, (Block.Properties.create(Material.WOOD, MaterialColor.RED).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName("redlog"));
        event.getRegistry().register(new LogBlock(MaterialColor.YELLOW, (Block.Properties.create(Material.WOOD, MaterialColor.YELLOW).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName("yellowlog"));
        event.getRegistry().register(new LogBlock(MaterialColor.BLUE, (Block.Properties.create(Material.WOOD, MaterialColor.BLUE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName("bluelog"));
        event.getRegistry().register(new LogBlock(MaterialColor.LIGHT_BLUE, (Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_BLUE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName("lightbluelog"));
        event.getRegistry().register(new LogBlock(MaterialColor.GRAY, (Block.Properties.create(Material.WOOD, MaterialColor.GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName("greylog"));
        event.getRegistry().register(new LogBlock(MaterialColor.LIGHT_GRAY, (Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName("lightgreylog"));
        event.getRegistry().register(new LogBlock(MaterialColor.GREEN, (Block.Properties.create(Material.WOOD, MaterialColor.GREEN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName("greenlog"));
        event.getRegistry().register(new LogBlock(MaterialColor.LIME, (Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName("limegreenlog"));
        event.getRegistry().register(new LogBlock(MaterialColor.ORANGE_TERRACOTTA, (Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName("orangelog"));
        event.getRegistry().register(new LogBlock(MaterialColor.PINK, (Block.Properties.create(Material.WOOD, MaterialColor.PINK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName("pinklog"));
        event.getRegistry().register(new LogBlock(MaterialColor.MAGENTA, (Block.Properties.create(Material.WOOD, MaterialColor.MAGENTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName("magentalog"));
        event.getRegistry().register(new LogBlock(MaterialColor.CYAN, (Block.Properties.create(Material.WOOD, MaterialColor.CYAN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName("cyanlog"));
        event.getRegistry().register(new LogBlock(MaterialColor.PURPLE, (Block.Properties.create(Material.WOOD, MaterialColor.PURPLE).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName("purplelog"));
        event.getRegistry().register(new LogBlock(MaterialColor.WHITE_TERRACOTTA, (Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName("whitelog"));
        event.getRegistry().register(new LogBlock(MaterialColor.BROWN, (Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD))).setRegistryName("brownlog"));

        //Leaves
        event.getRegistry().register(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.BLACK).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT)).setRegistryName("blackleaves"));
        event.getRegistry().register(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.RED).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT)).setRegistryName("redleaves"));
        event.getRegistry().register(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.YELLOW).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT)).setRegistryName("yellowleaves"));
        event.getRegistry().register(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.BLUE).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT)).setRegistryName("blueleaves"));
        event.getRegistry().register(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.LIGHT_BLUE).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT)).setRegistryName("lightblueleaves"));
        event.getRegistry().register(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.GRAY).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT)).setRegistryName("greyleaves"));
        event.getRegistry().register(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.LIGHT_GRAY).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT)).setRegistryName("lightgreyleaves"));
        event.getRegistry().register(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.GREEN).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT)).setRegistryName("greenleaves"));
        event.getRegistry().register(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.LIME).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT)).setRegistryName("limegreenleaves"));
        event.getRegistry().register(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT)).setRegistryName("orangeleaves"));
        event.getRegistry().register(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.PINK).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT)).setRegistryName("pinkleaves"));
        event.getRegistry().register(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.MAGENTA).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT)).setRegistryName("pinkleaves"));
        event.getRegistry().register(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.CYAN).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT)).setRegistryName("pinkleaves"));
        event.getRegistry().register(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.PURPLE).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT)).setRegistryName("pinkleaves"));
        event.getRegistry().register(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT)).setRegistryName("pinkleaves"));
        event.getRegistry().register(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.BROWN).hardnessAndResistance(0).tickRandomly().sound(SoundType.PLANT)).setRegistryName("pinkleaves"));

    }

}

