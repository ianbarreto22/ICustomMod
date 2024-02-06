package com.example.examplemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties GOLDEN_POTATO = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 2000), 0.3f)
            .build();
}
