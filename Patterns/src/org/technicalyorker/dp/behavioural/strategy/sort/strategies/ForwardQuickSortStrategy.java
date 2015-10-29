package org.technicalyorker.dp.behavioural.strategy.sort.strategies;

public class ForwardQuickSortStrategy extends SortStrategy {
	private int[] num;
	private int number;

	public void sort(int[] values) {
		if (values == null || values.length == 0) {
			return;
		}
		this.num = values;
		number = values.length;
		quicksort(0, number - 1);
	}

	private void quicksort(int low, int high) {
		int i = low, j = high;
		int pivot = num[low + (high - low) / 2];
		while (i <= j) {
			while (num[i] < pivot) {
				i++;
			}
			while (num[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(num, i, j);
				i++;
				j--;
			}
		}
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}
}
