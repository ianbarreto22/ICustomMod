package com.example.examplemod.datagen;

import com.example.examplemod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
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
    }
}
