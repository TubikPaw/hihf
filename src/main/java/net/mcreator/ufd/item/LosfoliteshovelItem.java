
package net.mcreator.ufd.item;

public class LosfoliteshovelItem extends ShovelItem {
	public LosfoliteshovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1560;
			}

			public float getSpeed() {
				return 10.5f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -3f, new Item.Properties());
	}
}
