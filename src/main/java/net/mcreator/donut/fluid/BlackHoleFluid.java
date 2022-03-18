
package net.mcreator.donut.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.donut.init.DonutModItems;
import net.mcreator.donut.init.DonutModFluids;
import net.mcreator.donut.init.DonutModBlocks;

public abstract class BlackHoleFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> DonutModFluids.BLACK_HOLE,
			() -> DonutModFluids.FLOWING_BLACK_HOLE,
			FluidAttributes.builder(new ResourceLocation("donut:blocks/virus"), new ResourceLocation("donut:blocks/virus"))

					.gaseous()

	).explosionResistance(100f).canMultiply()

			.slopeFindDistance(1).bucket(() -> DonutModItems.BLACK_HOLE_BUCKET).block(() -> (LiquidBlock) DonutModBlocks.BLACK_HOLE);

	private BlackHoleFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(-20);
	}

	public static class Source extends BlackHoleFluid {
		public Source() {
			super();
			setRegistryName("black_hole");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BlackHoleFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_black_hole");
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
