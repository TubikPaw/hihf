
package net.mcreator.ufd.item;

public class CherryItem extends Item {
	public CherryItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.3f).build()));
	}
}
