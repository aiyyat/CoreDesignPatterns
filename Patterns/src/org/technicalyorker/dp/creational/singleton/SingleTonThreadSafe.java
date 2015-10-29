package org.technicalyorker.dp.creational.singleton;

/**
 * 
 * The thread safety issue that arose due to the SingleTonNotThreadSafe could be
 * solved simply by synchronizing the getInstance method as follows, but not
 * without an unwanted consequence. There will be a performance problem due to
 * thread contention for lock which will be introduced by the single point of
 * access of the singleton instance via getInstance() method.
 * 
 * @author achuth
 *
 */
public class SingleTonThreadSafe {
	private static SingleTonThreadSafe singleTonInstance = null;

	private SingleTonThreadSafe() {
	}

	public static synchronized SingleTonThreadSafe getInstance() {
		if (null == singleTonInstance) {
			singleTonInstance = new SingleTonThreadSafe();
		}
		return singleTonInstance;
	}
}
