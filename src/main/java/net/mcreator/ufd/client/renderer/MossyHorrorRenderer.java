
package net.mcreator.ufd.client.renderer;

import net.mcreator.ufd.entity.MossyHorrorEntity;
import net.mcreator.ufd.client.model.Modelmossy_monster;

public class MossyHorrorRenderer extends MobRenderer<MossyHorrorEntity, Modelmossy_monster<MossyHorrorEntity>> {
	public MossyHorrorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmossy_monster(context.bakeLayer(Modelmossy_monster.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MossyHorrorEntity entity) {
		return new ResourceLocation("hota:textures/entities/mossy_monster.png");
	}
}
