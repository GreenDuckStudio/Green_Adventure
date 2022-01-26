package de.greenduck.greenadventure;

import de.greenduck.greenadventure.block.ModBlocks;
import de.greenduck.greenadventure.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("greenadventure")
public class GreenAdventure {

    public static final String MOD_ID = "greenadventure";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public GreenAdventure() {
        IEventBus eventbus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventbus);
        ModBlocks.register(eventbus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}