
package net.mcreator.ufd.item;

public class DarkmetalshovelItem extends ShovelItem {
	public DarkmetalshovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1350;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 4;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -3f, new Item.Properties());
	}
}
