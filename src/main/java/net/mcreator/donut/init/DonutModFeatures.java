
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.donut.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.donut.world.features.ores.SugarOreFeature;
import net.mcreator.donut.world.features.lakes.FrostingFeature;
import net.mcreator.donut.world.features.lakes.BlackHoleFeature;
import net.mcreator.donut.world.features.BurntHouseFeature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DonutModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(FrostingFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.LAKES, FrostingFeature.GENERATE_BIOMES, FrostingFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlackHoleFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.LAKES, BlackHoleFeature.GENERATE_BIOMES, BlackHoleFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SugarOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SugarOreFeature.GENERATE_BIOMES,
				SugarOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BurntHouseFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				BurntHouseFeature.GENERATE_BIOMES, BurntHouseFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
