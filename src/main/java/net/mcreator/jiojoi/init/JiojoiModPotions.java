
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jiojoi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.jiojoi.JiojoiMod;

public class JiojoiModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, JiojoiMod.MODID);
	public static final RegistryObject<Potion> BASCH = REGISTRY.register("basch", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 0, false, true)));
}
