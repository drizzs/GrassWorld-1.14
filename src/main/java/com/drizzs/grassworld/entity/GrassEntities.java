package com.drizzs.grassworld.entity;

import com.drizzs.grassworld.GrassWorld;
import com.drizzs.grassworld.entity.endtity.GreenEndermanEntity;
import com.drizzs.grassworld.items.GrassWorldItems;
import com.drizzs.grassworld.util.ItemGroupGW;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;

public class GrassEntities
{

    public static EntityType<?> green_enderman = EntityType.Builder.create(GreenEndermanEntity::new, EntityClassification.CREATURE).build(GrassWorld.MOD_ID + ":green_enderman").setRegistryName(location("green_enderman"));


    public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll
                (
                        GrassWorldItems.green_egg = registerEntitySpawnEgg(green_enderman, 0x2f5882, 0x6f1499, "green_enderman_egg")
                );

    }


    public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name)
    {
        SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(ItemGroupGW.instance));
        item.setRegistryName(location(name));
        return item;
    }

    public static void registerEntityWorldSpawn(EntityType<?> entity, Biome... biomes)
    {
        for(Biome biome : biomes)
        {
            if(biome != null)
            {
                biome.getSpawns(entity.getClassification()).add(new Biome.SpawnListEntry(entity, 10, 1, 10));
            }
        }
    }

    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(GrassWorld.MOD_ID, name);
    }



}
