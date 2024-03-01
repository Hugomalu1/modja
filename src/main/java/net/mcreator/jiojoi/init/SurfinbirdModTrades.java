
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
public class SurfinbirdModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.LEATHERWORKER) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(Items.BUCKET), new ItemStack(SurfinbirdModItems.UROL_BUCKET.get()), 20, 15, 1f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6),

					new ItemStack(SurfinbirdModItems.BARSCH.get(), 3), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 12),

					new ItemStack(SurfinbirdModItems.HECHT.get(), 2), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(SurfinbirdModItems.GRETTNE.get(), 10),

					new ItemStack(Items.EMERALD, 3), 20, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.GLOWSTONE_DUST, 5), new ItemStack(SurfinbirdModItems.PURLPELGULPER.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 12),

					new ItemStack(SurfinbirdModItems.SHRIMP.get(), 6), 10, 5, 0.05f));
		}
	}
}
