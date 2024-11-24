
package net.mcreator.ufd.item;

public class SandwichItem extends Item {
	public SandwichItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.6f).build()));
	}
}
