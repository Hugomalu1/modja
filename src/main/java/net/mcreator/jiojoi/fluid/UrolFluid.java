
package net.mcreator.jiojoi.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.jiojoi.init.SurfinbirdModItems;
import net.mcreator.jiojoi.init.SurfinbirdModFluids;
import net.mcreator.jiojoi.init.SurfinbirdModFluidTypes;
import net.mcreator.jiojoi.init.SurfinbirdModBlocks;

public abstract class UrolFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> SurfinbirdModFluidTypes.UROL_TYPE.get(), () -> SurfinbirdModFluids.UROL.get(), () -> SurfinbirdModFluids.FLOWING_UROL.get())
			.explosionResistance(100f).tickRate(1).bucket(() -> SurfinbirdModItems.UROL_BUCKET.get()).block(() -> (LiquidBlock) SurfinbirdModBlocks.UROL.get());

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
