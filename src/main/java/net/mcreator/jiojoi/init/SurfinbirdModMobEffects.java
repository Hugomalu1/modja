
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jiojoi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.jiojoi.potion.BaMobEffect;
import net.mcreator.jiojoi.SurfinbirdMod;

public class SurfinbirdModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SurfinbirdMod.MODID);
	public static final RegistryObject<MobEffect> BA = REGISTRY.register("ba", () -> new BaMobEffect());
}
