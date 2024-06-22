// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

public static class ModelVAMPIRE extends EntityModel<Entity> {
	private final ModelRenderer r_leg;
	private final ModelRenderer l_leg;
	private final ModelRenderer body;
	private final ModelRenderer l_ruka;
	private final ModelRenderer r_ruka;
	private final ModelRenderer head;

	public ModelVAMPIRE() {
		texWidth = 32;
		texHeight = 32;

		r_leg = new ModelRenderer(this);
		r_leg.setPos(0.0F, 24.0F, 0.0F);
		r_leg.texOffs(8, 17).addBox(0.0F, -7.15F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		l_leg = new ModelRenderer(this);
		l_leg.setPos(0.0F, 0.0F, 0.0F);
		r_leg.addChild(l_leg);
		l_leg.texOffs(16, 17).addBox(-2.0F, -7.15F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 24.0F, 0.0F);
		body.texOffs(0, 8).addBox(-2.0F, -14.0F, -1.0F, 4.0F, 7.0F, 2.0F, 0.0F, false);

		l_ruka = new ModelRenderer(this);
		l_ruka.setPos(0.0F, 24.0F, 0.0F);
		l_ruka.texOffs(0, 17).addBox(-4.0F, -14.15F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		r_ruka = new ModelRenderer(this);
		r_ruka.setPos(0.0F, 0.0F, 0.0F);
		l_ruka.addChild(r_ruka);
		r_ruka.texOffs(12, 8).addBox(2.0F, -14.15F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		r_ruka.addChild(head);
		head.texOffs(0, 0).addBox(-2.0F, -18.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		r_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		l_ruka.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.r_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.l_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.l_ruka.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.r_ruka.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}