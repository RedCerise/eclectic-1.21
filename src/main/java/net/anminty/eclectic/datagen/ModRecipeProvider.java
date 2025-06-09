package net.anminty.eclectic.datagen;

import net.anminty.eclectic.block.ModBlocks;
import net.anminty.eclectic.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.COIN_BLOCK)
                .pattern(" X ")
                .pattern("XXX")
                .pattern(" X ")
                .input('X', ModItems.COIN)
                .criterion(hasItem(ModItems.COIN), conditionsFromItem(ModItems.COIN))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COIN, 5)
                .input(ModBlocks.COIN_BLOCK)
                .criterion(hasItem(ModBlocks.COIN_BLOCK), conditionsFromItem(ModBlocks.COIN_BLOCK))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.BOOST_BLOCK)
                .pattern(" R ")
                .pattern("RSR")
                .pattern(" R ")
                .input('R', Items.REDSTONE)
                .input('S', Items.SLIME_BLOCK)
                .criterion(hasItem(Items.SLIME_BLOCK), conditionsFromItem(Items.SLIME_BLOCK))
                .offerTo(recipeExporter);

        createDoorRecipe(ModBlocks.PINK_DOOR, Ingredient.ofItems(ModBlocks.PINK_BLOCK))
                .criterion(hasItem(ModBlocks.PINK_BLOCK), conditionsFromItem(ModBlocks.PINK_BLOCK))
                .offerTo(recipeExporter);

        createTrapdoorRecipe(ModBlocks.PINK_TRAPDOOR, Ingredient.ofItems(ModBlocks.PINK_BLOCK))
                .criterion(hasItem(ModBlocks.PINK_BLOCK), conditionsFromItem(ModBlocks.PINK_BLOCK))
                .offerTo(recipeExporter);

        createStairsRecipe(ModBlocks.PINK_STAIRS, Ingredient.ofItems(ModBlocks.PINK_BLOCK))
                .criterion(hasItem(ModBlocks.PINK_BLOCK), conditionsFromItem(ModBlocks.PINK_BLOCK))
                .offerTo(recipeExporter);

        createFenceGateRecipe(ModBlocks.PINK_FENCE_GATE, Ingredient.ofItems(ModBlocks.PINK_BLOCK))
                .criterion(hasItem(ModBlocks.PINK_BLOCK), conditionsFromItem(ModBlocks.PINK_BLOCK))
                .offerTo(recipeExporter);

        createFenceRecipe(ModBlocks.PINK_FENCE, Ingredient.ofItems(ModBlocks.PINK_BLOCK))
                .criterion(hasItem(ModBlocks.PINK_BLOCK), conditionsFromItem(ModBlocks.PINK_BLOCK))
                .offerTo(recipeExporter);
        
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_SLAB, Ingredient.ofItems(ModBlocks.PINK_BLOCK))
                .criterion(hasItem(ModBlocks.PINK_BLOCK), conditionsFromItem(ModBlocks.PINK_BLOCK))
                .offerTo(recipeExporter);

        offerWallRecipe(recipeExporter ,RecipeCategory.REDSTONE, ModBlocks.PINK_PRESSURE_PLATE, ModBlocks.PINK_BLOCK);






    }


}
