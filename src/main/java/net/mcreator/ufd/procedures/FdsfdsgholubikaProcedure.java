package net.mcreator.ufd.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.ufd.init.HotaModItems;
import net.mcreator.ufd.init.HotaModBlocks;

public class FdsfdsgholubikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(HotaModItems.BLUEBERRIES.get()));
				entityToSpawn.setPickUpDelay(1);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == HotaModBlocks.RRERGHOLUBIKA.get() && Math.random() <= 0.1) {
			world.setBlock(BlockPos.containing(x, y, z), HotaModBlocks.FSDFGHOLUBIKA.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == HotaModBlocks.FSDFGHOLUBIKA.get() && Math.random() <= 0.08) {
			world.setBlock(BlockPos.containing(x, y, z), HotaModBlocks.VCVXVGHOLUBIKA.get().defaultBlockState(), 3);
		}
	}
}
