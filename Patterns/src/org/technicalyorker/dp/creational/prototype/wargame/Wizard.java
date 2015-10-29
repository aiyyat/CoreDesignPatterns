package org.technicalyorker.dp.creational.prototype.wargame;

public class Wizard implements Cloneable {
	Soul soul;

	public Wizard(Soul soul) {
		this.soul = soul;
	}

	@Override
	protected Wizard clone() throws CloneNotSupportedException {
		return (Wizard) super.clone();
	}

	@Override
	public String toString() {
		return "Wizard [soul=" + soul + ", hashCode()=" + hashCode() + "]";
	}
}
