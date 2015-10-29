package org.technicalyorker.dp.creational.prototype.wargame;

public class Battalion implements Cloneable {
	private Wizard[] warlocks = new Wizard[100];
	Wizard warlock = new Wizard(new Soul());

	public Battalion() {
		for (int i = 0; i < warlocks.length; i++) {
			try {
				warlocks[i] = warlock.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	protected Wizard[] clone() throws CloneNotSupportedException {
		Wizard[] clonedCopy = new Wizard[warlocks.length];
		for (int i = 0; i < warlocks.length; i++) {
			clonedCopy[i] = warlocks[i].clone();
		}
		return clonedCopy;
	}
}
