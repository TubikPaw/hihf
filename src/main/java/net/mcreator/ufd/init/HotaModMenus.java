
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ufd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.ufd.world.inventory.UkayvMenu;
import net.mcreator.ufd.world.inventory.ApsrspMenu;
import net.mcreator.ufd.HotaMod;

public class HotaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HotaMod.MODID);
	public static final RegistryObject<MenuType<ApsrspMenu>> APSRSP = REGISTRY.register("apsrsp", () -> IForgeMenuType.create(ApsrspMenu::new));
	public static final RegistryObject<MenuType<UkayvMenu>> UKAYV = REGISTRY.register("ukayv", () -> IForgeMenuType.create(UkayvMenu::new));
}
