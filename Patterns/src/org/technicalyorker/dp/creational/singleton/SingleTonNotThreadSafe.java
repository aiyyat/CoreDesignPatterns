package org.technicalyorker.dp.creational.singleton;

/**
 * The following code is quite Obvious why it is not thread safe in nature. It's
 * quite easily possible that when two seperate threads which passes the
 * condition of checking if singleToninstance is null both ends up creating
 * seperate instances. But for a Single threaded application to make use of lazy
 * loading singleton this is the ideal candidate when the performance and
 * purpose is taken into account.
 * 
 * @author achuth
 *
 */
public class SingleTonNotThreadSafe {
	private static SingleTonNotThreadSafe singleToninstance = new SingleTonNotThreadSafe();

	private SingleTonNotThreadSafe() {
	}

	public static SingleTonNotThreadSafe getInstance() {
		if (null == singleToninstance) {
			singleToninstance = new SingleTonNotThreadSafe();
		}
		return singleToninstance;
	}
}
