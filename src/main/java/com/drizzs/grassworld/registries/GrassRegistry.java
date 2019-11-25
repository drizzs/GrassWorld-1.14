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

    public static void registerItems(final RegistryEvent.Register<Item> event) {

        EnumMap<DyeColor, RegistryObject<Block>> overworldGrass = Maps.newEnumMap(DyeColor.class);
        EnumMap<DyeColor, RegistryObject<Block>> fancyoverworldGrass = Maps.newEnumMap(DyeColor.class);
        EnumMap<DyeColor, RegistryObject<Block>> glowingoverworldGrass = Maps.newEnumMap(DyeColor.class);
        EnumMap<DyeColor, RegistryObject<Block>> enchantedoverworldGrass = Maps.newEnumMap(DyeColor.class);
        EnumMap<DyeColor, RegistryObject<Block>> netherGrass = Maps.newEnumMap(DyeColor.class);
        EnumMap<DyeColor, RegistryObject<Block>> endGrass = Maps.newEnumMap(DyeColor.class);
        EnumMap<DyeColor, RegistryObject<Block>> fancyEndGrass = Maps.newEnumMap(DyeColor.class);
        EnumMap<DyeColor, RegistryObject<Block>> fancyNetherGrass = Maps.newEnumMap(DyeColor.class);

        EnumMap<DyeColor, RegistryObject<Item>> grassItemBlocks = Maps.newEnumMap(DyeColor.class);

        EnumMap<DyeColor, RegistryObject<Item>> overworldSeeds = Maps.newEnumMap(DyeColor.class);
        EnumMap<DyeColor, RegistryObject<Item>> netherSeeds = Maps.newEnumMap(DyeColor.class);
        EnumMap<DyeColor, RegistryObject<Item>> endSeeds = Maps.newEnumMap(DyeColor.class);
        EnumMap<DyeColor, RegistryObject<Item>> fancyEndSeeds = Maps.newEnumMap(DyeColor.class);
        EnumMap<DyeColor, RegistryObject<Item>> fancyNetherSeeds = Maps.newEnumMap(DyeColor.class);

        for (DyeColor dyeColor: DyeColor.values()) {
            overworldGrass.put(dyeColor, BLOCKS.register(dyeColor.toString() + "grass", () -> new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT) ,dyeColor)));
            fancyoverworldGrass.put(dyeColor, BLOCKS.register("fancy" + dyeColor.toString() + "grass", () -> new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT) ,dyeColor)));
            glowingoverworldGrass.put(dyeColor, BLOCKS.register("glowing" + dyeColor.toString() + "grass", () -> new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT) ,dyeColor)));
            enchantedoverworldGrass.put(dyeColor, BLOCKS.register("enchanted" + dyeColor.toString() + "grass", () -> new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT) ,dyeColor)));
            netherGrass.put(dyeColor, BLOCKS.register(dyeColor.toString() + "nethergrass", () -> new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT) ,dyeColor)));
            endGrass.put(dyeColor, BLOCKS.register(dyeColor.toString() + "endgrass", () -> new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT) ,dyeColor)));
            fancyEndGrass.put(dyeColor, BLOCKS.register("fancy" + dyeColor.toString() + "endgrass", () -> new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT) ,dyeColor)));
            fancyNetherGrass.put(dyeColor, BLOCKS.register("fancy" + dyeColor.toString() + "nethergrass", () -> new GrassBase(Block.Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT) ,dyeColor)));
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

        for (DyeColor dyeColor: DyeColor.values()) {
            overworldSeeds.put(dyeColor, ITEMS.register(dyeColor.toString() + "seed", () -> new GrassWorldSeed(() -> overworldGrass.get(dyeColor).orElse(Blocks.AIR))));
            overworldSeeds.put(dyeColor, ITEMS.register("fancy" + dyeColor.toString() + "seed", () -> new GrassWorldSeed(() -> fancyoverworldGrass.get(dyeColor).orElse(Blocks.AIR))));
            overworldSeeds.put(dyeColor, ITEMS.register("glowing" + dyeColor.toString() + "seed", () -> new GrassWorldSeed(() -> glowingoverworldGrass.get(dyeColor).orElse(Blocks.AIR))));
            overworldSeeds.put(dyeColor, ITEMS.register("enchanted" + dyeColor.toString() + "seed", () -> new GrassWorldSeed(() -> enchantedoverworldGrass.get(dyeColor).orElse(Blocks.AIR))));
            netherSeeds.put(dyeColor, ITEMS.register(dyeColor.toString() + "netherseed", () -> new GrassWorldSeed(() -> netherGrass.get(dyeColor).orElse(Blocks.AIR))));
            endSeeds.put(dyeColor, ITEMS.register(dyeColor.toString() + "endseed", () -> new GrassWorldSeed(() -> endGrass.get(dyeColor).orElse(Blocks.AIR))));
            fancyEndSeeds.put(dyeColor, ITEMS.register("fancy" + dyeColor.toString() + "endseed", () -> new GrassWorldSeed(() -> fancyEndGrass.get(dyeColor).orElse(Blocks.AIR))));
            fancyNetherSeeds.put(dyeColor, ITEMS.register("fancy" + dyeColor.toString() + "netherseed", () -> new GrassWorldSeed(() -> fancyNetherGrass.get(dyeColor).orElse(Blocks.AIR))));
        }
    }

    public static final RegistryObject<Item> GWICON = ITEMS.register("gwicon",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}

