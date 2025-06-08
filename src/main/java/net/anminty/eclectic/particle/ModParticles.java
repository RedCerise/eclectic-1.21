package net.anminty.eclectic.particle;

import net.anminty.eclectic.Eclectic;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {

    public static final SimpleParticleType EYE_PARTICLE =
            registerParticle("eye_particle", FabricParticleTypes.simple());

    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType){
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(Eclectic.MOD_ID, name), particleType);
    }
    public static void registerParticles() {
        Eclectic.LOGGER.info("Registering Particles for " + Eclectic.MOD_ID);


    }
}
