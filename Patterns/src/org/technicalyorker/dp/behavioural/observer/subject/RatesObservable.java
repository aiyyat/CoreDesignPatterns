package org.technicalyorker.dp.behavioural.observer.subject;

import org.technicalyorker.dp.behavioural.observer.domain.Rate;
import org.technicalyorker.dp.behavioural.observer.observers.RatesObserver;

/**
 * Rates Observable interface.
 * 
 * @author achuth
 *
 */
public interface RatesObservable {
	public void add(RatesObserver observer);

	public void remove(RatesObserver observer);

	public void notifyRegisteredListeners(Rate rate);
}
