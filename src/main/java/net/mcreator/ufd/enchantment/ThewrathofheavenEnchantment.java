
package net.mcreator.ufd.enchantment;

import net.mcreator.ufd.init.HotaModItems;

public class ThewrathofheavenEnchantment extends Enchantment {
	public ThewrathofheavenEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient.of(new ItemStack(HotaModItems.HEAVENLYSWORD.get()), new ItemStack(HotaModItems.HEAVENLYHAMMER.get())).test(itemstack);
	}
}
