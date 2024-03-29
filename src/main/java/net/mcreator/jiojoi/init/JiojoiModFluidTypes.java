
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jiojoi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.jiojoi.fluid.types.UrolFluidType;
import net.mcreator.jiojoi.JiojoiMod;

public class JiojoiModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, JiojoiMod.MODID);
	public static final RegistryObject<FluidType> UROL_TYPE = REGISTRY.register("urol", () -> new UrolFluidType());
}
