package com.ooni.worldwands.items;

import com.ooni.worldwands.WorldWands;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(WorldWands.TAB));
    }
}
