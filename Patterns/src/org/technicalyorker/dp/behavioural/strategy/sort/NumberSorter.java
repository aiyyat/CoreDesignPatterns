package org.technicalyorker.dp.behavioural.strategy.sort;

import java.util.Arrays;

import org.technicalyorker.dp.behavioural.strategy.sort.strategies.SortStrategy;

public class NumberSorter {
	SortStrategy strategy;

	public NumberSorter(SortStrategy strategy) {
		this.strategy = strategy;
	}

	public void display(int[] a) {
		System.out.print("\nSorted Version of " + Arrays.toString(a) + " is ");
		strategy.sort(a);
		System.out.print(Arrays.toString(a) + " Strategy: "
				+ strategy.getClass().getSimpleName());
	}
}
