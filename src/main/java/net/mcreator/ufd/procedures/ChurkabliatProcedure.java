package net.mcreator.ufd.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.ufd.init.HotaModItems;

public class ChurkabliatProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (true) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(HotaModItems.GALAXY_CUTTER.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
