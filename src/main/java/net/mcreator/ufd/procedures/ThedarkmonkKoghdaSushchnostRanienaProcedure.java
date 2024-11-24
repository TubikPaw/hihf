package net.mcreator.ufd.procedures;

import net.mcreator.ufd.init.HotaModMobEffects;

public class ThedarkmonkKoghdaSushchnostRanienaProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(HotaModMobEffects.BLEEDING.get(), 20, 0));
	}
}
