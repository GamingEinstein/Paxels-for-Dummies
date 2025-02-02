package net.gamingeinstein.paxelsfordummies.datagen;

import net.gamingeinstein.paxelsfordummies.PaxelsForDummies;
import net.gamingeinstein.paxelsfordummies.registries.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

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

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(PaxelsForDummies.MOD_ID, "item/" + item.getId().getPath()));
    }
}
