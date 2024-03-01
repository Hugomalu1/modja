
package net.mcreator.jiojoi.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class BaMobEffect extends MobEffect {
	public BaMobEffect() {
		super(MobEffectCategory.HARMFUL, -11717054);
	}

	@Override
	public String getDescriptionId() {
		return "effect.surfinbird.ba";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
