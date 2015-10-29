package org.technicalyorker.dp.behavioural.state.car;

public class WestFacingState implements State {

	private Car car;

	public WestFacingState(Car car) {
		this.car = car;
	}

	@Override
	public void turnLeft() {
		car.setDirection(car.SOUTH_FACING_STATE);
	}

	@Override
	public void turnRight() {
		car.setDirection(car.NORTH_FACING_STATE);
	}

	@Override
	public void moveFront() {
		car.getPosition().decrementX();
	}

	@Override
	public void moveBack() {
		car.getPosition().incrementX();
	}
}
