package com.ooni.worldwands.util;

import com.ooni.worldwands.WorldWands;
import com.ooni.worldwands.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WorldWands.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> WAND = ITEMS.register("wand", ItemBase::new);
    public static final RegistryObject<Item> NAV_WAND = ITEMS.register("nav_wand", ItemBase::new);
    public static final RegistryObject<Item> BLOCK_DATA_CYCLER = ITEMS.register("block_data_cycler", ItemBase::new);
    public static final RegistryObject<Item> FAR_WAND = ITEMS.register("far_wand", ItemBase::new);
    public static final RegistryObject<Item> FLOOD_FILL = ITEMS.register("flood_fill", ItemBase::new);
    public static final RegistryObject<Item> INFO_WAND = ITEMS.register("info_wand", ItemBase::new);
    public static final RegistryObject<Item> LONG_RANGE_BUILDER = ITEMS.register("long_range_builder", ItemBase::new);
    public static final RegistryObject<Item> REPLACER = ITEMS.register("replacer", ItemBase::new);
    public static final RegistryObject<Item> STACKER = ITEMS.register("stacker", ItemBase::new);
    public static final RegistryObject<Item> TREE_WAND = ITEMS.register("tree_wand", ItemBase::new);


}
