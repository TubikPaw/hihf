// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelrewq extends EntityModel<Entity> {
	private final ModelRenderer r_arm;
	private final ModelRenderer l_leg;
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer r_leg;
	private final ModelRenderer body;
	private final ModelRenderer l_arm;

	public Modelrewq() {
		textureWidth = 64;
		textureHeight = 64;

		r_arm = new ModelRenderer(this);
		r_arm.setRotationPoint(-4.0F, 4.0F, 0.0F);
		r_arm.setTextureOffset(0, 30).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 10.0F, 4.0F, 0.0F, false);

		l_leg = new ModelRenderer(this);
		l_leg.setRotationPoint(2.0F, 14.0F, 0.0F);
		l_leg.setTextureOffset(14, 30).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 10.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 4.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 3.1416F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		r_leg = new ModelRenderer(this);
		r_leg.setRotationPoint(-2.0F, 14.0F, 0.0F);
		r_leg.setTextureOffset(30, 26).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 10.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 8.0F, 0.0F);
		setRotationAngle(body, 0.0F, 3.1416F, 0.0F);
		body.setTextureOffset(0, 16).addBox(-3.0F, -4.0F, -2.0F, 6.0F, 10.0F, 4.0F, 0.0F, false);

		l_arm = new ModelRenderer(this);
		l_arm.setRotationPoint(4.0F, 4.0F, 0.0F);
		l_arm.setTextureOffset(20, 16).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 10.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		r_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		l_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		r_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		l_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.r_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.l_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.l_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.r_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}