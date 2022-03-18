
package net.mcreator.donut.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.donut.init.DonutModFluids;

public class BlackHoleItem extends BucketItem {
	public BlackHoleItem() {
		super(() -> DonutModFluids.BLACK_HOLE,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
		setRegistryName("black_hole_bucket");
	}
}
