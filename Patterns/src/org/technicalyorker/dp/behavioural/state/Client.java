package org.technicalyorker.dp.behavioural.state;

import org.technicalyorker.dp.behavioural.state.car.Car;
import org.technicalyorker.dp.behavioural.state.car.Position;

public class Client {
	public static void main(String[] args) {
		Car car = new Car(new Position(0, 0, 10, 10));
		System.out.println(car);
		car.steerRight();
		System.out.println(car);
		car.steerRight();
		System.out.println(car);
		car.steerRight();
		System.out.println(car);
		car.steerRight();
		System.out.println(car);
		car.moveForwardBy(20);
		System.out.println(car);
	}
}
