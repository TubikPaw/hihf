
package net.mcreator.ufd.client.renderer;

import net.mcreator.ufd.entity.ProjectileiceologerEntity;
import net.mcreator.ufd.client.model.Modelsnaryad_ledologa;

public class ProjectileiceologerRenderer extends MobRenderer<ProjectileiceologerEntity, Modelsnaryad_ledologa<ProjectileiceologerEntity>> {
	public ProjectileiceologerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnaryad_ledologa(context.bakeLayer(Modelsnaryad_ledologa.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ProjectileiceologerEntity entity) {
		return new ResourceLocation("hota:textures/entities/123.png");
	}
}
