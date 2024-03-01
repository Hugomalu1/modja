
package net.mcreator.jiojoi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.network.chat.Component;

import java.util.List;

public class HarpuneItem extends FishingRodItem {
	public HarpuneItem() {
		super(new Item.Properties().durability(100));
	}

	@Override
	public int getEnchantmentValue() {
		return 2;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
