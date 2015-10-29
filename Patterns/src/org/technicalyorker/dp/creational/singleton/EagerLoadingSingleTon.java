package org.technicalyorker.dp.creational.singleton;

/**
 * This is called Eager or Early Instantiation variant of a Singleton. Unlike
 * the other variants the objects are created and stored even before the first
 * call to getInstance and hence the name. This is again Singleton in the
 * Classloader scope.
 * 
 * @author achuth
 *
 */
public class EagerLoadingSingleTon {
	private static final EagerLoadingSingleTon singleTonInstance = new EagerLoadingSingleTon();

	private EagerLoadingSingleTon() {
	}

	public static EagerLoadingSingleTon getInstance() {
		return singleTonInstance;
	}
}
