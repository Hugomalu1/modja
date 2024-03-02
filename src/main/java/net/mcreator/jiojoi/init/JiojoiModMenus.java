
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jiojoi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.jiojoi.world.inventory.FritoseMenu;
import net.mcreator.jiojoi.JiojoiMod;

public class JiojoiModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, JiojoiMod.MODID);
	public static final RegistryObject<MenuType<FritoseMenu>> FRITOSE = REGISTRY.register("fritose", () -> IForgeMenuType.create(FritoseMenu::new));
}
