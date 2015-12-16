package org.technicalyorker.dp.structural.adapter;

public class USLaptop {
	private USPowerSocket powerPlug;

	public void setPlug(USPowerSocket powerPlug) {
		this.powerPlug = powerPlug;
	}

	public void switchOn() {
		System.out.println("US Laptop powered by " + powerPlug.drawCurrent());
	}
}
