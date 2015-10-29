package org.technicalyorker.dp.behavioural.memento;

public class Memento {
	Stage stage;
	String attendingStaff;

	public Memento(Policy configuration) {
		this.stage = configuration.getStage();
		this.attendingStaff = configuration.getAttendingStaff();
	}

	public Stage getStage() {
		return stage;
	}

	public String getAttendingStaff() {
		return attendingStaff;
	}

	@Override
	public String toString() {
		return "Memento [stage=" + stage + ", attendingStaff=" + attendingStaff
				+ "]";
	}
}
