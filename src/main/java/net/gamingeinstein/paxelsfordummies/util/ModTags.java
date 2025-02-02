package net.gamingeinstein.paxelsfordummies.util;

import net.gamingeinstein.paxelsfordummies.PaxelsForDummies;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> MINEABLE_WITH_PAXEL = forgeTag("mineable/paxel");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(PaxelsForDummies.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> PAXELS = forgeTag("tools/paxels");

        public static final TagKey<Item> PAXELS_WOOD = forgeTag("tools/paxels/wood");
        public static final TagKey<Item> PAXELS_STONE = forgeTag("tools/paxels/stone");
        public static final TagKey<Item> PAXELS_GOLD = forgeTag("tools/paxels/gold");
        public static final TagKey<Item> PAXELS_IRON = forgeTag("tools/paxels/iron");
        public static final TagKey<Item> PAXELS_DIAMOND = forgeTag("tools/paxels/diamond");
        public static final TagKey<Item> PAXELS_NETHERITE = forgeTag("tools/paxels/netherite");



        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(PaxelsForDummies.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
