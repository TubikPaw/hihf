
package net.mcreator.ufd.potion;

import net.mcreator.ufd.procedures.GchcProcedure;

public class HjMobEffect extends MobEffect {
	public HjMobEffect() {
		super(MobEffectCategory.HARMFUL, -52480);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		GchcProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void initializeClient(java.util.function.Consumer<IClientMobEffectExtensions> consumer) {
		consumer.accept(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		});
	}
}
