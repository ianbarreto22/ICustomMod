package com.example.examplemod.item;

import com.example.examplemod.ICustomMod;
import com.example.examplemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ICustomMod.MODID);

    public static final RegistryObject<CreativeModeTab> ICUSTOM_ITEMS = CREATIVE_MOD_TABS.register("icustom_items",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.FIRE_SHARD.get()))
                    .title(Component.translatable("creativetab.icustom_items"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.FIRE_SHARD.get());
                        pOutput.accept(ModItems.STONE_ROD.get());
                        pOutput.accept(ModItems.FERTILIZER.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ICUSTOM_TOOLS = CREATIVE_MOD_TABS.register("icustom_tools",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.FIRE_PICKAXE.get()))
                    .title(Component.translatable("creativetab.icustom_tools"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.FIRE_PICKAXE.get());
                        pOutput.accept(ModItems.FIRE_SHOVEL.get());
                        pOutput.accept(ModItems.FIRE_AXE.get());
                        pOutput.accept(ModItems.FIRE_HOE.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ICUSTOM_COMBAT = CREATIVE_MOD_TABS.register("icustom_combat",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.FIRE_BLADE.get()))
                    .title(Component.translatable("creativetab.icustom_combat"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.FIRE_BLADE.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ICUSTOM_BLOCKS = CREATIVE_MOD_TABS.register("icustom_blocks",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.FIRESTONE.get()))
                    .title(Component.translatable("creativetab.icustom_blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.FIRESTONE.get());
                        pOutput.accept(ModBlocks.SMOOTH_STONE_STAIRS.get());
                        pOutput.accept(ModBlocks.SMOOTH_STONE_WALL.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ICUSTOM_FOODS = CREATIVE_MOD_TABS.register("icustom_foods",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.GOLDEN_POTATO.get()))
                    .title(Component.translatable("creativetab.icustom_foods"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.GOLDEN_POTATO.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
