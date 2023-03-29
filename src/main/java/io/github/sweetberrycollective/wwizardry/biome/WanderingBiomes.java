package io.github.sweetberrycollective.wwizardry.biome;

import com.terraformersmc.biolith.api.biome.BiomePlacement;
import com.terraformersmc.biolith.api.biome.SubBiomeMatcher;
import io.github.sweetberrycollective.wwizardry.WanderingMod;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.quiltmc.qsl.worldgen.biome.api.BiomeModifications;
import org.quiltmc.qsl.worldgen.biome.api.ModificationPhase;

public final class WanderingBiomes {
	public static final RegistryKey<Biome> FORGOTTEN_FIELDS = createKey("forgotten_fields");
	public static final RegistryKey<PlacedFeature> SCULK_PATCH_SPECIAL = createFeatureKey("sculk_patch_special");

	private WanderingBiomes() {
	}

	public static void init() {
		BiomePlacement.addSubOverworld(Biomes.PLAINS, FORGOTTEN_FIELDS, SubBiomeMatcher.of(SubBiomeMatcher.Criterion.ofBiome(SubBiomeMatcher.CriterionTargets.NEIGHBOR, Biomes.SAVANNA, false)));
		WanderingMod.LOGGER.info("Initialized biomes");
	}

	private static RegistryKey<Biome> createKey(String id) {
		return RegistryKey.of(RegistryKeys.BIOME, WanderingMod.id(id));
	}

	private static RegistryKey<PlacedFeature> createFeatureKey(String identifier) {
		return RegistryKey.of(RegistryKeys.PLACED_FEATURE, WanderingMod.id(identifier));
	}
}
