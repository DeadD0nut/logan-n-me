
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.donut.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DonutModPotions {
	private static final List<Potion> REGISTRY = new ArrayList<>();
	public static final Potion FROSTY = register(new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3568, 15, true, true),
			new MobEffectInstance(MobEffects.CONFUSION, 3600, 0, false, true), new MobEffectInstance(MobEffects.BLINDNESS, 2000, 0, false, true),
			new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 20, true, true), new MobEffectInstance(MobEffects.POISON, 100, 30, true, true),
			new MobEffectInstance(MobEffects.BAD_OMEN, 3600, 0, true, true),
			new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 0, true, true)).setRegistryName("frosty"));

	private static Potion register(Potion potion) {
		REGISTRY.add(potion);
		return potion;
	}

	@SubscribeEvent
	public static void registerPotions(RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Potion[0]));
	}
}
