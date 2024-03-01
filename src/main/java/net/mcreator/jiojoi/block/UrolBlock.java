
package net.mcreator.jiojoi.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.jiojoi.init.SurfinbirdModFluids;

public class UrolBlock extends LiquidBlock {
	public UrolBlock() {
		super(() -> SurfinbirdModFluids.UROL.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).lightLevel(s -> 3).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
