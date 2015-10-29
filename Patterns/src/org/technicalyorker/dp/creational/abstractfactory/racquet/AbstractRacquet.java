package org.technicalyorker.dp.creational.abstractfactory.racquet;

import org.technicalyorker.dp.creational.abstractfactory.materials.Materials;

public class AbstractRacquet implements Racquet {
	private Materials materials;

	AbstractRacquet(Materials materials) {
		this.materials = materials;
	}

	@Override
	public String getSpecification() {
		if (null == materials) {
			throw new IllegalStateException(
					"Racquet has to be provided with Materials");
		}
		return this + materials.getInformation();
	}

	public Materials getMaterials() {
		return materials;
	}

	@Override
	public String toString() {
		return "Type:" + this.getClass().getSimpleName();
	}
}
