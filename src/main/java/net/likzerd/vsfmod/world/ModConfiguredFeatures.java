package net.likzerd.vsfmod.world;

import net.likzerd.vsfmod.VSFMod;
import net.likzerd.vsfmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;


import java.util.List;
public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_BAUXITE_KEY = registerKey("deepslate_bauxite");

    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_BAUXITE_PLACED_KEY = registerKey("deepslate_bauxite_placed");
    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {

        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldDeepslateBauxite =
                List.of(OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_BAUXITE.getDefaultState()));

        register(context, DEEPSLATE_BAUXITE_KEY, Feature.ORE, new OreFeatureConfig(overworldDeepslateBauxite, 12));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(VSFMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}