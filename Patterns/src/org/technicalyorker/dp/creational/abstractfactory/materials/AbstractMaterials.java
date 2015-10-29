package org.technicalyorker.dp.creational.abstractfactory.materials;

import org.technicalyorker.dp.creational.abstractfactory.materials.frames.FrameMaterial;
import org.technicalyorker.dp.creational.abstractfactory.materials.grips.GripMaterial;
import org.technicalyorker.dp.creational.abstractfactory.materials.strings.StringMaterial;

public abstract class AbstractMaterials implements Materials {
	public String getInformation() {
		FrameMaterial f = getFrameMaterial();
		GripMaterial g = getGripMaterial();
		StringMaterial s = getStringMaterial();
		return "\n " + f.getClass().getSimpleName() + "(" + f.getInformation()
				+ ")\n " + g.getClass().getSimpleName() + "("
				+ g.getInformation() + ")\n " + s.getClass().getSimpleName()
				+ "(" + s.getInformation() + ")";
	}
}
