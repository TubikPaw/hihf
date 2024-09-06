package net.mcreator.ufd.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.ufd.network.HotaModVariables;
import net.mcreator.ufd.init.HotaModItems;

import java.util.function.Supplier;
import java.util.Map;

public class LuijkgfhasdProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HotaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HotaModVariables.PlayerVariables())).Old_money >= 100) {
			{
				double _setval = (entity.getCapability(HotaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HotaModVariables.PlayerVariables())).Old_money - 100;
				entity.getCapability(HotaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Old_money = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(HotaModItems.ABYSS.get());
				_setstack.setCount(1);
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
