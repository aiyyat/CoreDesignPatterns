package org.technicalyorker.dp.creational.abstractfactory.materials;

import org.technicalyorker.dp.creational.abstractfactory.materials.frames.FrameMaterial;
import org.technicalyorker.dp.creational.abstractfactory.materials.frames.StainlessSteelFrameMaterial;
import org.technicalyorker.dp.creational.abstractfactory.materials.frames.WoodenFrameMaterial;
import org.technicalyorker.dp.creational.abstractfactory.materials.grips.GripMaterial;
import org.technicalyorker.dp.creational.abstractfactory.materials.grips.RexinGripMaterial;
import org.technicalyorker.dp.creational.abstractfactory.materials.strings.PlasticStringMaterial;
import org.technicalyorker.dp.creational.abstractfactory.materials.strings.StringMaterial;

public class CheapMaterials extends AbstractMaterials {
	FrameMaterial f = new WoodenFrameMaterial();
	GripMaterial g = new RexinGripMaterial();
	StringMaterial s = new PlasticStringMaterial();

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
