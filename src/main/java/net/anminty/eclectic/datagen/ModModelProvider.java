package net.anminty.eclectic.datagen;

import net.anminty.eclectic.block.ModBlocks;
import net.anminty.eclectic.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool pinkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BOOST_BLOCK);

        pinkPool.stairs(ModBlocks.PINK_STAIRS);
        pinkPool.slab(ModBlocks.PINK_SLAB);
        pinkPool.button(ModBlocks.PINK_BUTTON);
        pinkPool.pressurePlate(ModBlocks.PINK_PRESSURE_PLATE);
        pinkPool.fence(ModBlocks.PINK_FENCE);
        pinkPool.fenceGate(ModBlocks.PINK_FENCE_GATE);
        pinkPool.wall(ModBlocks.PINK_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.PINK_DOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.DOLLAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.EYE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEAR, Models.GENERATED);

    }
}
