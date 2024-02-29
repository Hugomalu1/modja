
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jiojoi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.jiojoi.item.DwagItem;
import net.mcreator.jiojoi.JiojoiMod;

public class JiojoiModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JiojoiMod.MODID);
	public static final RegistryObject<Item> DWAG = REGISTRY.register("dwag", () -> new DwagItem());
}
