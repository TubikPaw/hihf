
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ufd.init;

import net.mcreator.ufd.client.gui.UkayvScreen;
import net.mcreator.ufd.client.gui.TraiderScreen;
import net.mcreator.ufd.client.gui.ApsrspScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HotaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HotaModMenus.APSRSP.get(), ApsrspScreen::new);
			MenuScreens.register(HotaModMenus.UKAYV.get(), UkayvScreen::new);
			MenuScreens.register(HotaModMenus.TRAIDER.get(), TraiderScreen::new);
		});
	}
}
