package com.drizzs.grassworld.registries;

import com.drizzs.grassworld.blocks.GrassBase;
import com.drizzs.grassworld.items.GrassWorldSeed;
import com.drizzs.grassworld.util.group.GrassGroup;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.EnumMap;

import static com.drizzs.grassworld.GrassWorld.MOD_ID;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GrassRegistry {
    private static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MOD_ID);
    private static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MOD_ID);

    public static final EnumMap<DyeColor, RegistryObject<Block>> overworldGrass = Maps.newEnumMap(DyeColor.class);
    public static final EnumMap<DyeColor, RegistryObject<Block>> fancyoverworldGrass = Maps.newEnumMap(DyeColor.class);
    public static final EnumMap<DyeColor, RegistryObject<Block>> glowingoverworldGrass = Maps.newEnumMap(DyeColor.class);
    public static final EnumMap<DyeColor, RegistryObject<Block>> enchantedoverworldGrass = Maps.newEnumMap(DyeColor.class);
    public static final EnumMap<DyeColor, RegistryObject<Block>> netherGrass = Maps.newEnumMap(DyeColor.class);
    public static final EnumMap<DyeColor, RegistryObject<Block>> endGrass = Maps.newEnumMap(DyeColor.class);
    public static final EnumMap<DyeColor, RegistryObject<Block>> fancyEndGrass = Maps.newEnumMap(DyeColor.class);
    public static final EnumMap<DyeColor, RegistryObject<Block>> fancyNetherGrass = Maps.newEnumMap(DyeColor.class);
    public static final EnumMap<DyeColor, RegistryObject<Item>> grassItemBlocks = Maps.newEnumMap(DyeColor.class);
    public static final EnumMap<DyeColor, RegistryObject<Item>> overworldSeeds = Maps.newEnumMap(DyeColor.class);

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        for (DyeColor dyeColor : DyeColor.values()) {
            overworldGrass.put(dyeColor, BLOCKS.register(dyeColor.toString() + "grass", () -> new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))));
            fancyoverworldGrass.put(dyeColor, BLOCKS.register("fancy" + dyeColor.toString() + "grass", () -> new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))));
            glowingoverworldGrass.put(dyeColor, BLOCKS.register("glowing" + dyeColor.toString() + "grass", () -> new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))));
            enchantedoverworldGrass.put(dyeColor, BLOCKS.register("enchanted" + dyeColor.toString() + "grass", () -> new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))));
            netherGrass.put(dyeColor, BLOCKS.register(dyeColor.toString() + "nethergrass", () -> new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))));
            endGrass.put(dyeColor, BLOCKS.register(dyeColor.toString() + "endgrass", () -> new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))));
            fancyEndGrass.put(dyeColor, BLOCKS.register("fancy" + dyeColor.toString() + "endgrass", () -> new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))));
            fancyNetherGrass.put(dyeColor, BLOCKS.register("fancy" + dyeColor.toString() + "nethergrass", () -> new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT))));
        }

        for (DyeColor dyeColor : DyeColor.values()) {
            overworldGrass.get(dyeColor);
            fancyoverworldGrass.get(dyeColor);
            glowingoverworldGrass.get(dyeColor);
            enchantedoverworldGrass.get(dyeColor);
            netherGrass.get(dyeColor);
            endGrass.get(dyeColor);
            fancyEndGrass.get(dyeColor);
            fancyNetherGrass.get(dyeColor);
        }

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        for (DyeColor dyeColor : DyeColor.values()) {
             //BlockItems
            grassItemBlocks.put(dyeColor, ITEMS.register(dyeColor.toString() + "grass", () -> new BlockItem(overworldGrass.get(dyeColor).orElse(Blocks.AIR), new Item.Properties().group(GrassGroup.instance))));
            grassItemBlocks.put(dyeColor, ITEMS.register("fancy" + dyeColor.toString() + "grass", () -> new BlockItem(fancyoverworldGrass.get(dyeColor).orElse(Blocks.AIR), new Item.Properties().group(GrassGroup.instance))));
            grassItemBlocks.put(dyeColor, ITEMS.register("glowing" + dyeColor.toString() + "grass", () -> new BlockItem(glowingoverworldGrass.get(dyeColor).orElse(Blocks.AIR), new Item.Properties().group(GrassGroup.instance))));
            grassItemBlocks.put(dyeColor, ITEMS.register("enchanted" + dyeColor.toString() + "grass", () -> new BlockItem(enchantedoverworldGrass.get(dyeColor).orElse(Blocks.AIR), new Item.Properties().group(GrassGroup.instance))));
            grassItemBlocks.put(dyeColor, ITEMS.register(dyeColor.toString() + "nethergrass", () -> new BlockItem(netherGrass.get(dyeColor).orElse(Blocks.AIR), new Item.Properties().group(GrassGroup.instance))));
            grassItemBlocks.put(dyeColor, ITEMS.register(dyeColor.toString() + "endgrass", () -> new BlockItem(endGrass.get(dyeColor).orElse(Blocks.AIR), new Item.Properties().group(GrassGroup.instance))));
            grassItemBlocks.put(dyeColor, ITEMS.register("fancy" + dyeColor.toString() + "endgrass", () -> new BlockItem(fancyEndGrass.get(dyeColor).orElse(Blocks.AIR), new Item.Properties().group(GrassGroup.instance))));
            grassItemBlocks.put(dyeColor, ITEMS.register("fancy" + dyeColor.toString() + "nethergrass", () -> new BlockItem(fancyNetherGrass.get(dyeColor).orElse(Blocks.AIR), new Item.Properties().group(GrassGroup.instance))));
        }

        for (DyeColor dyeColor : DyeColor.values()) {
            overworldSeeds.put(dyeColor, ITEMS.register(dyeColor.toString() + "seed", () -> new GrassWorldSeed(() -> overworldGrass.get(dyeColor).orElse(Blocks.AIR))));
            overworldSeeds.put(dyeColor, ITEMS.register("fancy" + dyeColor.toString() + "seed", () -> new GrassWorldSeed(() -> fancyoverworldGrass.get(dyeColor).orElse(Blocks.AIR))));
            overworldSeeds.put(dyeColor, ITEMS.register("glowing" + dyeColor.toString() + "seed", () -> new GrassWorldSeed(() -> glowingoverworldGrass.get(dyeColor).orElse(Blocks.AIR))));
            overworldSeeds.put(dyeColor, ITEMS.register("enchanted" + dyeColor.toString() + "seed", () -> new GrassWorldSeed(() -> enchantedoverworldGrass.get(dyeColor).orElse(Blocks.AIR))));
            overworldSeeds.put(dyeColor, ITEMS.register(dyeColor.toString() + "netherseed", () -> new GrassWorldSeed(() -> netherGrass.get(dyeColor).orElse(Blocks.AIR))));
            overworldSeeds.put(dyeColor, ITEMS.register(dyeColor.toString() + "endseed", () -> new GrassWorldSeed(() -> endGrass.get(dyeColor).orElse(Blocks.AIR))));
            overworldSeeds.put(dyeColor, ITEMS.register("fancy" + dyeColor.toString() + "endseed", () -> new GrassWorldSeed(() -> fancyEndGrass.get(dyeColor).orElse(Blocks.AIR))));
            overworldSeeds.put(dyeColor, ITEMS.register("fancy" + dyeColor.toString() + "netherseed", () -> new GrassWorldSeed(() -> fancyNetherGrass.get(dyeColor).orElse(Blocks.AIR))));

        }

        for (DyeColor dyeColor : DyeColor.values()) {
            grassItemBlocks.get(dyeColor);
            overworldSeeds.get(dyeColor);
        }
    }

        public static final RegistryObject<Item> GWICON = ITEMS.register("gwicon",
                () -> new Item(new Item.Properties()));

        public static void register (IEventBus bus){
            ITEMS.register(bus);
            BLOCKS.register(bus);
        }
    }
