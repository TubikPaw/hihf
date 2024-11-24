
package net.mcreator.ufd.potion;

import net.mcreator.ufd.procedures.BleedingKazhdyiTikVoVriemiaEffiektaProcedure;

public class BleedingMobEffect extends MobEffect {
	public BleedingMobEffect() {
		super(MobEffectCategory.HARMFUL, -6750208);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BleedingKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
