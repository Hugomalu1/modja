package net.mcreator.jiojoi.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class HhProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		itemstack.grow(1);
		if (entity instanceof Player _player) {
			_player.getAbilities().mayfly = true;
			_player.onUpdateAbilities();
		}
	}
}
