package de.greenduck.greenadventure.item;

import de.greenduck.greenadventure.GreenAdventure;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GreenAdventure.MOD_ID);

    public static final RegistryObject<Item> AERUM = ITEMS.register("aerum",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
