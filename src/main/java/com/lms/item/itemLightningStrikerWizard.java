package com.lms.item;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.lms.LmsTabs;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class itemLightningStrikerWizard extends Item{

public static CreativeTabs LsmCreativeTab;
public static com.lms.LmsCreativeTab lsmCreativeTab;
public static Item LS3; 




public itemLightningStrikerWizard(){}

public static Item block;public static Object instance;public void load(){

	
	
	//Recipe
	
	
	
GameRegistry.addRecipe(new ItemStack(block, 1), new Object[]{
	"XEX", "XIX", "XDX", Character.valueOf('E'), new ItemStack(Items.blaze_rod, 1), Character.valueOf('I'), new ItemStack(Items.iron_sword, 1), Character.valueOf('D'), new ItemStack(Items.diamond_sword, 1), 
});}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){
}

//Registry
static{
block = (new Itemlightningstriker(8005));
Item.itemRegistry.addObject(8000, "LightningstrikerWizard", block);

}

static class Itemlightningstriker extends Item{
//Stats
public Itemlightningstriker(int par1){
setMaxDamage(6);
maxStackSize = 1;
setUnlocalizedName("LightningstrikerWizard");
setTextureName("lms:itemLightningStrikerWizard");
setCreativeTab(LsmCreativeTab);
}
//Enchantability
public int getItemEnchantability()
{
    return 1;
}
//Item Duration
public int getMaxItemUseDuration(ItemStack par1ItemStack)
{
    return 2500;
}


		//Strike da lightning D:
public boolean onItemUse(ItemStack itemStack, EntityPlayer entity, World world, int i, int j, int k, int l, float a, float b, float c){
if(true){
entity.addPotionEffect(new PotionEffect(1, 1000, 2));
entity.addPotionEffect(new PotionEffect(5, 1000, 2));
entity.addPotionEffect(new PotionEffect(3, 5, 2));
}

return true;
}
}

public static void LmsRegistry() {
	registerItem();
	IntializeItem();
}
private static void IntializeItem() {
	instance = new Item().setUnlocalizedName("Lightning Striker").setCreativeTab(LsmCreativeTab).setTextureName("lms:itemLightningStriker");
}
private static <LightningStriker> void registerItem(Item item, String name)
{
	
	String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
	item.setUnlocalizedName(unlocalizedName);
	item.setTextureName("lms" + ":" + unlocalizedName);
	item.setCreativeTab(LmsTabs.tab);
	
	GameRegistry.registerItem(item, unlocalizedName);
}
public static Item LS;
private static void registerItem() {
	LS = new itemLightningStriker();
	registerItem(LS, "Lightning Striker");
	
}}