package com.drizzs.grassworld.items;

import com.drizzs.grassworld.util.group.GrassGroup;
import com.drizzs.grassworld.util.tags.GrassTags;
import net.minecraft.block.Block;
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
        if (this.isIn(GrassTags.Items.DIRTSEED)) {
            if (world.getBlockState(blockpos).getBlock().isIn(GrassTags.Blocks.OVERWORLDSEEDDIRT)) {
                world.setBlockState(blockpos, this.grassSupplier.get().getDefaultState());
                item.shrink(1);
            }
        }
        else if (this.isIn(GrassTags.Items.ENDSEED)) {
            if (world.getBlockState(blockpos).getBlock().isIn(GrassTags.Blocks.ENDSEEDDIRT)) {
                world.setBlockState(blockpos, this.grassSupplier.get().getDefaultState());
                item.shrink(1);
            }
        }
        else if (this.isIn(GrassTags.Items.NETHERSEED)) {
            if (world.getBlockState(blockpos).getBlock().isIn(GrassTags.Blocks.NETHERSEEDDIRT)) {
                world.setBlockState(blockpos, this.grassSupplier.get().getDefaultState());
                item.shrink(1);
            }
        }
        return ActionResultType.SUCCESS;
    }

}
