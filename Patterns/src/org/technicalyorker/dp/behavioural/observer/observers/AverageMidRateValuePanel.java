package org.technicalyorker.dp.behavioural.observer.observers;

import java.math.BigDecimal;

import org.technicalyorker.dp.behavioural.observer.ApplicationConstants;
import org.technicalyorker.dp.behavioural.observer.domain.Rate;

/**
 * Calculates the average Mid Rate Value.
 * 
 * @author achuth
 *
 */
public class AverageMidRateValuePanel implements RatesObserver {
	int ratesCount = 1;
	BigDecimal totalMid = new BigDecimal(0);

	@Override
	public void onRateNotified(Rate rate) {
		totalMid = totalMid.add(rate.getMid());
		System.out.println("Average Mid Rate Value:"
				+ totalMid.divide(new BigDecimal(ratesCount++),
						ApplicationConstants.context));
	}
}
