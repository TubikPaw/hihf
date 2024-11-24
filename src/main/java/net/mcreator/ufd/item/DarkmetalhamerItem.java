
package net.mcreator.ufd.item;

public class DarkmetalhamerItem extends PickaxeItem {
	public DarkmetalhamerItem() {
		super(new Tier() {
			public int getUses() {
				return 1350;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -3f, new Item.Properties());
	}
}
