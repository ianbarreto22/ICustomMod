package com.example.examplemod.datagen;

import com.example.examplemod.block.ModBlocks;
import com.example.examplemod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FIRE_SHARD.get())
                .pattern(" B ")
                .pattern("BNB")
                .pattern(" B ")
                .define('B', Ingredient.of(new ItemStack(Items.BLAZE_ROD)))
                .define('N', Ingredient.of(new ItemStack(Items.NETHERITE_INGOT)))
                .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STONE_ROD.get(), 4)
                .pattern("C")
                .pattern("C")
                .define('C', Ingredient.of(new ItemStack(Items.STONE)))
                .unlockedBy(getHasName(Items.STONE), has(Items.STONE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.FIRE_BLADE.get())
                .pattern("F")
                .pattern("F")
                .pattern("S")
                .define('F', ModItems.FIRE_SHARD.get())
                .define('S', ModItems.STONE_ROD.get())
                .unlockedBy(getHasName(ModItems.FIRE_SHARD.get()), has(ModItems.FIRE_SHARD.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FIRE_PICKAXE.get())
                .pattern("FFF")
                .pattern(" S ")
                .pattern(" S ")
                .define('F', ModItems.FIRE_SHARD.get())
                .define('S', ModItems.STONE_ROD.get())
                .unlockedBy(getHasName(ModItems.FIRE_SHARD.get()), has(ModItems.FIRE_SHARD.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FIRE_AXE.get())
                .pattern("FF")
                .pattern("SF")
                .pattern("S ")
                .define('F', ModItems.FIRE_SHARD.get())
                .define('S', ModItems.STONE_ROD.get())
                .unlockedBy(getHasName(ModItems.FIRE_SHARD.get()), has(ModItems.FIRE_SHARD.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FIRE_HOE.get())
                .pattern("FF")
                .pattern("S ")
                .pattern("S ")
                .define('F', ModItems.FIRE_SHARD.get())
                .define('S', ModItems.STONE_ROD.get())
                .unlockedBy(getHasName(ModItems.FIRE_SHARD.get()), has(ModItems.FIRE_SHARD.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FIRE_SHOVEL.get())
                .pattern("F")
                .pattern("S")
                .pattern("S")
                .define('F', ModItems.FIRE_SHARD.get())
                .define('S', ModItems.STONE_ROD.get())
                .unlockedBy(getHasName(ModItems.FIRE_SHARD.get()), has(ModItems.FIRE_SHARD.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIRESTONE.get())
                .pattern("FF")
                .pattern("FF")
                .define('F', ModItems.FIRE_SHARD.get())
                .unlockedBy(getHasName(ModItems.FIRE_SHARD.get()), has(ModItems.FIRE_SHARD.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.GOLDEN_POTATO.get())
                .pattern("GGG")
                .pattern("GPG")
                .pattern("GGG")
                .define('G', Items.GOLD_NUGGET)
                .define('P', Items.POTATO)
                .unlockedBy(getHasName(Items.POTATO), has(Items.POTATO))
                .unlockedBy(getHasName(Items.GOLD_NUGGET), has(Items.GOLD_NUGGET))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS.get(), 4)
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .define('S', Items.SMOOTH_STONE)
                .unlockedBy(getHasName(Items.SMOOTH_STONE), has(Items.SMOOTH_STONE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL.get(), 6)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.SMOOTH_STONE)
                .unlockedBy(getHasName(Items.SMOOTH_STONE), has(Items.SMOOTH_STONE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FERTILIZER.get())
                .pattern("BB")
                .pattern("BB")
                .define('B', Items.BONE_MEAL)
                .unlockedBy(getHasName(Items.BONE_MEAL), has(Items.BONE_MEAL))
                .save(recipeOutput);

        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS.get(), Blocks.SMOOTH_STONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_WALL.get(), Blocks.SMOOTH_STONE);
    }

}
