package org.technicalyorker.dp.behavioural.state.car;

public class NorthFacingState implements State {

	private Car car;

	NorthFacingState(Car car) {
		this.car = car;
	}

	@Override
	public void turnLeft() {
		car.setDirection(car.WEST_FACING_STATE);
	}

	@Override
	public void turnRight() {
		car.setDirection(car.EAST_FACING_STATE);
	}

	@Override
	public void moveFront() {
		car.getPosition().incrementY();
	}

	@Override
	public void moveBack() {
		car.getPosition().decrementY();
	}
}
