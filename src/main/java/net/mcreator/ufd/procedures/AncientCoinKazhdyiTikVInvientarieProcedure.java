package net.mcreator.ufd.procedures;

import net.mcreator.ufd.network.HotaModVariables;
import net.mcreator.ufd.init.HotaModItems;

public class AncientCoinKazhdyiTikVInvientarieProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(HotaModItems.ANCIENT_COIN.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		{
			double _setval = (entity.getCapability(HotaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HotaModVariables.PlayerVariables())).Old_money + 1;
			entity.getCapability(HotaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Old_money = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
