
package net.mcreator.ufd.item;

public class BlackberryItem extends Item {
	public BlackberryItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.3f).build()));
	}
}
