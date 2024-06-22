
package net.mcreator.ufd.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ufd.entity.EyeEntity;
import net.mcreator.ufd.client.model.Modelhgfxf;

public class EyeRenderer extends MobRenderer<EyeEntity, Modelhgfxf<EyeEntity>> {
	public EyeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhgfxf(context.bakeLayer(Modelhgfxf.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EyeEntity entity) {
		return new ResourceLocation("hota:textures/entities/texture3232.png");
	}
}
