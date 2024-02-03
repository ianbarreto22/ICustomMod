package com.example.examplemod.item;

import com.example.examplemod.ICustomMod;
import com.example.examplemod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier FIRE_SHARD = TierSortingRegistry.registerTier(
      new ForgeTier(5,1500,5f, 4f, 25,
              ModTags.Blocks.NEEDS_FIRE_SHARD_TOOL, ()-> Ingredient.of(ModItems.FIRE_SHARD.get())),
            new ResourceLocation(ICustomMod.MODID, "fire_shard"), List.of(Tiers.NETHERITE), List.of()
    );
}
