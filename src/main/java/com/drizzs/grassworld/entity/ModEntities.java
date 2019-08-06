package com.drizzs.grassworld.entity;

import com.drizzs.grassworld.entity.endtities.enderman.GreenEnderman;
import com.drizzs.grassworld.items.GrassWorldItems;
import com.drizzs.grassworld.util.GrassRegistries;
import com.drizzs.grassworld.util.ItemGroupGW;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;

public class ModEntities
{
    public static EntityType<?> GREENENDERMAN = EntityType.Builder.create(GreenEnderman:: new, EntityClassification.MONSTER).build("grassworld:greenenderman").setRegistryName("greenenderman");



    public static void registerEntityEggs(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll
                (
            GrassWorldItems.grassworldentityegg = registerEntitySpawnEgg(GREENENDERMAN, 0x16DA00 , 0xDBD232, "greenenderman_egg")

            );

    }

    public static Item registerEntitySpawnEgg(EntityType<?> type, int colour1, int colour2, String name)
    {
            SpawnEggItem item = new SpawnEggItem(type, colour1, colour2, new Item.Properties().group(ItemGroupGW.instance));
            item.setRegistryName(GrassRegistries.location(name));
            return item;
    }

    public static void registerEntityWorldSpawns()
    {
        registerEntityWorldSpawn(GREENENDERMAN, Biomes.SMALL_END_ISLANDS);
    }

    public static void registerEntityWorldSpawn(EntityType<?> entity, Biome... biomes)
    {

        for(Biome biome : biomes)
        {
            if(biome != null)
            {
                biome.getSpawns(entity.getClassification()).add(new Biome.SpawnListEntry(entity, 100, 1, 10));
            }

        }



    }



}
