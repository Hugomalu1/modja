
package net.mcreator.jiojoi.recipes.brewing;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.jiojoi.init.SurfinbirdModPotions;
import net.mcreator.jiojoi.init.SurfinbirdModItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BdbffbdfdbdBrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> BrewingRecipeRegistry.addRecipe(new BdbffbdfdbdBrewingRecipe()));
	}

	@Override
	public boolean isInput(ItemStack input) {
		Item inputItem = input.getItem();
		return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION) && PotionUtils.getPotion(input) == SurfinbirdModPotions.BASCH.get();
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(new ItemStack(SurfinbirdModItems.GESCHMOLZENESMICROPLASTICK.get())).test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return new ItemStack(SurfinbirdModItems.GESCHMOLZENESMICROPLASTICK.get());
		}
		return ItemStack.EMPTY;
	}
}
