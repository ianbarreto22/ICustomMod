package com.example.examplemod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class Firestone extends Block {

    public Firestone(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if(!pEntity.isOnFire()){
            pEntity.setSecondsOnFire(5);
        }
    }
}
