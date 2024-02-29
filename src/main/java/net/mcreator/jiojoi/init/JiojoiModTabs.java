
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jiojoi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.jiojoi.JiojoiMod;

public class JiojoiModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JiojoiMod.MODID);
	public static final RegistryObject<CreativeModeTab> UROLINDUSTRY = REGISTRY.register("urolindustry",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.jiojoi.urolindustry")).icon(() -> new ItemStack(JiojoiModItems.UROL_BUCKET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(JiojoiModItems.BACKFISCH.get());
				tabData.accept(JiojoiModItems.GEOLTERBACKFISCH.get());
				tabData.accept(JiojoiModItems.FISCHSTABCHEN.get());
				tabData.accept(JiojoiModItems.KNUSPERSTABCHEN.get());
			}).withSearchBar().build());
}
