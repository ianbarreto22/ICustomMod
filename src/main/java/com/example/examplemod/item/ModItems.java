package com.example.examplemod.item;

import com.example.examplemod.ICustomMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ICustomMod.MODID);

    public static final RegistryObject<Item> FIRE_SHARD = ITEMS.register("fire_shard", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FIRE_BLADE = ITEMS.register("fire_blade", () -> new SwordItem(ModToolTiers.FIRE_SHARD,4, 2, new Item.Properties()));
    public static final RegistryObject<Item> FIRE_PICKAXE = ITEMS.register("fire_pickaxe", () -> new PickaxeItem(ModToolTiers.FIRE_SHARD,1, 1, new Item.Properties()));
    public static final RegistryObject<Item> FIRE_AXE = ITEMS.register("fire_axe", () -> new AxeItem(ModToolTiers.FIRE_SHARD,7, 1, new Item.Properties()));
    public static final RegistryObject<Item> FIRE_SHOVEL = ITEMS.register("fire_shovel", () -> new ShovelItem(ModToolTiers.FIRE_SHARD,0, 0, new Item.Properties()));
    public static final RegistryObject<Item> FIRE_HOE = ITEMS.register("fire_hoe", () -> new HoeItem(ModToolTiers.FIRE_SHARD,0, 0, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
