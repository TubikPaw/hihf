
package net.mcreator.ufd.item;

public class DarkmetalswordItem extends SwordItem {
	public DarkmetalswordItem() {
		super(new Tier() {
			public int getUses() {
				return 1350;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2.3f, new Item.Properties());
	}
}
