
package net.mcreator.donut.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class ChickenStripsItem extends Item {
	public ChickenStripsItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.3f)

						.meat().build()));
		setRegistryName("chicken_strips");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 5;
	}
}
