package net.gamingeinstein.paxelsfordummies;

import net.gamingeinstein.paxelsfordummies.registries.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(PaxelsForDummiesForge.MOD_ID)
public class PaxelsForDummiesForge {
    public static final String MOD_ID = "paxelsfordummies";
    public static final String MOD_NAME = "Paxels for Dummies";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public PaxelsForDummiesForge() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
