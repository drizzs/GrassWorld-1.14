package com.drizzs.grassworld.util;

import com.drizzs.grassworld.items.GrassWorldItems;
import com.drizzs.grassworld.items.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupGW extends ItemGroup {

    public static final ItemGroupGW instance = new ItemGroupGW(ItemGroup.GROUPS.length, "grassworld");

    private ItemGroupGW(int index, String label)
    {
        super(index, label);
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(GrassWorldItems.gw_icon);
    }


}
