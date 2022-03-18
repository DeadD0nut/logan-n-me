
package net.mcreator.donut.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.donut.init.DonutModTabs;

public class DonutItem extends PickaxeItem {
	public DonutItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 99994f;
			}

			public float getAttackDamageBonus() {
				return 9992f;
			}

			public int getLevel() {
				return 9999;
			}

			public int getEnchantmentValue() {
				return 99992;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, 56.0999f, new Item.Properties().tab(DonutModTabs.TAB_DONUTS).fireResistant());
		setRegistryName("donut");
	}

	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}
}
