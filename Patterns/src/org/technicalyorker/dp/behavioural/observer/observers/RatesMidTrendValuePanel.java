package org.technicalyorker.dp.behavioural.observer.observers;

import java.util.ArrayList;
import java.util.List;

import org.technicalyorker.dp.behavioural.observer.domain.Rate;

/**
 * Displays the latest trend in mid values of the rates.
 * 
 * @author achuth
 *
 */
public class RatesMidTrendValuePanel implements RatesObserver {
	List<Rate> rates = new ArrayList<Rate>();
	private final int ADJUST = 50;

	@Override
	public void onRateNotified(Rate rate) {
		rates.add(rate);
		StringBuffer str = new StringBuffer("");
		for (Rate rateval : rates) {
			str.append(rateval.getMid().floatValue() + ",");
		}
		int len = str.length();
		int from = len < ADJUST ? 0 : len - ADJUST;
		System.out.println("Rate Trend: ..."
				+ str.toString().substring(from, len));
	}
}
