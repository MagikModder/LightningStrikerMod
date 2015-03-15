package com.lms;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.lms.item.LmsItems;

public class LmsCreativeTab extends CreativeTabs

		//Crashes a fucking ton :(

{
	public LmsCreativeTab() 
	{
		super("Lms");
	}

	@Override
	public Item getTabIconItem()
	{
		return LmsItems.LightningStriker;
	}
}
