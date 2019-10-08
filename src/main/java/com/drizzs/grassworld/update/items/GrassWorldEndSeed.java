package com.drizzs.grassworld.update.items;

import com.drizzs.grassworld.update.util.lib.GrassContentLib;
import com.drizzs.grassworld.update.util.group.GrassGroup;
import com.drizzs.grassworld.update.util.tags.GrassTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class GrassWorldEndSeed extends Item {

    public BlockState grassBlock;

    public GrassWorldEndSeed(Properties group, BlockState grassBlock)
    {
        super(new Properties().group(GrassGroup.instance).maxStackSize(16));
        this.grassBlock = grassBlock;

    }

    @Nonnull
    public ActionResultType onItemUse(ItemUseContext context) {
        World world = context.getWorld();
        BlockPos blockpos = context.getPos();
        ItemStack item = context.getItem();

        if (world.getBlockState(blockpos).getBlock().isIn(GrassTags.Blocks.ENDSEEDDIRT))
        {

            world.setBlockState(blockpos, this.grassBlock);
            item.shrink(1);
        }
        return ActionResultType.SUCCESS;

    }

}
