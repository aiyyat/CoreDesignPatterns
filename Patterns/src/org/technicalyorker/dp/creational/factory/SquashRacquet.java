package org.technicalyorker.dp.creational.factory;

public class SquashRacquet implements Racquet {
	@Override
	public Specification getSpecification() {
		return new Specification("BZ100", "Black", "Stiff", "Carbon Fibre",
				675, 362);
	}

	@Override
	public String toString() {
		return "SquashRacquet [getSpecification()=" + getSpecification() + "]";
	}
}
