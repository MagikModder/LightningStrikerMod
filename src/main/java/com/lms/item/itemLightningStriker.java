package com.lms.item;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.creativetab.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.init.*;

import java.util.*;

import com.lms.LmsTabs;
public class itemLightningStriker extends Item{

public static CreativeTabs LsmCreativeTab;
public static com.lms.LmsCreativeTab lsmCreativeTab;
public static Item LS3; 




public itemLightningStriker(){}

public static Item block;public static Object instance;public void load(){

	
	
	//Recipe
	
	
	
GameRegistry.addRecipe(new ItemStack(block, 1), new Object[]{
	"XEX", "XIX", "XDX", Character.valueOf('E'), new ItemStack(Items.ender_pearl, 1), Character.valueOf('I'), new ItemStack(Items.iron_sword, 1), Character.valueOf('D'), new ItemStack(Items.diamond_sword, 1), 
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
block = (new Itemlightningstriker(8000));
Item.itemRegistry.addObject(8000, "Lightningstriker", block);

}

static class Itemlightningstriker extends Item{
//Stats
public Itemlightningstriker(int par1){
setMaxDamage(3);
maxStackSize = 1;
setUnlocalizedName("Lightningstriker");
setTextureName("lms:itemLightningStriker");
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
    return 0;
}


		//Strike da lightning D:
public boolean onItemUse(ItemStack itemStack, EntityPlayer entity, World world, int i, int j, int k, int l, float a, float b, float c){
if(true){
world.spawnEntityInWorld(new EntityLightningBolt(world, i, j, k));
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