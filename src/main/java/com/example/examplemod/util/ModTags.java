package com.example.examplemod.util;

import com.example.examplemod.ICustomMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_FIRE_SHARD_TOOL = tag("needs_fire_shard_tools");

        private  static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(ICustomMod.MODID, name));
        }
    }

    public static class  Items {
        private  static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(ICustomMod.MODID, name));
        }
    }
}
