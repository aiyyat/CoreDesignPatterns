package org.technicalyorker.dp.structural.adapter;

public class USIndianPowerSocketAdapter extends USPowerSocket implements PowerSocket {
	private IndianPowerSocket indianPowerSocket;

	public USIndianPowerSocketAdapter(IndianPowerSocket indianPowerSocket) {
		this.indianPowerSocket = indianPowerSocket;
	}

	public String drawCurrent() {
		return indianPowerSocket.drawCurrent();
	}
}
