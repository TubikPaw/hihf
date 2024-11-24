
package net.mcreator.ufd.item;

import java.util.List;

public class HeartentItem extends Item {
	public HeartentItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u0421\u0435\u0440\u0434\u0446\u0435 \u0432\u0435\u043B\u0438\u043A\u043E\u0433\u043E \u0445\u043E\u0437\u044F\u0438\u043D\u0430 \u043B\u0435\u0441\u043E\u0432."));
	}
}
