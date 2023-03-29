package io.github.sweetberrycollective.wwizardry.util;

import net.minecraft.world.biome.source.util.MultiNoiseUtil;

// hahayes best name
public final class MultiNoiseUtilUtil {
	private MultiNoiseUtilUtil() {
		throw new UnsupportedOperationException("no");
	}

	/**
	 * none parameters with left zero
	 * @return a parameter range that is always 0.0
	 */
	public static MultiNoiseUtil.ParameterRange zeroParams() {
		return MultiNoiseUtil.ParameterRange.of(0.0f);
	}
}
