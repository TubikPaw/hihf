
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ufd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ufd.HotaMod;

public class HotaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, HotaMod.MODID);
	public static final RegistryObject<SoundEvent> FOREST_OF_THE_ANCIENTS = REGISTRY.register("forest_of_the_ancients", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("hota", "forest_of_the_ancients")));
	public static final RegistryObject<SoundEvent> CONCERT_OF_THE_ANCIENTS = REGISTRY.register("concert_of_the_ancients", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("hota", "concert_of_the_ancients")));
	public static final RegistryObject<SoundEvent> WASTELAND_OF_THE_ANCIENTS = REGISTRY.register("wasteland_of_the_ancients", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("hota", "wasteland_of_the_ancients")));
	public static final RegistryObject<SoundEvent> ZVUK_MSHYSTOGO_POKROVA = REGISTRY.register("zvuk_mshystogo_pokrova", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("hota", "zvuk_mshystogo_pokrova")));
	public static final RegistryObject<SoundEvent> MUZYKA_MSHSTOGO_POKROVA = REGISTRY.register("muzyka_mshstogo_pokrova", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("hota", "muzyka_mshstogo_pokrova")));
}
