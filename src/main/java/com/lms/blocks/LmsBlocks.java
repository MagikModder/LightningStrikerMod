package com.lms.blocks;

import com.lms.LmsTabs;

import net.minecraft.block.Block;
import net.minecraftforge.oredict.OreDictionary;


import cpw.mods.fml.common.registry.GameRegistry;

public class LmsBlocks 
{
	public static Block LightningOre;
	
	public static void register()
	{
		
		LightningOre = new BlockLightningOre();
		registerBlock(LightningOre, "Lightning Ore");
	
	}
	
	private static void registerBlock(Block block, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		block.setBlockName(unlocalizedName);
		block.setBlockTextureName("Lms:" + unlocalizedName);
		block.setCreativeTab(LmsTabs.tab);
		
		GameRegistry.registerBlock(block, unlocalizedName);
	}
	
	private static void registerOre(Block block, String name, String oreDictName)
	{
		registerBlock(block, name);
		OreDictionary.registerOre("lms_" + oreDictName.toLowerCase(), block);
	}
	
	private static void registerOreAsTileEntity(Block block, String name, String oreDictName, Class clazz)
	{
		registerOre(block, name, oreDictName);
		GameRegistry.registerTileEntity(clazz, name);
	}
	
	private static void registerTileEntity(Block block, String name, Class clazz)
	{
		registerBlock(block, name);
		GameRegistry.registerTileEntity(clazz, name);
	}
}
