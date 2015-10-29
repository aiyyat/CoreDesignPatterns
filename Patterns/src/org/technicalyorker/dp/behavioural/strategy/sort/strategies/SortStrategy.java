package org.technicalyorker.dp.behavioural.strategy.sort.strategies;

public abstract class SortStrategy {
	public abstract void sort(int[] input);

	void swap(int[] num, int i, int j) {
		int tmp = num[i];
		num[i] = num[j];
		num[j] = tmp;
	}
}
