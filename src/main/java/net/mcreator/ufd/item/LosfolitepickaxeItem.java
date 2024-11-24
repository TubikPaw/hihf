
package net.mcreator.ufd.item;

public class LosfolitepickaxeItem extends PickaxeItem {
	public LosfolitepickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1560;
			}

			public float getSpeed() {
				return 10.5f;
			}

			public float getAttackDamageBonus() {
				return -0.1f;
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
		}, 1, -2.8f, new Item.Properties());
	}
}
