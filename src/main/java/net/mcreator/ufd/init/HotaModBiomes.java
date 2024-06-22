
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ufd.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.FeatureSorter;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

import com.google.common.base.Suppliers;

@Mod.EventBusSubscriber
public class HotaModBiomes {
	@SubscribeEvent
	public static void onServerAboutToStart(ServerAboutToStartEvent event) {
		MinecraftServer server = event.getServer();
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registries.DIMENSION_TYPE);
		Registry<LevelStem> levelStemTypeRegistry = server.registryAccess().registryOrThrow(Registries.LEVEL_STEM);
		Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registries.BIOME);
		for (LevelStem levelStem : levelStemTypeRegistry.stream().toList()) {
			DimensionType dimensionType = levelStem.type().value();
			if (dimensionType == dimensionTypeRegistry.getOrThrow(BuiltinDimensionTypes.OVERWORLD)) {
				ChunkGenerator chunkGenerator = levelStem.generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters().values());
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.6f, 0.6f), Climate.Parameter.span(-0.6f, 0.6f), Climate.Parameter.span(-0.09f, 1.11f), Climate.Parameter.span(0.2f, 1.4f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(0.1989120172f, 1.3989120172f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "arp")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.6f, 0.6f), Climate.Parameter.span(-0.6f, 0.6f), Climate.Parameter.span(-0.09f, 1.11f), Climate.Parameter.span(0.2f, 1.4f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(0.1989120172f, 1.3989120172f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "arp")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5f, 1.5f), Climate.Parameter.span(-1.5f, -0.5f), Climate.Parameter.span(-0.01f, 0.99f), Climate.Parameter.span(0.5f, 1.5f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.198110467f, 0.801889533f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "orpa")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5f, 1.5f), Climate.Parameter.span(-1.5f, -0.5f), Climate.Parameter.span(-0.01f, 0.99f), Climate.Parameter.span(0.5f, 1.5f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.198110467f, 0.801889533f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "orpa")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.48f, 1.52f), Climate.Parameter.span(-1.52f, -0.48f), Climate.Parameter.span(-0.03f, 1.01f), Climate.Parameter.span(0.48f, 1.52f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-1.2069452795f, -0.1669452795f), 0),
							biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "mechanizedwastelandoftheancients")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.48f, 1.52f), Climate.Parameter.span(-1.52f, -0.48f), Climate.Parameter.span(-0.03f, 1.01f), Climate.Parameter.span(0.48f, 1.52f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-1.2069452795f, -0.1669452795f), 0),
							biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "mechanizedwastelandoftheancients")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.54f, 0.54f), Climate.Parameter.span(-0.54f, 0.54f), Climate.Parameter.span(-0.03f, 1.05f), Climate.Parameter.span(0.26f, 1.34f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-1.4986018929f, -0.4186018929f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "vampirebiome")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.54f, 0.54f), Climate.Parameter.span(-0.54f, 0.54f), Climate.Parameter.span(-0.03f, 1.05f), Climate.Parameter.span(0.26f, 1.34f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-1.4986018929f, -0.4186018929f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "vampirebiome")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.56f, 0.56f), Climate.Parameter.span(-0.56f, 0.56f), Climate.Parameter.span(-0.05f, 1.07f), Climate.Parameter.span(0.24f, 1.36f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.3059356827f, 0.8140643173f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "entforest")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.56f, 0.56f), Climate.Parameter.span(-0.56f, 0.56f), Climate.Parameter.span(-0.05f, 1.07f), Climate.Parameter.span(0.24f, 1.36f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.3059356827f, 0.8140643173f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "entforest")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.2866666667f, 0.9533333333f), Climate.Parameter.span(0.18f, 1.42f), Climate.Parameter.span(-0.11f, 1.13f), Climate.Parameter.span(0.18f, 1.42f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.1997723075f, 1.0402276925f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "mossycover")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.2866666667f, 0.9533333333f), Climate.Parameter.span(0.18f, 1.42f), Climate.Parameter.span(-0.11f, 1.13f), Climate.Parameter.span(0.18f, 1.42f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.1997723075f, 1.0402276925f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "mossycover")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.54f, 0.54f), Climate.Parameter.span(-0.54f, 0.54f), Climate.Parameter.span(-0.03f, 1.05f), Climate.Parameter.span(0.41f, 1.49f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-1.249732101f, -0.169732101f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "berryplain")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.54f, 0.54f), Climate.Parameter.span(-0.54f, 0.54f), Climate.Parameter.span(-0.03f, 1.05f), Climate.Parameter.span(0.41f, 1.49f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-1.249732101f, -0.169732101f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "berryplain")))));
					chunkGenerator.biomeSource = MultiNoiseBiomeSource.createFromList(new Climate.ParameterList<>(parameters));
					chunkGenerator.featuresPerStep = Suppliers
							.memoize(() -> FeatureSorter.buildFeaturesPerStep(List.copyOf(chunkGenerator.biomeSource.possibleBiomes()), biome -> chunkGenerator.generationSettingsGetter.apply(biome).features(), true));
				}
				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
					if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
						List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
						surfaceRules.add(1,
								preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "arp")), Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.COARSE_DIRT.defaultBlockState(), Blocks.CLAY.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "orpa")), Blocks.COARSE_DIRT.defaultBlockState(), Blocks.COBBLESTONE.defaultBlockState(),
								Blocks.COARSE_DIRT.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "mechanizedwastelandoftheancients")), HotaModBlocks.RUSTYMETAL.get().defaultBlockState(),
								HotaModBlocks.RUSTYMETAL_2.get().defaultBlockState(), HotaModBlocks.RUSTYMETAL_2.get().defaultBlockState()));
						surfaceRules.add(1,
								preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "vampirebiome")), Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(), Blocks.SAND.defaultBlockState()));
						surfaceRules.add(1,
								preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "entforest")), Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(), Blocks.SAND.defaultBlockState()));
						surfaceRules.add(1,
								preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "mossycover")), Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(), Blocks.WATER.defaultBlockState()));
						surfaceRules.add(1,
								preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "berryplain")), Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(), Blocks.SAND.defaultBlockState()));
						NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(), noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(),
								noiseGeneratorSettings.noiseRouter(), SurfaceRules.sequence(surfaceRules.toArray(SurfaceRules.RuleSource[]::new)), noiseGeneratorSettings.spawnTarget(), noiseGeneratorSettings.seaLevel(),
								noiseGeneratorSettings.disableMobGeneration(), noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(), noiseGeneratorSettings.useLegacyRandomSource());
						noiseGenerator.settings = new Holder.Direct<>(moddedNoiseGeneratorSettings);
					}
				}
			}
			if (dimensionType == dimensionTypeRegistry.getOrThrow(BuiltinDimensionTypes.NETHER)) {
				ChunkGenerator chunkGenerator = levelStem.generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters().values());
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5f, 1.5f), Climate.Parameter.span(-1.5f, -0.5f), Climate.Parameter.span(-0.01f, 0.99f), Climate.Parameter.span(0.5f, 1.5f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.198110467f, 0.801889533f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "orpa")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5f, 1.5f), Climate.Parameter.span(-1.5f, -0.5f), Climate.Parameter.span(-0.01f, 0.99f), Climate.Parameter.span(0.5f, 1.5f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.198110467f, 0.801889533f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "orpa")))));
					chunkGenerator.biomeSource = MultiNoiseBiomeSource.createFromList(new Climate.ParameterList<>(parameters));
					chunkGenerator.featuresPerStep = Suppliers
							.memoize(() -> FeatureSorter.buildFeaturesPerStep(List.copyOf(chunkGenerator.biomeSource.possibleBiomes()), biome -> chunkGenerator.generationSettingsGetter.apply(biome).features(), true));
				}
				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
					if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
						List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
						surfaceRules.add(2,
								anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("hota", "orpa")), Blocks.COARSE_DIRT.defaultBlockState(), Blocks.COBBLESTONE.defaultBlockState(), Blocks.COARSE_DIRT.defaultBlockState()));
						NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(), noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(),
								noiseGeneratorSettings.noiseRouter(), SurfaceRules.sequence(surfaceRules.toArray(SurfaceRules.RuleSource[]::new)), noiseGeneratorSettings.spawnTarget(), noiseGeneratorSettings.seaLevel(),
								noiseGeneratorSettings.disableMobGeneration(), noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(), noiseGeneratorSettings.useLegacyRandomSource());
						noiseGenerator.settings = new Holder.Direct<>(moddedNoiseGeneratorSettings);
					}
				}
			}
		}
	}

	private static SurfaceRules.RuleSource preliminarySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(),
						SurfaceRules.sequence(
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
										SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock)))));
	}

	private static SurfaceRules.RuleSource anySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.sequence(
						SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
								SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
						SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock))));
	}
}
