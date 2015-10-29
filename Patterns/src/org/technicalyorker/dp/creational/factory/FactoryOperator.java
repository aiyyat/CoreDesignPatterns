package org.technicalyorker.dp.creational.factory;

/**
 * Here the product of the Factory Method is Badminton Racquet.
 * 
 * @author achuth
 *
 */
public class FactoryOperator {
	public static void main(String[] args) {
		System.out.println(RacquetFactory.produceRacquet("badminton"));
	}
}
