
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.donut.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DonutModTabs {
	public static CreativeModeTab TAB_DONUTS;

	public static void load() {
		TAB_DONUTS = new CreativeModeTab("tabdonuts") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DonutModItems.DONUT);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
