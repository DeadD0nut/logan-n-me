
package net.mcreator.donut.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class MeltedSugerItem extends Item {
	public MeltedSugerItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("melted_suger");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
