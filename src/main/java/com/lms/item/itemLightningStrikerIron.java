package com.lms.item;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import com.lms.LmsTabs;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class itemLightningStrikerIron extends Item{

public static CreativeTabs LsmCreativeTab;
public static com.lms.LmsCreativeTab lsmCreativeTab;




public itemLightningStrikerIron(){}

public static Item block;public static Object instance;public void load(){

	
	
	//Recipe
	
	
	
GameRegistry.addRecipe(new ItemStack(block, 1), new Object[]{
	"XEX", "XIX", "XDX", Character.valueOf('E'), new ItemStack(LmsItems.LightningIngot, 1), Character.valueOf('I'), new ItemStack(Items.fire_charge, 1), Character.valueOf('D'), new ItemStack(Items.diamond_sword, 1), 
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
block = (new ItemlightningstrikerIron(8001));
Item.itemRegistry.addObject(8002, "EvilLightningStriker", block);

}

static class ItemlightningstrikerIron extends Item{
//Stats
public ItemlightningstrikerIron(int par1){
setMaxDamage(20);
maxStackSize = 1;
setUnlocalizedName("Lightningstriker");
setTextureName("lms:itemLightningStriker");
setCreativeTab(LsmCreativeTab);
}
//Enchantability
public int getItemEnchantability()
{
    return 0;
}
//Item Duration
public int getMaxItemUseDuration(ItemStack par1ItemStack)
{
    return 3;
}


		//Strike da lightning D:
public boolean onItemUse(ItemStack itemStack, EntityPlayer entity, World world, int i, int j, int k, int l, float a, float b, float c){
if(true){
	MinecraftServer.getServer().addChatMessage(new ChatComponentText("You are evil...There is no goig back."));
world.spawnEntityInWorld(new EntityLightningBolt(world, i, j, k));
}

return true;
}
}
public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity){
float var4 = 1.0F;
int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D - (double)entity.yOffset);
int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);

if(true){
MinecraftServer.getServer().addChatMessage(new ChatComponentText("You must click on the ground to activate the lightning power"));
}

return itemstack;
}
public static void LmsRegistry() {
	registerItem();
	IntializeItem();
}
private static void IntializeItem() {
	instance = new Item().setUnlocalizedName("Lightning Striker Iron").setCreativeTab(LsmCreativeTab).setTextureName("lms:itemLightningStriker");
}
private static <LightningStrikerIron> void registerItem(Item item, String name)
{
	
	String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
	item.setUnlocalizedName(unlocalizedName);
	item.setTextureName("lms" + ":" + unlocalizedName);
	item.setCreativeTab(LmsTabs.tab);
	
	GameRegistry.registerItem(item, unlocalizedName);
}
public static Item LS2;
private static void registerItem() {
	LS2 = new itemLightningStriker();
	registerItem(LS2, "Lightning Striker Iron");
	
}}