package org.technicalyorker.dp.creational.factory;

public class RacquetFactory {
	private RacquetFactory() {

	}

	public static Racquet produceRacquet(String game) {
		switch (game) {
		case "badminton":
			return new BadmintonRacquet();
		case "tennis":
			return new TennisRacquet();
		case "squash":
			return new SquashRacquet();
		default:
			return null;
		}
	}
}
