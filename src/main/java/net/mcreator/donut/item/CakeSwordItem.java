
package net.mcreator.donut.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.donut.init.DonutModTabs;

public class CakeSwordItem extends SwordItem {
	public CakeSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2380;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 28f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 69;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.CAKE));
			}
		}, 3, -3.5f, new Item.Properties().tab(DonutModTabs.TAB_DONUTS).fireResistant());
		setRegistryName("cake_sword");
	}
}
