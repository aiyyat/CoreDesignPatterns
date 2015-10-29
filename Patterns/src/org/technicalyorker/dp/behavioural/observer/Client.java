package org.technicalyorker.dp.behavioural.observer;

import org.technicalyorker.dp.behavioural.observer.observers.AverageMidRateValuePanel;
import org.technicalyorker.dp.behavioural.observer.observers.LatestRateValuePanel;
import org.technicalyorker.dp.behavioural.observer.observers.RatesMidTrendValuePanel;
import org.technicalyorker.dp.behavioural.observer.subject.RatesGeneratorEngine;

/**
 * Client the controls the observers registeration and removal. Also initiates
 * wake up call RatesGeneratorEngine to poller
 * 
 * @author achuth
 *
 */
public class Client {
	public static void main(String[] args) {
		RatesGeneratorEngine engine = new RatesGeneratorEngine();
		engine.add(new AverageMidRateValuePanel());
		engine.add(new LatestRateValuePanel());
		engine.add(new RatesMidTrendValuePanel());
		engine.pollRatesAndNotify();
	}
}
