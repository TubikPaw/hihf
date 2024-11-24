
package net.mcreator.ufd.item;

import net.mcreator.ufd.procedures.DfdfsfsdfdsProcedure;

public class ThundertridentItem extends SwordItem {
	public ThundertridentItem() {
		super(new Tier() {
			public int getUses() {
				return 1564;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.TRIDENT));
			}
		}, 3, 5.5f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		DfdfsfsdfdsProcedure.execute(entity, sourceentity);
		return retval;
	}
}
