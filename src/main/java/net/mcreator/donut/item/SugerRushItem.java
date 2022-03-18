
package net.mcreator.donut.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.donut.init.DonutModSounds;

public class SugerRushItem extends RecordItem {
	public SugerRushItem() {
		super(0, DonutModSounds.REGISTRY.get(new ResourceLocation("donut:aaaaaaaa")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("suger_rush");
	}
}
