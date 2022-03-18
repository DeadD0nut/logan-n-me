
package net.mcreator.donut.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class Frosted_OreItem extends Item {
	public Frosted_OreItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("frosted_ore");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
