package net.gamingeinstein.paxelsfordummies.registries;

import net.gamingeinstein.paxelsfordummies.PaxelsForDummies;
import net.gamingeinstein.paxelsfordummies.item.PaxelItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static DeferredRegister.Items ITEMS = DeferredRegister.createItems(PaxelsForDummies.MOD_ID);

    // Paxels
    public static final DeferredItem<PaxelItem> WOODEN_PAXEL = ITEMS.register("wooden_paxel",
            () -> new PaxelItem(Tiers.WOOD, new Item.Properties()
                    .attributes(PaxelItem.createAttributes(Tiers.WOOD, 6.0f, -3.2f))));
    public static final DeferredItem<PaxelItem> STONE_PAXEL = ITEMS.register("stone_paxel",
            () -> new PaxelItem(Tiers.STONE, new Item.Properties()
                    .attributes(PaxelItem.createAttributes(Tiers.STONE, 7.0f, -3.2f))));
    public static final DeferredItem<PaxelItem> IRON_PAXEL = ITEMS.register("iron_paxel",
            () -> new PaxelItem(Tiers.IRON, new Item.Properties()
                    .attributes(PaxelItem.createAttributes(Tiers.IRON, 6.0f, -3.0f))));
    public static final DeferredItem<PaxelItem> GOLDEN_PAXEL = ITEMS.register("golden_paxel",
            () -> new PaxelItem(Tiers.GOLD, new Item.Properties()
                    .attributes(PaxelItem.createAttributes(Tiers.GOLD, 6.0f, -3.1f))));
    public static final DeferredItem<PaxelItem> DIAMOND_PAXEL = ITEMS.register("diamond_paxel",
            () -> new PaxelItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(PaxelItem.createAttributes(Tiers.DIAMOND, 5.0f, -3.0f))));
    public static final DeferredItem<PaxelItem> NETHERITE_PAXEL = ITEMS.register("netherite_paxel",
            () -> new PaxelItem(Tiers.NETHERITE, new Item.Properties().fireResistant()
                    .attributes(PaxelItem.createAttributes(Tiers.NETHERITE, 5.0f, -3.0f))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        eventBus.addListener(ModItems::addCreative);

        PaxelsForDummies.LOG.info("Registering Items for \"Paxels for Dummies\"");
    }

    private static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.WOODEN_PAXEL);
            event.accept(ModItems.STONE_PAXEL);
            event.accept(ModItems.IRON_PAXEL);
            event.accept(ModItems.GOLDEN_PAXEL);
            event.accept(ModItems.DIAMOND_PAXEL);
            event.accept(ModItems.NETHERITE_PAXEL);
        }
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.WOODEN_PAXEL);
            event.accept(ModItems.STONE_PAXEL);
            event.accept(ModItems.IRON_PAXEL);
            event.accept(ModItems.GOLDEN_PAXEL);
            event.accept(ModItems.DIAMOND_PAXEL);
            event.accept(ModItems.NETHERITE_PAXEL);
        }
    }
}
