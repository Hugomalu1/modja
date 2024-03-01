
package net.mcreator.jiojoi.item.extension;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.dispenser.OptionalDispenseItemBehavior;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockSource;

import net.mcreator.jiojoi.init.SurfinbirdModItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IdkItemExtension {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> DispenserBlock.registerBehavior(SurfinbirdModItems.FEUERSTABCHEN.get(), new OptionalDispenseItemBehavior() {
			public ItemStack execute(BlockSource blockSource, ItemStack stack) {
				ItemStack itemstack = stack.copy();
				Level world = blockSource.getLevel();
				Direction direction = blockSource.getBlockState().getValue(DispenserBlock.FACING);
				int x = blockSource.getPos().getX();
				int y = blockSource.getPos().getY();
				int z = blockSource.getPos().getZ();
				itemstack.shrink(1);
				return itemstack;
			}
		}));
	}
}
