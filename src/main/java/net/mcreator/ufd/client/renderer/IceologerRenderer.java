
package net.mcreator.ufd.client.renderer;

import net.mcreator.ufd.entity.IceologerEntity;
import net.mcreator.ufd.client.model.Modeliceologer;

public class IceologerRenderer extends MobRenderer<IceologerEntity, Modeliceologer<IceologerEntity>> {
	public IceologerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeliceologer(context.bakeLayer(Modeliceologer.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IceologerEntity entity) {
		return new ResourceLocation("hota:textures/entities/ledolog.png");
	}
}
