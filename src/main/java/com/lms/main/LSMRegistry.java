package com.lms.main;
import com.lms.item.itemLightningStriker;
import com.lms.item.itemLightningStrikerIron;
import com.lms.lib.RefStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID, version = RefStrings.VERSION)
public class LSMRegistry {
	//To be deleted later on
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent) {
		itemLightningStriker.LmsRegistry();
		itemLightningStrikerIron.LmsRegistry();
	}}
