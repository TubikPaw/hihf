
package net.mcreator.ufd.client.renderer;

import net.mcreator.ufd.entity.SwarmoffirefliesEntity;
import net.mcreator.ufd.client.model.Modelueue;

public class SwarmoffirefliesRenderer extends MobRenderer<SwarmoffirefliesEntity, Modelueue<SwarmoffirefliesEntity>> {
	public SwarmoffirefliesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelueue(context.bakeLayer(Modelueue.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<SwarmoffirefliesEntity, Modelueue<SwarmoffirefliesEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("hota:textures/entities/oghvnu.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, SwarmoffirefliesEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SwarmoffirefliesEntity entity) {
		return new ResourceLocation("hota:textures/entities/cdjdw.png");
	}
}
