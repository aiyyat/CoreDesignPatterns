package org.technicalyorker.dp.behavioural.observer.observers;

import org.technicalyorker.dp.behavioural.observer.domain.Rate;

/**
 * Any Observer.
 * 
 * @author achuth
 *
 */
public interface RatesObserver {
	public void onRateNotified(Rate rate);
}
