package com.example.examplemod.datagen;

import com.example.examplemod.ICustomMod;
import com.example.examplemod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, ICustomMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.FIRE_SHARD);
        handheld(ModItems.FIRE_SHOVEL);
        handheld(ModItems.FIRE_PICKAXE);
        handheld(ModItems.FIRE_AXE);
        handheld(ModItems.FIRE_HOE);
        handheld(ModItems.FIRE_BLADE);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ICustomMod.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheld(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ICustomMod.MODID, "item/" + item.getId().getPath()));
    }
}
