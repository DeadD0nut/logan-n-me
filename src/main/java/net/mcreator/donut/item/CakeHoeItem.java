
package net.mcreator.donut.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.donut.init.DonutModTabs;
import net.mcreator.donut.init.DonutModItems;

public class CakeHoeItem extends HoeItem {
	public CakeHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2380;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 70;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DonutModItems.CAKE_EYE));
			}
		}, 0, -3f, new Item.Properties().tab(DonutModTabs.TAB_DONUTS));
		setRegistryName("cake_hoe");
	}
}
