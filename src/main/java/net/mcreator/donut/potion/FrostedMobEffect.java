
package net.mcreator.donut.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FrostedMobEffect extends MobEffect {
	public FrostedMobEffect() {
		super(MobEffectCategory.HARMFUL, -65281);
		setRegistryName("frosted");
	}

	@Override
	public String getDescriptionId() {
		return "effect.donut.frosted";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
