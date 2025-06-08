package net.anminty.eclectic;

import net.anminty.eclectic.particle.EyeParticle;
import net.anminty.eclectic.particle.ModParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

public class EclecticClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(ModParticles.EYE_PARTICLE, EyeParticle.Factory::new);
    }
}
