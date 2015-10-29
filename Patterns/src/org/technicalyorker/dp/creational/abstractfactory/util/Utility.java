package org.technicalyorker.dp.creational.abstractfactory.util;

public class Utility {
	public static final String getSpacedTokenInPosition(String input,
			int position) {
		return input.split(" ")[position];
	}

	public static void printlineSeperator() {
		System.out
				.println("---------------------------------------------------");
	}
}
