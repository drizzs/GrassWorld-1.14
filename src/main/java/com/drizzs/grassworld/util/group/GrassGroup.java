package com.drizzs.grassworld.util.group;

import com.drizzs.grassworld.util.lib.GrassContentLib;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GrassGroup extends ItemGroup {

    public static final GrassGroup instance = new GrassGroup(ItemGroup.GROUPS.length, "grassworld");

    private GrassGroup(int index, String label)
    {
        super(index, label);
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(GrassContentLib.gw_icon);
    }


}
