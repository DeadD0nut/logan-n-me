
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.donut.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.donut.item.UltimateSwordItem;
import net.mcreator.donut.item.UltimateShovelItem;
import net.mcreator.donut.item.UltimatePickaxeItem;
import net.mcreator.donut.item.UltimateHoeItem;
import net.mcreator.donut.item.UltimateAxeItem;
import net.mcreator.donut.item.SugerRushItem;
import net.mcreator.donut.item.SugerCoatedLandsItem;
import net.mcreator.donut.item.SugarSwordItem;
import net.mcreator.donut.item.SugarShovelItem;
import net.mcreator.donut.item.SugarPickaxeItem;
import net.mcreator.donut.item.SugarIngotItem;
import net.mcreator.donut.item.SugarHoeItem;
import net.mcreator.donut.item.SugarAxeItem;
import net.mcreator.donut.item.Solid_Jolly_RancherSwordItem;
import net.mcreator.donut.item.Solid_Jolly_RancherShovelItem;
import net.mcreator.donut.item.Solid_Jolly_RancherPickaxeItem;
import net.mcreator.donut.item.Solid_Jolly_RancherHoeItem;
import net.mcreator.donut.item.Solid_Jolly_RancherAxeItem;
import net.mcreator.donut.item.SmartiesItem;
import net.mcreator.donut.item.ScytheOfTheGodsItem;
import net.mcreator.donut.item.PileODonutsItem;
import net.mcreator.donut.item.MnMItem;
import net.mcreator.donut.item.MikeandikeItem;
import net.mcreator.donut.item.MeltedSugerItem;
import net.mcreator.donut.item.LemmonHeadItem;
import net.mcreator.donut.item.JollyRancherItem;
import net.mcreator.donut.item.GummyItem;
import net.mcreator.donut.item.GumItem;
import net.mcreator.donut.item.FrostingItem;
import net.mcreator.donut.item.Frosted_OreItem;
import net.mcreator.donut.item.FrostedSugarItem;
import net.mcreator.donut.item.FrostedArmorItem;
import net.mcreator.donut.item.DonutItem;
import net.mcreator.donut.item.ChockolatItem;
import net.mcreator.donut.item.ChickenStripsItem;
import net.mcreator.donut.item.ChewedGumItem;
import net.mcreator.donut.item.CandyBlobItem;
import net.mcreator.donut.item.CakeSwordItem;
import net.mcreator.donut.item.CakeShovelItem;
import net.mcreator.donut.item.CakePickaxeItem;
import net.mcreator.donut.item.CakeHoeItem;
import net.mcreator.donut.item.CakeEyeItem;
import net.mcreator.donut.item.CakeAxeItem;
import net.mcreator.donut.item.Bow2Item;
import net.mcreator.donut.item.BlackHoleItem;
import net.mcreator.donut.item.AaaaaItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DonutModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item TEST = register(DonutModBlocks.TEST, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BOW_2 = register(new Bow2Item());
	public static final Item DONUT = register(new DonutItem());
	public static final Item FROSTING_BUCKET = register(new FrostingItem());
	public static final Item AAAAA = register(new AaaaaItem());
	public static final Item CAKE_EYE = register(new CakeEyeItem());
	public static final Item MONSTERE = register(
			new SpawnEggItem(DonutModEntities.MONSTERE, -13395712, -52429, new Item.Properties().tab(DonutModTabs.TAB_DONUTS))
					.setRegistryName("monstere_spawn_egg"));
	public static final Item CAKE_PICKAXE = register(new CakePickaxeItem());
	public static final Item CAKE_AXE = register(new CakeAxeItem());
	public static final Item CAKE_SWORD = register(new CakeSwordItem());
	public static final Item CAKE_SHOVEL = register(new CakeShovelItem());
	public static final Item CAKE_HOE = register(new CakeHoeItem());
	public static final Item FROSTED_ORE = register(new Frosted_OreItem());
	public static final Item FROSTED_ORE_ORE = register(DonutModBlocks.FROSTED_ORE_ORE, DonutModTabs.TAB_DONUTS);
	public static final Item FROSTED_ORE_BLOCK = register(DonutModBlocks.FROSTED_ORE_BLOCK, DonutModTabs.TAB_DONUTS);
	public static final Item FROSTED_BEAST = register(
			new SpawnEggItem(DonutModEntities.FROSTED_BEAST, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("frosted_beast_spawn_egg"));
	public static final Item FROSTED_ARMOR_HELMET = register(new FrostedArmorItem.Helmet());
	public static final Item FROSTED_ARMOR_CHESTPLATE = register(new FrostedArmorItem.Chestplate());
	public static final Item FROSTED_ARMOR_LEGGINGS = register(new FrostedArmorItem.Leggings());
	public static final Item FROSTED_ARMOR_BOOTS = register(new FrostedArmorItem.Boots());
	public static final Item BLACK_HOLE_BUCKET = register(new BlackHoleItem());
	public static final Item SUGAR_INGOT = register(new SugarIngotItem());
	public static final Item SUGAR_ORE = register(DonutModBlocks.SUGAR_ORE, DonutModTabs.TAB_DONUTS);
	public static final Item SUGAR_BLOCK = register(DonutModBlocks.SUGAR_BLOCK, DonutModTabs.TAB_DONUTS);
	public static final Item SUGAR_PICKAXE = register(new SugarPickaxeItem());
	public static final Item SUGAR_AXE = register(new SugarAxeItem());
	public static final Item SUGAR_SWORD = register(new SugarSwordItem());
	public static final Item SUGAR_SHOVEL = register(new SugarShovelItem());
	public static final Item SUGAR_HOE = register(new SugarHoeItem());
	public static final Item FROSTED_SUGAR = register(new FrostedSugarItem());
	public static final Item SHUGER_MAN = register(
			new SpawnEggItem(DonutModEntities.SHUGER_MAN, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("shuger_man_spawn_egg"));
	public static final Item PILE_O_DONUTS = register(new PileODonutsItem());
	public static final Item CHICKEN_STRIPS = register(new ChickenStripsItem());
	public static final Item SUGER_COATED_LANDS = register(new SugerCoatedLandsItem());
	public static final Item GUMMY = register(new GummyItem());
	public static final Item MN_M = register(new MnMItem());
	public static final Item CHOCKOLAT = register(new ChockolatItem());
	public static final Item GUM = register(new GumItem());
	public static final Item CHEWED_GUM = register(new ChewedGumItem());
	public static final Item JOLLY_RANCHER = register(new JollyRancherItem());
	public static final Item LEMMON_HEAD = register(new LemmonHeadItem());
	public static final Item MIKEANDIKE = register(new MikeandikeItem());
	public static final Item SMARTIES = register(new SmartiesItem());
	public static final Item CANDY_BLOB = register(new CandyBlobItem());
	public static final Item SUPER_CANDY = register(DonutModBlocks.SUPER_CANDY, DonutModTabs.TAB_DONUTS);
	public static final Item THE_ULTIMATE_CANDY = register(DonutModBlocks.THE_ULTIMATE_CANDY, DonutModTabs.TAB_DONUTS);
	public static final Item ULTIMATE_PICKAXE = register(new UltimatePickaxeItem());
	public static final Item ULTIMATE_AXE = register(new UltimateAxeItem());
	public static final Item ULTIMATE_SWORD = register(new UltimateSwordItem());
	public static final Item ULTIMATE_SHOVEL = register(new UltimateShovelItem());
	public static final Item ULTIMATE_HOE = register(new UltimateHoeItem());
	public static final Item SUGER_RUSH = register(new SugerRushItem());
	public static final Item MELTED_SUGER = register(new MeltedSugerItem());
	public static final Item NUMB_SNAKE = register(
			new SpawnEggItem(DonutModEntities.NUMB_SNAKE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("numb_snake_spawn_egg"));
	public static final Item SCYTHE_OF_THE_GODS = register(new ScytheOfTheGodsItem());
	public static final Item SOLID_JOLLY_RANCHER_PICKAXE = register(new Solid_Jolly_RancherPickaxeItem());
	public static final Item SOLID_JOLLY_RANCHER_AXE = register(new Solid_Jolly_RancherAxeItem());
	public static final Item SOLID_JOLLY_RANCHER_SWORD = register(new Solid_Jolly_RancherSwordItem());
	public static final Item SOLID_JOLLY_RANCHER_SHOVEL = register(new Solid_Jolly_RancherShovelItem());
	public static final Item SOLID_JOLLY_RANCHER_HOE = register(new Solid_Jolly_RancherHoeItem());
	public static final Item COOKIE_DOUGH = register(DonutModBlocks.COOKIE_DOUGH, DonutModTabs.TAB_DONUTS);
	public static final Item BURNT_WOOD = register(DonutModBlocks.BURNT_WOOD, DonutModTabs.TAB_DONUTS);
	public static final Item BURNT_LOG = register(DonutModBlocks.BURNT_LOG, DonutModTabs.TAB_DONUTS);
	public static final Item BURNT_PLANKS = register(DonutModBlocks.BURNT_PLANKS, DonutModTabs.TAB_DONUTS);
	public static final Item BURNT_LEAVES = register(DonutModBlocks.BURNT_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final Item BURNT_STAIRS = register(DonutModBlocks.BURNT_STAIRS, DonutModTabs.TAB_DONUTS);
	public static final Item BURNT_SLAB = register(DonutModBlocks.BURNT_SLAB, DonutModTabs.TAB_DONUTS);
	public static final Item BURNT_FENCE = register(DonutModBlocks.BURNT_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final Item BURNT_FENCE_GATE = register(DonutModBlocks.BURNT_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final Item BURNT_PRESSURE_PLATE = register(DonutModBlocks.BURNT_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final Item BURNT_BUTTON = register(DonutModBlocks.BURNT_BUTTON, DonutModTabs.TAB_DONUTS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
