package net.anminty.eclectic.item;

import net.anminty.eclectic.Eclectic;
import net.anminty.eclectic.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ECLECTIC_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Eclectic.MOD_ID, "eclectic_items"), FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.COIN))
                    .displayName(Text.translatable("itemgroup.eclectic.eclectic_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.COIN);
                        entries.add(ModItems.DOLLAR);
                        entries.add(ModBlocks.PINK_BLOCK);
                        entries.add(ModBlocks.COIN_BLOCK);
                        entries.add(ModItems.EYE);
                        entries.add(ModBlocks.BOOST_BLOCK);
                        entries.add(ModItems.TEAR);
                        entries.add(ModItems.JUNK);
                    }).build());

    public static void registerItemGroups (){
        Eclectic.LOGGER.info("Registering Item Groups for "+ Eclectic.MOD_ID);
    }
}
