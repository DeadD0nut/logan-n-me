
package net.mcreator.donut.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.BlockPos;

import net.mcreator.donut.init.DonutModItems;
import net.mcreator.donut.init.DonutModFluids;
import net.mcreator.donut.init.DonutModBlocks;

public abstract class FrostingFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> DonutModFluids.FROSTING,
			() -> DonutModFluids.FLOWING_FROSTING,
			FluidAttributes.builder(new ResourceLocation("donut:blocks/frosting"), new ResourceLocation("donut:blocks/frosting"))

					.viscosity(1)

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.stare")))).explosionResistance(100f)
							.canMultiply().tickRate(1)

							.slopeFindDistance(1).bucket(() -> DonutModItems.FROSTING_BUCKET).block(() -> (LiquidBlock) DonutModBlocks.FROSTING);

	private FrostingFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.BARRIER;
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(-5);
	}

	public static class Source extends FrostingFluid {
		public Source() {
			super();
			setRegistryName("frosting");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends FrostingFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_frosting");
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
