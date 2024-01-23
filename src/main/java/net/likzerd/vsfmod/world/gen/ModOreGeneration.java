package net.likzerd.vsfmod.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.likzerd.vsfmod.world.ModPlacedFeatures;
import net.minecraft.world.gen.GenerationStep;

import static net.likzerd.vsfmod.world.ModPlacedFeatures.DEEPSLATE_BAUXITE_PLACED_KEY;


public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, DEEPSLATE_BAUXITE_PLACED_KEY);

    }
}
