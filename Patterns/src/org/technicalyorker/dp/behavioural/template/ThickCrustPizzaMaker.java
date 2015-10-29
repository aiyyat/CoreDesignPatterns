package org.technicalyorker.dp.behavioural.template;

public class ThickCrustPizzaMaker extends PizzaMaker {

	@Override
	protected void makeDough() {
		System.out.println("Made Dough");
	}

	@Override
	protected void prepareTopings() {
		System.out.println("Added some chicken and vegetable toppings");
	}

	@Override
	protected void makeBase() {
		System.out.println("made the dough base.. very thick one this time..");
	}

	@Override
	protected void bake() {
		System.out.println("Bake to make it crispy..");
	}
}
