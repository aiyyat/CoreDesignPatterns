package org.technicalyorker.dp.creational.abstractfactory;

import org.technicalyorker.dp.creational.abstractfactory.materials.MaterialFactory;
import org.technicalyorker.dp.creational.abstractfactory.materials.Materials;
import org.technicalyorker.dp.creational.abstractfactory.racquet.Racquet;
import org.technicalyorker.dp.creational.abstractfactory.racquet.RacquetFactory;
import org.technicalyorker.dp.creational.abstractfactory.util.Utility;

public class RacquetAssembly {

	public Racquet assemble(String instruction) {
		String quality = Utility.getSpacedTokenInPosition(instruction, 0);
		String racquetType = Utility.getSpacedTokenInPosition(
				instruction, 2);
		Materials materials = new MaterialFactory().create(quality);
		Racquet racquet = new RacquetFactory().produceRacquet(racquetType,
				materials);
		return racquet;
	}

}
