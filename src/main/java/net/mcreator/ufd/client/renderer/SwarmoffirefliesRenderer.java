
package net.mcreator.ufd.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.ufd.entity.SwarmoffirefliesEntity;
import net.mcreator.ufd.client.model.Modelueue;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SwarmoffirefliesRenderer extends MobRenderer<SwarmoffirefliesEntity, Modelueue<SwarmoffirefliesEntity>> {
	public SwarmoffirefliesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelueue(context.bakeLayer(Modelueue.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<SwarmoffirefliesEntity, Modelueue<SwarmoffirefliesEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("hota:textures/entities/oghvnu.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, SwarmoffirefliesEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SwarmoffirefliesEntity entity) {
		return new ResourceLocation("hota:textures/entities/cdjdw.png");
	}
}
