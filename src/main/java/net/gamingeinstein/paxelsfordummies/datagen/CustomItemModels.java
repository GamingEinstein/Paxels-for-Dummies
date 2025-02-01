package net.gamingeinstein.paxelsfordummies.datagen;

import net.gamingeinstein.paxelsfordummies.PaxelsForDummies;
import net.gamingeinstein.paxelsfordummies.registries.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class CustomItemModels extends ItemModelProvider {
    public CustomItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PaxelsForDummies.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(ModItems.WOODEN_PAXEL);
        handheldItem(ModItems.STONE_PAXEL);
        handheldItem(ModItems.IRON_PAXEL);
        handheldItem(ModItems.GOLDEN_PAXEL);
        handheldItem(ModItems.DIAMOND_PAXEL);
        handheldItem(ModItems.NETHERITE_PAXEL);
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(PaxelsForDummies.MOD_ID,"item/" + item.getId().getPath()));
    }
}
