package net.anminty.eclectic.item;

import net.anminty.eclectic.Eclectic;
import net.anminty.eclectic.item.custom.ParticleItem;
import net.anminty.eclectic.item.custom.ScytheItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.ComponentType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COIN = registerItem("coin", new Item(new Item.Settings()));
    public static final Item DOLLAR = registerItem("dollar", new Item(new Item.Settings()));

    public static final Item EYE = registerItem("eye", new ParticleItem(new Item.Settings()));

    public static final Item TEAR = registerItem("tear", new Item(new Item.Settings().food(ModFoodComponents.TEAR)));

    public static final Item JUNK = registerItem("junk", new Item(new Item.Settings()));

    public static final Item MUSH_SCYTHE = registerItem("mush_scythe", new ScytheItem(
            ModToolMaterials.CUSTOM, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CUSTOM
            ,7, -2.9f))));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Eclectic.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Eclectic.LOGGER.info("Registering Mod Items for " + Eclectic.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(COIN);
            fabricItemGroupEntries.add(DOLLAR);


        });
    }
}
