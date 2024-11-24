package net.mcreator.ufd.procedures;

import net.mcreator.ufd.init.HotaModEntities;

import java.util.Calendar;

public class IceologerPriObnovlieniiTaktaSushchnostiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double previousRecipe = 0;
		if (Calendar.getInstance().get(Calendar.SECOND) == 30) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = HotaModEntities.PROJECTILEICEOLOGER.get().spawn(_level, BlockPos.containing(x, y + 3, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}
