
package net.mcreator.jiojoi.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.jiojoi.init.JiojoiModItems;
import net.mcreator.jiojoi.init.JiojoiModFluids;
import net.mcreator.jiojoi.init.JiojoiModFluidTypes;
import net.mcreator.jiojoi.init.JiojoiModBlocks;

public abstract class UrolFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> JiojoiModFluidTypes.UROL_TYPE.get(), () -> JiojoiModFluids.UROL.get(), () -> JiojoiModFluids.FLOWING_UROL.get()).explosionResistance(100f)
			.tickRate(1).bucket(() -> JiojoiModItems.UROL_BUCKET.get()).block(() -> (LiquidBlock) JiojoiModBlocks.UROL.get());

	private UrolFluid() {
		super(PROPERTIES);
	}

	public static class Source extends UrolFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends UrolFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
