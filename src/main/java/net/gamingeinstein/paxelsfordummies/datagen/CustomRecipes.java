package net.gamingeinstein.paxelsfordummies.datagen;

import net.gamingeinstein.paxelsfordummies.registries.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class CustomRecipes extends RecipeProvider implements IConditionBuilder {
    public CustomRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.WOODEN_PAXEL.get())
                .requires(Items.WOODEN_PICKAXE)
                .requires(Items.WOODEN_AXE)
                .requires(Items.WOODEN_SHOVEL)
                .unlockedBy("has_wooden_pickaxe", has(Items.WOODEN_PICKAXE))
                .unlockedBy("has_wooden_axe", has(Items.WOODEN_AXE))
                .unlockedBy("has_wooden_shovel", has(Items.WOODEN_SHOVEL))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.STONE_PAXEL.get())
                .requires(Items.STONE_PICKAXE)
                .requires(Items.STONE_AXE)
                .requires(Items.STONE_SHOVEL)
                .unlockedBy("has_stone_pickaxe", has(Items.STONE_PICKAXE))
                .unlockedBy("has_stone_axe", has(Items.STONE_AXE))
                .unlockedBy("has_stone_shovel", has(Items.STONE_SHOVEL))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.IRON_PAXEL.get())
                .requires(Items.IRON_PICKAXE)
                .requires(Items.IRON_AXE)
                .requires(Items.IRON_SHOVEL)
                .unlockedBy("has_iron_pickaxe", has(Items.IRON_PICKAXE))
                .unlockedBy("has_iron_axe", has(Items.IRON_AXE))
                .unlockedBy("has_iron_shovel", has(Items.IRON_SHOVEL))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.GOLDEN_PAXEL.get())
                .requires(Items.GOLDEN_PICKAXE)
                .requires(Items.GOLDEN_AXE)
                .requires(Items.GOLDEN_SHOVEL)
                .unlockedBy("has_golden_pickaxe", has(Items.GOLDEN_PICKAXE))
                .unlockedBy("has_golden_axe", has(Items.GOLDEN_AXE))
                .unlockedBy("has_golden_shovel", has(Items.GOLDEN_SHOVEL))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.DIAMOND_PAXEL.get())
                .requires(Items.DIAMOND_PICKAXE)
                .requires(Items.DIAMOND_AXE)
                .requires(Items.DIAMOND_SHOVEL)
                .unlockedBy("has_diamond_pickaxe", has(Items.DIAMOND_PICKAXE))
                .unlockedBy("has_diamond_axe", has(Items.DIAMOND_AXE))
                .unlockedBy("has_diamond_shovel", has(Items.DIAMOND_SHOVEL))
                .save(recipeOutput);
        netheriteSmithing(recipeOutput, ModItems.DIAMOND_PAXEL.get(), RecipeCategory.TOOLS, ModItems.NETHERITE_PAXEL.get());
    }
}
