package org.technicalyorker.dp.behavioural.observer.subject;

import java.util.HashSet;
import java.util.Set;

import org.technicalyorker.dp.behavioural.observer.domain.Rate;
import org.technicalyorker.dp.behavioural.observer.observers.RatesObserver;

/**
 * Abstract Subject that provides default implementation for any observable.
 * 
 * @author achuth
 *
 */
public abstract class AbstractRatesObservable implements RatesObservable {
	Set<RatesObserver> observers = new HashSet<RatesObserver>();

	@Override
	public void add(RatesObserver observer) {
		observers.add(observer);
	}

	@Override
	public void remove(RatesObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyRegisteredListeners(Rate rate) {
		for (RatesObserver observer : observers) {
			observer.onRateNotified(rate);
		}
	}
}
