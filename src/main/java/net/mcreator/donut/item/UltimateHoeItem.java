
package net.mcreator.donut.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.donut.init.DonutModBlocks;

public class UltimateHoeItem extends HoeItem {
	public UltimateHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2500;
			}

			public float getSpeed() {
				return 60f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 20;
			}

			public int getEnchantmentValue() {
				return 140;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DonutModBlocks.THE_ULTIMATE_CANDY));
			}
		}, 0, 6f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("ultimate_hoe");
	}
}
