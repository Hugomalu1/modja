
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

import net.mcreator.jiojoi.SurfinbirdMod;

public class SurfinbirdModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SurfinbirdMod.MODID);
	public static final RegistryObject<CreativeModeTab> UROLINDUSTRY = REGISTRY.register("urolindustry",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.surfinbird.urolindustry")).icon(() -> new ItemStack(SurfinbirdModItems.UROL_BUCKET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SurfinbirdModItems.UROL_BUCKET.get());
				tabData.accept(SurfinbirdModItems.BACKFISCH.get());
				tabData.accept(SurfinbirdModItems.GEOLTERBACKFISCH.get());
				tabData.accept(SurfinbirdModItems.FISCHSTABCHEN.get());
				tabData.accept(SurfinbirdModItems.KNUSPERSTABCHEN.get());
				tabData.accept(SurfinbirdModItems.ZIEGELSTABCHEN.get());
				tabData.accept(SurfinbirdModItems.KOHLESTABCHEN.get());
				tabData.accept(SurfinbirdModItems.FEUERSTABCHEN.get());
				tabData.accept(SurfinbirdModBlocks.MICROPLASTICK.get().asItem());
				tabData.accept(SurfinbirdModItems.MICROPLASTICKFRAGMENT.get());
				tabData.accept(SurfinbirdModItems.GESCHMOLZENESMICROPLASTICK.get());
				tabData.accept(SurfinbirdModBlocks.BAUMWOLLE.get().asItem());
				tabData.accept(SurfinbirdModItems.STOFF.get());
				tabData.accept(SurfinbirdModItems.TASCHENLAMPE.get());
				tabData.accept(SurfinbirdModBlocks.STEEL_ORE.get().asItem());
				tabData.accept(SurfinbirdModBlocks.STEEL_BLOCK.get().asItem());
				tabData.accept(SurfinbirdModItems.STEEL_INGOT.get());
				tabData.accept(SurfinbirdModItems.SUNGLASSES.get());
				tabData.accept(SurfinbirdModItems.BLACKMELTEDMICROPLASTICK.get());
				tabData.accept(SurfinbirdModItems.BLUEMELTEDMICROPLASTICK.get());
				tabData.accept(SurfinbirdModItems.REDMELTEDMICROPLASTICK.get());
				tabData.accept(SurfinbirdModItems.GOLDCHAIN.get());
				tabData.accept(SurfinbirdModItems.DIPAR.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> FISH = REGISTRY.register("fish",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.surfinbird.fish")).icon(() -> new ItemStack(SurfinbirdModItems.BARSCH.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SurfinbirdModItems.BARSCH.get());
				tabData.accept(SurfinbirdModItems.NAMNAMGEKOCHTERBARSH.get());
				tabData.accept(SurfinbirdModItems.HECHT.get());
				tabData.accept(SurfinbirdModItems.GEKOCHTERHECHT.get());
				tabData.accept(SurfinbirdModItems.HALFEF.get());
				tabData.accept(SurfinbirdModItems.GRETTNE.get());
				tabData.accept(SurfinbirdModItems.DAWDAW.get());
				tabData.accept(SurfinbirdModItems.PROFISHINGROD.get());
				tabData.accept(SurfinbirdModItems.PURLPELGULPER.get());
				tabData.accept(SurfinbirdModItems.FRIEDPURPELGULPER.get());
				tabData.accept(SurfinbirdModItems.HARPUNE.get());
				tabData.accept(SurfinbirdModItems.SHRIMP.get());
				tabData.accept(SurfinbirdModItems.FRIEDSHRIMP.get());
				tabData.accept(SurfinbirdModItems.SHRIMPSHELL.get());
				tabData.accept(SurfinbirdModItems.TURTEL.get());
				tabData.accept(SurfinbirdModItems.Z_ZZZZZAAAAH_TURTEL.get());
			}).withSearchBar().build());
}
