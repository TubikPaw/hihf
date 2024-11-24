
package net.mcreator.ufd.client.renderer;

import net.mcreator.ufd.entity.VampireEntity;

public class VampireRenderer extends HumanoidMobRenderer<VampireEntity, HumanoidModel<VampireEntity>> {
	public VampireRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(VampireEntity entity) {
		return new ResourceLocation("hota:textures/entities/vampire_nigga.png");
	}
}
