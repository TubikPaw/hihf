
package net.mcreator.ufd.item;

import net.mcreator.ufd.procedures.AncientCoinKazhdyiTikVInvientarieProcedure;

public class AncientCoinItem extends Item {
	public AncientCoinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		AncientCoinKazhdyiTikVInvientarieProcedure.execute(entity);
	}
}
