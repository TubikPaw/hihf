
package net.mcreator.ufd.item;

public class ConcertoftheancientsItem extends RecordItem {
	public ConcertoftheancientsItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("hota:concert_of_the_ancients")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 0);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
