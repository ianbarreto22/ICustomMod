package com.example.examplemod.item;

import com.example.examplemod.ICustomMod;
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
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
