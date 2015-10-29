package org.technicalyorker.dp.creational.abstractfactory.materials.grips;

public class GripMaterialFactory {
	public GripMaterial createGripMaterial(String material) {
		switch (material) {
		case "leather":
			return new LeatherGripMaterial();
		default:
			return new RexinGripMaterial();
		}
	}
}
