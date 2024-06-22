
package net.mcreator.ufd.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

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
