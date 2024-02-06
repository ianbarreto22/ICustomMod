package com.example.examplemod.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import javax.swing.text.Style;
import java.util.List;

public class Fertilizer extends Item {
    public Fertilizer(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide()){
            BlockPos blockClickedPos = pContext.getClickedPos();
            BlockState blockClickedState = pContext.getLevel().getBlockState(blockClickedPos);
            if(blockClickedState.is(Blocks.DIRT)){
                pContext.getLevel().setBlock(blockClickedPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);
                pContext.getLevel().playSound(null, blockClickedPos, SoundEvents.BONE_MEAL_USE, SoundSource.BLOCKS, 1f,1f);
                pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                        player -> player.broadcastBreakEvent(player.getUsedItemHand()));
            }
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.icustommod.fertilizer").withStyle(ChatFormatting.AQUA));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
