// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

public static class Modelblood_sword extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer bb_main;

	public Modelblood_sword() {
		texWidth = 16;
		texHeight = 16;

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, 24.0F, 0.0F);
		bone.texOffs(0, 0).addBox(-3.0F, -3.0F, -1.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		bone.texOffs(0, 6).addBox(-4.0F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.texOffs(4, 6).addBox(-5.0F, -3.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.texOffs(8, 6).addBox(-6.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.texOffs(0, 4).addBox(1.0F, -3.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}