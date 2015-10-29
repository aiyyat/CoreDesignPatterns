package org.technicalyorker.dp.behavioural.observer.observers;

import org.technicalyorker.dp.behavioural.observer.domain.Rate;

/**
 * Shows the latest of rate values in its panel.
 * 
 * @author achuth
 *
 */
public class LatestRateValuePanel implements RatesObserver {

	@Override
	public void onRateNotified(Rate rate) {
		System.out.println("Latest Rate Value Panel\n\tAsk: " + rate.getAsk()
				+ "\n\tBid: " + rate.getBid() + "\n\tMid: " + rate.getMid());
	}
}
