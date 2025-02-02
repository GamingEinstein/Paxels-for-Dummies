package net.gamingeinstein.paxelsfordummies.datagen;

import net.gamingeinstein.paxelsfordummies.PaxelsForDummies;
import net.gamingeinstein.paxelsfordummies.registries.ModItems;
import net.gamingeinstein.paxelsfordummies.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class CustomItemTags extends ItemTagsProvider {
    public CustomItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                          CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, PaxelsForDummies.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.BREAKS_DECORATED_POTS).addTag(ModTags.Items.PAXELS);
        tag(ItemTags.WEAPON_ENCHANTABLE).addTag(ModTags.Items.PAXELS);
        tag(ItemTags.SHARP_WEAPON_ENCHANTABLE).addTag(ModTags.Items.PAXELS);
        tag(ItemTags.MINING_ENCHANTABLE).addTag(ModTags.Items.PAXELS);
        tag(ItemTags.MINING_LOOT_ENCHANTABLE).addTag(ModTags.Items.PAXELS);
        tag(ItemTags.DURABILITY_ENCHANTABLE).addTag(ModTags.Items.PAXELS);
        tag(ItemTags.PIGLIN_LOVED).add(ModItems.GOLDEN_PAXEL.get());
        tag(ItemTags.CLUSTER_MAX_HARVESTABLES)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());
        tag(Tags.Items.TOOLS)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());
        tag(Tags.Items.MINING_TOOL_TOOLS)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());
        tag(Tags.Items.MELEE_WEAPON_TOOLS)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());
        tag(ModTags.Items.PAXELS)
                .add(ModItems.WOODEN_PAXEL.get())
                .add(ModItems.STONE_PAXEL.get())
                .add(ModItems.IRON_PAXEL.get())
                .add(ModItems.GOLDEN_PAXEL.get())
                .add(ModItems.DIAMOND_PAXEL.get())
                .add(ModItems.NETHERITE_PAXEL.get());
    }
}
