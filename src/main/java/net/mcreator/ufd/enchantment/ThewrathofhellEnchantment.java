
package net.mcreator.ufd.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.ufd.init.HotaModItems;

public class ThewrathofhellEnchantment extends Enchantment {
	public ThewrathofhellEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient.of(new ItemStack(HotaModItems.INFERNALSWORD.get()), new ItemStack(HotaModItems.INFERNALHAMMER.get())).test(itemstack);
	}
}
