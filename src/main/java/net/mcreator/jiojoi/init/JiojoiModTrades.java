
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.jiojoi.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class JiojoiModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.LEATHERWORKER) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(Items.BUCKET), new ItemStack(JiojoiModItems.UROL_BUCKET.get()), 20, 15, 1f));
		}
	}
}
