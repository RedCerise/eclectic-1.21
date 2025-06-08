package net.anminty.eclectic;

import net.anminty.eclectic.block.ModBlocks;
import net.anminty.eclectic.item.ModItemGroups;
import net.anminty.eclectic.item.ModItems;
import net.anminty.eclectic.particle.ModParticles;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Eclectic implements ModInitializer {
	public static final String MOD_ID = "eclectic";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

		FuelRegistry.INSTANCE.add(ModItems.JUNK, 150);

		ModParticles.registerParticles();
	}
}