
package net.mcreator.donut.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.donut.init.DonutModFluids;

public class BlackHoleBlock extends LiquidBlock {
	public BlackHoleBlock() {
		super(DonutModFluids.BLACK_HOLE, BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
		setRegistryName("black_hole");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
