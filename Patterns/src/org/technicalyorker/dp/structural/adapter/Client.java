package org.technicalyorker.dp.structural.adapter;

public class Client {
	public static void main(String[] args) {
		USIndianPowerSocketAdapter adapter = new USIndianPowerSocketAdapter(new IndianPowerSocket());
		USLaptop laptop = new USLaptop();
		laptop.setPlug(adapter);
		laptop.switchOn();
	}
}
