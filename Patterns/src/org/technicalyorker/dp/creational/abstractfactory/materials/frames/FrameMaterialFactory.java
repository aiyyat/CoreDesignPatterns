package org.technicalyorker.dp.creational.abstractfactory.materials.frames;

public class FrameMaterialFactory {
	FrameMaterial m;

	public FrameMaterial create(String material) {
		switch (material) {
		case "carbon":
			return new CarbonFrameMaterial();
		case "steel":
			return new StainlessSteelFrameMaterial();
		default:
			return new WoodenFrameMaterial();
		}
	}
}
