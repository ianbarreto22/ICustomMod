package com.example.examplemod.datagen;

import com.example.examplemod.ICustomMod;
import com.example.examplemod.block.ModBlocks;
import com.example.examplemod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ICustomMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Blocks.NEEDS_FIRE_SHARD_TOOL)
                .add(ModBlocks.FIRESTONE.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.FIRESTONE.get())
                .add(ModBlocks.SMOOTH_STONE_STAIRS.get())
                .add(ModBlocks.SMOOTH_STONE_WALL.get());

        this.tag(BlockTags.STAIRS)
                .add(ModBlocks.SMOOTH_STONE_STAIRS.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.SMOOTH_STONE_WALL.get());
    }
}
