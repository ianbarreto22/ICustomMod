package com.example.examplemod.block;

import com.example.examplemod.ICustomMod;
import com.example.examplemod.block.custom.Firestone;
import com.example.examplemod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ICustomMod.MODID);

    public static final RegistryObject<Block> FIRESTONE = registerBlock("firestone",
            ()-> new Firestone(BlockBehaviour.Properties
                    .copy(Blocks.NETHERITE_BLOCK)
                    .sound(SoundType.STONE)
                    .lightLevel(lightEmission -> 15)
            ));

    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            ()-> new StairBlock(
                    () -> Blocks.SMOOTH_STONE.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)
            ));

    public static  final  RegistryObject<Block> SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            ()-> new WallBlock(
                    BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)
            ));

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> blockRegistered = BLOCKS.register(name, block);
        registerBlockItem(name, blockRegistered);
        return blockRegistered;
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
