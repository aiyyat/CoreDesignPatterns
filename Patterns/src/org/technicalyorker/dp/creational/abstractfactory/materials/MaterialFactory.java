package org.technicalyorker.dp.creational.abstractfactory.materials;

public class MaterialFactory {
	public Materials create(String quality) {
		switch (quality) {
		case "best":
			return new BestMaterials();
		case "mediocre":
			return new MediocreMaterials();
		default:
			return new CheapMaterials();
		}
	}
}
