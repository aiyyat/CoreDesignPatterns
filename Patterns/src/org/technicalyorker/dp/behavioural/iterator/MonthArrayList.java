package org.technicalyorker.dp.behavioural.iterator;

import java.util.Iterator;

public class MonthArrayList implements Iterable<String> {
	String[] months = new String[] { "JANUARY", "FEBRUARY", "MARCH", "APRIL",
			"MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER",
			"NOVEMEBER", "DECEMBER" };
	@Override
	public Iterator<String> iterator() {
		return new MonthIterator(months);
	}
}
