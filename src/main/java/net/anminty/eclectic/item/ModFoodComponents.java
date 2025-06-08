package net.anminty.eclectic.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent TEAR = new FoodComponent.Builder().nutrition(6).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200), 1f).build();
}
