package com.lms.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLightningOre extends Block
{
	public BlockLightningOre()
	{
		super(Material.rock);
		this.setHardness(5F);
		this.setResistance(15F);
		this.setHarvestLevel("pickaxe", 1);
	}
}
