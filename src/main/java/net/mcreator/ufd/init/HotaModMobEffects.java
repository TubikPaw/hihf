
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ufd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.ufd.potion.HjMobEffect;
import net.mcreator.ufd.potion.BleedingMobEffect;
import net.mcreator.ufd.HotaMod;

public class HotaModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, HotaMod.MODID);
	public static final RegistryObject<MobEffect> HJ = REGISTRY.register("hj", () -> new HjMobEffect());
	public static final RegistryObject<MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
}
