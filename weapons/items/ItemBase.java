package com.lllumino.weapons.items;

import com.lllumino.weapons.Weapons;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(Weapons.TAB));
    }
}
