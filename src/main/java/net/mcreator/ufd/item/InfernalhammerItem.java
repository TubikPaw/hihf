
package net.mcreator.ufd.item;

public class InfernalhammerItem extends PickaxeItem {
	public InfernalhammerItem() {
		super(new Tier() {
			public int getUses() {
				return 5900;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -3f, new Item.Properties());
	}
}
