package org.technicalyorker.dp.behavioural.observer.subject;

import java.math.BigDecimal;

import org.technicalyorker.dp.behavioural.observer.ApplicationConstants;
import org.technicalyorker.dp.behavioural.observer.domain.Rate;

/**
 * Engine generates is a pull based Rates Engine which notifies observers when
 * it receives a rate.
 * 
 * @author achuth
 *
 */
public class RatesGeneratorEngine extends AbstractRatesObservable {
	public void pollRatesAndNotify() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// Polling Rates
			BigDecimal ask = new BigDecimal(Math.random() * 100);
			BigDecimal bid = new BigDecimal(Math.random() * 100);
			BigDecimal mid = ask.add(bid).divide(new BigDecimal(2.0),
					ApplicationConstants.context);

			// Notifying Registered Rates Observers
			notifyRegisteredListeners(new Rate(ask, bid, mid));
		}
	}
}
