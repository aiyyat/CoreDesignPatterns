package org.technicalyorker.dp.creational.abstractfactory;

import static org.technicalyorker.dp.creational.abstractfactory.util.Utility.printlineSeperator;

public class RacquetAssemblyOperator {
	public static void main(String[] args) {
		System.out.println(new RacquetAssembly().assemble(
				"best quality badminton racquet").getSpecification());
		printlineSeperator();
		System.out.println(new RacquetAssembly().assemble(
				"mediocre quality badminton racquet").getSpecification());
		printlineSeperator();
		System.out.println(new RacquetAssembly().assemble(
				"basic quality tennis racquet").getSpecification());
		printlineSeperator();
		System.out.println(new RacquetAssembly().assemble(
				"cheap quality tennis racquet").getSpecification());
		printlineSeperator();
		System.out.println(new RacquetAssembly().assemble(
				"best quality squash racquet").getSpecification());
		printlineSeperator();
	}
}
