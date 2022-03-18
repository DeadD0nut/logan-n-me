
package net.mcreator.donut.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.donut.init.DonutModItems;

public class Solid_Jolly_RancherAxeItem extends AxeItem {
	public Solid_Jolly_RancherAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 950;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 7;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DonutModItems.JOLLY_RANCHER));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("solid_jolly_rancher_axe");
	}
}
