package com.louis.mod.Items.Tools.Ruby;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem {

    public HoeBase(ToolMaterial material) {
        super(material, (int) -5.5, 0.0f, new Item.Settings().group(ItemGroup.TOOLS));
    }
    
}