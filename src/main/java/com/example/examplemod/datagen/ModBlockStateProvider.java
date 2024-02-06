package com.example.examplemod.datagen;

import com.example.examplemod.ICustomMod;
import com.example.examplemod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ICustomMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.FIRESTONE);
        stairsBlock((StairBlock) ModBlocks.SMOOTH_STONE_STAIRS.get(), blockTexture(Blocks.SMOOTH_STONE));
        wallBlock((WallBlock) ModBlocks.SMOOTH_STONE_WALL.get(), blockTexture(Blocks.SMOOTH_STONE));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
