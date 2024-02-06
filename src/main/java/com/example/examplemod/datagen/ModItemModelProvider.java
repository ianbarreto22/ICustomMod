package com.example.examplemod.datagen;

import com.example.examplemod.ICustomMod;
import com.example.examplemod.block.ModBlocks;
import com.example.examplemod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, ICustomMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.FIRE_SHARD);
        simpleItem(ModItems.STONE_ROD);
        simpleItem(ModItems.GOLDEN_POTATO);
        simpleItem(ModItems.FERTILIZER);
        handheld(ModItems.FIRE_SHOVEL);
        handheld(ModItems.FIRE_PICKAXE);
        handheld(ModItems.FIRE_AXE);
        handheld(ModItems.FIRE_HOE);
        handheld(ModItems.FIRE_BLADE);
        stairBlockItem(ModBlocks.SMOOTH_STONE_STAIRS);
        wallItemVanillaBased(ModBlocks.SMOOTH_STONE_WALL, "smooth_stone");
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ICustomMod.MODID, "item/" + item.getId().getPath()));
    }

    private void stairBlockItem(RegistryObject<Block> block){
        withExistingParent(ICustomMod.MODID + ':' + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    private void wallItemVanillaBased(RegistryObject<Block> block, String blockName){
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation("minecraft", "block/" + blockName));
    }

    private ItemModelBuilder handheld(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ICustomMod.MODID, "item/" + item.getId().getPath()));
    }
}
