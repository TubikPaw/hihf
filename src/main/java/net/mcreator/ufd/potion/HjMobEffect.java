
package net.mcreator.ufd.potion;

import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ufd.procedures.GchcProcedure;

public class HjMobEffect extends MobEffect {
	public HjMobEffect() {
		super(MobEffectCategory.HARMFUL, -52480);
	}

	@Override
	public String getDescriptionId() {
		return "effect.hota.hj";
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
