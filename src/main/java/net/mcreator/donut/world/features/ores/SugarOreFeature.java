
package net.mcreator.donut.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.donut.init.DonutModBlocks;

import java.util.Set;
import java.util.Random;

public class SugarOreFeature extends OreFeature {
	public static final SugarOreFeature FEATURE = (SugarOreFeature) new SugarOreFeature().setRegistryName("donut:sugar_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(SugarOreFeatureRuleTest.INSTANCE, DonutModBlocks.SUGAR_ORE.defaultBlockState(), 6))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(1), VerticalAnchor.absolute(99)))).squared().count(17);
	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public SugarOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (dimensionType == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("donut:frosted_sugar")))
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class SugarOreFeatureRuleTest extends RuleTest {
		static final SugarOreFeatureRuleTest INSTANCE = new SugarOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<SugarOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<SugarOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("donut:sugar_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
