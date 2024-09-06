
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ufd.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.ufd.client.renderer.VampireRenderer;
import net.mcreator.ufd.client.renderer.ThedarkmonkRenderer;
import net.mcreator.ufd.client.renderer.SwarmoffirefliesRenderer;
import net.mcreator.ufd.client.renderer.ProjectileiceologerRenderer;
import net.mcreator.ufd.client.renderer.PharaohRenderer;
import net.mcreator.ufd.client.renderer.OdditiesTraderRenderer;
import net.mcreator.ufd.client.renderer.MossypigRenderer;
import net.mcreator.ufd.client.renderer.MossyHorrorRenderer;
import net.mcreator.ufd.client.renderer.MechanicaleyeRenderer;
import net.mcreator.ufd.client.renderer.IceologerRenderer;
import net.mcreator.ufd.client.renderer.EyeRenderer;
import net.mcreator.ufd.client.renderer.EntRenderer;
import net.mcreator.ufd.client.renderer.CarnivorousflowerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HotaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HotaModEntities.EYE.get(), EyeRenderer::new);
		event.registerEntityRenderer(HotaModEntities.THEDARKMONK.get(), ThedarkmonkRenderer::new);
		event.registerEntityRenderer(HotaModEntities.MECHANICALEYE.get(), MechanicaleyeRenderer::new);
		event.registerEntityRenderer(HotaModEntities.VAMPIRE.get(), VampireRenderer::new);
		event.registerEntityRenderer(HotaModEntities.ENT.get(), EntRenderer::new);
		event.registerEntityRenderer(HotaModEntities.PHARAOH.get(), PharaohRenderer::new);
		event.registerEntityRenderer(HotaModEntities.CARNIVOROUSFLOWER.get(), CarnivorousflowerRenderer::new);
		event.registerEntityRenderer(HotaModEntities.MOSSYPIG.get(), MossypigRenderer::new);
		event.registerEntityRenderer(HotaModEntities.SWARMOFFIREFLIES.get(), SwarmoffirefliesRenderer::new);
		event.registerEntityRenderer(HotaModEntities.ICEOLOGER.get(), IceologerRenderer::new);
		event.registerEntityRenderer(HotaModEntities.PROJECTILEICEOLOGER.get(), ProjectileiceologerRenderer::new);
		event.registerEntityRenderer(HotaModEntities.SPARKLINGSWORD_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HotaModEntities.TRUEWOODENSWORD_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HotaModEntities.MOSSY_HORROR.get(), MossyHorrorRenderer::new);
		event.registerEntityRenderer(HotaModEntities.ODDITIES_TRADER.get(), OdditiesTraderRenderer::new);
	}
}
