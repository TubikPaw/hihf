
package net.mcreator.ufd.client.renderer;

import net.mcreator.ufd.entity.EntEntity;

public class EntRenderer extends HumanoidMobRenderer<EntEntity, HumanoidModel<EntEntity>> {
	public EntRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(EntEntity entity) {
		return new ResourceLocation("hota:textures/entities/wise-old-ent-spellbound-garden-skin-contest-1-8-on-planetminecraft-com.png");
	}
}
