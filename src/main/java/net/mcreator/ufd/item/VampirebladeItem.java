
package net.mcreator.ufd.item;

import net.mcreator.ufd.procedures.U9Procedure;

import java.util.List;

public class VampirebladeItem extends SwordItem {
	public VampirebladeItem() {
		super(new Tier() {
			public int getUses() {
				return 15000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, 6f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		U9Procedure.execute(sourceentity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal(
				"\u0427\u0435\u043B\u043E\u0432\u0435\u043A \u043E\u0431\u043B\u0430\u0434\u0430\u044E\u0449\u0438\u0439 \u044D\u0442\u0438\u043C \u043A\u043B\u0438\u043D\u043A\u043E\u043C \u043C\u043E\u0436\u0435\u0442 \u043F\u043E\u0445\u0438\u0449\u0430\u0442\u044C \u0436\u0438\u0437\u043D\u0438 \u0432\u0440\u0430\u0433\u043E\u0432. \u041E\u0441\u0442\u043E\u0440\u043E\u0436\u043D\u043E \u043D\u0435\u043F\u0440\u0430\u0432\u0438\u043B\u044C\u043D\u0430\u044F \u0442\u0435\u0445\u043D\u0438\u043A\u0430 \u0432\u044B \u043C\u043E\u0436\u0435\u0442\u0435 \u0443\u043C\u0435\u0440\u0435\u0442\u044C!"));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
