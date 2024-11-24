
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ufd.init;

import net.mcreator.ufd.HotaMod;

public class HotaModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, HotaMod.MODID);
	public static final RegistryObject<Potion> FIREPOTION = REGISTRY.register("firepotion", () -> new Potion(new MobEffectInstance(HotaModMobEffects.HJ.get(), 200, 0, false, true)));
	public static final RegistryObject<Potion> BERRY_POWER = REGISTRY.register("berry_power", () -> new Potion(new MobEffectInstance(MobEffects.NIGHT_VISION, 360, 0, false, true), new MobEffectInstance(MobEffects.HEALTH_BOOST, 360, 1, false, true),
			new MobEffectInstance(MobEffects.REGENERATION, 360, 0, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 360, 0, false, true), new MobEffectInstance(MobEffects.JUMP, 360, 0, false, true)));
	public static final RegistryObject<Potion> ANCIENTWATER = REGISTRY.register("ancientwater", () -> new Potion());
}
