
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jiojoi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.jiojoi.potion.BaMobEffect;
import net.mcreator.jiojoi.JiojoiMod;

public class JiojoiModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, JiojoiMod.MODID);
	public static final RegistryObject<MobEffect> BA = REGISTRY.register("ba", () -> new BaMobEffect());
}
