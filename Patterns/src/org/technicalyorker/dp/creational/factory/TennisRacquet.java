package org.technicalyorker.dp.creational.factory;

public class TennisRacquet implements Racquet {
	public Specification getSpecification() {
		return new Specification("BZ100", "Black", "Stiff", "Carbon Fibre",
				675, 362);
	}

	@Override
	public String toString() {
		return "TennisRacquet [getSpecification()=" + getSpecification() + "]";
	}
}
