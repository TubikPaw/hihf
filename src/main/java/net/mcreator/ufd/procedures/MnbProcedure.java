package net.mcreator.ufd.procedures;

import net.mcreator.ufd.network.HotaModVariables;

public class MnbProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + (entity.getCapability(HotaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HotaModVariables.PlayerVariables())).Old_money;
	}
}
