
package net.mcreator.ufd.client.renderer;

import net.mcreator.ufd.entity.MossypigEntity;

public class MossypigRenderer extends MobRenderer<MossypigEntity, PigModel<MossypigEntity>> {
	public MossypigRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MossypigEntity entity) {
		return new ResourceLocation("hota:textures/entities/muddy_pig.png");
	}
}
