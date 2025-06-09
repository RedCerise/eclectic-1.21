package net.anminty.eclectic.block;

import net.anminty.eclectic.Eclectic;
import net.anminty.eclectic.block.custom.BoostBlock;
import net.anminty.eclectic.block.custom.CoinBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block PINK_BLOCK = registerBlock("pink_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block COIN_BLOCK = registerBlock("coin_block",
            new CoinBlock(AbstractBlock.Settings.create().nonOpaque().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(0.2f)));

    public static final Block BOOST_BLOCK = registerBlock("boost_block",
            new BoostBlock(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.SLIME)));

public static final Block PINK_STAIRS = registerBlock("pink_stairs", new StairsBlock(
        ModBlocks.PINK_BLOCK.getDefaultState(), AbstractBlock.Settings.create()
        .strength(2f).requiresTool()));

public static final Block PINK_SLAB = registerBlock("pink_slab", new SlabBlock(
        AbstractBlock.Settings.create()
        .strength(2f).requiresTool()));

public static final Block PINK_BUTTON = registerBlock("pink_button", new ButtonBlock(
        BlockSetType.IRON,20 , AbstractBlock.Settings.create()
        .strength(2f).requiresTool().noCollision()));
public static final Block PINK_PRESSURE_PLATE = registerBlock("pink_pressure_plate", new PressurePlateBlock(
        BlockSetType.IRON, AbstractBlock.Settings.create()
        .strength(2f).requiresTool()));

public static final Block PINK_FENCE = registerBlock("pink_fence", new FenceBlock(
        AbstractBlock.Settings.create()
        .strength(2f).requiresTool()));

public static final Block PINK_FENCE_GATE = registerBlock("pink_fence_gate", new FenceGateBlock(
        WoodType.CHERRY, AbstractBlock.Settings.create()
        .strength(2f).requiresTool()));

public static final Block PINK_WALL = registerBlock("pink_wall", new WallBlock(
        AbstractBlock.Settings.create()
        .strength(2f).requiresTool()));

public static final Block PINK_DOOR = registerBlock("pink_door", new DoorBlock(
        BlockSetType.IRON, AbstractBlock.Settings.create()
        .strength(2f).requiresTool().nonOpaque()));

public static final Block PINK_TRAPDOOR = registerBlock("pink_trapdoor", new DoorBlock(
        BlockSetType.IRON, AbstractBlock.Settings.create()
        .strength(2f).requiresTool().nonOpaque()));





    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Eclectic.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Eclectic.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

    public static void registerModBlocks() {
        Eclectic.LOGGER.info("Registering Mod Blocks for " + Eclectic.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.PINK_BLOCK);
        });
    }
}
