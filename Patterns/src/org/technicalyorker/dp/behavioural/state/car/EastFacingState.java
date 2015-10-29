package org.technicalyorker.dp.behavioural.state.car;

public class EastFacingState implements State {

	private Car car;

	public EastFacingState(Car car) {
		this.car = car;
	}

	@Override
	public void turnLeft() {
		car.setDirection(car.NORTH_FACING_STATE);
	}

	@Override
	public void turnRight() {
		car.setDirection(car.SOUTH_FACING_STATE);
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
