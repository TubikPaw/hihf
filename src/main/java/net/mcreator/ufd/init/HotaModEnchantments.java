
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ufd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.ufd.enchantment.ThewrathofhellEnchantment;
import net.mcreator.ufd.enchantment.ThewrathofheavenEnchantment;
import net.mcreator.ufd.enchantment.GodbloodEnchantment;
import net.mcreator.ufd.HotaMod;

public class HotaModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, HotaMod.MODID);
	public static final RegistryObject<Enchantment> THEWRATHOFHEAVEN = REGISTRY.register("thewrathofheaven", () -> new ThewrathofheavenEnchantment());
	public static final RegistryObject<Enchantment> THEWRATHOFHELL = REGISTRY.register("thewrathofhell", () -> new ThewrathofhellEnchantment());
	public static final RegistryObject<Enchantment> GODBLOOD = REGISTRY.register("godblood", () -> new GodbloodEnchantment());
}
