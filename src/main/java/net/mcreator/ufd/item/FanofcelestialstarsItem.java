
package net.mcreator.ufd.item;

import java.util.List;

public class FanofcelestialstarsItem extends SwordItem {
	public FanofcelestialstarsItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 46f;
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
		}, 3, -3f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal(
				"\u0417\u0432\u0451\u0437\u0434\u043D\u0430\u044F \u0441\u0438\u043B\u0430 \u043E\u0431\u043B\u0430\u0434\u0430\u044E\u0449\u0438\u043C \u044D\u0442\u0438\u043C \u043E\u0440\u0443\u0434\u0438\u0435\u043C \u0441\u043C\u0435\u0440\u0442\u0438... \u041D\u0430\u0434\u0435\u044E\u0441\u044C"));
		list.add(Component.literal("\u0430 \u0445\u043E\u0442\u044F \u043A\u043E\u0441\u043C\u043E\u0441 \u044D\u0442\u043E \u043A\u0440\u0443\u0442\u043E! \u0414\u0430?"));
	}
}
