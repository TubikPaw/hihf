
package net.mcreator.ufd.item;

public class ChargedmetaloftheancientsItem extends Item {
	public ChargedmetaloftheancientsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
