package org.technicalyorker.dp.creational.abstractfactory.materials;

import org.technicalyorker.dp.creational.abstractfactory.materials.frames.CarbonFrameMaterial;
import org.technicalyorker.dp.creational.abstractfactory.materials.frames.FrameMaterial;
import org.technicalyorker.dp.creational.abstractfactory.materials.grips.GripMaterial;
import org.technicalyorker.dp.creational.abstractfactory.materials.grips.LeatherGripMaterial;
import org.technicalyorker.dp.creational.abstractfactory.materials.strings.CarbonFiberStringMaterial;
import org.technicalyorker.dp.creational.abstractfactory.materials.strings.StringMaterial;

public class BestMaterials extends AbstractMaterials {
	FrameMaterial f = new CarbonFrameMaterial();
	GripMaterial g = new LeatherGripMaterial();
	StringMaterial s = new CarbonFiberStringMaterial();

	@Override
	public FrameMaterial getFrameMaterial() {
		return f;
	}

	@Override
	public GripMaterial getGripMaterial() {
		return g;
	}

	@Override
	public StringMaterial getStringMaterial() {
		return s;
	}
}
