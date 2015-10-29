package org.technicalyorker.dp.behavioural.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MonthIterator implements Iterator<String> {
	String[] months = null;
	int index = 0;
	int size = 0;

	public MonthIterator(String[] months) {
		this.months = months;
		size = months.length;
	}

	@Override
	public boolean hasNext() {
		return index < size;
	}

	public String next() {
		if (index >= size)
			throw new NoSuchElementException();
		return months[index++];
	}
}
