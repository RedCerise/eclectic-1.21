package net.anminty.eclectic.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class ScytheItem extends SwordItem {
    public ScytheItem(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postDamageEntity(stack, target, attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 60, 1,
                false, true, true));
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        if(Screen.hasShiftDown()){
            tooltip.add(Text.of("§8This weapon applies poison on hit§r"));
        } else {
            tooltip.add(Text.of("§8§oPress SHIFT for more info§r"));
        }
        super.appendTooltip(stack, context, tooltip, options);
    }
}
