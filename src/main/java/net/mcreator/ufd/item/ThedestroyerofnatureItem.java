
package net.mcreator.ufd.item;

public class ThedestroyerofnatureItem extends SwordItem {
	public ThedestroyerofnatureItem() {
		super(new Tier() {
			public int getUses() {
				return 1590;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return 0.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 1;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -3f, new Item.Properties());
	}
}
