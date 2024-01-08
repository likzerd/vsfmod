package net.likzerd.vsfmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.likzerd.vsfmod.VSFMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_BAUXITE = registerItem("rawbauxite", new Item(new FabricItemSettings()));

    public static final Item EARTH_PLANET_ID_CHIP = registerItem("earthplanetidchip", new Item(new FabricItemSettings()));
    public static final Item MOON_PLANET_ID_CHIP = registerItem("moonplanetidchip", new Item(new FabricItemSettings()));
    public static final Item MARS_PLANET_ID_CHIP = registerItem("marsplanetidchip", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemsGroup(FabricItemGroupEntries entries) {
        entries.add(RAW_BAUXITE);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VSFMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        VSFMod.LOGGER.info("Registering Mod ModItems for " + VSFMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemsGroup);
    }
}
