
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ufd.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.ufd.client.gui.UkayvScreen;
import net.mcreator.ufd.client.gui.ApsrspScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HotaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HotaModMenus.APSRSP.get(), ApsrspScreen::new);
			MenuScreens.register(HotaModMenus.UKAYV.get(), UkayvScreen::new);
		});
	}
}
