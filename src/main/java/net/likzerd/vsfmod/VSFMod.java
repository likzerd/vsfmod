package net.likzerd.vsfmod;

import net.fabricmc.api.ModInitializer;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import net.likzerd.vsfmod.item.ModItems;
>>>>>>> aa5edb6 (funni)
>>>>>>> 5fa1ae2 (Initial commit)
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VSFMod implements ModInitializer {
	public static final String MOD_ID = "vsfmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

<<<<<<< HEAD
		LOGGER.info("Hello Fabric world!");
=======
<<<<<<< HEAD
		LOGGER.info("Hello Fabric world!");
=======
		ModItems.registerModItems();
>>>>>>> aa5edb6 (funni)
>>>>>>> 5fa1ae2 (Initial commit)
	}
}