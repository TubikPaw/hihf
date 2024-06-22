package net.mcreator.ufd.procedures;

import net.minecraft.world.entity.Entity;

public class GchcProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
	}
}
