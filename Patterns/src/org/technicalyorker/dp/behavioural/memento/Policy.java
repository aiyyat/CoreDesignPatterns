package org.technicalyorker.dp.behavioural.memento;

public class Policy {
	private Stage stage;
	private String attendingStaff;

	public String getAttendingStaff() {
		return attendingStaff;
	}

	public void setAttendingStaff(String attendingStaff) {
		this.attendingStaff = attendingStaff;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public Memento createSnapShot() {
		return new Memento(this);
	}

	public void restoreToPreviousState(Memento memento) {
		setStage(memento.getStage());
		setAttendingStaff(memento.getAttendingStaff());
	}

	@Override
	public String toString() {
		return "Policy [stage=" + stage + ", attendingStaff=" + attendingStaff
				+ "]";
	}
}
