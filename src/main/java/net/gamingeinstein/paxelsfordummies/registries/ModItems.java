package net.gamingeinstein.paxelsfordummies.registries;

import net.gamingeinstein.paxelsfordummies.PaxelsForDummies;
import net.gamingeinstein.paxelsfordummies.item.PaxelItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PaxelsForDummies.MOD_ID);

    // Paxels
    public static final RegistryObject<Item> WOODEN_PAXEL = ITEMS.register("wooden_paxel",
            () -> new PaxelItem(6.0f, -3.2f, Tiers.WOOD, new Item.Properties()));
    public static final RegistryObject<Item> STONE_PAXEL = ITEMS.register("stone_paxel",
            () -> new PaxelItem(7.0f, -3.2f, Tiers.STONE, new Item.Properties()));
    public static final RegistryObject<Item> IRON_PAXEL = ITEMS.register("iron_paxel",
            () -> new PaxelItem(6.0f, -3.0f, Tiers.IRON, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_PAXEL = ITEMS.register("golden_paxel",
            () -> new PaxelItem(6.0f, -3.1f, Tiers.GOLD, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_PAXEL = ITEMS.register("diamond_paxel",
            () -> new PaxelItem(5.0f, -3.0f, Tiers.DIAMOND, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_PAXEL = ITEMS.register("netherite_paxel",
            () -> new PaxelItem(5.0f, -3.0f, Tiers.NETHERITE, new Item.Properties().fireResistant()));

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
