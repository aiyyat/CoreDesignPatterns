package org.technicalyorker.dp.behavioural.state.car;

public class Car {
	Position position;
	public final State NORTH_FACING_STATE = new NorthFacingState(this);
	public final State SOUTH_FACING_STATE = new SouthFacingState(this);
	public final State EAST_FACING_STATE = new EastFacingState(this);
	public final State WEST_FACING_STATE = new WestFacingState(this);

	State direction = NORTH_FACING_STATE;

	public Car(Position position) {
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	public void setDirection(State direction) {
		this.direction = direction;
	}

	public void steerLeft() {
		direction.turnLeft();
	}

	public void steerRight() {
		direction.turnRight();
	}

	public void moveForwardBy(int steps) {
		for (int i = 0; i < steps; i++) {
			direction.moveFront();
		}
	}

	public void moveBackwardBy(int steps) {
		for (int i = 0; i < steps; i++) {
			direction.moveBack();
		}
	}

	@Override
	public String toString() {
		return "Car [position=" + position + ", direction="
				+ direction.getClass().getSimpleName() + "]";
	}
}
