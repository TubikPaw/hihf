
package net.mcreator.ufd.item;

public class LosfoliteberryItem extends Item {
	public LosfoliteberryItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(6).saturationMod(1f).build()));
	}
}
