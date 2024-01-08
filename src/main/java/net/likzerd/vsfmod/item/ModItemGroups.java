package net.likzerd.vsfmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.likzerd.vsfmod.VSFMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RAW_BAUXITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VSFMod.MOD_ID, "rawbauxite"),
            FabricItemGroup.builder().displayName(Text.translatable("VSF Mod"))
                    .icon(() -> new ItemStack(ModItems.RAW_BAUXITE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_BAUXITE);
                        entries.add(ModItems.EARTH_PLANET_ID_CHIP);
                        entries.add(Items.DIAMOND);


                    }).build());


    public static void registerItemGroups() {
        VSFMod.LOGGER.info("Registering Item Groups for " + VSFMod.MOD_ID);
    }
}
