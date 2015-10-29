package org.technicalyorker.dp.creational.abstractfactory.racquet;

import org.technicalyorker.dp.creational.abstractfactory.materials.Materials;
import org.technicalyorker.dp.creational.abstractfactory.util.Utility;

public class RacquetFactory {
	public Racquet produceRacquet(String game, Materials materials) {
		switch (Utility.getSpacedTokenInPosition(game, 0)) {
		case "badminton":
			return new BadmintonRacquet(materials);
		case "tennis":
			return new TennisRacquet(materials);
		case "squash":
			return new SquashRacquet(materials);
		default:
			return null;
		}
	}
}
