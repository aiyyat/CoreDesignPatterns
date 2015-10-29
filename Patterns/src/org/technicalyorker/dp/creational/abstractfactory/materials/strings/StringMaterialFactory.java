package org.technicalyorker.dp.creational.abstractfactory.materials.strings;

public class StringMaterialFactory {
	public StringMaterial create(String material) {
		switch (material) {
		case "plastic":
			return new PlasticStringMaterial();
		default:
			return new CarbonFiberStringMaterial();
		}
	}
}
