package org.technicalyorker.dp.creational.abstractfactory.materials;

import org.technicalyorker.dp.creational.abstractfactory.materials.frames.FrameMaterial;
import org.technicalyorker.dp.creational.abstractfactory.materials.grips.GripMaterial;
import org.technicalyorker.dp.creational.abstractfactory.materials.strings.StringMaterial;

public interface Materials extends Specificational {
	public FrameMaterial getFrameMaterial();

	public StringMaterial getStringMaterial();

	public GripMaterial getGripMaterial();
}
