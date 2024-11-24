
package net.mcreator.ufd.client.renderer;

import net.mcreator.ufd.entity.CarnivorousflowerEntity;
import net.mcreator.ufd.client.model.Modelнекук;

public class CarnivorousflowerRenderer extends MobRenderer<CarnivorousflowerEntity, Modelнекук<CarnivorousflowerEntity>> {
	public CarnivorousflowerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelнекук(context.bakeLayer(Modelнекук.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CarnivorousflowerEntity entity) {
		return new ResourceLocation("hota:textures/entities/texrpyfgh8.png");
	}
}
