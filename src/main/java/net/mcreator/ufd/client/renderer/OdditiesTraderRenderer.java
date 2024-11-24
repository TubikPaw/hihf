
package net.mcreator.ufd.client.renderer;

import net.mcreator.ufd.entity.OdditiesTraderEntity;

public class OdditiesTraderRenderer extends HumanoidMobRenderer<OdditiesTraderEntity, HumanoidModel<OdditiesTraderEntity>> {
	public OdditiesTraderRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(OdditiesTraderEntity entity) {
		return new ResourceLocation("hota:textures/entities/male-wandering-trader-outfit-on-planetminecraft-com.png");
	}
}
