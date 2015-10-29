package org.technicalyorker.dp.behavioural.state.car;

public class SouthFacingState implements State {

	private Car car;
	
	public SouthFacingState(Car car) {
		this.car = car;
	}

	@Override
	public void turnLeft() {
		car.setDirection(car.EAST_FACING_STATE);
	}

	@Override
	public void turnRight() {
		car.setDirection(car.WEST_FACING_STATE);
	}

	@Override
	public void moveFront() {
		car.getPosition().decrementY();
	}

	@Override
	public void moveBack() {
		car.getPosition().incrementY();
	}
}
