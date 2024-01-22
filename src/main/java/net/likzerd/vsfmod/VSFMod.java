package net.likzerd.vsfmod;

import net.fabricmc.api.ModInitializer;
import net.likzerd.vsfmod.block.ModBlocks;
import net.likzerd.vsfmod.item.ModItemGroups;
import net.likzerd.vsfmod.item.ModItems;
import net.likzerd.vsfmod.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VSFMod implements ModInitializer {
	public static final String MOD_ID = "vsfmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

        ModWorldGeneration.generateModWorldGen();
	}
}