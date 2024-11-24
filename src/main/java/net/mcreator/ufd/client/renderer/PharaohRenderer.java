
package net.mcreator.ufd.client.renderer;

import net.mcreator.ufd.entity.PharaohEntity;

public class PharaohRenderer extends HumanoidMobRenderer<PharaohEntity, HumanoidModel<PharaohEntity>> {
	public PharaohRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(PharaohEntity entity) {
		return new ResourceLocation("hota:textures/entities/pharaoh_mummy.png");
	}
}
