package net.anminty.eclectic.item.custom;

import net.anminty.eclectic.particle.ModParticles;
import net.minecraft.enchantment.effect.entity.ApplyMobEffectEnchantmentEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.random.RandomGenerator;


public class ParticleItem extends Item {
    public ParticleItem(Settings settings) {
        super(settings);
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        user.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 200, 1,
                true, false, false));
        for (int i = 0; i < 64; i++) {
            world.addParticle(
                    ModParticles.EYE_PARTICLE,
                    RandomGenerator.getDefault().nextDouble(user.getPos().getX()-3, user.getPos().getX()+3f),
                    RandomGenerator.getDefault().nextDouble(user.getPos().getY()-3, user.getPos().getY()+3f),
                    RandomGenerator.getDefault().nextDouble(user.getPos().getZ()-3, user.getPos().getZ()+3f),
                    Random.create().nextGaussian() * 1.1,
                    Random.create().nextGaussian() * 1.1,
                    Random.create().nextGaussian() * 1.1
            );
            user.getItemCooldownManager().set(this, 100);
        }

        return super.use(world, user, hand);
    }
}
