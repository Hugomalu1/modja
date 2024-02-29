
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jiojoi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.jiojoi.item.UrolItem;
import net.mcreator.jiojoi.item.KnusperstabchenItem;
import net.mcreator.jiojoi.item.GeolterbackfischItem;
import net.mcreator.jiojoi.item.FischstabchenItem;
import net.mcreator.jiojoi.item.DwagItem;
import net.mcreator.jiojoi.item.BackfischItem;
import net.mcreator.jiojoi.JiojoiMod;

public class JiojoiModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JiojoiMod.MODID);
	public static final RegistryObject<Item> UROL_BUCKET = REGISTRY.register("urol_bucket", () -> new UrolItem());
	public static final RegistryObject<Item> DWAG = REGISTRY.register("dwag", () -> new DwagItem());
	public static final RegistryObject<Item> BACKFISCH = REGISTRY.register("backfisch", () -> new BackfischItem());
	public static final RegistryObject<Item> GEOLTERBACKFISCH = REGISTRY.register("geolterbackfisch", () -> new GeolterbackfischItem());
	public static final RegistryObject<Item> FISCHSTABCHEN = REGISTRY.register("fischstabchen", () -> new FischstabchenItem());
	public static final RegistryObject<Item> KNUSPERSTABCHEN = REGISTRY.register("knusperstabchen", () -> new KnusperstabchenItem());
}
