package com.lms.item;



import com.lms.LmsTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class LmsItems {
	public static Item ExpiredLightning;
	// Damaged lightning, when crafted will only give half durability sword^
	public static Item LightningOre;
	public static Item LightningDimension;
	public static Item ActiveLightningIngot;
	public static Item ActiveLightningOre;
	//Will kill player entity on touch ^
	public static itemLightningStriker LightningStriker;
	public static itemLightningStrikerWizard LightningStriker2;
	public static Item LS;
	public static Item LS2;
	public static Item LS3;
	public static Item LS4;
	public static Item LS5;
	public static Item LightningIngot;
	
	
	
	
	public static void register()

	{	
		LightningStriker = new itemLightningStriker();
		LS = new itemLightningStriker();
		LS2 = new itemLightningStrikerIron();
		LS3 = new itemLightningStrikerTeleportation();
		LS4 = new itemLightningStrikerWizard();
		LightningStriker2 = new itemLightningStrikerWizard();
		ActiveLightningIngot = new itemIngot();
		LightningIngot = new itemIngot();
		LS = new itemLightningStriker();
		LS2 = new itemLightningStrikerIron();
		
		
		
		registerItem(LS3, "Lightning Striker Teleportation");
		registerItem(LS4, "Lightning Striker Wizard Edition");
		registerItem(LS2, "Lightning Striker Iron Edition");
		registerItem(LightningIngot, "Lightning Ingot");
		registerItem(ActiveLightningIngot, "Active Lightning Ingot");
		registerItem(LightningIngot, "Lightning Ingot");
		registerItem(LS, "Lightning Striker");
	}
	private static <LightningStriker> void registerItem(Item item, String name)
	{
		
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setTextureName("lms" + ":" + unlocalizedName);
		item.setCreativeTab(LmsTabs.tab);
		
		GameRegistry.registerItem(item, unlocalizedName);
	}
	
	
}
