package org.technicalyorker.dp.behavioural.strategy.sort.strategies;

public class ReverseSelectionSortStrategy extends SortStrategy {
	@Override
	public void sort(int[] numoriginal) {
		int[] num = numoriginal.clone();
		int i, j, a;
		for (i = num.length - 1; i > 0; i--) {
			a = 0;
			for (j = 1; j <= i; j++) {
				if (num[j] < num[a])
					a = j;
			}
			swap(num, i, a);

		}
	}
}
