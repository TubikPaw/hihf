// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;

	public Modelcustom_model() {
		texWidth = 256;
		texHeight = 256;

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, 24.0F, 0.0F);
		bone.texOffs(0, 95).addBox(-17.0F, -15.0F, -27.0F, 34.0F, 11.0F, 2.0F, 0.0F, false);
		bone.texOffs(0, 0).addBox(-24.0F, -47.0F, -24.0F, 48.0F, 47.0F, 48.0F, 0.0F, false);
		bone.texOffs(72, 95).addBox(-10.0F, -38.0F, -29.0F, 21.0F, 21.0F, 5.0F, 0.0F, false);
		bone.texOffs(0, 30).addBox(-5.0F, -34.0F, -30.0F, 11.0F, 11.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
		cube_r1.texOffs(0, 108).addBox(-24.0F, -69.0F, 0.0F, 9.0F, 22.0F, 8.0F, 0.0F, false);
		cube_r1.texOffs(0, 0).addBox(15.0F, -69.0F, 0.0F, 9.0F, 22.0F, 8.0F, 0.0F, false);
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
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}