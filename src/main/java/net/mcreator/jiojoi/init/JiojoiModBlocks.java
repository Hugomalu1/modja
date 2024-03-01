
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jiojoi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.jiojoi.block.UrolBlock;
import net.mcreator.jiojoi.block.SteelOreBlock;
import net.mcreator.jiojoi.block.SteelBlockBlock;
import net.mcreator.jiojoi.block.MicroplastickBlock;
import net.mcreator.jiojoi.block.BaumwolleBlock;
import net.mcreator.jiojoi.JiojoiMod;

public class JiojoiModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JiojoiMod.MODID);
	public static final RegistryObject<Block> UROL = REGISTRY.register("urol", () -> new UrolBlock());
	public static final RegistryObject<Block> MICROPLASTICK = REGISTRY.register("microplastick", () -> new MicroplastickBlock());
	public static final RegistryObject<Block> BAUMWOLLE = REGISTRY.register("baumwolle", () -> new BaumwolleBlock());
	public static final RegistryObject<Block> STEEL_ORE = REGISTRY.register("steel_ore", () -> new SteelOreBlock());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
}
