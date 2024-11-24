
package net.mcreator.ufd.item;

public class LosfoliteswordItem extends SwordItem {
	public LosfoliteswordItem() {
		super(new Tier() {
			public int getUses() {
				return 1560;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2.5f, new Item.Properties());
	}
}
