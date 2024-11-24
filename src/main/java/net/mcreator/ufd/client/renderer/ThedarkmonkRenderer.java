
package net.mcreator.ufd.client.renderer;

import net.mcreator.ufd.entity.ThedarkmonkEntity;

public class ThedarkmonkRenderer extends HumanoidMobRenderer<ThedarkmonkEntity, HumanoidModel<ThedarkmonkEntity>> {
	public ThedarkmonkRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(ThedarkmonkEntity entity) {
		return new ResourceLocation("hota:textures/entities/vampire.png");
	}
}
