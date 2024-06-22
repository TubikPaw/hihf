
package net.mcreator.ufd.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.ufd.entity.MechanicaleyeEntity;
import net.mcreator.ufd.client.model.Modelhgfxf;

public class MechanicaleyeRenderer extends MobRenderer<MechanicaleyeEntity, Modelhgfxf<MechanicaleyeEntity>> {
	public MechanicaleyeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhgfxf(context.bakeLayer(Modelhgfxf.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(MechanicaleyeEntity entity) {
		return new ResourceLocation("hota:textures/entities/texture321312.png");
	}
}
