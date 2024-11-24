
package net.mcreator.ufd.enchantment;

public class GodbloodEnchantment extends Enchantment {
	public GodbloodEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 2;
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
