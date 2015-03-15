package com.lms.Recipe;

import com.lms.item.LmsItems;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class LmsRecipe {
	public static void register()
	{
		GameRegistry.addSmelting(LmsItems.ActiveLightningOre, new ItemStack(LmsItems.ActiveLightningIngot), 10);
		GameRegistry.addSmelting(LmsItems.LightningOre, new ItemStack(LmsItems.LightningIngot), 5);
	}
}
