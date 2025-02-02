package net.gamingeinstein.paxelsfordummies.datagen;

import net.gamingeinstein.paxelsfordummies.PaxelsForDummies;
import net.gamingeinstein.paxelsfordummies.registries.ModItems;
import net.gamingeinstein.paxelsfordummies.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class CustomItemTags extends ItemTagsProvider {
    public CustomItemTags(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                          CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, PaxelsForDummies.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(Tags.Items.TOOLS).addTag(ModTags.Items.PAXELS);
        this.tag(ItemTags.TOOLS).addTag(ModTags.Items.PAXELS);
        this.tag(ModTags.Items.PAXELS)
                .addTag(ModTags.Items.PAXELS_WOOD)
                .addTag(ModTags.Items.PAXELS_STONE)
                .addTag(ModTags.Items.PAXELS_IRON)
                .addTag(ModTags.Items.PAXELS_GOLD)
                .addTag(ModTags.Items.PAXELS_DIAMOND)
                .addTag(ModTags.Items.PAXELS_NETHERITE);
        this.tag(ModTags.Items.PAXELS_WOOD).add(ModItems.WOODEN_PAXEL.get());
        this.tag(ModTags.Items.PAXELS_STONE).add(ModItems.STONE_PAXEL.get());
        this.tag(ModTags.Items.PAXELS_GOLD).add(ModItems.GOLDEN_PAXEL.get());
        this.tag(ModTags.Items.PAXELS_IRON).add(ModItems.IRON_PAXEL.get());
        this.tag(ModTags.Items.PAXELS_DIAMOND).add(ModItems.DIAMOND_PAXEL.get());
        this.tag(ModTags.Items.PAXELS_NETHERITE).add(ModItems.NETHERITE_PAXEL.get());
        this.tag(ItemTags.CLUSTER_MAX_HARVESTABLES)
                .addTag(ModTags.Items.PAXELS_WOOD)
                .addTag(ModTags.Items.PAXELS_STONE)
                .addTag(ModTags.Items.PAXELS_IRON)
                .addTag(ModTags.Items.PAXELS_GOLD)
                .addTag(ModTags.Items.PAXELS_DIAMOND)
                .addTag(ModTags.Items.PAXELS_NETHERITE);
    }
}
