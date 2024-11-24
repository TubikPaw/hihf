package net.mcreator.ufd.procedures;

import net.mcreator.ufd.init.HotaModItems;
import net.mcreator.ufd.init.HotaModBlocks;

public class VayfObnovitTaktProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HotaModItems.STRAWBERRY.get()));
				entityToSpawn.setPickUpDelay(1);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == HotaModBlocks.VAYF.get() && Math.random() <= 0.1) {
			world.setBlock(BlockPos.containing(x, y, z), HotaModBlocks.XY.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == HotaModBlocks.XY.get() && Math.random() <= 0.08) {
			world.setBlock(BlockPos.containing(x, y, z), HotaModBlocks.PENIC.get().defaultBlockState(), 3);
		}
	}
}
