package com.hci.humbercraft.items;

import com.hci.humbercraft.HumberCraft;
import com.hci.humbercraft.HumberCraft.HumbercraftItemGroup;

import net.minecraft.item.*;

public class ItemBase extends Item{

	public ItemBase() {
		super(new Item.Properties().group(HumbercraftItemGroup.instance));
	}
	
}
