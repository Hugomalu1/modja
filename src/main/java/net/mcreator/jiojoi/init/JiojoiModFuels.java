
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jiojoi.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class JiojoiModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == JiojoiModItems.FEUERSTABCHEN.get())
			event.setBurnTime(2647);
	}
}
