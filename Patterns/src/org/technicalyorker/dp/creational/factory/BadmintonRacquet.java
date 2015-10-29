package org.technicalyorker.dp.creational.factory;

public class BadmintonRacquet implements Racquet {

	public Specification getSpecification() {
		return new Specification("B750", "Black", "Stiff", "Carbon Fibre", 675,
				90);
	}

	@Override
	public String toString() {
		return "BadmintonRacquet [getSpecification()=" + getSpecification()
				+ "]";
	}
}
