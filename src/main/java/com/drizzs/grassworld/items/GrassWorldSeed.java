package com.drizzs.grassworld.items;

import com.drizzs.grassworld.blocks.GrassBase;
import com.drizzs.grassworld.util.GrassHolders;
import com.drizzs.grassworld.util.group.GrassGroup;
import com.drizzs.grassworld.util.lib.GrassContentLib;
import com.drizzs.grassworld.util.tags.GrassTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public class GrassWorldSeed extends Item {

    private final Supplier<Block> grassSupplier;

    public GrassWorldSeed(Supplier<Block> grassSupplier) {
        super(new Properties().group(GrassGroup.instance).maxStackSize(16));
        this.grassSupplier = grassSupplier;
    }

    @Nonnull
    public ActionResultType onItemUse(ItemUseContext context) {
        World world = context.getWorld();
        BlockPos blockpos = context.getPos();
        ItemStack item = context.getItem();
        world.setBlockState(blockpos, this.grassSupplier.get().getDefaultState());
        item.shrink(1);
        return ActionResultType.SUCCESS;
    }

}
