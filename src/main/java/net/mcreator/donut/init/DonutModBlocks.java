
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.donut.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.donut.block.TheUltimateCandyBlock;
import net.mcreator.donut.block.TestBlock;
import net.mcreator.donut.block.SuperCandyBlock;
import net.mcreator.donut.block.SugarOreBlock;
import net.mcreator.donut.block.SugarBlockBlock;
import net.mcreator.donut.block.FrostingBlock;
import net.mcreator.donut.block.Frosted_OreOreBlock;
import net.mcreator.donut.block.Frosted_OreBlockBlock;
import net.mcreator.donut.block.FrostedSugarPortalBlock;
import net.mcreator.donut.block.CookieDoughBlock;
import net.mcreator.donut.block.BurntWoodBlock;
import net.mcreator.donut.block.BurntStairsBlock;
import net.mcreator.donut.block.BurntSlabBlock;
import net.mcreator.donut.block.BurntPressurePlateBlock;
import net.mcreator.donut.block.BurntPlanksBlock;
import net.mcreator.donut.block.BurntLogBlock;
import net.mcreator.donut.block.BurntLeavesBlock;
import net.mcreator.donut.block.BurntFenceGateBlock;
import net.mcreator.donut.block.BurntFenceBlock;
import net.mcreator.donut.block.BurntButtonBlock;
import net.mcreator.donut.block.BlackHoleBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DonutModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block TEST = register(new TestBlock());
	public static final Block FROSTING = register(new FrostingBlock());
	public static final Block FROSTED_ORE_ORE = register(new Frosted_OreOreBlock());
	public static final Block FROSTED_ORE_BLOCK = register(new Frosted_OreBlockBlock());
	public static final Block BLACK_HOLE = register(new BlackHoleBlock());
	public static final Block SUGAR_ORE = register(new SugarOreBlock());
	public static final Block SUGAR_BLOCK = register(new SugarBlockBlock());
	public static final Block FROSTED_SUGAR_PORTAL = register(new FrostedSugarPortalBlock());
	public static final Block SUPER_CANDY = register(new SuperCandyBlock());
	public static final Block THE_ULTIMATE_CANDY = register(new TheUltimateCandyBlock());
	public static final Block COOKIE_DOUGH = register(new CookieDoughBlock());
	public static final Block BURNT_WOOD = register(new BurntWoodBlock());
	public static final Block BURNT_LOG = register(new BurntLogBlock());
	public static final Block BURNT_PLANKS = register(new BurntPlanksBlock());
	public static final Block BURNT_LEAVES = register(new BurntLeavesBlock());
	public static final Block BURNT_STAIRS = register(new BurntStairsBlock());
	public static final Block BURNT_SLAB = register(new BurntSlabBlock());
	public static final Block BURNT_FENCE = register(new BurntFenceBlock());
	public static final Block BURNT_FENCE_GATE = register(new BurntFenceGateBlock());
	public static final Block BURNT_PRESSURE_PLATE = register(new BurntPressurePlateBlock());
	public static final Block BURNT_BUTTON = register(new BurntButtonBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
