package org.technicalyorker.dp.behavioural.strategy.sort.strategies;

public class ReverseSelectionSortStrategy extends SortStrategy {
	@Override
	public void sort(int[] numoriginal) {
		int i, j, a;
		for (i = numoriginal.length - 1; i > 0; i--) {
			a = 0;
			for (j = 1; j <= i; j++) {
				if (numoriginal[j] < numoriginal[a])
					a = j;
			}
			swap(numoriginal, i, a);

		}
	}
}
