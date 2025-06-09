package net.anminty.eclectic.datagen;

import net.anminty.eclectic.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PINK_BLOCK);
        addDrop(ModBlocks.BOOST_BLOCK);

        addDrop(ModBlocks.PINK_STAIRS);
        addDrop(ModBlocks.PINK_WALL);
        addDrop(ModBlocks.PINK_FENCE);
        addDrop(ModBlocks.PINK_FENCE_GATE);
        addDrop(ModBlocks.PINK_BUTTON);
        addDrop(ModBlocks.PINK_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_TRAPDOOR);

        addDrop(ModBlocks.PINK_SLAB, slabDrops(ModBlocks.PINK_SLAB));
        addDrop(ModBlocks.PINK_DOOR, doorDrops(ModBlocks.PINK_DOOR));

    }
}
