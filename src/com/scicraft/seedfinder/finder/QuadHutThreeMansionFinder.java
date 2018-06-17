import java.lang.Math;
import com.scicraft.seedfinder.*;

public class QuadHutThreeMansionFinder extends QuadHutMultiMansionFinder {

	protected boolean fullSeedWorks(
			long seed, BiomeGenerator generator, int radius,
			XZPair[] chunkLocations, XZPair worldSpawn) {
		if (!checker.quadHutsWillSpawn(hut, chunkLocations, generator)) {
			return false;
		}
		return checker.mansionCount(mansion, seed, generator, radius) >= 3;
	}

}

