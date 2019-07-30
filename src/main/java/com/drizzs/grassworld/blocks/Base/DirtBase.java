package com.drizzs.grassworld.blocks.Base;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

public class DirtBase extends Block{

    public static final BooleanProperty SNOWY;

    protected DirtBase(Block.Properties properties) {
        super(properties);
        this.setDefaultState((BlockState)((BlockState)this.stateContainer.getBaseState()).with(SNOWY, false));
    }

    public BlockState updatePostPlacement(BlockState state, Direction direction, BlockState p_196271_3_, IWorld p_196271_4_, BlockPos p_196271_5_, BlockPos p_196271_6_) {
        if (direction != Direction.UP) {
            return super.updatePostPlacement(state, direction, p_196271_3_, p_196271_4_, p_196271_5_, p_196271_6_);
        } else {
            Block lvt_7_1_ = p_196271_3_.getBlock();
            return (BlockState)state.with(SNOWY, lvt_7_1_ == Blocks.SNOW_BLOCK || lvt_7_1_ == Blocks.SNOW);
        }
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Block lvt_2_1_ = context.getWorld().getBlockState(context.getPos().up()).getBlock();
        return (BlockState)this.getDefaultState().with(SNOWY, lvt_2_1_ == Blocks.SNOW_BLOCK || lvt_2_1_ == Blocks.SNOW);
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(new IProperty[]{SNOWY});
    }

    static {
        SNOWY = BlockStateProperties.SNOWY;
    }
}


