package net.mcreator.donut.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class ScytheOfTheGodsEntitySwingsItemProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double blast = 0;
		double blastx = 0;
		double blasty = 0;
		for (int index0 = 0; index0 < (int) (5); index0++) {
			blastx = blastx + 30;
			blasty = blasty + 1;
			for (int index1 = 0; index1 < (int) (5); index1++) {
				world.setBlock(new BlockPos((int) (entity.getX() + blastx), (int) (entity.getY() + blasty), (int) (entity.getZ() + blastx)),
						Blocks.GRASS_BLOCK.defaultBlockState(), 3);
				blast = blast + 1;
			}
		}
	}
}
