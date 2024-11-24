package net.mcreator.ufd.client.gui;

import net.mcreator.ufd.world.inventory.UkayvMenu;
import net.mcreator.ufd.network.UkayvButtonMessage;
import net.mcreator.ufd.HotaMod;

import java.util.HashMap;

public class UkayvScreen extends AbstractContainerScreen<UkayvMenu> {
	private final static HashMap<String, Object> guistate = UkayvMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_cook;

	public UkayvScreen(UkayvMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 178;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("hota:textures/screens/ukayv.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("hota:textures/screens/untitled_03-29-2024_10-15-30.png"), this.leftPos + 0, this.topPos + -88, 0, 0, 176, 166, 176, 166);

		guiGraphics.blit(new ResourceLocation("hota:textures/screens/untitled_03-28-2024_07-51-56_1.png"), this.leftPos + 24, this.topPos + -52, 0, 0, 128, 128, 128, 128);

		guiGraphics.blit(new ResourceLocation("hota:textures/screens/fcge8.png"), this.leftPos + 139, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("hota:textures/screens/fcge8.png"), this.leftPos + 14, this.topPos + 0, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("hota:textures/screens/fcge8.png"), this.leftPos + 80, this.topPos + -19, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.hota.ukayv.label_beta"), 77, 29, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_cook = Button.builder(Component.translatable("gui.hota.ukayv.button_cook"), e -> {
			if (true) {
				HotaMod.PACKET_HANDLER.sendToServer(new UkayvButtonMessage(0, x, y, z));
				UkayvButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 62, this.topPos + 56, 46, 20).build();
		guistate.put("button:button_cook", button_cook);
		this.addRenderableWidget(button_cook);
	}
}
