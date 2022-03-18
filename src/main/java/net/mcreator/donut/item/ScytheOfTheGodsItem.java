
package net.mcreator.donut.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.donut.procedures.ScytheOfTheGodsEntitySwingsItemProcedure;
import net.mcreator.donut.init.DonutModBlocks;

public class ScytheOfTheGodsItem extends SwordItem {
	public ScytheOfTheGodsItem() {
		super(new Tier() {
			public int getUses() {
				return 25000;
			}

			public float getSpeed() {
				return 60f;
			}

			public float getAttackDamageBonus() {
				return 98f;
			}

			public int getLevel() {
				return 20;
			}

			public int getEnchantmentValue() {
				return 1400;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DonutModBlocks.THE_ULTIMATE_CANDY));
			}
		}, 3, -3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
		setRegistryName("scythe_of_the_gods");
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		ScytheOfTheGodsEntitySwingsItemProcedure.execute(entity.level, entity);
		return retval;
	}
}
