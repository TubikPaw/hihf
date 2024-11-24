
package net.mcreator.ufd.item;

public class BoiledediblerootsItem extends Item {
	public BoiledediblerootsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(5).saturationMod(4.2f).build()));
	}
}
