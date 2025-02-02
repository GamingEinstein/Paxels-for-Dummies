package net.gamingeinstein.paxelsfordummies.datagen;

import net.gamingeinstein.paxelsfordummies.registries.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class CustomRecipes extends RecipeProvider implements IConditionBuilder {
    public CustomRecipes(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.WOODEN_PAXEL.get())
                .requires(Items.WOODEN_PICKAXE)
                .requires(Items.WOODEN_AXE)
                .requires(Items.WOODEN_SHOVEL)
                .unlockedBy("has_wooden_pickaxe", inventoryTrigger(ItemPredicate.Builder.item().of(Items.WOODEN_PICKAXE).build()))
                .unlockedBy("has_wooden_axe", inventoryTrigger(ItemPredicate.Builder.item().of(Items.WOODEN_AXE).build()))
                .unlockedBy("has_wooden_shovel", inventoryTrigger(ItemPredicate.Builder.item().of(Items.WOODEN_SHOVEL).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.STONE_PAXEL.get())
                .requires(Items.STONE_PICKAXE)
                .requires(Items.STONE_AXE)
                .requires(Items.STONE_SHOVEL)
                .unlockedBy("has_stone_pickaxe", inventoryTrigger(ItemPredicate.Builder.item().of(Items.STONE_PICKAXE).build()))
                .unlockedBy("has_stone_axe", inventoryTrigger(ItemPredicate.Builder.item().of(Items.STONE_AXE).build()))
                .unlockedBy("has_stone_shovel", inventoryTrigger(ItemPredicate.Builder.item().of(Items.STONE_SHOVEL).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.IRON_PAXEL.get())
                .requires(Items.IRON_PICKAXE)
                .requires(Items.IRON_AXE)
                .requires(Items.IRON_SHOVEL)
                .unlockedBy("has_iron_pickaxe", inventoryTrigger(ItemPredicate.Builder.item().of(Items.IRON_PICKAXE).build()))
                .unlockedBy("has_iron_axe", inventoryTrigger(ItemPredicate.Builder.item().of(Items.IRON_AXE).build()))
                .unlockedBy("has_iron_shovel", inventoryTrigger(ItemPredicate.Builder.item().of(Items.IRON_SHOVEL).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.GOLDEN_PAXEL.get())
                .requires(Items.GOLDEN_PICKAXE)
                .requires(Items.GOLDEN_AXE)
                .requires(Items.GOLDEN_SHOVEL)
                .unlockedBy("has_golden_pickaxe", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GOLDEN_PICKAXE).build()))
                .unlockedBy("has_golden_axe", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GOLDEN_AXE).build()))
                .unlockedBy("has_golden_shovel", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GOLDEN_SHOVEL).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.DIAMOND_PAXEL.get())
                .requires(Items.DIAMOND_PICKAXE)
                .requires(Items.DIAMOND_AXE)
                .requires(Items.DIAMOND_SHOVEL)
                .unlockedBy("has_diamond_pickaxe", inventoryTrigger(ItemPredicate.Builder.item().of(Items.DIAMOND_PICKAXE).build()))
                .unlockedBy("has_diamond_axe", inventoryTrigger(ItemPredicate.Builder.item().of(Items.DIAMOND_AXE).build()))
                .unlockedBy("has_diamond_shovel", inventoryTrigger(ItemPredicate.Builder.item().of(Items.DIAMOND_SHOVEL).build()))
                .save(consumer);
        netheriteSmithing(consumer, ModItems.DIAMOND_PAXEL.get(), RecipeCategory.TOOLS, ModItems.NETHERITE_PAXEL.get());
    }
}
