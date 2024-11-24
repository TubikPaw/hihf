
package net.mcreator.ufd.item;

public class RaspberryItem extends Item {
	public RaspberryItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.3f).build()));
	}
}
