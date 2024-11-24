
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ufd.init;

import net.mcreator.ufd.client.model.Modelнекук;
import net.mcreator.ufd.client.model.Modelueue;
import net.mcreator.ufd.client.model.Modelsnaryad_ledologa;
import net.mcreator.ufd.client.model.Modelmossy_monster;
import net.mcreator.ufd.client.model.Modeliceologer;
import net.mcreator.ufd.client.model.Modelhgfxf;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HotaModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmossy_monster.LAYER_LOCATION, Modelmossy_monster::createBodyLayer);
		event.registerLayerDefinition(Modelhgfxf.LAYER_LOCATION, Modelhgfxf::createBodyLayer);
		event.registerLayerDefinition(Modelsnaryad_ledologa.LAYER_LOCATION, Modelsnaryad_ledologa::createBodyLayer);
		event.registerLayerDefinition(Modeliceologer.LAYER_LOCATION, Modeliceologer::createBodyLayer);
		event.registerLayerDefinition(Modelueue.LAYER_LOCATION, Modelueue::createBodyLayer);
		event.registerLayerDefinition(Modelнекук.LAYER_LOCATION, Modelнекук::createBodyLayer);
	}
}
