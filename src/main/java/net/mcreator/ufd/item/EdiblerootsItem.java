
package net.mcreator.ufd.item;

public class EdiblerootsItem extends Item {
	public EdiblerootsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(1.5f).build()));
	}
}
