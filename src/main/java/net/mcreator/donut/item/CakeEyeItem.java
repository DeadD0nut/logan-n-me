
package net.mcreator.donut.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.donut.init.DonutModTabs;

public class CakeEyeItem extends Item {
	public CakeEyeItem() {
		super(new Item.Properties().tab(DonutModTabs.TAB_DONUTS).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
		setRegistryName("cake_eye");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
