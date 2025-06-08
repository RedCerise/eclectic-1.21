package net.anminty.eclectic.particle;

import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;
import org.jetbrains.annotations.Nullable;

import java.util.random.RandomGenerator;

public class EyeParticle extends SpriteBillboardParticle {
    public EyeParticle(ClientWorld clientWorld, double x, double y, double z,
                       SpriteProvider spriteProvider, double Xspeed, double Yspeed, double Zspeed) {
        super(clientWorld, x, y, z, Xspeed, Yspeed, Zspeed);

        this.maxAge = RandomGenerator.getDefault().nextInt(60, 120);
        this.velocityMultiplier = 0.9f;
        this.scale = RandomGenerator.getDefault().nextFloat(0.2f, 0.6f);

        this.setSpriteForAge(spriteProvider);
    }



    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }


    public static class Factory implements ParticleFactory<SimpleParticleType>{
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public @Nullable Particle createParticle(SimpleParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            return new EyeParticle(world, x, y, z, this.spriteProvider, velocityX, velocityY, velocityZ);
        }
    }
}
