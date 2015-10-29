package org.technicalyorker.dp.behavioural.template;

/**
 * The Template methods defined have to have implementations if not with a
 * default behaviour.
 * 
 * @author achuth
 *
 */
public abstract class PizzaMaker {
	/**
	 * Avoid override this if the method is not to change.
	 */
	public final void makePizza() {
		makeDough();
		prepareTopings();
		makeBase();
		addCheeseAndTopings();
		bake();
		pack();
	}

	protected abstract void makeDough();

	protected abstract void prepareTopings();

	protected abstract void makeBase();

	protected void addCheeseAndTopings() {
		System.out.println("added Cheese and toppings");
	}

	protected abstract void bake();

	protected void pack() {
		System.out.println("Basic Packing..");
	}
}
