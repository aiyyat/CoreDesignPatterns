package org.technicalyorker.dp.behavioural.observer;

import java.math.MathContext;
import java.math.RoundingMode;

/**
 * 
 * @author achuth
 *
 */
public class ApplicationConstants {
	public static final MathContext context = new MathContext(5,
			RoundingMode.HALF_UP);
}
