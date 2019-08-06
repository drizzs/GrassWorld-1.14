package com.drizzs.grassworld.items.endseed.normal;

import com.drizzs.grassworld.blocks.GrassWorldBlocks;
import com.drizzs.grassworld.items.GrassWorldItems;
import com.drizzs.grassworld.util.ItemGroupGW;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class OrangeEndSeed extends Item {

    public OrangeEndSeed(Properties group)
    {
        super(new Properties().group(ItemGroupGW.instance).maxStackSize(16));

    }

    @Nonnull
    public ActionResultType onItemUse(ItemUseContext context) {
        World world = context.getWorld();
        BlockPos blockpos = context.getPos();
        ItemStack item = context.getItem();
        Hand hand = context.getHand();

        if (!(item.getItem() == GrassWorldItems.orangeendseed)){

            return ActionResultType.PASS;
        }

        if (world.getBlockState(blockpos).getBlock() == Blocks.END_STONE)
        {

            world.setBlockState(blockpos, GrassWorldBlocks.orangeendgrass.getDefaultState());
            item.shrink(1);
        }
        return ActionResultType.SUCCESS;

    }

}
