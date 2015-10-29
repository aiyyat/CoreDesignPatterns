package org.technicalyorker.dp.creational.singleton;

/**
 * This is yet another variant of Singleton which will ensure Thread safety in a
 * multi-threaded environment. Unlike the Synchronized approach there is no
 * performance issues which would arise due to every thread waiting. A
 * contention for the lock of the singleton object could definitely happen but
 * only for those threads that the Singleton instance while it is still yet to
 * be created.
 * 
 * @author achuth
 *
 */
public class DoubleLockingSingleTon {
	private static DoubleLockingSingleTon singleTonInstance = null;

	private DoubleLockingSingleTon() {
	}

	public static DoubleLockingSingleTon getInstance() {
		if (null == singleTonInstance) {
			synchronized (singleTonInstance) {
				if (null == singleTonInstance) {
					singleTonInstance = new DoubleLockingSingleTon();
				}
			}
		}
		return singleTonInstance;
	}
}
