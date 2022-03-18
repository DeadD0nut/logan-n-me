
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.donut.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.donut.world.biome.FrostedForestBiome;
import net.mcreator.donut.world.biome.BurntCookiesBiome;
import net.mcreator.donut.DonutMod;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DonutModBiomes {
	private static final List<Biome> REGISTRY = new ArrayList<>();
	public static Biome FROSTED_FOREST = register("frosted_forest", FrostedForestBiome.createBiome());
	public static Biome BURNT_COOKIES = register("burnt_cookies", BurntCookiesBiome.createBiome());

	private static Biome register(String registryname, Biome biome) {
		REGISTRY.add(biome.setRegistryName(new ResourceLocation(DonutMod.MODID, registryname)));
		return biome;
	}

	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Biome[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FrostedForestBiome.init();
			BurntCookiesBiome.init();
		});
	}
}
