
package net.mcreator.ufd.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.ufd.procedures.GrrProcedure;

import java.util.List;

public class KatanaofDeathItem extends SwordItem {
	public KatanaofDeathItem() {
		super(new Tier() {
			public int getUses() {
				return 212;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 48f;
			}

			public int getLevel() {
				return 12;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, 50f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		GrrProcedure.execute(entity.level(), sourceentity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal(
				"\u0423\u043B\u0443\u0447\u0448\u0435\u043D\u043D\u0430\u044F \u0432\u0435\u0440\u0441\u0438\u044F \u0412\u0430\u043C\u043F\u0438\u0440\u0441\u043A\u043E\u0433\u043E \u043A\u043B\u0438\u043D\u043A\u0430! \u0412\u044B \u043C\u043E\u0436\u0435\u0442\u0435 \u0443\u043A\u0440\u0430\u0441\u0442\u044C \u0436\u0438\u0437\u043D\u044C \u0432\u0440\u0430\u0433\u0430. \u0415\u0441\u043B\u0438 \u043D\u0435\u043F\u0440\u0430\u0432\u0438\u043B\u044C\u043D\u043E \u0438\u0441\u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u044C \u044D\u0442\u043E \u043E\u0440\u0443\u0436\u0438\u0435 \u0441\u043C\u0435\u0440\u0442\u0438 \u0442\u043E \u0432\u044B \u043C\u043E\u043C\u0435\u043D\u0442\u0430\u043B\u044C\u043D\u043E \u043F\u043E\u043F\u0440\u0430\u0449\u0430\u0435\u0442\u0435\u0441\u044C \u0441\u043E \u0441\u0432\u043E\u0435\u0439 \u0436\u0430\u043B\u043A\u043E\u0439 \u0436\u0438\u0437\u044C\u044E!"));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
