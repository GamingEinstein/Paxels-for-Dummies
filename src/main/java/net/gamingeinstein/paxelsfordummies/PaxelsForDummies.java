package net.gamingeinstein.paxelsfordummies;

import net.gamingeinstein.paxelsfordummies.registries.ModItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(PaxelsForDummies.MOD_ID)
public class PaxelsForDummies {
    public static final String MOD_ID = "paxelsfordummies";
    public static final String MOD_NAME = "Paxels for Dummies";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public PaxelsForDummies(IEventBus eventBus) {
        NeoForge.EVENT_BUS.register(this);

        ModItems.register(eventBus);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
