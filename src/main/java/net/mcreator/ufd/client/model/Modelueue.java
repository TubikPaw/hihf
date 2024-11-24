package net.mcreator.ufd.client.model;

// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelueue<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("hota", "modelueue"), "main");
	public final ModelPart All;

	public Modelueue(ModelPart root) {
		this.All = root.getChild("All");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition All = partdefinition.addOrReplaceChild("All",
				CubeListBuilder.create().texOffs(8, 9).addBox(6.0F, -2.0F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(4.0F, -3.0F, 5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 6)
						.addBox(-5.0F, -6.0F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 3).addBox(-8.0F, -2.0F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 10)
						.addBox(4.1F, -10.0F, 3.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 0).addBox(0.0F, -9.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 7)
						.addBox(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(0.0F, -5.0F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 4)
						.addBox(-4.0F, -9.0F, -9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 1).addBox(6.0F, -10.0F, -6.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-6.0F, -5.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(6.0F, -5.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 17.0F, -1.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		All.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
